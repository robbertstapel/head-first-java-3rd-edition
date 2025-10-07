package com.example.api;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        SimpleHttpServer server = new SimpleHttpServer();
        server.start();
    }
}
