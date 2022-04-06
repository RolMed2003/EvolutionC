package Clases.Apoyo;

public class Utilities {

    public boolean isInt(String numero){
        
        boolean X = true;
        
        try {
            
            int Y = Integer.parseInt(numero);
            
        } catch (NumberFormatException e) {
            
            X = false;
            
        }
        
        return X;
    }
    
    public boolean isFloat(String numero){
        
        boolean X = true;
        
        try {
            
            float Y = Float.parseFloat(numero);
            
        } catch (NumberFormatException e) {
            
            X = false;
            
        }
        
        return X;
    }

}
