import java.util.Scanner;

public class aula17 {
    static Scanner teclado = new Scanner(System.in);

    /* nao utilizado
    public static double soma(double numero1, double numero2){
        return numero1 + numero2;
    }
     */

    public static double operacao(double numero1, double numero2, char letra){
        if (letra =='+'){
            return numero1 + numero2;
        } else if (letra == '-'){
            return numero1 - numero2;
        } else if (letra == '*'){
            return numero1 * numero2;
        } else {
            return numero1 / numero2;
        }
    }

    public static void main(String[] args) {
        double n1, n2;
        char letra;
        System.out.print("Informe o primeiro número: ");
        n1 = teclado.nextDouble();
        System.out.print("Informe o segundo número: ");
        n2 = teclado.nextDouble();
        /* nao utilizado
        System.out.println("A soma é " + soma(n1,n2));
        System.out.println("A soma é " + soma(3,5));
         */
        System.out.println("Selecione o tipo de operação (+, -, * ou /): ");
        letra = teclado.next().charAt(0);
        switch (letra){
            case '+' :
            case '-' :
            case '*' :
            case '/' :
                System.out.println(n1+" "+letra+" "+n2+" = "+operacao(n1,n2,letra));
                break;
            default :
                System.out.println("Operação inválida!");
                break;
        }
    }
}
