public class DetalleProducto {
    public static void main(String[] args) {
        String nombreProducto="Latitas Nupec";
        double precio = 10.50;
        int cantidadDisponible=1;
        boolean isDisponible = true;

        System.out.println("isDisponible = " + nombreProducto);
        System.out.println("isDisponible = " + precio);
        System.out.println("isDisponible = " + cantidadDisponible);
        System.out.println("isDisponible = " + isDisponible);


        // De los valores de cada Variable

        nombreProducto="Latitas Nupec Premium";
        precio=9.90;
        cantidadDisponible= 10;
        isDisponible= true;

        System.out.println("isDisponible = " + nombreProducto);
        System.out.println("isDisponible = " + precio);
        System.out.println("isDisponible = " + cantidadDisponible);
        System.out.println("isDisponible = " + isDisponible);
    }
}
