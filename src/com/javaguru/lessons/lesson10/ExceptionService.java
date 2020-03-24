package com.javaguru.lessons.lesson10;

class ExceptionService {

    void throwCheckedException() throws Exception {
        throw new Exception("CHECKED EXCEPTION");
    }

    void throwUncheckedException() {
        throw new RuntimeException("UNCHECKED EXCEPTION");
    }

}
