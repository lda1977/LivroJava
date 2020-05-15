/* O programa a seguir cria duas variáveis chamadas var1 e var2. */

public class Example2 {
    public static void main(String[] args) {
        /**
         *  Instruções de declaração de variaveis interio,  Em Java, todas as variáveis devem
         *  ser declaradas antes de serem usadas.
         *  */
        int var1;
        int var2;
        var1 = 1024; /*  atribui a var1 o valor 1024: */

        /**
         *  código exibe o valor de var1 precedido pelo string “var1
            contains”
         */
        System.out.println("Valor constande de Var1 é: " + var1);
        /**
         * atribui a var2 o valor de var1 dividido por 2:
         * Essa linha divide o valor de var1 por 2 e armazena o resultado em var2.
         *  */
        var2 = var1 / 2;
        System.out.print("Var2 contem var1 / 2: ");
        System.out.println(var2);
    }
}
