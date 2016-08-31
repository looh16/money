<!DOCTYPE>

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
<div style="margin: 0 470px">
	<body>
	
		<div class="panel panel-default">
			<div class="panel-heading">Cadastro de ganho</div>
			<div class="panel-body">

				<form class="form-horizontal">
					<div class="form-group">
						<label for="inputEmail" class="control-label col-xs-2">Data</label>
						<div class="col-xs-6">
							<input type="text" class="form-control" id="inputEmail">
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-xs-2">O que</label>
						<div class="col-xs-6">
							<input type="text" class="form-control" id="inputPassword">
						</div>
					</div>

					<div class="form-group">
						<label class="control-label col-xs-2">Tipo</label>
						<div class="col-xs-6">
							<select name="Events" class="form-control">
								<option value="0" selected>Selecione o tipo</option>
								<option value="100M Run">100M Run</option>
								<option value="200M Run">200M Run</option>
								<option value="400M Run">400M Run</option>
								<option value="800M Run">800M Run</option>
							</select>
						</div>

					</div>
					<div class="form-group">
						<label class="control-label col-xs-2">Valor</label>
						<div class="col-xs-6">
							<input type="text" class="form-control" id="inputPassword">
						</div>
					</div>

					<div class="form-group">
						<label class="control-label col-xs-2"></label>
						<div class="col-xs-6 ">
							<button type="submit" class="btn btn-primary">Cadastrar</button>
							<button type="submit" class="btn btn-warning">Cancelar</button>
						</div>
					</div>
				</form>
			</div>
		</div>
		<c:import url="footer.jsp"></c:import>
	</body>
</div>
