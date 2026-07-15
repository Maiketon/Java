public class Constantes {

    static void main(String[] args) {
        System.out.println("Constantes en Java y su Sintaxis");

        final var DIAS_SEMANA = 7; // Realizamos inferencia con el tipo VAR, pero podemos declarar con otro tipo de dato

        final var PI =3.141516;

        System.out.println("PI = " + PI);
        System.out.println("DIAS_SEMANA = " + DIAS_SEMANA);
        System.out.println("Usando PI desde la libreria Math: "+ Math.PI);


        final var MENSAJE_BIENVENIDA = "Bienviedo al CUrso de Java del profe Ubaldo";

        System.out.println("Mensaje de Bienvenida"+MENSAJE_BIENVENIDA);





    }
}
