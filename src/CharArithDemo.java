/**
 * Como char é um tipo de 16 bits sem sinal,
 */
public class CharArithDemo {
    public static void main(String[] args) {
        char ch;

        ch = 'x';
        System.out.println("Ch contain " + ch);

        /* Um char pode ser incrementado */
        ch++;
        System.out.println("Ch é novo " + ch);

        /* Um char pode receber um valor inteiro */
        ch = 90;
        System.out.println("Ch com decimal é: " + ch);
    }
}
