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
        table, th, td {
            border: 1px solid #ccc;
        }

        table {
            border-collapse: collapse;
            width: 100%;
        }

        th, td {
            text-align: left;
            padding: 10px;
        }

        tr:hover {
            background-color: #ddd;
            cursor: pointer;
        }
    </style>
</head>
<body>
<div class="container-fluid">
    <header class="row fa-burger-soda">
        <a style="text-align: center;" class="col-sm-3" href="./index.jsp"><img style="width: 50%;"
                                                                                src="https://static.vecteezy.com/system/resources/previews/000/348/155/non_2x/management-vector-icon.jpg"></a>
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
            <form class="form-inline my-2 my-lg-0" action="/users?action=search" method="post">
                <input name="countrySearch" class="form-control mr-sm-2" type="search" placeholder="Search">
                <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search By Country</button>
            </form>
        </div>
    </nav>
    <div class="row">
        <article class="col-sm-12">

            <br>
            <h1 class="text-center">List of Users</h1>
            <table>

                <tr>
                    <th scope="col">Index</th>
                    <th scope="col">ID</th>
                    <th scope="col">Name</th>
                    <th scope="col">Email</th>
                    <th scope="col">Country</th>
                    <th scope="col"></th>
                    <th scope="col"></th>
                </tr>


                <c:forEach var="user" items="${listUser}" varStatus="loop">
                    <tr>
                        <td scope="row"><c:out value="${loop.index +1}"/></td>
                        <td><c:out value="${user.id}"/></td>
                        <td><c:out value="${user.name}"/></td>
                        <td><c:out value="${user.email}"/></td>
                        <td><c:out value="${user.country}"/></td>
                        <td>
                            <a href="/users?action=edit&id=${user.id}">Edit</a>
                        </td>
                        <td>
                            <a href="/users?action=delete&id=${user.id}">Delete</a>
                        </td>
                    </tr>
                </c:forEach>
                <c:if test="${action == 'search'}">
                    <c:if test="${size == '0'}">
                        <tr>
                            <td colspan="7"><h3>Not found</h3></td>
                        </tr>
                    </c:if>
                </c:if>
            </table>
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
</body>
</html>