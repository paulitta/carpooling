class UrlMappings {

	static mappings = {
        "/$controller/$action?/$id?(.${format})?"{
            constraints {
                // apply constraints here
            }
        }
	
		//  "/"(view:"/index")
        //"/"(view:"/carpooling/busquedaDeViajes") // Modificado para que comience con el proyecto carpooling.
       
		"/"(view:"/carpooling/tipoUsuario")
		
		 "500"(view:'/error')
	}
}
