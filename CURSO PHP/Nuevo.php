

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <form method="POST" action="Nuevo.php">
    <input type="text" name= "itemName">
    <input type="submit" value="send">
    </form>
    
</body>
</html>

<?php 

if($_SERVER["REQUEST_METHOD"] == "POST") {
$itemName = $_POST["itemName"];
$itemPrice = 100;
$tax = 2.0;

echo "Item: " . $itemName . " <br> Item price: " . $itemPrice . " usd <br>";
echo "Item price after taxes: " . $itemPrice * $tax . " usd";


}




?>