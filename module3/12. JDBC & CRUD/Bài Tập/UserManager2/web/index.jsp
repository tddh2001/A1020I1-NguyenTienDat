<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/bootstrap.css">
    <script src="js/jquery-3.6.0.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <title>User Management Application</title>
    <style>
        .slider {
            width: 100%;
            height: 450px;
            margin: 20px auto !important;
            border-radius: 10px;
            overflow: hidden;
        }

        .slides {
            width: 500%;
            height: 450px;
            display: flex;
        }

        .slides input {
            display: none;
        }

        .slide {
            width: 20%;
            transition: 2s;
        }

        .slide img {
            width: 100%;
            height: 450px;
        }

        .navigation-manual {
            position: absolute;
            width: 1200px;
            margin-top: -30px;
            display: flex;
            justify-content: center;
        }

        .manual-btn {
            border: 2px solid red;
            border-radius: 10px;
            cursor: pointer;
            transition: 1s;
        }

        .manual-btn:not(:last-child) {
            /*khoảng cách giữa các nút button*/
            margin-right: 20px;
        }

        .manual-btn:hover {
            /*Thay đổi background của button khi di chuột tới*/
            background: red;
        }

        #radio1:checked~.first {
            margin-left: 0;
        }

        #radio2:checked~.first {
            margin-left: -20%;
        }

        #radio3:checked~.first {
            margin-left: -40%;
        }

        #radio4:checked~.first {
            margin-left: -60%;
        }


        /*css for automatic navigation*/

        .navigation-auto {
            position: absolute;
            display: flex;
            width: 1200px;
            justify-content: center;
        }

        .navigation-auto div {
            border: 2px solid red;
            border-radius: 10px;
            transition: 1s;
        }

        .navigation-auto div:not(:last-child) {
            margin-right: 20px;
        }

        #radio1:checked~.navigation-auto .auto-btn1 {
            background: red;
        }

        #radio2:checked~.navigation-auto .auto-btn2 {
            background: red;
        }

        #radio3:checked~.navigation-auto .auto-btn3 {
            background: red;
        }

        #radio4:checked~.navigation-auto .auto-btn4 {
            background: red;
        }
    </style>
</head>
<body>
<div class="container-fluid">
    <header class="row fa-burger-soda">
        <a style="text-align: center;" class="col-sm-3" href="./index.jsp"><img style="width: 50%;" src="https://static.vecteezy.com/system/resources/previews/000/348/155/non_2x/management-vector-icon.jpg"></a>
        <div class="col-sm-9 shopping-mall">
            <a style="text-decoration: none;" href="./index.jsp">
                <h2 style="color: rgb(38, 0, 255); text-align: center;">User Management Application</h2>
            </a>
        </div>
    </header>
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
        <a class="navbar-brand" href="./index.jsp"><span class="glyphicon glyphicon-home"></span> Trang chủ</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"
                aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav mr-auto">
                <li class="nav-item">
                    <a class="nav-link" href="/users?action=create">Thêm Mới User</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/users?action=users">Danh Sách Users</a>
                </li>
            </ul>
            <form class="form-inline my-2 my-lg-0" action="/users?action=search"  method="post">
                <input name="countrySearch" class="form-control mr-sm-2" type="search" placeholder="Search">
                <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search By Country</button>
            </form>
        </div>
    </nav>
    <div class="row">
        <article class="col-sm-12">
            <div class="slider">
                <div class="slides">
                    <input type="radio" name="radio-btn" id="radio1">
                    <input type="radio" name="radio-btn" id="radio2">
                    <input type="radio" name="radio-btn" id="radio3">
                    <div class="slide first">
                        <img src="./img/it1.jpg" alt="">
                    </div>
                    <div class="slide">
                        <img src="./img/it2.jpg">
                    </div>
                    <div class="slide">
                        <img src="./img/it3.jpg">
                    </div>
                    <div class="navigation-auto">
                        <div class="auto-btn1"></div>
                        <div class="auto-btn2"></div>
                        <div class="auto-btn3"></div>
                    </div>
                </div>
                <div class="navigation-manual">
                    <label for="radio1" class="manual-btn"></label>
                    <label for="radio2" class="manual-btn"></label>
                    <label for="radio3" class="manual-btn"></label>
                </div>
            </div>

        </article>

    </div>
    <footer class="card-footer row">
        <div id="map" class="col-sm-10">
            <div class="map">
                <a style="text-decoration: none; color: rgb(2, 40, 255);"
                   href="https://www.google.com/maps/place/TLSPORT+SHOP/@15.9802717,108.2364109,188m/data=!3m2!1e3!4b1!4m5!3m4!1s0x31421b13a1c89651:0x93787d9457e638e8!8m2!3d15.9802704!4d108.2369581"
                   target="_blank">Cơ sở 1: Đặng Thái Thân</a><br>
                <a style="text-decoration: none;color: rgb(2, 40, 255);" href="" target="_blank">Cơ sở 2: Ngô Quyền</a>
                <p style="text-decoration: none;color: rgb(2, 40, 255);">©copyright by Tiến Đạt</p>
            </div>
        </div>
        <div id="hotline" class="col-sm-2">

        </div>
    </footer>
</div>
<script type="text/javascript">
    //slide tự động chạy
    var counter = 1;
    setInterval(function() {
        document.getElementById('radio' + counter).checked = true;
        counter++;
        if (counter > 3) {
            counter = 1;
        }
    }, 4000);
</script>
</body>
</html>