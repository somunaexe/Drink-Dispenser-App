package io.github.somunaexe.dispenser.run;

public class Drink {
    private int id;
    private String name;
    private  boolean alcoholic;
    private double amountLeft;
    private double totalAmount;

    public Drink(
        int id,
        String name,
        boolean alcoholic,
        double amountLeft,
        double totalAmount)
    {
        this.id = id;
        this.name = name;
        this.alcoholic =  alcoholic;
        this.amountLeft = amountLeft;
        this.totalAmount = totalAmount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAlcoholic() {
        return alcoholic;
    }

    public void setAlcoholic(boolean alcoholic) {
        this.alcoholic = alcoholic;
    }

    public double getAmountLeft() {
        return amountLeft;
    }

    public void setAmountLeft(double amountLeft) {
        this.amountLeft = amountLeft;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }
}
