class NuevaClase{
    public int num1 = 25;
    public int num2 = 5;
}


public class Main {
    public static void main(String[] args) {

        NuevaClase atributo = new NuevaClase();

        int suma = atributo.num1 + atributo.num2;
        int resta = atributo.num1 - atributo.num2;
        int multiplicacion = atributo.num1 * atributo.num2;
        int division = atributo.num1 / atributo.num2;
        int modulo = atributo.num1 % atributo.num2;

        System.out.println("---------------------------------");
        System.out.println("X = {" + atributo.num1 + "}");
        System.out.println("Y = {" + atributo.num2 + "}");
        System.out.println("Suma: = {" + suma + "}");
        System.out.println("Resta: = {" + resta + "}");
        System.out.println("Multiplicación: = {" + multiplicacion + "}");
        System.out.println("División: = {" + division + "}");
        System.out.println("Módulo: = {" + modulo + "}");
        System.out.println("________________________________");

    }
}

