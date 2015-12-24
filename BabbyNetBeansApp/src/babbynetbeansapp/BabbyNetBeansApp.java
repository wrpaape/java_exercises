/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package babbynetbeansapp;
/**
 *
 * @author Reid
 */

public class BabbyNetBeansApp {
    static final double PI = 3.14159;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int radius;
        double area;

        radius = Integer.parseInt(args[0]);
        area = PI * (radius * radius);
        System.out.println("A circle of radius " + args[0] + " has area of " + area);
    }
}
