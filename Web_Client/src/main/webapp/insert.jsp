<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert Computer!</title>
<link rel="stylesheet" type="text/css" href="resources/css/bootstrap.min.css">
</head>
<body>
	<div class="container">
		<h2 class="mt-5 mb-3">Thêm mới sinh viên</h2>
		<form action="InsertComputer" method="post">
			<div class="form-group mt-2">
				<label for="comName">Computer Name</label> <input
					type="text" class="form-control" id="comName" name="comName">
			</div>
			<div class="form-group mt-2">
				<label for="producer">Producer</label> <input
					type="text" class="form-control" id="producer" name="producer">
			</div>
			<label class="mt-2">Status</label>
			<div class="form-group">
				<div class="form-check form-check-inline">
					<label class="form-check-label">
						<input class="form-check-input" type="radio" name="status" value="true" checked> Hiện
					</label>
            	</div>
				<div class="form-check form-check-inline">
					<label class="form-check-label">
						<input class="form-check-input" type="radio" name="status" value="false"> Ẩn
					</label>
				</div>
			</div>
			<div class="form-group mt-2">
				<label for="yearMaking">Year Making</label> <input
					type="date" class="form-control" id="yearMaking" name="yearMaking">
			</div>
			<div class="form-group mt-2">
				<label for="expireDate">Expire Date</label> <input
					type="date" class="form-control" id="expireDate" name="expireDate">
			</div>
			<div class="form-group mt-2">
				<label for="price">Price</label> <input
					type="text" class="form-control" id="price" name="price">
			</div>
			<div class="my-3">
				<button type="submit" class="btn btn-primary">Insert</button>
			</div>
		</form>
	</div>
</body>
</html>