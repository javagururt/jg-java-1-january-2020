package com.javaguru.lessons.lesson5;

class TableDemo {

    public static void main(String[] args) {
        Table firstTable = new Table();
        Table secondTable = new Table();

        firstTable.setColor("Black");
        firstTable.setMaterial("Metal");

        secondTable.setColor("White");
        secondTable.setMaterial("Plastic");

        String firstTableTextualRepresentation = firstTable.toString();
        System.out.println(firstTableTextualRepresentation);

        System.out.println(secondTable);
    }
}
