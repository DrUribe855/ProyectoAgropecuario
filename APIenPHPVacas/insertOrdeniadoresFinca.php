<?php
header("Access-Control-Allow-Origin: *"); // Permite el acceso desde cualquier origen, o usa "http://localhost" si solo quieres permitirlo desde localhost.
header("Access-Control-Allow-Methods: GET, POST");
header("Access-Control-Allow-Headers: Content-Type");

include 'Conexion.php';

if ( !empty($_POST['id_usuario']) and !empty($_POST['id_finca']) ){

    $id_usuario = $_POST['id_usuario'];
    $id_finca = $_POST['id_finca'];

    try {
        $consulta = $base_de_datos->prepare("INSERT INTO ordeniadores_finca(id_usuario, id_finca) VALUES(:idu, :idf) ");

        $consulta->bindParam(':idu', $id_usuario);
        $consulta->bindParam(':idf', $id_finca);


        $proceso = $consulta->execute();

        if ($proceso) {
            $respuesta = [
                'status' => true,
                'mesagge' => "OK##CLIENT##INSERT"
            ];
            echo json_encode($respuesta);
        } else {
            $respuesta = [
                'status' => false,
                'mesagge' => "ERROR##CLIENT##INSERT"
            ];
            echo json_encode($respuesta);
        }
    } catch (Exception $e) {
        $respuesta = [
            'status' => false,
            'mesagge' => "ERROR##SQL",
            'exception' => $e
        ];
        echo json_encode($respuesta);
    }
} else {
    $respuesta = [
        'status' => false,
        'mesagge' => "ERROR##DATOS##POST",
        '$_GET' => $_GET,
        '$_POST' => $_POST
    ];
    echo json_encode($respuesta);
}
?>