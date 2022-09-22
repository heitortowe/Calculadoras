import java.util.Scanner;

public class Calculadora {

    public static Scanner sc = new Scanner(System.in);


    public double num1;
    public double num2;

    public double soma() {
        System.out.println("qual o 1° número");
        num1 = sc.nextDouble();

        System.out.println("qanto deseja adicionar?");
        num2 = sc.nextDouble();

        return num1 + num2;

    }

    public double subracao() {
        System.out.println("qual o 1° número");
        num1 = sc.nextDouble();

        System.out.println("quanto deseja subtrair?");
        num2 = sc.nextDouble();

        return num1 - num2;

    }

    public double multiplicacao() {
        System.out.println("qual o 1° número");
        num1 = sc.nextDouble();

        System.out.println("deseja multiplicar por quanto?");
        num2 = sc.nextDouble();

        return num1 * num2;

    }

    public double divisao() {
        System.out.println("qual o 1° número");
        num1 = sc.nextDouble();

        System.out.println("deseja dividir por quanto?");
        num2 = sc.nextDouble();

        return num1 / num2;
    }
    public double potenciacao () {
        System.out.println("qual o número");
        num1 = sc.nextDouble();

        System.out.println("deseja elevar a quanto?");
        num2 = sc.nextDouble();

        return Math.pow(num1, num2);
    }
    public double porcentagem () {
        System.out.println("número 1");
        double num1 = sc.nextDouble();
        System.out.println("número 2");
        double num2 = sc.nextDouble();

        return Math.pow(num1, num2);
    }
    public double raizQuadrada () {
        System.out.println("digite o número para fazer a raiz");
        double num1 = sc.nextDouble();
        return Math.sqrt(num1);
    }

}