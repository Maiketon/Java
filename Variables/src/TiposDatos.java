public class TiposDatos {


    public static void main(String[] args) {

       //Guarda 8 bits
        byte tipoByte = 127;
        System.out.println("tipoByte = " + tipoByte);


        //Guarda hasta 16 bits
        short tipoShort =32000;
        System.out.println("tipoShort = " + tipoShort);

        //Guarda hasta 32 bits
        int tipoInt = 2147483647;
        System.out.println("tipoInt = " + tipoInt);

        //Guarda hasta 64 bits, tiene la casuistica, se comporata como un INT , si queremos usar los bits
        //completos, debemos agregar una l | L al final para podamos sacar provecho.
        long tipoLong = 987654321098765432L;

        //Punto flotante, con precisión de 2 decimales. Usamos F || f igual  que en Long para que tome
        //los demas decimales. Soporta 32 bits en float.


        float tipoFloat= 3.14F;

        //d || D para indicar que es un double

        double tipoDouble= 3.141516D;


        //Caracter
        //Cualquier caracter del juego unicode.
        char tipoChar='A';
        tipoChar =65; //Asignamos el numero en el cual el caracter A tiene en la tabla de caracteres Unicode
        //Hace la conversión automatica

        //Booleano
        boolean tipoBolean = true;
        tipoBolean= false;


        //valores default
        //enteros 0
        //punto flotante 0.0
        // char es el valor vacio \u0000
        //Tipo Booleano false
        // Tipos Object || String Null

    }
}
