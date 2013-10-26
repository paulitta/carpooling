import carpooling.Usuario

class BootStrap {

	def init = { servletContext ->

		new Usuario(nombre: "Maria", apellido: "Lopez", dni: 33157053 , email: "marialopez@gmail.com", telefono: 35282463 , contrasenia: 'abc123').save(flush:true)

		//new Usuario(nombre: "Lucia", apellido: "Roldan", dni: 29157077 , email: "luciaroldan@gmail.com", telefono: 44414566 , contrasenia: 'def456').save()

		//new Usuario(nombre: "Marcos", apellido: "Suarez", dni: 27100732 , email: "marcossuarez@gmail.com", telefono: 15309921 , contrasenia: 'ghi000').save()

		//new Usuario(nombre: "Marcos", apellido: "Suarez", dni: 27100732 , email: "ms@gmail.com", telefono: 153099011 , contrasenia: 'aaa111').save()//repetido
	}

	def destroy = {
	}
}