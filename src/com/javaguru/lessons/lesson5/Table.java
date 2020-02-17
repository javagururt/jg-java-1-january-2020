package com.javaguru.lessons.lesson5;

class Table {

    private String material;
    private String color;

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Table{" +
                "material='" + material + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
