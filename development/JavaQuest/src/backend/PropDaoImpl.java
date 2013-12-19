/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package backend;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 *
 * @author herman
 */
public abstract class PropDaoImpl {
    
    
     protected Properties load(String file) {
    
         Properties prop = new Properties();
          FileInputStream fis;
        
        try{
            fis = new FileInputStream(file);
            prop.load(fis);
            
            
        } catch(IOException ex){
            ex.printStackTrace();
            // TODO throw exception
        } 
        
        return prop;
    }
    
    protected void store(String file, Properties prop, boolean append) {
        
        FileOutputStream fos;
        
        try {
            fos = new FileOutputStream(file, append);
            prop.store(fos,null);
            fos.close();
        
        } catch(IOException ex){
            ex.printStackTrace();
             // TODO throw exception
        } 
        
    }
    
}
