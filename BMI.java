package csc1009.src.lect04;

import java.util.Scanner;

public class BMI {

    public static final double POUND = 0.45359237; //constant put in all caps. 
    public static final double INCH = 0.0254;
    
    public double height;
    public double weight;
    public double bmi;
    public String interpretation;


    public BMI(double height, double weight){
        this.height = height;
        this.weight = weight;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeightInMeters(){
        double heightInMeters = height * INCH;
        return heightInMeters;
    }

    public double getWeightInKilo(){
        double weightInKilo = weight * POUND;
        return weightInKilo;
    }

    public double getBmi() {
        double bmi = getWeightInKilo() / Math.pow(getHeightInMeters(),2);
        return bmi;
    }

    public void setBmi(double bmi) {
        this.bmi = bmi;
    }

    public String getInterpretation() {
        if (getBmi() < 18.5){
            return "Underweight";
        }
        else if (getBmi() <25.0){
            return "Normal";
        }
        else if (getBmi() <30){
            return "Overweight";
        }
        else{
            return "Obese";
        }
    }

    public void setInterpretation(String interpretation) {
        this.interpretation = interpretation;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();

        System.out.print("Enter height in iches: ");
        double height = input.nextDouble();

        BMI bmi = new BMI(height, weight);

        System.out.printf("BMI is %.15f \n", bmi.getBmi());
        System.out.println(bmi.getInterpretation());
        
        input.close();

    }
}
