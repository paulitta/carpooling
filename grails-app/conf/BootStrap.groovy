import carpooling.Usuario


class BootStrap {

    def init = { servletContext ->
		
		10.times {
			def tmp = new Usuario(nombre: "Usuario${it}", apellido: "Apellido${it}", dni: 123456, email: 'lalala@gmail.com', telefono: 555555, contrasenia: '11111klsdkfd')
			tmp.save()
	
		}
	
    }
    def destroy = {

		
    }
	

}
