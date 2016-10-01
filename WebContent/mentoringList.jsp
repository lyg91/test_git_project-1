<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
	<%@ page import="java.util.ArrayList"%>
<%@ page import="work.model.dto.Student"%>
<%@ page import="work.util.Utility"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<!-- Theme Made By www.w3schools.com - No Copyright -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="css/bootstrap.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<link href="css/common.css" rel="stylesheet" type="text/css">

<style>
.btn-warning {
	background-color: #F7BE81;
}
</style>
</head>
<body>
	<%@ include file="topMenu.jsp"%>

	<!-- Container (Portfolio Section) -->
	<div id="portfolio" class="container-fluid text-center bg-grey">
		<div class="row">


			<h2>Mentoring</h2>
			<h4>������ ����Ե���� ���丵</h4>

			<form class="form-inline">

				<div class="btn-group col-xs-12"
					style="margin: 0 auto; padding-left: 25%" data-toggle="buttons">
					<label class="btn"> <input type="hidden" name="options">
						�ι���ȸ����
					</label>

					<div class="btn-group" style="width: 500px">
						<label class="btn btn-warning"> <input type="radio"
							name="options" id="option3" autocomplete="off"> �濵�а�
						</label><label class="btn btn-warning"> <input type="radio"
							name="options" id="option3" autocomplete="off"> ������к�
						</label><label class="btn btn-warning"> <input type="radio"
							name="options" id="option3" autocomplete="off"> �߱����а�
						</label><label class="btn btn-warning"> <input type="radio"
							name="options" id="option3" autocomplete="off"> �Ϻ����а�
						</label><label class="btn btn-warning"> <input type="radio"
							name="options" id="option3" autocomplete="off"> ���Ʊ�����
						</label><label class="btn btn-warning"> <input type="radio"
							name="options" id="option3" autocomplete="off"> �濵�����а�
						</label>
					</div>

					<br> <br> <br> <label class="btn "> <input
						type="hidden" name="options" id="option3" autocomplete="on">
						���Ǻ�������
					</label>

					<div class="btn-group" style="width: 500px">

						<label class="btn btn-warning"> <input type="radio"
							name="options" id="option3" autocomplete="off"> ��ȣ�а�
						</label><label class="btn btn-warning"> <input type="radio"
							name="options" id="option3" autocomplete="off"> ����ġ���а�
						</label><label class="btn btn-warning"> <input type="radio"
							name="options" id="option3" autocomplete="off"> ��ǰ�����а�
						</label><label class="btn btn-warning"> <input type="radio"
							name="options" id="option3" autocomplete="off"> ��ȸ�����а�
						</label><label class="btn btn-warning"> <input type="radio"
							name="options" id="option3" autocomplete="off"> ���ɸ��а�
						</label><label class="btn btn-warning"> <input type="radio"
							name="options" id="option3" autocomplete="off"> ���ǰ����а�
						</label><label class="btn btn-warning"> <input type="radio"
							name="options" id="option3" autocomplete="off"> ��Ȱü���а�
						</label>

					</div>
					<br> <br>
					<br> <label class="btn "> <input type="hidden"
						id="option3" autocomplete="on"> ���б������
					</label>

					<div class="btn-group" style="width: 500px">

						<label class="btn btn-warning"> <input type="radio"
							name="options" id="option3" autocomplete="off"> ȭ�а�
						</label><label class="btn btn-warning"> <input type="radio"
							name="options" id="option3" autocomplete="off"> ������а�
						</label><label class="btn btn-warning"> <input type="radio"
							name="options" id="option3" autocomplete="off"> ���������ڿ��а�
						</label><label class="btn btn-warning"> <input type="radio"
							name="options" id="option3" autocomplete="off"> ȯ������ο����а�
						</label><label class="btn btn-warning"> <input type="radio"
							name="options" id="option3" autocomplete="off"> ��ǻ���к�
						</label><label class="btn btn-warning"> <input type="radio"
							name="options" id="option3" autocomplete="off">
							��ǻ��-��īƮ�δн����к�
						</label><label class="btn btn-warning"> <input type="radio"
							name="options" id="option3" autocomplete="off"> ȭ�л�����а�
						</label>
					</div>

					<br> <br> <br> <label class="btn "> <input
						type="hidden" name="options" id="option3" autocomplete="off">
						&nbsp;&nbsp; &nbsp;&nbsp;���д��� &nbsp;&nbsp;&nbsp;&nbsp;
					</label>

					<div class="btn-group" style="width: 500px">

						<label class="btn btn-warning"> <input type="radio"
							name="options" id="option3" autocomplete="off"> ���а�
						</label><label class="btn btn-warning"> <input type="radio"
							name="options" id="option3" autocomplete="off"> �����Ǿ���а�
						</label>
					</div>
					<br> <br> <label class="btn "> <input
						type="hidden" name="options" id="option3" autocomplete="off">
						��ȭ��������
					</label>

					<div class="btn-group" style="width: 500px">

						<label class="btn btn-warning"> <input type="radio"
							name="options" id="option3" autocomplete="off"> �����а�
						</label><label class="btn btn-warning"> <input type="radio"
							name="options" id="option3" autocomplete="off"> �̼��������а�
						</label><label class="btn btn-warning"> <input type="radio"
							name="options" id="option3" autocomplete="off">
							Ŀ�´����̼ǵ������а�
						</label><label class="btn btn-warning"> <input type="radio"
							name="options" id="option3" autocomplete="off"> �����а�
						</label><label class="btn btn-warning"> <input type="radio"
							name="options" id="option3" autocomplete="off"> ��Ʈ�ص������а�
						</label>
					</div>
					<br> <br>
					<br>
					<label class="btn "> <input type="hidden" name="options"
						id="option3" autocomplete="off"> &nbsp;&nbsp;
						&nbsp;&nbsp;���д���&nbsp;&nbsp; &nbsp;&nbsp;
					</label>
					<div class="btn-group" style="width: 500px">

						<label class="btn btn-warning"> <input type="radio"
							name="options" id="option3" autocomplete="off"> ���а�
						</label>
					</div>

				</div>

				<br> <br> <br> <br> <input type="text"
					class="form-control" size="50" placeholder="�˻�" required
					style="margin-top: 50px;">
				<button type="button" class="btn btn-danger"
					style="margin-top: 50px;">�˻�</button>
			</form>

			<div class="row">
				<div class="col-xs-6 ">
					<div class="thumbnail">
						<span class="col-xs-4"> <img src="images/ceci1.jpg"
							alt="..." class="img-circle"
							style="width: 150px; height: 150px; margin: 10px">
						</span> <span class="caption">
							<h3>Thumbnail label</h3>
							<p>...</p>
							<p>
								<a href="#" class="btn btn-primary" role="button">Button</a> <a
									href="#" class="btn btn-default" role="button">Button</a>
							</p>
						</span>
					</div>
				</div>
			</div>

		</div>
	</div>


	<%@ include file="footer.jsp"%>
</body>
</html>