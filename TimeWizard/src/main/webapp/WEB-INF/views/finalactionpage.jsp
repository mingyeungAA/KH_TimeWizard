<%@page import="com.minibean.timewizard.model.dto.UserInfoDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<link href="https://fonts.googleapis.com/css2?family=Source+Code+Pro&family=Source+Sans+Pro:wght@200;400&family=Staatliches&display=swap" rel="stylesheet">
<link href="/timewizard/css/actionpage.css" rel="stylesheet">
<script src="/timewizard/js/actionpage.js" defer></script>
<script src="/timewizard/js/tap.js" defer></script>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script src="https://kit.fontawesome.com/3049a69bf8.js" crossorigin="anonymous"></script>

</head>
<body>


	<jsp:include page="/WEB-INF/views/header.jsp"></jsp:include>

	
	<section class="sectionbar">
		<div class="main_box">
			<div class="tab_box">
				<div class="tap active" onclick="openTab(event, 'con1')"><a href="#">Tap 1</a></div>
				<div class="tap" onclick="openTab(event, 'con2')"><a href="#">Tap 2</a></div>
			</div>
			<div class="content_box">

				<div id="con1" class="content on"><jsp:include page="/WEB-INF/views/personal_daily.jsp" flush="true"></jsp:include></div>
				<div id="con2" class="content"><p>Content 2, Tap 2의 내용</p><a href="calendar">Calender</a></div>
			</div>
		</div>
	</section>
	<jsp:include page="friendlist.jsp"></jsp:include>
	<jsp:include page="footer.jsp"></jsp:include>
	
 
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/sockjs-client/1.1.5/sockjs.min.js"></script>
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/stomp.js/2.3.3/stomp.js"></script>


</body>
</html>










