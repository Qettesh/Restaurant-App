package dev.lpa;

import java.util.Scanner;

public enum DrinkSize {
    //Enum for drink sizes and their prices

        SMALL("Small", 1.25),
        MEDIUM("Medium", 1.65),
        LARGE("Large", 1.85);

        protected DrinkSize size;
        protected double price;

        DrinkSize(DrinkSize size, double price) {
            this.size = size;
            this.price = price;
        }

    private static void createDrinkSize(MealOrder mealOrder, Scanner input) { //Create drink size method
        System.out.println("\n-----Custom Meal Order System-----");
        System.out.println("Enter burger type: ");
        String burgerType = input.nextLine();
        System.out.println("Enter burger price: ");
        double  burgerPrice = input.nextDouble();
        System.out.println("Enter number of toppings: ");
        int numberOfToppings = input.nextInt();
        input.nextLine();
    }

    DrinkSize(String small, double v) {
    }

    public DrinkSize getSize() {
            return size;
        }

        public DrinkSize getName() {
            return this.size;
        }

        public double getPrice() {
            return this.price;
        }

}
