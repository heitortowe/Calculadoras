import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Calculadora calc = new Calculadora();

        System.out.println("Menu" +
                "\n1- Soma" +
                "\n2- Subtração"+
                "\n3- Multiplicação"+
                "\n4- Divisão"+
                "\n5- Potenciação"+
                "\n6- Porcentagem"+
                "\n7- Raiz Quadrada");

        int opcao = sc.nextInt();

        switch (opcao){
            case 1:
                System.out.println(calc.soma());
                break;
            case 2:
                System.out.println(calc.subracao());
                break;
            case 3:
                System.out.println(calc.multiplicacao());
                break;
            case 4:
                System.out.println(calc.divisao());
                break;
            case 5:
                System.out.println(calc.potenciacao());
                break;
            case 6:
                System.out.println(calc.porcentagem());
                break;
            case 7:
                System.out.println(calc.raizQuadrada());
                break;


        }

    }

}