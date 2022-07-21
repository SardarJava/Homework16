import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write down the radius:  ");
        int number = scanner.nextInt();


        Circle circle = new Circle(Math.PI);
        circle.area();
        int radius = number;
        System.out.println("The area equals to: " + Math.PI * (radius * radius));

        circle.circumference();
        System.out.println("The circumference equals to: " + Math.PI * 2 * radius);









    }}