public class MasConcatenacionCadenas {

    static void main(String[] args) {
        //Mas formas de concatenar cadenas en Java


        var cadena1="Hola";
        var cadena2="Mundo";
        var cadena3= cadena1 +  " " + cadena2;


        //Metodo concat
        System.out.println("Concatenación con Concat");
        cadena3= cadena1.concat(" ").concat("Mundo");
        System.out.println("cadena3 = " + cadena3);


        //Metodo String Builder

        var constructorCadenas= new StringBuilder();

        constructorCadenas.append(cadena1);
        constructorCadenas.append(cadena2);

        var resultado = constructorCadenas.toString();

        System.out.println("Concatenación con String Builder");
        System.out.println("resultado = " + resultado);


        //StringBuffer

        var stringBuffer = new StringBuffer();
        System.out.println("Concatenación con String Buffer");
        stringBuffer.append(cadena1).append(" ").append(cadena2);
        resultado = stringBuffer.toString();
        System.out.println(resultado);



        //join
        //El String Join nos permite agregar un caracter para separar las cadenasy podemos ir concatenando
        // cadenas con comas
        resultado = String.join(" ",cadena1,cadena2, "Adios");
        System.out.println("Concatenación con String Join");
        System.out.println("resultado = " + resultado);
    }
}
