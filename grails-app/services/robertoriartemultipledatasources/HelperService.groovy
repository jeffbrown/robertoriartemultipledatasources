package robertoriartemultipledatasources

import grails.gorm.transactions.Transactional

@Transactional("IkebanaUser")
class HelperService {

    Usuario saveNewUsuario() {
        def b = new Usuario(nombre: 'Sorrento', apellido: 'Sama')
        b.IkebanaUser.save()
    }
}
