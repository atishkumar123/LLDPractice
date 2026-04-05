package FactoryPattern.ShapeFactory;

import FactoryPattern.shape.Circle;
import FactoryPattern.shape.Rectangle;
import FactoryPattern.shape.Shape;
import FactoryPattern.shape.Square;

public class ShapeFactory {

    public Shape getShape(String input){

        switch(input){
            case "CIRCLE":
                return new Circle();
            case "SQUARE":
                return new Square();

            case "RECTANGLE":
                return new Rectangle();
            default:
                return null;
        }

    }
}
