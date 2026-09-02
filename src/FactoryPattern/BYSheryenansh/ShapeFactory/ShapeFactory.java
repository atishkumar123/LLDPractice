package FactoryPattern.BYSheryenansh.ShapeFactory;

import FactoryPattern.BYSheryenansh.shape.Circle;
import FactoryPattern.BYSheryenansh.shape.Rectangle;
import FactoryPattern.BYSheryenansh.shape.Shape;
import FactoryPattern.BYSheryenansh.shape.Square;

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
