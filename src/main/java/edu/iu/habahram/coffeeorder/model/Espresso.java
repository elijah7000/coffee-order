package edu.iu.habahram.coffeeorder.model;

public class Espresso extends CondimentDecorator{
    public Espresso(Beverage beverage ){
        this.beverage = beverage;
    }
    @Override
    public float cost(){
        return beverage.cost() + 1.99F;
    }
    @Override
    public String getDescription(){
        return beverage.getDescription() + ", Esperesso";
    }
}
