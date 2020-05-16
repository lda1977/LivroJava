/**
 * Você pode usar o laço for, a instrução if e blocos de código para criar uma
 * versão melhorada do conversor de galões em litros desenvolvida na seção Tente
 * isto 1-1. Essa nova versão exibirá uma tabela de conversões começando com 1
 * galão e terminando em 100 galões. A cada 10 galões, uma linha em branco será
 * exibida. Isso é feito com o uso de uma variável chamada counter que conta o
 * número de linhas que foram exibidas. Preste atenção especial no seu uso.
 * Este programa exibe uma tabela de conversões
 * de galões em litros.
 */
public class GalToLitTable {
    public static void main(String[] args) {
        double gallons, litros;
        int contador;

        contador = 0;
        for (gallons = 1; gallons <= 100; gallons++) {
            litros = gallons * 3.7854;
            System.out.println(gallons + " Galões " + litros + " Litros: ");
            contador++;

            if (contador == 10) {
                System.out.println();
                contador = 0;
            }/* Fim IF */
        }/* Fim for */
    }
}
