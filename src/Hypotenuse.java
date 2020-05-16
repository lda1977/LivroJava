/**
 * Usa o teorema de Pitágoras para
 * encontrar o comprimento da hipotenusa
 * dados os comprimentos dos dois lados
 * opostos.
 */
public class Hypotenuse {
    public static void main(String[] args) {
        double side1, side2, hypot;
        side1 = 3;
        side2 = 4;

        hypot = Math.sqrt(side1 * side1 + side2 * side2);
        System.out.println("Hypotenusa é:  " + hypot);
    }
}
