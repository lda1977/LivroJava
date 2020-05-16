/**
 * aqui está um programa que calcula quantas polegadas há
 * em um cubo com 1x1x1 milhas:
 */
public class Inches {
    public static void main(String[] args) {
        long cubicInches;
        long inchesPerMile;

        /* Calcula quantas polegadas há em um milha */
        inchesPerMile = 5280 * 12;

        /* Calcula o numero de polegadas cúbicas */
        cubicInches = inchesPerMile * inchesPerMile * inchesPerMile;

        System.out.println("there are " + cubicInches + " cubic inches in a cubic mile ");

    }
}
