<?php 
	header("Access-Control-Allow-Origin: * "); // Permite el acceso desde cualquier origen, o usa "http://localhost" si solo quieres permitirlo desde localhost.
	header("Access-Control-Allow-Methods: GET, POST");
	header("Access-Control-Allow-Headers: Content-Type");

    include 'Conexion.php';

    if (!empty($_GET['documento'])) {
	    $consulta = $base_de_datos->query("SELECT vacas.alias, vacas.estado
                                            FROM vacas
                                            JOIN fincas ON vacas.id_finca = fincas.id_finca
                                            JOIN ordeniadores_finca ON fincas.id_finca = ordeniadores_finca.id_finca
                                            JOIN usuarios ON ordeniadores_finca.id_usuario = usuarios.id_usuario
                                            WHERE usuarios.documento = ".$_GET['documento']);
	    $datos = $consulta->fetchAll();
        $respuesta['registros'] = $datos;
        echo json_encode($respuesta);

	}else{
        $respuesta = [
                        'status' => false,
                        'mesagge' => "ERROR##DATOS##GET",
                        '$_GET' => $_GET,
                        '$_POST' => $_POST
                      ];
        echo json_encode($respuesta);
    }
    

    
    
?>

