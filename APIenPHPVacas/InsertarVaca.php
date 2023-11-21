<?php
header("Access-Control-Allow-Origin: *"); // Permite el acceso desde cualquier origen, o usa "http://localhost" si solo quieres permitirlo desde localhost.
header("Access-Control-Allow-Methods: GET, POST");
header("Access-Control-Allow-Headers: Content-Type");

include 'Conexion.php';

if (!empty($_POST['id_finca']) and !empty($_POST['descripcion']) and !empty($_POST['alias']) and !empty($_POST['estado'])){

    $id_finca = $_POST['id_finca'];
    $descripcion = $_POST['descripcion'];
    $alias = $_POST['alias'];
    $estado = $_POST['estado'];

    try {
        $consulta = $base_de_datos->prepare("INSERT INTO vacas (id_finca, descripcion, alias, estado) VALUES(:idf, :descrip, :alias, :estado) ");

        $consulta->bindParam(':idf', $id_finca);
        $consulta->bindParam(':descrip', $descripcion);
        $consulta->bindParam(':alias', $alias);
        $consulta->bindParam(':estado', $estado);


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