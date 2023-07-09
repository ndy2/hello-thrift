package org.example.hello;

import org.example.thrift.impl.HelloThriftResource;
import org.example.thrift.impl.HelloThriftService;

import java.util.Collections;
import java.util.List;

public class HelloThriftServiceImpl implements HelloThriftService.Iface {

    @Override
    public HelloThriftResource get(int id) {
        return new HelloThriftResource();
    }

    @Override
    public void save(HelloThriftResource resource) {
        // saveResource();
    }

    @Override
    public List<HelloThriftResource> getList() {
        return Collections.emptyList();
    }

    @Override
    public boolean ping() {
        System.out.println("ping");
        return true;
    }
}
