namespace java org.example.thrift.impl

exception InvalidOperationException {
    1: i32 code,
    2: string description
}

struct HelloThriftResource {
    1: i32 id,
    2: string name,
    3: optional string salutation
}

service HelloThriftService {

    HelloThriftResource get(1:i32 id) throws (1:InvalidOperationException e),

    void save(1:HelloThriftResource resource) throws (1:InvalidOperationException e),

    list <HelloThriftResource> getList() throws (1:InvalidOperationException e),

    bool ping() throws (1:InvalidOperationException e)
}
