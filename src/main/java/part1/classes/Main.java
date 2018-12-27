package part1.classes;

import part1.classes.Car;

public class Main {
    public static void main(String[] args) {

        Car porshe = new Car();
        Car holden = new Car();

       // porshe.model = "Carrera"; // bad example, dont do that - its possible only when parameter model is public

        porshe.setModel("Carrera");
        System.out.println("Model is " + porshe.getModel());
        porshe.setModel("CAMARO");
        System.out.println("Model is " + porshe.getModel());



    }

}
