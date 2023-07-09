package org.example;

import org.example.hello.HelloThriftClient;

public class ClientMain {
    public static void main(String[] args) {
        new HelloThriftClient().ping();
    }
}
