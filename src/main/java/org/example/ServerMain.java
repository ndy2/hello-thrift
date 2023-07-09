package org.example;

import org.apache.thrift.transport.TTransportException;
import org.example.hello.HelloThriftServer;

public class ServerMain {
    public static void main(String[] args) throws TTransportException {
        new HelloThriftServer().start();
    }
}
