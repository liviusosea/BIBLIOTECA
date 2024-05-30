import java.util.*;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;
import java.lang.String;

 class Romane extends Carte {
        
         String gen;    
     
       public Romane(String titlu, String autor, int Pag, String gen){
          
         super(titlu, autor, Pag);
         this.gen = gen;
          
        }
        
        
        @Override
        public String toString(){
        return "Titlu: " + titlu + ", Autor: " + autor + ", Pagini: " + Pag + ", Gen: " + gen;
    
        }
        
    }
          
          
      