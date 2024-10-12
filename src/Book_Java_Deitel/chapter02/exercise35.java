// two numbers are given and displays the squares and cubes of all numbers in the range between the given numbers

import java.util.Scanner;

public class exercise35 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number1;
        int number2;
        int number3;
        float square, cube;

        System.out.print("Enter two numbers and I will calculate the square and cube of the numbers in that range ");
        System.out.print("Enter first number: ");
        number1 = input.nextInt();

        System.out.print("Enter second number: ");
        number2 = input.nextInt();

        if (number1 > number2) {
            number3 = number1;
            number1 = number2;
            number2 = number3;
        }
        System.out.println(" Number | Square | Cube ");
        for (int i = number1; i <= number2; i++) {
            cube = i * i * i;
            square = i * i;
            System.out.printf("   %d   |   %.2f  |  %.2f \n", i, square, cube);

        }
    }// End of main method
}// End of example5 class