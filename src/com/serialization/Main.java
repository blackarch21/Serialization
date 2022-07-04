package com.serialization;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        Vehicle bmw = new Vehicle("bmw", 12344);
        Vehicle audi = new Vehicle("audi", 134221);
        try (FileOutputStream fos = new FileOutputStream("src\\files\\vehicle.dat")){
            try(ObjectOutputStream out = new ObjectOutputStream(fos)) {
                out.writeObject(bmw);
                out.writeObject(audi);
                System.out.println("File written");
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
