package FactoryPattern.BYSheryenansh;

import FactoryPattern.BYSheryenansh.ShapeFactory.ShapeFactory;
import FactoryPattern.BYSheryenansh.shape.Shape;

public class Main {

    public static void main(String[] args) {

        ShapeFactory shapeFactory=new ShapeFactory();

        Shape circle= shapeFactory.getShape("CIRCLrE");

        circle.draw();
    }

}
