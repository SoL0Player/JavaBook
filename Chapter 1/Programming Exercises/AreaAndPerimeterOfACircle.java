/*
 * Programming Excersise 1.8
 * Write a program that displays the area and perimeter 
 * of a circle that has a radius of 5.5 using the following formula:
                        perimeter = 2 * radius * p
                        area = radius * radius * p
 */

public class AreaAndPerimeterOfACircle {
    public static void main(String[] args) {
        System.out.print("perimeter: ");
        System.out.println( (2) * (5.5) * ( (1) - (1/3) + (1/5) - (1/7) + (1/9) - (1/11) ) );
        System.out.print("area = ");
        System.out.println( (5.5) * (5.5) * ( (1) - (1/3) + (1/5) - (1/7) + (1/9) - (1/11) ) );
    }
}
