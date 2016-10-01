<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>MCS ȸ������������</title>

<!-- Theme Made By www.w3schools.com - No Copyright -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="css/bootstrap.css">
<script src="js/ajax.js"></script>


<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<link href="css/common.css" rel="stylesheet" type="text/css">


<script type="text/javascript">
	function isPw() {
		//web.xml
		var url = "controller";

		var params = "";
		params += "action=pwCheck";

		var pw = document.getElementById("pw").value;
		params += "&pw=" + pw;

		// ���䵥���� : Json
		params += "&responseDataType=json";

		//�������� �ݹ� �Լ� ���ε�
		var callback = responseJson;
		var method = "GET";
		// js/ajax.js ��ũ��Ʈ �̿���� ajax ���� ��û
		new ajax.xhr.Request(url, params, callback, method)
	}

	/** Json ���䵥���� ó�� callback �Լ�
	 {"valid","true"}

	 eval("1+2") =>���ڿ����� ��ȯ�Լ�
	 json ������ ���ڿ��� json��ü ��ȯ
	 eval("("+json������ ���乮�ڿ�+")")
	 */
	function responseJson(xhr) {
		if (xhr.readyState == 4 && xhr.status == 200) {
			var resultJson = eval("(" + xhr.responseText + ")");
			var result = resultJson.valid;
			if (result == 'true') {
				// messageUserId ����޼��� ���
				document.getElementById("pwConfirm").innerHTML = "<span class='glyphicon glyphicon-ok' aria-hidden='true'></span><span class='sr-only'>Error:</span>��ġ ";
				document.getElementById("btnPw").disabled = false;

			} else if (result == 'false') {
				document.getElementById("pwConfirm").innerHTML = "<span class='glyphicon glyphicon-remove' aria-hidden='true'></span><span class='sr-only'>Error:</span>����ġ ";
				document.getElementById("btnPw").disabled = true;
				document.getElementById("pw").focus();


			} else if (result == 'required') {
				document.getElementById("pwConfirm").innerHTML = "���Է�";
				document.getElementById("btnPw").disabled = true;
				document.getElementById("pw").focus();

			}
		}

	}
	 
	 
	 function isPwDelete() {
			//web.xml
			var url = "controller";

			var params = "";
			params += "action=pwCheckDelete";

			var pwDelete = document.getElementById("pwDelete").value;
			params += "&pwDelete=" + pwDelete;

			// ���䵥���� : Json
			params += "&responseDataType=json";

			//�������� �ݹ� �Լ� ���ε�
			var callback = responseJson2;
			var method = "GET";
			// js/ajax.js ��ũ��Ʈ �̿���� ajax ���� ��û
			new ajax.xhr.Request(url, params, callback, method)
		}

		/** Json ���䵥���� ó�� callback �Լ�
		 {"valid","true"}

		 eval("1+2") =>���ڿ����� ��ȯ�Լ�
		 json ������ ���ڿ��� json��ü ��ȯ
		 eval("("+json������ ���乮�ڿ�+")")
		 */
		function responseJson2(xhr) {
			if (xhr.readyState == 4 && xhr.status == 200) {
				var resultJson = eval("(" + xhr.responseText + ")");
				var result = resultJson.valid;
				if (result == 'true') {
					// messageUserId ����޼��� ���
					document.getElementById("pwConfirmDelete").innerHTML = "<span class='glyphicon glyphicon-ok' aria-hidden='true'></span><span class='sr-only'>Error:</span>��ġ ";
					document.getElementById("btnPwDelete").disabled = false;

				} else if (result == 'false') {
					document.getElementById("pwConfirmDelete").innerHTML = "<span class='glyphicon glyphicon-remove' aria-hidden='true'></span><span class='sr-only'>Error:</span>����ġ ";
					document.getElementById("btnPwDelete").disabled = true;
					document.getElementById("pwDelete").focus();


				} else if (result == 'required') {
					document.getElementById("pwConfirmDelete").innerHTML = "���Է�";
					document.getElementById("btnPwDelete").disabled = true;
					document.getElementById("pwDelete").focus();

				}
			}

		}
</script>
</head>
<body id="myPage">

	<nav class="navbar navbar-default navbar-fixed-top">
	<div class="container">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle" data-toggle="collapse"
				data-target="#myNavbar">
				<span class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="success.jsp">MCS</a>
		</div>
		<div class="collapse navbar-collapse" id="myNavbar">

			<ul class="nav navbar-nav navbar-right">
				<li>
					<!-- Button trigger modal -->
					<button type="button" class="btn btn-primary " data-toggle="modal"
						data-target="#myModal" style="margin: 8px"><%=session.getAttribute("id")%>��&nbsp;<%=session.getAttribute("part")%>���</a>
					</button> <!-- Modal -->


				</li>
				<li><a href="about.jsp">ABOUT</a></li>
				<li><a href="mentoring.jsp">���丵</a></li>
				<li><a href="study.jsp">�׷콺�͵�</a></li>
				<li><a href="kin.jsp">����IN</a></li>
				<li><a href="notice.jsp">��������</a></li>

			</ul>
		</div>
	</div>

	</nav>

	<div class="jumbotron text-center">



		<h1>MC in SYU</h1>
		<p>Mentoring Campus in Sahmyook University</p>
		<form class="form-inline">
			<input type="text" class="form-control" size="50" placeholder="�˻�"
				required>
			<button type="button" class="btn btn-danger">�˻�</button>
		</form>
	</div>



	<!-- Container (Services Section) -->
	<div id="services" class="container-fluid text-center">

		<h2>MCS</h2>
		<h4><%=session.getAttribute("id")%>��&nbsp;<%=session.getAttribute("part")%>���
		</h4>
		<br>
		<div class="row slideanim">
			<div class="col-sm-4">
				<a href="controller?action=studentList"> <span
					class="glyphicon glyphicon-user logo-small"></span>
					<h4>ȸ������</h4></a>
			</div>
			<div class="col-sm-4">
				<a data-toggle="modal" data-target="#upPwModal"> <span
					class="glyphicon glyphicon-lock logo-small"></span>
					<h4>���͵����</h4></a>

			</div>
			<div class="col-sm-4">
				<a data-toggle="modal" data-target="#deleteModal"> <span
					class="glyphicon glyphicon-trash logo-small"></span>
					<h4>���丵����</h4></a>

			</div>
		</div>
		<br> <br>
		<div class="row slideanim">
			<div class="col-sm-4">
				<a href="#"> <span
					class="glyphicon glyphicon-education logo-small"></span>
					<h4>�����ΰ���</h4></a>
			</div>
			<div class="col-sm-4">
				<a href="#"> <span
					class="glyphicon glyphicon-heart-empty logo-small"></span>
					<h4>��������</h4>
				</a>
			</div>
			<div class="col-sm-4">
				<a href="#"> <span
					class="glyphicon glyphicon-info-sign logo-small"></span>
					<h4>1��1���� ����</h4></a>
			</div>

		</div>
		<br> <br>
		<div class="row slideanim">
			<div class="col-sm-4">
				<a href="#"> <span
					class="glyphicon glyphicon-question-sign logo-small"></span>
					<h4>��������</h4></a> </a>
			</div>
			<div class="col-sm-4">
				<a href="#"> <span
					class="glyphicon glyphicon-envelope logo-small"></span>
					<h4>��������</h4></a>
			</div>
			<div class="col-sm-4">
				<a href="#"> <span class="glyphicon glyphicon-plane logo-small"></span>
					<h4>SU-Wings</h4></a>
			</div>
		</div>
	</div>


	<footer class="container-fluid text-center"> <a href="#myPage"
		title="To Top"> <span class="glyphicon glyphicon-chevron-up"></span>
	</a>
	<p>
		Made By group ACE &nbsp;&nbsp; designed By group ACE <br>Tel:02-112-1122
		&nbsp;&nbsp; e-mail: syu@ac.kr <br> <a href="#">www.ACEteam.com</a>
	</p>
	</footer>



</body>
</html>
