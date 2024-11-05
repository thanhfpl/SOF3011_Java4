<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body>
<form action="/giang-vien/add" method="post" >
    <div>
        <span>Mã:</span>
        <input type="text" name="mssv1">
    </div>
    <div>
        <span>Tên:</span>
        <input type="text" name="ten">
    </div>
    <div>
        <span>Tuổi:</span>
        <input type="text" name="tuoi">
    </div>
    <div>
        <span>Giới tính:</span>
        <input type="radio" name="gioiTinh" checked value="true">Nam
        <input type="radio" name="gioiTinh" checked value="false">Nữ
    </div>
    <div>
        <span>Quê quán:</span>
        <input type="text" name="queQuan">
    </div>
    <br>
    <button type="submit" class="btn btn-primary" >Add</button>

</form>
<table class="table">

    <thead>
    <tr>

        <th scope="col">STT</th>
        <th scope="col">Mã</th>
        <th scope="col">Tên</th>
        <th scope="col">Sở Thích</th>
        <th scope="col">Giới Tính</th>

        <th scope="col">Action</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${a}" var="ban">
        <tr>
            <td>${ban.id}</td>
            <td>${ban.ma}</td>
            <td>${ban.ten}</td>
            <td>${ban.soThich}</td>
            <td>${ban.gioiTinh}</td>

            <td>
                <a href="/ban/xoa?idXoa=${ban.id}" > <button class="btn btn-primary">Xóa</button></a>
                <a href="" > <button class="btn btn-primary">Detail</button></a>
            </td>
        </tr>


    </c:forEach>
    </tbody>
</table>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</body>
</html>

