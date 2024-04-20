import java.util.Scanner;

public class operacionesBasica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //solicitar 2 números que se puedan sumar entre ellos
        //Buscar el resultado del un múmero al 2
        //Escribir 2 palabras y poner en una frase contenidas
        //Pedir 2 números y ver si son iguales o no

        //Suma de número
        System.out.print("Ingrese el primer número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double numero2 = scanner.nextDouble();

        double resultado = numero1 + numero2;
        System.out.println("La suma es: " + resultado);

        // Al cuandrado

        System.out.print("Ingrese el primer número: ");
        double numero01 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double numero02 = scanner.nextDouble();

        double suma = numero1 + numero2;
        System.out.println("La suma es: " + suma);

        double cuadradoNumero1 = Math.pow(numero01, 2);
        double cuadradoNumero2 = Math.pow(numero02, 2);
        System.out.println("El cuadrado del primer número es: " + cuadradoNumero1);
        System.out.println("El cuadrado del segundo número es: " + cuadradoNumero2);

        //Dos palabras, una frase

        System.out.print("Ingrese la primera palabra:  ");
        String palabra1 = scanner.nextLine();


        System.out.print("Ingrese la segunda palabra:  ");
        String palabra2 = scanner.nextLine();

        String frase = palabra1 + "   " + palabra2;
        System.out.println("La frase formada es: ");


        //Dos números y ver son iguales
        System.out.print("Ingrese el primer número: ");
        double numero001 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double numero002 = scanner.nextDouble();

        if (numero001 == numero002) {
            System.out.println("Los números son iguales.");
        } else {
            System.out.println("Los números NO son iguales.");
        }

    }
}