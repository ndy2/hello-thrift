package org.example.hello;

import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;
import org.example.thrift.impl.HelloThriftService;

public class HelloThriftClient {

    public void ping() {
        try {
            TTransport transport;

            transport = new TSocket("localhost", 9090);
            transport.open();

            TProtocol protocol = new TBinaryProtocol(transport);
            HelloThriftService.Client client = new HelloThriftService.Client(protocol);

            System.out.print("Calling remote method...");

            client.ping();

            System.out.println("done.");

            transport.close();

        } catch (TException x) {
            x.printStackTrace();
        }

    }
}
