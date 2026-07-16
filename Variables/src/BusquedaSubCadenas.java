public class BusquedaSubCadenas {
    static void main(String[] args) {

        //Buscar en sub cadenax.

        //IndexOf- devuelve el indice de la primera apareición de la subcadena

        var cadena1="Hola Mundo;";

        //SubCadena a buscar "Hola"
        var indice1 =cadena1.indexOf("Hola");
        System.out.println("indice1 = " + indice1);

        //Last index of devuelve el indice de la ultima aparicio de la subcadena

        var indice2 =cadena1.lastIndexOf("Mundo");

        System.out.println("indice2 = " + indice2);

        //Si no se encuentra la cadena buscada, la funcion regresa -1
        var indice3=cadena1.lastIndexOf("Java");

        System.out.println("indice3 = " + indice3);
    }
}
