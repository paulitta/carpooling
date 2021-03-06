<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

<title>Carpooling BA</title>

<link rel="stylesheet"
	href="${resource(dir: 'css', file: 'estilos.css')}" type="text/css" />
<link rel="stylesheet"
	href="${resource(dir: 'bootstrap/css', file: 'bootstrap-responsive.css')}"
	media="all" type="text/css" />
<link rel="stylesheet"
	href="${resource(dir: 'bootstrap/css', file: 'bootstrap.css')}"
	media="all" type="text/css" />
<script type="text/javascript"
	src="${resource(dir: 'bootstrap/js', file: 'jquery.js')}"></script>
<script type="text/javascript"
	src="${resource(dir: 'bootstrap/js', file: 'bootstrap.js')}"></script>

</head>

<body>

	<div id="bg_header">
		<img
			src="${resource(dir: 'images/carpooling', file: 'header_bg.jpg')}"
			height="114" width="1159" alt="header_bg" />

		<hr class="linea" />
		<div id="barra"></div>
		<div class="bg_contenido"></div>
	</div>

	<div id="contenedor">

		<div class="header">
			<g:link controller="index" action="renderIndexView">

				<img class="logo"
					src="${resource(dir: 'images/carpooling', file: 'logo.png')}"
					height="106" width="254" alt="logo" />

			</g:link>
		</div>
		<!--fin header_960-->

		<div class="menu">
			<ul>
				<li><g:link controller="index" action="renderIndexView">HOME</g:link></li>
				<li><a href="como_funciona.html">COMO FUNCIONA</a></li>
				<li><a href="perfil_usuario.html">MI PERFIL</a></li>
				<li><a href="agregar_viajes.html">MIS VIAJES</a></li>
				<li><g:link controller="index" action="renderTipoUsuarioView">TIPO USUARIO</g:link></li>
				<li><g:link controller="miembrosComunidad"
						action="renderMiembrosComunidadView">USUARIOS</g:link></li>
				<li><a href="#">CERRAR SESION</a></li>
			</ul>
		</div>
		<!--fin menu-->

		<div id="contenido">
			<ul>
				<g:each var="usuarios" in='${(usuario)}'>
					<li>Nombre: ${usuarios.nombre} <br /> Apellido: ${usuarios.apellido}
						<br /> DNI: ${usuarios.dni} <br /> Email: ${usuarios.email} <br />
						Telefono: ${usuarios.telefono} <br />
						<div class="seccion_imgs">
							<h3 style="text-align: center">
								<i class="glyphicon glyphicon-globe"></i>Usuarios de la
								comunidad Carpooling BA
							</h3>

							<g:each var="usuarios" in='${(usuario)}'>
								<li>
									<p>
										Nombre:
										${usuarios.nombre}
										- Apellido:
										${usuarios.apellido}
									</p>
									<p>
										Email:
										${usuarios.email}
									</p> <br></br>

								</li>
							</g:each>
						</div>
		</div>
		<!--fin contenido-->
		<div id="push"></div>
	</div>
	<!--fin contenedor-->

	<div id="footer">

		<div class="footer_960">

			<div id="foot_carpooling" class="secciones_foot">
				<h3>CARPOOLING</h3>
				<ul>
					<li><a href="index.html">Home</a></li>
					<li><a href="como_funciona.html">Como Funciona</a></li>
					<li><a href="#">Registrate</a></li>
					<li><a href="#">Contacto</a></li>
				</ul>
			</div>

			<div id="foot_mas_info" class="secciones_foot">
				<h3>MAS INFORMACION</h3>
				<ul>
					<li><a href="#">Acerca de Carpooling</a></li>
					<li><a href="#">Preguntas Frecuentes (FAQ)</a></li>
					<li><a href="#">Términos y Condiciones</a></li>
					<li><a href="#">Políticas de Privacidad</a></li>
				</ul>
			</div>

			<div id="foot_redes_sociales" class="secciones_foot">
				<h3>REDES SOCIALES</h3>
				<img
					src="${resource(dir: 'images/carpooling', file: 'redes_icons.png')}"
					height="33" width="117" alt="redes_icons" />
			</div>

			<hr class="linea_2" />

			<p>© 2013 | Crossing Barriers | Todos los derechos Reservados</p>

		</div>
		<!--fin footer_960-->

	</div>
	<!--fin footer-->
</body>
</html>