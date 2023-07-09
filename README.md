# Hello apache thrift

- Apache thrift 란? - https://thrift.apache.org/
- 참고 자료 - https://www.baeldung.com/apache-thrift

## How to Run

1. `thrift -r -out generated --gen java src/main/resources/hello-thrift.thrift`

(이미 실행 되어 있음)
-> generated 폴더 하위에 IDL 기반 Service/Resource/Exception 파일 생성

2. run `ServerMain.java` -> run `ClientMain.java`

두 별도의 procedure 간 ping 메서드로 통신하는 모습을 살펴본다.
