package entities;

import entities.enums.Color;

public class Rectangle extends Shape{

    private String name = "Rectangle";
    private Double width;
    private Double height;

    public Rectangle(){
        super();
    }

    public Rectangle(Double width, Double height, Color color){
        super(color);
        this.height = height;
        this.width = width;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Double area() {
        return width * height;
    }
}
