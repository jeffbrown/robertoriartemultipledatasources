package robertoriartemultipledatasources

class Usuario {
    String nombre
    String apellido
    static mapping = {
        datasources(['DEFAULT', 'IkebanaUser'])
    }
}
