package com.sofka.project;
import java.io.*;

public class Readtext {
    public void leer(String nameOfFile){
        try {
            FileReader r = new FileReader(nameOfFile);
            BufferedReader buffer = new BufferedReader(r);

            String temp="";
            while (temp!=null){
              temp = buffer.readLine();
              if(temp==null)
                  break;
              System.out.println(temp);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
