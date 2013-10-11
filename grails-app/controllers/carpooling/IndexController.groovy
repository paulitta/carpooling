package carpooling

class IndexController {

    def redirectMiembrosComunidadController() {
		
		redirect(controller:"MiembrosComunidadController", action:"renderMiembrosComunidadView")
		
	}
}
