<?php 
	header("Access-Control-Allow-Origin: * "); // Permite el acceso desde cualquier origen, o usa "http://localhost" si solo quieres permitirlo desde localhost.
	header("Access-Control-Allow-Methods: GET, POST");
	header("Access-Control-Allow-Headers: Content-Type");

    include 'Conexion.php';

   
    $consulta = $base_de_datos->query("SELECT vacas.id_vaca, fincas.id_finca, fincas.nombre_finca, vacas.alias, vacas.descripcion, vacas.estado
                                        FROM vacas
                                        JOIN fincas ON vacas.id_finca = fincas.id_finca");
    $datos = $consulta->fetchAll();
    $respuesta['registros'] = $datos;
    echo json_encode($respuesta);
    
    

    
    
?>

