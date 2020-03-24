package com.javaguru.lessons.lesson10;

class CheckedExceptionExample {

    public static void main(String[] args) {
        ExceptionService service = new ExceptionService();
        //handler
        try {
            service.throwCheckedException();
            System.out.println("TRY");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("FINALLY");
        }

        System.out.println("Hello World!");

        service.throwUncheckedException();

        System.out.println("The end.");
    }
}
