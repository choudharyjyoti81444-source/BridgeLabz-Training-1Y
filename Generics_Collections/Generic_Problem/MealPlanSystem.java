package com.gla.Generics_Collections.Generic_Problem;

interface MealPlan {
    String getMealName();
}

class VegetarianMeal implements MealPlan {
    public String getMealName() {
        return "Vegetarian Meal";
    }
}

class VeganMeal implements MealPlan {
    public String getMealName() {
        return "Vegan Meal";
    }
}

class KetoMeal implements MealPlan {
    public String getMealName() {
        return "Keto Meal";
    }
}

class HighProteinMeal implements MealPlan {
    public String getMealName() {
        return "High Protein Meal";
    }
}

class Meal<T extends MealPlan> {
    T meal;
    Meal(T meal) {
        this.meal = meal;
    }

    public void showMeal() {
        System.out.println(meal.getMealName());
    }
}

public class MealPlanSystem {
    public static <T extends MealPlan> void generateMeal(T m) {
        System.out.println("Your Meal: " + m.getMealName());
    }

    public static void main(String[] args) {
        Meal<VegetarianMeal> m1 = new Meal<>(new VegetarianMeal());
        Meal<VeganMeal> m2 = new Meal<>(new VeganMeal());

        m1.showMeal();
        m2.showMeal();

        generateMeal(new KetoMeal());
        generateMeal(new HighProteinMeal());
    }
}
