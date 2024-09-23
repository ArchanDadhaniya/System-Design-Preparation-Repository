package StructuralPatterns.DecoratorPattern;

import StructuralPatterns.DecoratorPattern.Decorator.ExtraCheese;
import StructuralPatterns.DecoratorPattern.Decorator.Mushroom;

public class Main {

    public static void main(String[] args) {
        // Order a plain FarmHouse pizza
        BasePizza farmhousePizza = new FarmHousePizza();
        System.out.println("FarmHouse Pizza cost: " + farmhousePizza.cost());

        // Order a FarmHouse pizza with extra cheese
        BasePizza farmhouseWithCheese = new ExtraCheese(farmhousePizza);
        System.out.println("FarmHouse Pizza with Extra Cheese cost: " + farmhouseWithCheese.cost());

        // Order a Margherita pizza with extra cheese and mushrooms
        BasePizza margheritaPizza = new MargheritaPizza();
        BasePizza margheritaWithCheeseAndMushrooms = new Mushroom(new ExtraCheese(margheritaPizza));
        System.out.println("Margherita Pizza with Extra Cheese and Mushrooms cost: " + margheritaWithCheeseAndMushrooms.cost());

        // Order a VegDelight pizza with mushrooms
        BasePizza vegDelightWithMushrooms = new Mushroom(new VegDelightPizza());
        System.out.println("VegDelight Pizza with Mushrooms cost: " + vegDelightWithMushrooms.cost());
    }
}
