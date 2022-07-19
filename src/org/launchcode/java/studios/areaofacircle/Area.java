package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;

public class Area {

    public static void main(String[] args) {

        double radius;
        double area;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius.");
        radius = input.nextDouble();
        input.close();

        area = 3.14 * radius * radius;
        System.out.println(String.format("The area of a circle with a radius of %s is %s", radius, area));



    }




}
