<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<link rel="stylesheet" href="./css/showt	ext.css" />
<link rel="stylesheet" href="./css/show.css" />
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link
	href="https://fonts.googleapis.com/css2?family=Gowun+Batang:wght@700&family=Noto+Sans+KR:wght@300&display=swap"
	rel="stylesheet">
<script type="text/javascript" src="./showtext.js" defer></script>
<title>선택된 게시물</title>
</head>
<body>
	<div class="selectlist">
		<div id="title">${ board.title }</div>
		<div id="text">${ board.my_textarea}</div>
		<button id="delete">삭제하기</button>
		<a href="./list" class="button">목록으로가기</a>
	</div>
	<script>
		const deletelist = document.getElementById("delete");
		deletelist.addEventListener("click", function() {
			location.assign("http://localhost:8080/delete?pk="+${board.pk});
		});
	</script>
</body>
</html>
