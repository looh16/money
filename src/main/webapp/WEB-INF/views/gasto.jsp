<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css"
	integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp"
	crossorigin="anonymous">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.0/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"
	integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa"
	crossorigin="anonymous"></script>

<c:import url="header.jsp"></c:import>
<div class="col-md-10" align="center"
	style="margin-left: 110px; margin-top: 50px">

<body>
	<div align="left">
		<a href="cadastraGasto" class="btn btn-primary btn-sm">Novo Gasto</a> 
		<a href="cadastraGanho" class="btn btn-primary btn-sm">Novo Ganho</a> 
	</div>
	<table class="table table-striped">
		<thead>
			<tr>
				<th>Data</th>
				<th>Descrição</th>
				<th>Tipo</th>
				<th>Valor</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>1</td>
				<td>John</td>
				<td>Carter</td>
				<td>johncarter@mail.com</td>
			</tr>
			<tr>
				<td>2</td>
				<td>Peter</td>
				<td>Parker</td>
				<td>peterparker@mail.com</td>
			</tr>
			<tr>
				<td>3</td>
				<td>John</td>
				<td>Rambo</td>
				<td>johnrambo@mail.com</td>
			</tr>
		</tbody>
	</table>
		<c:import url="footer.jsp"></c:import>
	</body>
</div>
