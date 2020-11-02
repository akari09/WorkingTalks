<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Working Talks My Calendar</title>

<link rel="stylesheet" type="text/css" href="css/common.css">
<link rel="stylesheet" type="text/css" href="calendar/main.css" />
<link rel="stylesheet" type="text/css" href="calendar/main.min.css" />
<script src="js/jquery-3.4.1.js"></script>
<script src="calendar/main.js"></script>
<script src="calendar/main.min.js"></script>
<script src="calendar/locales-all.js"></script>
<script>

document.addEventListener('DOMContentLoaded', function() {
	var calendarEl = document.getElementById('calendar');
	var calendar = new FullCalendar.Calendar(calendarEl, {
		schedulerLicenseKey: 'CC-Attribution-NonCommercial-NoDerivatives',
		locale: 'ja',
		initialView: 'dayGridMonth',
		headerToolbar: {
			left: 'prev,next today',
			center: 'title',
			right: 'dayGridMonth,timeGridWeek,timeGridDay'
		},
		events: [
			{
				title: 'All Day Event',
				start: '2020-10-01'
			},
			{
				title: 'Long Event',
				start: '2020-10-07',
				end: '2020-10-10'
	        },
			{
				title: 'Birthday Party',
				start: '2020-10-13T07:00:00'
			}
		]
	});
	calendar.render();
});

</script>
</head>
<body>
		<div class="main-contents">
		
			<div id="calendar" style="height: 70%; width: 70%; margin: 40px auto;"></div>
		
		</div>

</body>
</html>