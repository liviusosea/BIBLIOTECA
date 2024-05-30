import java.util.*;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;
import java.lang.String;


   class Poezii extends Carte{
    
      
      private int nrDePoezii;
      
     public Poezii(String titlu, String autor, int Pag, int nrDePoezii){
          
         super(titlu, autor, Pag);
         this.nrDePoezii = nrDePoezii;
          
        }
        
        public int getNrDePoezii(){
            return nrDePoezii;
        }
        
        @Override
        public String toString(){
        return  "Titlu: " + titlu + ", Autor: " + autor + ", Pagini: " + Pag + ", Numar de poezii: " + nrDePoezii;
    
        }
      
    }

  
