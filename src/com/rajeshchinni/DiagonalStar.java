package com.rajeshchinni;

public class DiagonalStar {
    public static void main(String[] args) {
        printSquareStar(5);
        printSquareStar(8);
        // https://www.youtube.com/watch?v=DoUdYh9V5aQ
        // https://www.youtube.com/watch?v=stFbAQUSEnQ





    }


    public static void printSquareStar(int number) {



        if (number < 5) {
            System.out.println("Invalid Value");
        } else {
            int column; //i
            int row; //j

            for (column = 0; column < number; column++) {
                for (row = 0; row < number; row++) {
                    if (column == 0 ||
                            column == number - 1 ||
                            row == 0 ||
                            row == number - 1 ||
                            column == row ||
                            column == number - (row + 1)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }


    }





}










