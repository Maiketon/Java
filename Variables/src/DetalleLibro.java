public class DetalleLibro {


    static void main(String[] args) {
        String tituloLibro ="El señor de los anillos";
        //Memoria stack; guarda los valores directamente en si, si se tratan de tipos de datos primitivos

        //Memoria Heap, guarda en Stack el valor de dirección de memoria , de la memoria heap donde se encuentra el valor del objeto//

        int anioPublicacion=1954;
        boolean libroDisponible=true;
        double precio =500.50;

        System.out.println(tituloLibro);
        System.out.println(anioPublicacion);
        System.out.println(libroDisponible);
        System.out.println(precio);

        //Modificar el titulo del libro//

        tituloLibro="El Señor de los Anillos";

    }
}
