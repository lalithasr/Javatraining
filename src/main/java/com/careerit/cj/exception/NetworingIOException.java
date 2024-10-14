package com.careerit.cj.exception;

public class NetworingIOException extends Exception {

    public NetworingIOException(String message) {
        super(message);
    }

    public static void main(String[] args) {
        try {
            throw new NetworingIOException("Network is down");
        } catch (NetworingIOException e) {
            System.out.println("Caught networking exception : "+e.getMessage());
        }
    }
}
