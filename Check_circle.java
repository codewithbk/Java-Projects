package com.company;

// I know the class and variable name is not so code because i am a beginner.

class Check_radius{

    // Here we use getter and setter method to gave data in class private variable

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    private double radius;
    private double area;
    private double perimeter;

    // it function use to check or you say it use for result my mean the final answer what happen !!

    public void answer(){

        // firstly i check that the variable are not null

        if (radius == 0.0){
            System.out.println("MAY, Be you not enter radius value ! \n Hint call .setRadius() ");
        } else if (area == 0.0){
            System.out.println("MAY, Be you not enter area value !\n Hint call .setArea()");
        } else if (perimeter == 0.0){
            System.out.println("MAY, Be you not enter perimeter value !\n Hint call .setPerimeter()");
        } else {

            // then just made a simply logic to check user input

            /**
             * You go these two url to check my code is write or not !!
             * https://www.google.com/search?q=how+to+find+the+radius+of+a+circle+given+the+perimeter (for perimeter)
             * https://www.google.com/search?q=how+to+find+the+radius+of+a+circle+given+the+area (for area)
             *
             * THE LOGIC :-
             *
             * the logic are very easy
             * 1. now i have all value but you know we are human so we all do mistake so i also validate the variable also.
             * 2. than, i make my own two variable (computer_perimeter , computer_area) where i check find area and perimeter by user radius
             * 3. than, i jest match my two variable (computer_perimeter , computer_area) to user input two variable (area , perimeter)
             * 4. Or, finally i print the answer using if else
             *
             * MORE IMPROVE :-
             *
             * 1. You add user_input in it by using Scanner Package
             * 2. ....!
             *  */


            double computer_perimeter = 2 * Math.PI * radius;
            double computer_area = Math.PI * radius * radius;

            computer_perimeter = Math.round(computer_perimeter*100.0)/100.0;
            computer_area = Math.round(computer_area*100.0)/100.0;

            if (computer_area == Math.round(area*100.0)/100.0){
                if (computer_perimeter == Math.round(perimeter*100.0)/100.0){
                    System.out.println("Ya, your Perimeter" + "(" + perimeter + ")" + " and Area"+ "(" + area + ")" + " correct according to Radius"+ "(" + radius + ")" + ".");
                }
            } else {
                System.out.println("Opp's, !! your Perimeter" + "(" + perimeter + ")" + " and Area"+ "(" + area + ")" + " does not according to Radius"+ "(" + radius + ")" + ".");
                System.out.println("Because According to your Radius" + "(" + perimeter + ")" + " your Area will be " + (computer_area) + " and Perimeter will be " + (computer_perimeter) + ".");
            }
        }


    }

}

public class task {
    public static void main(String[] args) {
        Check_radius check_radius = new Check_radius(); // Make a obj of class.
        check_radius.setRadius(0.0); // Set radius value
        check_radius.setArea(0.0); // Set Area value
        check_radius.setPerimeter(0.0); // Set Perimeter value
        check_radius.answer(); // !!!! Call These function to get Answer or final result..
    }
}
