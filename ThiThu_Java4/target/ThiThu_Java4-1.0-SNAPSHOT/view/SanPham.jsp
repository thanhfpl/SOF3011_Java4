<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 11/04/2024
  Time: 9:37 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <title>Bootstrap demo</title>
    <link
            href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
            rel="stylesheet"
            integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
            crossorigin="anonymous"
    />
</head>
<body>
<form action="/giang-vien/add" method="post">
    <div>
        <span>Id:</span>
        <input type="text" name="mssv1" />
    </div>
    <div>
        <span>Ma:</span>
        <input type="text" name="ten" />
    </div>
    <div>
        <span>Ten:</span>
        <input type="text" name="tuoi" />
    </div>

    <div>
        <span>NgaySX:</span>
        <input type="text" name="queQuan" />
    </div>
    <div>
        <span>Mota:</span>
        <input type="text" name="queQuan" />
    </div>
    <div>
        <span>Website:</span>
        <input type="text" name="queQuan" />
    </div>
    <div>
        <span>GiaBan:</span>
        <input type="text" name="queQuan" />
    </div>
    <div>
        <span>SoLuong:</span>
        <input type="text" name="queQuan" />
    </div>




    <br />
    <button type="submit" class="btn btn-primary">Add</button>
</form>
<table class="table">
    <thead>
    <tr>
        <th scope="col">ID</th>
        <th scope="col">Ma</th>
        <th scope="col">Ten</th>
        <th scope="col">ngaySanXuat</th>
        <th scope="col">moTa</th>
        <th scope="col">webSite</th>
        <th scope="col">GiaBan</th>
        <th scope="col">SoLuong</th>
        <th scope="col">Action</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${a}" var="sp">
        <tr>
            <td>${sp.id}</td>
            <td>${sp.ma}</td>
            <td>${sp.ten}</td>
            <td>${sp.ngaySanXuat}</td>
            <td>${sp.moTa}</td>
            <td>${sp.webSite}</td>
            <td>${sp.giaBan}</td>
            <td>${sp.soLuong}</td>
            <td>
                <a href="/san-pham/detai?idDetail=${sp.id}"><button class="btn btn-primary">Detail</button></a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<script
        src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
        crossorigin="anonymous"
></script>
</body>
</html>
