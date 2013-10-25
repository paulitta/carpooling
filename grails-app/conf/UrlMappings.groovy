class UrlMappings {

	static mappings = {
        "/$controller/$action?/$id?(.${format})?"{
            constraints {
                // apply constraints here
            }
        }
		
		//  "/"(view:"/index")
        //"/"(view:"/carpooling/index") // Modificado para que comience con el proyecto carpooling.
		"/"(view:"/carpooling/tipoUsuario") // MODIFICADO PARA QUE COMIENCE CON LA PRIMERA VISTA DEL USUARIO LOGEADO
        "500"(view:'/error')
	}
}
