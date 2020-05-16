/**
 * Embora os exemplos de programas anteriores ilustrem vários recursos importantes
 * da linguagem Java, eles não são muito úteis. Mesmo que você ainda não saiba muito
 * sobre Java, pode colocar em ação o que aprendeu para criar um programa prático.
 * Neste projeto, criaremos um programa que converte galões em litros. O programa
 * funcionará declarando duas variáveis double. Uma conterá o número de galões e a
 * outra o número de litros após a conversão. Um galão é equivalente a 3,7854 litros.
 * Logo, na conversão de galões em litros, o valor do galão é multiplicado por 3,7854.
 * O programa exibe tanto o número de galões quanto o número equivalente em litros.
 */
public class GalToLit {
    public static void main(String[] args) {
        double gallons; /* Contem o numero de um galões */
        double litros;  /* Contem o conversão para litros */

        gallons = 10;   /* Começa com 10 galões */
        litros = gallons * 3.7854;

        System.out.println(gallons + "Gallons é: " + litros + " Litros é: ");
    }
}
