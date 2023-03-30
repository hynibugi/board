<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 글쓰기 양식</title>
</head>
<form action="/write" method="post" id="body">
	<textarea id="title" name="title" rows="1" cols="100 "
		placeholder="제목을 입력하세요"></textarea>
	<textarea id="nickname" name="nickname" rows="1" cols="100 ">${lastname}</textarea>
	<textarea id="my-textarea" name="my-textarea" rows="30" cols="100"></textarea>
	<footer id="foot">
		<button class="writing" id="wbutton" type="submit">글쓰기</button>
		<div id="important">
			<label> <input type="checkbox" name="importantcontent"
				id="importantcontent" value="true"> 중요
			</label>
		</div>
	</footer>
</form>
<a href="/list" class="button">목록으로가기</a>
</body>