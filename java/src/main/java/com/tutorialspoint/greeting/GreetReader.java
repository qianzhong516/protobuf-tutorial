package com.tutorialspoint.greeting;

import java.io.FileInputStream;
import com.tutorialspoint.greeting.Greeting.Greet;

public class GreetReader {
    public static void main(String[] args) {
        Greet.Builder greetBuilder = Greet.newBuilder();

        String filename = "greeting_proto_output";

        try (FileInputStream input = new FileInputStream(filename)) {
            Greet greet = greetBuilder.mergeFrom(input).build();
            System.out.println(
                    "Greeting: " + greet.getGreeting() + "\n" + "Username: " + greet.getUsername());
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
