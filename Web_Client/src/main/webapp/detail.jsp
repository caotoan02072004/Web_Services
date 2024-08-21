<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Detail Computer!</title>
<link rel="stylesheet" type="text/css" href="resources/css/bootstrap.min.css">
</head>
<body>
	<div class="container mt-5">
		<h2 class="mb-3">Chi tiết thông tin máy tính</h2>
		<table class="table table-bordered mt-5">
			<thead>
				<tr>
					<th>Computer Id</th>
					<th>Computer Name</th>
					<th>Producer</th>
					<th>Status</th>
					<th>YearMaking</th>
					<th>ExpireDate</th>
					<th>Price</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>${c.comId}</td>
					<td>${c.comName}</td>
					<td>${c.producer}</td>
					<td>${c.status ? "Hiện" : "Ẩn"}</td>
					<td><fmt:formatDate value="${c.yearMaking}" pattern="dd/MM/yyyy" /></td>
					<td><fmt:formatDate value="${c.expireDate}" pattern="dd/MM/yyyy" /></td>
					<td>${c.price}</td>
				</tr>
			</tbody>
		</table>
	</div>
</body>
</html>