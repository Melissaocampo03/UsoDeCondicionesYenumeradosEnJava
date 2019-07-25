package enumerados;

public enum Constantes {

    MENSAJE_CUADRO("Esto es un mensaje"),
    MENSAJE_TITULO("Esto es un titulo"),
    MENSAJE_DOLAR_ALTO("El dolar esta muy alto"),
    MENSAJE_DOLAR_BAJO("El dolar esta muy bajo"),
    MENSAJE_INGRESO_VALOR("Ingresa un valor");

    private String mensaje;

    Constantes(String s) {

        this.mensaje = s;
    }

        public String getMensaje() {
            return mensaje;
        }



}
