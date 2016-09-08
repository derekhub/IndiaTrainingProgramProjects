package com.training.randomstuff;

public class RangeCheckException extends Exception {
    private long bookNumber;

    public RangeCheckException(long bookNumber) {
        super();
        this.bookNumber = bookNumber;
    }

    @Override
    public String getMessage() {
        return this.bookNumber + " should be 1,000-10,000";
    }
}
