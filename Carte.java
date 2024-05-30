import java.util.*;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;
import java.lang.String;
import java.util.List;

 abstract class Carte  {
     
     protected String titlu;
     protected String autor;
     protected int Pag;
    //facem un constructor cu parametrii
    
        
    public  Carte(String titlu, String autor, int Pag){
        
        this.titlu = titlu;
        this.autor = autor;
        this.Pag = Pag;
                
        
    }
    
    
    public String getTitlu(){
        return titlu;
    }
         
    public String getAutor(){
        return autor;
    }
       
    public int getPag(){
        return Pag;
    }
    
    public abstract String toString();
  
}


    
    
    
   