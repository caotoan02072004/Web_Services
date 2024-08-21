<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Computer!</title>
<link rel="stylesheet" type="text/css" href="resources/css/bootstrap.min.css">
</head>
<body>
	<div class="container">
		<h1>Sửa thông tin máy tính</h1>
		<form action="UpdateComputer" method="post">
			<input type="hidden" name="comId" value="${c.comId}">
			<div class="form-group">
				<label for="comName">Computer Name</label> <input
					type="text" class="form-control" id="comName" name="comName" value="${c.comName}">
			</div>
			<div class="form-group">
				<label for="producer">Producer</label> <input
					type="text" class="form-control" id="producer" name="producer" value="${c.producer}">
			</div>
			<label>Status</label>
			<div class="form-group">
				<div class="form-check form-check-inline">
					<label>
						<input class="form-check-input" type="radio" name="status" value="true" ${c.status == true ? "checked" : ""}>Hiện
					</label>
				</div>
				<div class="form-check form-check-inline">
					<label>
						<input class="form-check-input" type="radio" name="status" value="false" ${c.status == false ? "checked" : ""}>Ẩn
					</label>
				</div>
			</div>
			<div class="form-group">
				<label for="yearMaking">YearMaking</label> <input
					type="date" class="form-control" id="yearMaking" name="yearMaking"  value="<fmt:formatDate value="${c.yearMaking}" pattern="yyyy-MM-dd" />">
			</div>
			<div class="form-group">
				<label for="expireDate">ExpireDate</label> <input
					type="date" class="form-control" id="expireDate" name="expireDate"  value="<fmt:formatDate value="${c.expireDate}" pattern="yyyy-MM-dd" />">
			</div>
			<div class="form-group">
				<label for="price">Price</label> <input
					type="text" class="form-control" id="price" name="price" value="${c.price}">
			</div>
			
			<div class="mt-3 mb-3">
				<button type="submit" class="btn btn-primary">Update</button>
			</div>
		</form>
	</div>
</body>
</html>