package com.training.domains;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Utility {
    
    public void serialize(Invoice i){
        
        try{
            ObjectOutputStream out = new ObjectOutputStream (new FileOutputStream (new File ("abc.ser")));
            
            out.writeObject(i);
            System.out.println("serialized baby");
            
            } catch (IOException e) {
                e.printStackTrace();
        }
        
    }
    
    public void deserialize() throws FileNotFoundException, IOException, ClassNotFoundException{
        
        Object obj = null;
        
        try(ObjectInputStream inStream = new ObjectInputStream(new FileInputStream(new File("Invoice.ser")))){
            obj = inStream.readObject();
            
        } catch (IOException e){
            e.printStackTrace();
        }
        
    }

}
