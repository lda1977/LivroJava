/**
 * Este programa ilustra as diferenças
 * entre int e double.
 */
public class Exemple3 {
    public static void main(String[] args) {
        int w; /*  esta instrução declara uma variável int */
        double x; /*  esta instrução declara uma variável de ponto flutuante */

        w = 10;
        x = 10.1;

        System.out.println("O valor original de w:  " + w);
        System.out.println("O valor original de x:  " + x);

        System.out.println(); /* Um linha em branco */
        /* Dividindo por 4 w e x */
        w = w / 4;
        x = x / 4;

        System.out.println("W divisão é:  " + w);
        System.out.println("x divisão é:  " + x);
    }
}
