public class ReemplazarSubcadenas {


    static void main(String[] args) {
        //Reemplazar subcadenas

        var cadena="Hola Mundo";
        System.out.println("Cadena Original =" + cadena);

        //Reemplazando Mundo por "a Todos"

        var nuevaCadena = cadena.replace("Mundo","a todos");

        System.out.println("nuevaCadena = " + nuevaCadena);
    }
}
