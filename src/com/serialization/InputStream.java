package com.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class InputStream {
    public static void main(String[] args) {
        try (FileInputStream fio = new FileInputStream("src\\files\\vehicle.dat")){
            try (ObjectInputStream ois= new ObjectInputStream(fio)){
                Vehicle v1 = (Vehicle) ois.readObject();
                Vehicle v2 = (Vehicle) ois.readObject();
                System.out.println("Vehicle1: "+ v1);
                System.out.println("Vehicle2: "+ v2);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
