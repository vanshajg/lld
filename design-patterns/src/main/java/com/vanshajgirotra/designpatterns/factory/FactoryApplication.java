package com.vanshajgirotra.designpatterns.factory;

public class FactoryApplication {
    public static void main(String[] args) {
        TransportFactory.buildTransport("ship").deliver();
    }
}
