package org.example;

public class HttpServerRunner {

    public static void main(String[] args) {

        HttpServer httpServer = new HttpServer(8082);
        httpServer.run();
    }
}
