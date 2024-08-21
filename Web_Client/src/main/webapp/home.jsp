<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="resources/css/bootstrap.min.css">
<title>Home Page!</title>
</head>
<body>
	<div class="container mt-5">
		<h2 class="mb-3">Danh sách máy tính</h2>
		<a class="btn btn-primary" href="insert.jsp">Thêm mới +</a>
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
					<th>Action</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${list}" var="c">
					<tr>
						<td>${c.comId}</td>
						<td>${c.comName }</td>
						<td>${c.producer}</td>
						<td>${c.status ? "Hiện" : "Ẩn"}</td>
						<td><fmt:formatDate value="${c.yearMaking }" pattern="dd/MM/yyyy" /></td>
						<td><fmt:formatDate value="${c.expireDate }" pattern="dd/MM/yyyy" /></td>
						<td>${c.price }</td>
						<td>
							<a class="btn btn-info" href="DetailComputer?comId=${c.comId}">Detail</a>
							<a class="btn btn-success" href="EditComputer?comId=${c.comId}">Update</a>
							<a class="btn btn-dark" href="DeleteComputer?comId=${c.comId}" onclick="return confirm('Are you sure?')">Delete</a>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>