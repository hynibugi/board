<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="./css/show.css" />
<script type="text/javascript" src="./show.js" defer></script>
<title>글목록</title>
</head>
<body>
	<table id="list">
		<tr>
			<th>글제목</th>
			<th>닉네임</th>
		</tr>
		<div class="textlist" id="search">
			<c:forEach var="board" items="${ list }">
				<tr>
					<td><span class="title"> <a class="link"
							href="/list?id=">${board.title}</a>
					</span></td>
					<td><span class="nickname">${board.my_textarea}</span></td>
				</tr>
			</c:forEach>
		</div>

	</table>
	<a href="/write" class="button">글쓰기🚀</a>
	<div id="search">
		<select id="type" name="type">
			<option value="name">닉네임</option>
			<option value="posttitle">게시물이름</option>
		</select>
		<textarea rows="1" cols="10">검색</textarea>
		<button id="button">제출</button>
	</div>
</body>
</html>
