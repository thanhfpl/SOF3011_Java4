<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 27/03/2024
  Time: 11:15 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

</head>
<body>
<div class="container-fluid">
    <table class="table table-bordered mt-3" style="width: 30%;">
        <form action="/giang-vien/search">
            Tên: <input name="ten"/>
            <button type="submit">Search</button>
        </form>
        <br/>

        <button><a href="">Add</a></button>
        <button><a href="">Giảng viên nữ</a></button>
        <tr>
            <th>ID</th>
            <th>Mã</th>
            <th>Tên</th>

            <th colspan="2">Action</th>
        </tr>
        </thead>

        <tbody>
        <c:forEach var="gv" items="${lists}">
            <tr>
                <td> ${gv.id123}</td>
                <td> ${gv.categoryCode}</td>
                <td> ${gv.categoryName}</td>

                <td>
                    <a href="" class="btn btn-primary">Detail</a>
                    <a href="" class="btn btn-warning"  >Detele</a>
                    <a href="" class="btn btn-warning"  >Update</a>
                </td>
            </tr>
        </c:forEach>


        </tbody>
    </table>
</div>


</body>
</html>