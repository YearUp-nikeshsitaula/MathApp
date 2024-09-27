package com.pluralsight;

import java.util.PrimitiveIterator;

public class MathApp {

    public static void main(String[] args) {
        // Question 1:
        // declare variables here
        int bobSalary = 5_000;
        int garySalary = 7_000;


        // then code solution

        int highestSalary = Math.max(bobSalary,garySalary);

        // then use System.out.println() to display results

        System.out.println("The highest salary is" + " " + "$" + highestSalary);

        // ex: System.out.println("The answer is " + answer);
        // REPEAT FOR NEXT EXERCISE
        //----------------------------------------------------------------------

        // Question 2:
        // declare variables here

        double carPrice = 9_000.78;
        double truckPrice = 30_000.67;

        // then code solution

        double lowestPrice = Math.min(carPrice,truckPrice);

        // then use System.out.println() to display results

        System.out.println("The lowest price is" + " " + "$" + lowestPrice);

        // ex: System.out.println("The answer is " + answer);
        // REPEAT FOR NEXT EXERCISE
        //--------------------------------------------------------------------

        // Question 3:
        // declare variables here

        double radius = 7.25;

        // then code solution
        double areaOfCircle = Math.PI * Math.pow(radius, 2);

        // then use System.out.println() to display results
        System.out.println("Area of the circle is" + " " + areaOfCircle);

        // ex: System.out.println("The answer is " + answer);
        // REPEAT FOR NEXT EXERCISE
        //----------------------------------------------------------------------

        // Question 4:
        // declare variables here

        double num1 = 5.0;

        // then code solution

        double squareRoot = Math.sqrt(num1);

        // then use System.out.println() to display results

        System.out.println("Square root =" + " " + squareRoot);

        // ex: System.out.println("The answer is " + answer);
        // REPEAT FOR NEXT EXERCISE
        //--------------------------------------------------------------------

        // Question 5:
        // declare variables here
        double firstLinePoint1 = 5;
        double firstLinePoint2 = 10;
        double secondLinePoint1 = 85;
        double secondLinePoint2 = 50;

        // then code solution

        double firstPoint = Math.pow(firstLinePoint1 - secondLinePoint1,2);
        double secondPoint = Math.pow(firstLinePoint2 - secondLinePoint2, 2);
        double distancePoint = Math.sqrt(firstPoint + secondPoint);

        // then use System.out.println() to display results

        System.out.println("Distance between two points is" + " " + distancePoint);

        // ex: System.out.println("The answer is " + answer);
        // REPEAT FOR NEXT EXERCISE
        //----------------------------------------------------------------------

        // Question 6:
        // declare variables here

        double num2 = -3.8;

        // then code solution

        double absoluteValue = Math.abs(num2);

        // then use System.out.println() to display results

        System.out.println("The abosulte value is" + " " + absoluteValue);
        // ex: System.out.println("The answer is " + answer);
        // REPEAT FOR NEXT EXERCISE
        //----------------------------------------------------------------------

        // Question 7:
        // declare variables here
        // then code solution
        double randomNum = Math.random();

        // then use System.out.println() to display results

        System.out.println("Random number from 0 and 1 =" + " " + randomNum);
        // ex: System.out.println("The answer is " + answer);
    }
}
