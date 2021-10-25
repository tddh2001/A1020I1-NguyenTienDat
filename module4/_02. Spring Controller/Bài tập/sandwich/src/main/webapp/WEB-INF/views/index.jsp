<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
<h1>Sandwich Condiment</h1>
<form action="/save" method="get">
    <input type="checkbox" name="condiment" value="lettuce">
    <label>Lettuce</label>
    <input type="checkbox" name="condiment" value="tomato">
    <label>Tomato</label>
    <input type="checkbox" name="condiment" value="mustard">
    <label>Mustard</label>
    <input type="checkbox" name="condiment" value="sprouts">
    <label>Sprouts</label>
    <br>
    <input type="submit" value="save">
</form>
<label>${msg}</label>
</body>
</html>