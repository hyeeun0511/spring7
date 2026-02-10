<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>게시판페이지 완료</title>
	</head>
	<body>
	<h2>게시판페이지 완료</h2>
	<form action="/board" method="post">
		     <input type="text" name="bno" placeholder="게시글번호를 입력하세요"/><br/>
		     <input type="text" name="id" placeholder="작성자를 입력하세요"><br/>
		     <input type="password" name="btitle" placeholder="제목를 입력하세요"/><br/>
		     <input type="text" name="bcontent" placeholder="내용 입력하세요"/><br/>
		     <br>
		     <input type="submit" value="글쓰기"><br>
		   </form>
	<ul>
		<li><a href="/">홈으로</a></li>
	</ul>
	
	</body>
</html>