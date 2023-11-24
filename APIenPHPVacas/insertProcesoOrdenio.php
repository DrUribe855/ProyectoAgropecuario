<?php
header("Access-Control-Allow-Origin: *"); // Permite el acceso desde cualquier origen, o usa "http://localhost" si solo quieres permitirlo desde localhost.
header("Access-Control-Allow-Methods: GET, POST");
header("Access-Control-Allow-Headers: Content-Type");

include 'Conexion.php';

if (!empty($_POST['id_vaca']) and !empty($_POST['id_ordeniador']) and !empty($_POST['litros'])) {

    $id_vaca = $_POST['id_vaca'];
    $id_ordeniador = $_POST['id_ordeniador'];
    $litros = $_POST['litros'];
    $fecha = $_POST['fecha'];


    try {
        $consulta = $base_de_datos->prepare("INSERT INTO proceso_ordenio (id_vaca, id_ordeniador, litros, fecha) VALUES(:id_vac, :id_orde, :lit, :fech) ");

        $consulta->bindParam(':id_vac', $id_vaca);
        $consulta->bindParam(':id_orde', $id_ordeniador);
        $consulta->bindParam(':lit', $litros);
        $consulta->bindParam(':fech', $fecha);


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