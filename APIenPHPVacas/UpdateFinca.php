<?php
header("Access-Control-Allow-Origin: *"); // Permite el acceso desde cualquier origen, o usa "http://localhost" si solo quieres permitirlo desde localhost.
header("Access-Control-Allow-Methods: GET, POST");
header("Access-Control-Allow-Headers: Content-Type");

include 'Conexion.php';

if (!empty($_POST['nombre_finca'])) {

    $id_finca = $_POST['id_finca'];
    $nombre_finca = $_POST['nombre_finca'];
    

    try {
        $consulta = $base_de_datos->prepare("UPDATE fincas SET nombre_finca=:nomf WHERE id_finca = :id ");

        $consulta->bindParam(':id', $id_finca);
        $consulta->bindParam(':nomf', $nombre_finca);
        

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