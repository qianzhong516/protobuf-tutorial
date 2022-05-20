package com.tutorialspoint.greeting;

import java.io.FileOutputStream;
import java.io.IOException;
import com.tutorialspoint.greeting.Greeting.Greet;

class GreetWriter {
    public static void main(String[] args) {
        Greet greet = Greet.newBuilder().setUsername(args[0]).setGreeting(args[1]).build();

        String filename = "greeting_proto_output";

        try (FileOutputStream output = new FileOutputStream(filename)) {
            greet.writeTo(output);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Saved greeting with following data to disk: \n" + greet);
    }
}
