import javax.swing.plaf.synth.SynthTextAreaUI;

/**
 * Demonstra a instrução if.
 */
public class IfDemo {
    public static void main(String[] args) {
        int a, b, c;

        a = 2;
        b = 3;

        if (a < b) {
            System.out.println("A é menor que B: ");
        }/* Fim IF 1 */
        if (a == b) {
            System.out.println("Não é igual: ");
        }/* Fim IF 2*/
        System.out.println();
        c = a - b;
        System.out.println("C contem -1: ");
        if (c >= 0) {
            System.out.println("C não é negativo: ");
        }/* Fim IF 3 */
        if (c < 0) {
            System.out.println("C é negativo: ");
        }/* Fim IF 4 */
        System.out.println();
        c = b - a;
        System.out.println("C contain 1: ");
        if (c >= 0) {
            System.out.println("C não é negativo: ");
        }/* Fim IF 5 */
        if (c < 0) {
            System.out.println("C é negativo: ");
        }/* Fim IF 6 */

    }
}
