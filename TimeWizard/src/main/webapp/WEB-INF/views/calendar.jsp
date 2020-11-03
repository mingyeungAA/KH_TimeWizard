<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="resources/css/calendartodo.css" rel="stylesheet">
 <link href="https://fonts.googleapis.com/css?family=Roboto&display=swap" rel="stylesheet">
<script src="resources/js/calendartodo1.js" defer></script>
<script src="resources/js/calendartodo2.js" defer></script>
<script src="resources/js/calendartodo3.js" defer></script>
<script src="resources/js/calendartodo4.js" defer></script>

<style type="text/css">

</style>
</head>
<body>

	<div class="main"> <!-- 여기서 사이즈를 바꿔주거나 
							fullcalendar.js => 외부에서 가져다 쓰거나.. 
							-->
		<div class="content-wrap">
			<div class="content-left">
				<div class="main-wrap">
					<div id="main-day" class="main-day"></div>
					<div id="main-date" class="main-date"></div>
				</div>
				<div class="todo-wrap">
					<div class="todo-title">Todo List</div>
					<div class="input-wrap">
						<input type="text" placeholder="please write here!!"
							id="input-box" class="input-box">
						<button type="button" id="input-data" class="input-data">INPUT</button>
						<div id="input-list" class="input-list"></div>
					</div>
				</div>
			</div>
			<div class="content-right">
				<table id="calendar" align="center">
					<thead>
						<tr class="btn-wrap clearfix">
							<td><label id="prev"> &#60; </label></td>
							<td align="center" id="current-year-month" colspan="5"></td>
							<td><label id="next"> &#62; </label></td>
						</tr>
						<tr>
							<td class="sun" align="center">Sun</td>
							<td align="center">Mon</td>
							<td align="center">Tue</td>
							<td align="center">Wed</td>
							<td align="center">Thu</td>
							<td align="center">Fri</td>
							<td class="sat" align="center">Sat</td>
						</tr>
					</thead>
					<tbody id="calendar-body" class="calendar-body"></tbody>
				</table>
			</div>
		</div>
	</div>

</body>
</html>