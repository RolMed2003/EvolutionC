package Clases.Apoyo;

public class Utilities {

    public boolean isInt(String numero){
        
        boolean X = true;
        
        try {
            
            float Y = Integer.parseInt(numero);
            
        } catch (NumberFormatException e) {
            
            X = false;
            
        }
        
        return X;
    }

}
