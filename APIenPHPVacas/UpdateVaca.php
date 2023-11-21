<?php
header("Access-Control-Allow-Origin: *"); // Permite el acceso desde cualquier origen, o usa "http://localhost" si solo quieres permitirlo desde localhost.
header("Access-Control-Allow-Methods: GET, POST");
header("Access-Control-Allow-Headers: Content-Type");

include 'Conexion.php';

if (!empty($_POST['id_vaca'] and !empty($_POST['id_finca']) and !empty($_POST['alias']) and !empty($_POST['descripcion']) and !empty($_POST['estado']) )) {

    $id_vaca = $_POST['id_vaca'];
    $id_finca = $_POST['id_finca'];
    $alias = $_POST['alias'];
    $descripcion = $_POST['descripcion'];
    $estado = $_POST['estado'];
    

    try {
        $consulta = $base_de_datos->prepare("UPDATE vacas SET id_finca=:idf, alias=:alias, descripcion=:descri, estado=:est WHERE id_vaca = :id ");

        $consulta->bindParam(':id', $id_vaca);
        $consulta->bindParam(':idf', $id_finca);
        $consulta->bindParam(':alias', $alias);
        $consulta->bindParam(':descri', $descripcion);
        $consulta->bindParam(':est', $estado);
        

        $proceso = $consulta->execute();

        if ($proceso) {
            $respuesta = [
                'status' => true,
                'mesagge' => "OK##CLIENT##UPDATE"
            ];
            echo json_encode($respuesta);
        } else {
            $respuesta = [
                'status' => false,
                'mesagge' => "ERROR##CLIENT##UPDATE"
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