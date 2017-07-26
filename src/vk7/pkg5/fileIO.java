/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vk7.pkg5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 *
 * @author Qnaerhi
 */
public class fileIO {
    private String filename;
    
    public fileIO(String s) {
        filename = s;
    }
       
    public void writeText(String text) throws FileNotFoundException, IOException {
        BufferedWriter out = new BufferedWriter(new FileWriter(filename));
        out.write(text);
        out.close();
    }
     public String readText() throws FileNotFoundException, IOException {
        BufferedReader in = new BufferedReader(new FileReader(filename));
        String s;
        String f = "";
        while ((s = in.readLine()) != null) {
            f +=s + "\n";
        }
        in.close();
        return f;
    }
}
