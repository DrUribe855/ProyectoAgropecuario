<?php 
	header("Access-Control-Allow-Origin: * "); // Permite el acceso desde cualquier origen, o usa "http://localhost" si solo quieres permitirlo desde localhost.
	header("Access-Control-Allow-Methods: GET, POST");
	header("Access-Control-Allow-Headers: Content-Type");

    include 'Conexion.php';

    $consulta = $base_de_datos->query("SELECT vacas.*, usuarios.nombres
                                      FROM usuarios
                                      JOIN ordeniadores_finca ON usuarios.id_usuario = ordeniadores_finca.id_usuario
                                      JOIN fincas ON ordeniadores_finca.id_finca = fincas.id_finca
                                      JOIN vacas ON fincas.id_finca = vacas.id_finca 
                                      WHERE usuarios.id_usuario = $id");
    $datos = $consulta->fetchAll();

    $respuesta['registros'] = $datos;
    echo json_encode($respuesta);
    
?>

