public class Cadenas {
    static void main(String[] args) {
        System.out.println(" Manejo de Cadenas en Java");
        var cadena1="Hola";
        System.out.println("Cadena1"+cadena1);

        var cadena2 ="Mundo";
        System.out.println("Cadena2"+cadena2);

        var cadena3 =cadena1 + " "+cadena2;

        System.out.println("Cadena3"+cadena3);

        //Cadena de multiples lineas , tambien conocida como text block

        var cadena4 = """
                Esta
                Es una cadena
                De multiples Lineas
                """;

        System.out.println("cadena1 = " + cadena1);
        System.out.println("cadena2 = " + cadena2);
        System.out.println("cadena3 = " + cadena3);
        System.out.println("cadena4 = " + cadena4);
    }
}
