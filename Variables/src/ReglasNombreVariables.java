public class ReglasNombreVariables {
    public static void main(String[] args) {
        //Reglas nombre variables
        
        String nombreCompleto ="Juan Carlos";
        System.out.println("nombreCompleto = " + nombreCompleto);

        String NombreCompleto ="Juan Carlos 2"; // No aplica las buenas practicas

        // String nombre-cliente usa un - por lo cual el compilador no lo detecta

        //String nombre_cliente = "Juan" , Es correcto pero no aplica las buenas practicas.

        String $apellidoCompleto ="Miguel Montoya"; //Variable correcta, usamos $ y seguimos con notacion Camello
        boolean isCasado = true; //Formato correcto, aplicando buenas practicas

    }
}
