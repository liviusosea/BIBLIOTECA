import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Collections;
import java.lang.String;
import java.util.Comparator;




class Biblioteca {
  
    private static Biblioteca instance;
    private List<Carte> carti;
        
    
    //hai sa vedem
     //@Override
      private Biblioteca(){
          carti = new ArrayList<>();
          this.carti = new ArrayList<>();
         System.out.println("Biblioteca deschisa!");
     }
     
     private static Biblioteca singleton;
     
     public static Biblioteca getInstance(){
        if (singleton == null){
            singleton = new Biblioteca();
        }
        
        return singleton;
        }
    
        public void adaugaRomane(String titlu, String autor, int Pag, String gen){
        carti.add(new Romane(titlu, autor, Pag, gen ));
        //System.out.println("ai adaugat un roman");
    }
    
        public void adaugaPoezii(String titlu, String autor,int Pag, int nrDePoezii){
        carti.add(new Poezii(titlu, autor, Pag, nrDePoezii));
        //System.out.println("ai adaugat o carte cu poezii");
    }
      
    
    public void afiseazaCartile(){
        System.out.println("Cartile din biblioteca sunt:");
        for (Carte carte : carti){
            System.out.println(carte);
        }
        }
    
        public void afiseazaAutori() throws CarteaNuExistaException{
           Set<String> autori = new HashSet<>();
            for (Carte carte : carti) {
            autori.add(carte.getAutor());
            }
            if (!autori.isEmpty()) {
            System.out.println("Autorii sunt: ");
            for (String autor : autori) {
                System.out.println(autor);
            }
            } else {
                System.out.println("Autorul nu exista in biblioteca! ");
            }
        }
    
        
        public void afiseazaCarti(String titlu,String autor) throws CarteaNuExistaException{
                 Scanner scanner = new Scanner (System.in);
                 System.out.println ("Introduceti tilul cartii: ");
                 scanner.nextLine();
                 
        
            boolean match = false;
        
            for (Carte carte : carti){
            
                String carteInfo = carte.toString();
            
                int startIndex = carteInfo.indexOf("Pagini: ") + "Pagini: ".length();
                int endIndex = carteInfo.indexOf(",", startIndex);
                String paginiInfo = carteInfo.substring(startIndex, endIndex);
                int pages = Integer.parseInt(paginiInfo.trim());
                System.out.println(carteInfo + " numar pagini: " );
            
            
            
                if (carte.getTitlu().equalsIgnoreCase(titlu)){
                    
                
                  System.out.println(carte);
                  match = true;
                  break;
                }
            
                if (!match){
                throw new CarteaNuExistaException("Cartea nu exista!" + titlu );
                
                }
            
                        
                if (carte.getTitlu().equalsIgnoreCase(titlu) || carte.getAutor().equalsIgnoreCase(titlu)){
                   
                System.out.println(" Titlul: " + carte.getTitlu() + " de: " + carte.getAutor() + "SI ARE: " + carte.getPag());
                match = true;
                }
        
                if (!match){
                System.out.println( "Cartea nu exista!" + titlu);
                }
                if (carte instanceof Romane){
                System.out.println(" Pagini: " + ((Romane) carte).getPag() );
                }
                else if (carte instanceof Poezii){
                System.out.println(" Pagini: " + ((Poezii)  carte).getPag() + " numarul de poezii este: " + ((Poezii) carte).getNrDePoezii());
               // System.out.println(" numarul de poezii este: " + ((Poezii) carte).getNrDePoezii());
                }
            
            
                match = true;
                break;
           
            }
            if (false){
            throw new CarteaNuExistaException(" Aceasta carte: " + titlu + " nu este disponibila ");
            }
                
        }
    
          
       
        
       
      public void afiseazaAutor() throws CarteaNuExistaException{
        
           Scanner scanner = new Scanner (System.in);
           System.out.println(" Introduceti titlul cartii: ");
           String titlu = scanner.nextLine();
           
           
       boolean match = false;
       for(Carte carte : carti){
           
           if(carte.getTitlu().equalsIgnoreCase(titlu)){
               System.out.println("autorul este: " + carte.getAutor());
               match = true;
               break;
               
           }
       }
       
       if (match == false){
           
           System.out.println("carte " + titlu + " nu exista! ");
           throw new CarteaNuExistaException(" Aceasta carte: " + titlu + " nu este disponibila ");

           //catch (CarteaNuExistaException() -> {sout("Cartea nu exista")};
       }
    }
      
    
    

        public void afiseazaCartiSortate(){
            carti.sort(Comparator.comparing(Carte ::getTitlu));
            System.out.println(" Cartile sunt sortate dupa titlu: ");
            for (Carte carte : carti){
                System.out.println(" Titlu: " + carte.getTitlu() + " Autor: " + carte.getAutor() );
            }
        }
    }
    
    
        
    
