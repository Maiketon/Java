public class GeneradorMailResuelto {


    static void main(String[] args)
    {
        System.out.println("**Generador de Emails");
        //Nombre completo del usuario//
        var nombreCompleto =" Miguel Angel Montoya Bautista";
        var nombreCompletoNormalizado= nombreCompleto.strip();
        nombreCompletoNormalizado = nombreCompletoNormalizado.replace(" ",".").toLowerCase();


        var nombreEmpresa =" Global Mentoring ";
        var nombreEmpresaNormalizado = nombreEmpresa.strip().toLowerCase().replace(" ",".");


        var extensionDominio =".com.mx";

       // var generarMail = new StringBuffer();

        //generarMail.append(nombreCompletoNormalizado).append("@").append(nombreEmpresaNormalizado).append(extensionDominio);

       // System.out.println("generarMail = " + generarMail);

        //Quitamos los espacio en blacno y convertimos a minusculas

        var dominioEmailNormalizado = "@"+ nombreEmpresaNormalizado+ extensionDominio;

        var emailNormalizado = nombreCompletoNormalizado +dominioEmailNormalizado;
        System.out.println("emailNormalizado = " + emailNormalizado);
    }
}
