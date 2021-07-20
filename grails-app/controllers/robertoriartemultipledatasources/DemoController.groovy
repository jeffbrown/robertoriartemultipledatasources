package robertoriartemultipledatasources

class DemoController {

    HelperService helperService

    def index() {
        Usuario usuario = helperService.saveNewUsuario()
        render "Usuario saved with id ${usuario.id}"
    }
}
