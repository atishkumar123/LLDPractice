package FactoryPattern;

import FactoryPattern.ShapeFactory.ShapeFactory;
import FactoryPattern.shape.Shape;

public class Main {

    public static void main(String[] args) {

        ShapeFactory shapeFactory=new ShapeFactory();

        Shape circle= shapeFactory.getShape("CIRCLrE");

        circle.draw();
    }

}
