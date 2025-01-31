package com.fileinputoutput;

import java.io.*;

public class FileIOExample {
    public static void main(String[] args) {
        String fileName = "data.txt";
        String dataToWrite = "This is a sample data to be stored using File IO Streams.";
  
        try (FileOutputStream fos = new FileOutputStream(fileName);
             BufferedOutputStream bos = new BufferedOutputStream(fos)) {
            bos.write(dataToWrite.getBytes());
            System.out.println("Data written to the file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }

    
        File file = new File(fileName);
        if (!file.exists()) {
            System.out.println("File does not exist. Exiting...");
            return;
        }

     
        try (FileInputStream fis = new FileInputStream(fileName);
             BufferedInputStream bis = new BufferedInputStream(fis)) {
            int content;
            System.out.println("Data read from the file:");
            while ((content = bis.read()) != -1) {
                System.out.print((char) content);
            }
            System.out.println(); 
        } catch (IOException e) {
            System.out.println("An error occurred while reading from the file: " + e.getMessage());
        }
    }
}
