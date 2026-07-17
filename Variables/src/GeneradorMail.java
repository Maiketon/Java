public class GeneradorMail {

    static void main(String[] args) {
        var nombreCompleto="Miguel Angel Montoya Bautista";
        var empresa="NFQ";
        var dominio="com.mx";

       //Descompocisión Nombre Completo y normalización a minusculas.
        var nombre1 = nombreCompleto.substring(0,6).toLowerCase();
        var nombre2 = nombreCompleto.substring(7,12).toLowerCase();
        var apellido1 = nombreCompleto.substring(13,20).toLowerCase();
        var apellido2 = nombreCompleto.substring(21,29).toLowerCase();

        //Normalización de empresa
        var empresaNormalizada=empresa.toLowerCase();

        //Concatencación
        var concatenacion = new StringBuffer();

        concatenacion.append(nombre1).append(".").append(nombre2).append(".").append(apellido1)
                .append(".").append(apellido2).append("@").append(dominio);

        System.out.println(concatenacion);

    }


}
