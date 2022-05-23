package com.tutorialspoint.theater;

import java.io.FileOutputStream;
import java.io.IOException;

import com.tutorialspoint.theater.TheaterOuterClass.Theater;

public class TheaterWriter {
    public static void main(String[] args) {
        Theater theater = Theater.newBuilder()
                .setName("Janice Zhong")
                .setAdderss("1, Beauty Street, NSW, Australia")
                .setTotalCapacity(320)
                .setMobile(98234567189L)
                .setBaseTicketPrice(22.45f)
                .build();

        String filename = "theater_protobuf_output";
        System.out.println("Saving theater information to file: " + filename);

        try (FileOutputStream output = new FileOutputStream(filename)) {
            theater.writeTo(output);
            System.out.println("Saved theater information with following data to disk: \n" + theater);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
