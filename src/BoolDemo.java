/**
 * O tipo boolean representa os valores verdadeiro/falso.
 */
public class BoolDemo {
    public static void main(String[] args) {
        boolean b;

        b = false;
        System.out.println("B é: " + b);

        b = true;
        System.out.println("B é: " + b);

        if (b) {
            System.out.println("não é executado. ");
        }/* Fim IF*/
        System.out.println("10 > 9 é " + (10 > 9));
    }
}
