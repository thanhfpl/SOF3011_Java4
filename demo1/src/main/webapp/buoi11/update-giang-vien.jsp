<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 29/03/2024
  Time: 6:09 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/giang-vien/update?id=${gv1.id2343}" method="post" >
    <div>
        <span>Mã:</span>
        <input type="text" name="mssv1" value="${gv1.mssv1}">
    </div>
    <div>
        <span>Tên:</span>
        <input type="text" name="ten" value="${gv1.ten}">
    </div>
    <div>
        <span>Tuổi:</span>
        <input type="text" name="tuoi" value="${gv1.tuoi}">
    </div>
    <div>
        <span>Giới tính:</span>
        <input type="radio" name="gioiTinh" checked value="true">Nam
        <input type="radio" name="gioiTinh" checked value="false">Nữ
    </div>
    <div>
        <span>Quê quán:</span>
        <input type="text" name="queQuan" value="${gv1.queQuan}">
    </div>
    <br>
    <button type="submit" class="btn btn-primary" >Update</button>

</form>

</body>
</html>
