package com.company;

import java.io.File;
import java.io.IOException;

public class CreateFile {

    public CreateFile(String fileName) {
        try {
            File myObj = new File(fileName+".txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
