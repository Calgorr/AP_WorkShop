package com.company;

public class AUTMath {
    /**
     * gets two integers and returns their sum.
     *
     * @param num1 the num 1
     * @param num2 the num 2
     * @return int
     */
    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    /**
     * gets two integer and returns their subtraction.
     *
     * @param num1 the num 1
     * @param num2 the num 2
     * @return int
     */
    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    /**
     * gets two numbers and returns their subtraction.
     *
     * @param num1 the num 1
     * @param num2 the num 2
     * @return int
     */
    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    /**
     * gets two numbers and returns their division.
     *
     * @param num1 the num 1
     * @param num2 the num 2
     * @return int
     */
    //the problem was with the return type and the int division which I fixed by changing the return type to double
    //and multiplying num1 by 1.0
    public static double divide(int num1, int num2) {
        return num1 * 1.0 / num2;
    }

    /**
     * gets a number and returns its factorial.
     *
     * @param number the number
     * @return int
     */

    //changed result=0 to result=1
    //changed for (int counter = 0; counter < number; counter++) {   to for (int counter = 1; counter <= number; counter++) {
    //            result = multiply(result, number);                               result = multiply(result, counter);
    //        }                                                         }
    public static int factorial(int number) {
        int result = 1;

        for (int counter = 1; counter <= number; counter++) {
            result = multiply(result, counter);
        }
        return result;
    }

    /**
     * gets a base and a power and calculates base in power of the input.
     *
     * @param base  the base
     * @param power the power
     * @return int
     */


    //this method had two problems the first onw was with the condition in the for loop which I fixed by changing
    //counter <= base to counter <= power and the other one got fixed by changing
    //multiply(result, power) to multiply(result, base)
    public static int pow(int base, int power) {
        int result = 1;

        for (int counter = 1; counter <= power; counter++) {
            result = multiply(result, base);
        }

        return result;
    }

    /**
     * gets an index and calculates the fibonacci sequence at that exact index recursively.
     *
     * @param index the index
     * @return int
     */


    //fib method had two problems the first one was the base condition which was (index == 0 || index == 1)
    //fixed it by changing it to(index == 1 || index == 2)
    //the second problem was with the return type out of the if statement
    //at first it was (return fib(index - 1)) I changed it to (fib(index - 1)+fib(index-2))
    public static int fib(int index) {
        if (index == 1 || index == 2) {
            return 1;
        }

        return fib(index - 1) + fib(index - 2);
    }
}