package com.rajeshchinni;

public class LargestPrime {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(-1));



    }

    public static int getLargestPrime(int number){
        if (number < 2){
            return -1;
        }

        int count = 2;
        while (number > 1){
            if (number % count == 0){
                //System.out.println("count is " + count);
                number = number / count;
                //System.out.println("number is " + number);

            } else {
                count++;
                //System.out.println("count after addition is " + count);
            }
        } return count;
    }
}
