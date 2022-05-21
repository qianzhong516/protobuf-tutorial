package com.tutorialspoint.theater;

import java.io.FileInputStream;
import java.io.IOException;

import com.tutorialspoint.theater.TheaterOuterClass.Theater;

public class TheaterReader {
    public static void main(String[] args) {
        Theater.Builder theaterBuilder = Theater.newBuilder();

        String filename = "theater_protobuf_output";
        System.out.println("Reading from file " + filename);

        try (FileInputStream input = new FileInputStream(filename)) {
            Theater theater = theaterBuilder.mergeFrom(input).build();
            System.out.println(theater);
        } catch (IOException e) {
            System.out.println(e);
        }

    }
}
