package com.cinema.ChainOfResponsibility;

public interface Handler {

    void setNextHandler(Handler nextHandler);
    void handleRequest(Request request);
    
}