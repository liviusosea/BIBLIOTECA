import java.util.*;
/*import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;*/

 class idei
 
 
    {
        
    
    private String titlu;
    private int pag;
    private String autor;
    private String romane;
    private String poezii;
    private String gen;
    
    
}
  






    /*
           public void afiseazaToateCartile(){
            System.out.println(" Cartile din biblioteca sunt urmatoarele: ");
            for (Carte carte : carti){
                System.out.println( " Titlu: " + carte.getTitlu() + " scrisa de " + carte.getAutor() + " gen: " + carte.getGen());
            }*/
            
            /*
           public void alegeOptiuni(String optiune) throws CarteaNuExistaException {
               String [] parts = optiune.split(" ");
               String operation = parts[0];
               
               switch (operation){
                   case "ADD_ROMAN":
                       if (parts.length == 5){
                           String titlu = parts[1];
                           String autor = parts[2];
                           int Pag = Integer.parseInt(parts[3]);
                           String gen = parts[4];
                           adaugaRomane(titlu, autor, Pag, gen);
                           System.out.println("Roman adaugat cu succes!");
                        }
                        else {
                            System.out.println("Date incorecte");
                        }
                        break;
                        
                    case "ADD_POEZII": 
                        if (parts.length == 5){
                           String titlu = parts[1];
                           String autor = parts[2];
                           int Pag = Integer.parseInt(parts[3]);
                           int nrDePoezii = Integer.parseInt(parts[4]);
                           adaugaPoezii(titlu, autor, Pag, nrDePoezii);
                           System.out.println("Carte Poezii adaugata cu succes!");
                       }
                       else {
                            System.out.println("Date incorecte");
                        }
                        
                        
                    case "AF_CARTI":
                        afiseazaCartile();
                        break;
                        
                    case "AF_AUTOR":
                        
                        afiseazaAutori();
                        break;
                        
                        /*
                        if(parts.length == 2){
                            String autorToFind = parts[1];
                            afiseazaAutori(autorToFind);
                        }
                        else{
                            System.out.println("Date incorecte");
                        }
                        break;
                        default:
                            System.out.println("Date incorecte!" + operation);
                            
                            
                        }
               */
            
                    
                
                
        
           
        
    
    
    
        /*
        for (Romane roman : carti){
            System.out.println(roman);
        }
        
        for (Poezii poezii : carti){
            
            System.out.println(poezii);
        }*/
    
    
    /*
    
    public void afiseazaCartiSortate(){
        Collections.sort(carti, Comparator.comparing( carte -> carte.getTitlu));
        afiseazaCartiSortate();
    }
    
        */    
    
    /*
    
     * 
    public void adaugaCarte(String titlu, String autor, int pag){
        
               
        //c1.add( new Carte(titlu, autor, nrPag));//aici CRAPA pentru ca am metoda abstracta in CARTE
        System.out.println("a fost adaugata o carte noua de: ");
    }
    */
    
    
    /*
    private String afiseazaTitlu(String titlu){
        if (titlu.length() == 0){
            numeNou++;
            titlu = "Carti din biblioteca" + autorNecunoscut;
        }
        else{
            titlu = afiseazaTitlu(titlu);
            
        }
            return (this.titlu = titlu);
        }
        
    private int afiseazaNrPag(int pag){
        if (pag < 1){
            pag = 1;
        }
        return (this.pag = pag);
    }
    */
    

       
       /*
        String numeAutor = " ";
        String[] nume = autor.split(" ");
        
        for (int Autor = 0; Autor < nume.length - 1; Autor++){
            numeAutor += (nume[Autor]) + " ";
            
        }
        
        numeAutor += (nume[nume.length - 1]);
        return (this.autor = numeAutor);*/
    
    /*
    public String getTitlu(){
        return titlu;
    }
    
    
    public int getafiseazaNrPag(){
        return pag;
    }
    
    public String getAutor(){
        return autor;
    }
    
    */
    


    

         
       /*    
         String[] Poezii = new String[4];
         String[] Poezii2 = {"Catelus cu paru cret", "Gandacelul", "Somnoroase pasarele"};
       
       
        //ArrayList<String>PoeziiArrayList = new ArrayList<>();
        
        ArrayList<String>PoeziiArrayList2 = new ArrayList<>(Arrays.asList ("Catelus cu parul cret", "Gandacelul", "somnoroase pasarele"));
         
         System.out.println(PoeziiArrayList2.get(1));
         System.out.println(PoeziiArrayList2.get(2));
         
         PoeziiArrayList2.add("Scrisoarea a 3a");
         System.out.println(PoeziiArrayList2.get(3));
        
    
             
             
         Scanner scan = new Scanner(System.in);
         System.out.println("Introduceti numele cartii:");
         
         
         Poezii[0] = scan.next();
         Poezii[1] = scan.next();
        // Poezii[2] = scan.next();
         
         
         System.out.println(Poezii[0]);
         System.out.println(Poezii[1]);
         //System.out.println(Poezii[2]);
         
                    
        String[] Romane = {"Ion", "Amadeus", "Delfinul"};
         
        ArrayList<String>RomaneArrayList2 = new ArrayList<>(Arrays.asList ("Ion", "Amadeus", "Delfinul"));
         
         
         String[] Romane2 = new String[4];
         Romane[0] = scan.next();
         Romane[1] = scan.next();
         
         
         
         System.out.println(Romane[0]);
         System.out.println(Romane[1]);
         
         RomaneArrayList2.add("Linistea");
         System.out.println(PoeziiArrayList2.get(3));
         
        
        
         
         /*String t = scan.nextInt();
         scan.nextInt();
         
         System.out.println("Titlul cartii este:" + t );
         int [] a = new int[t];
         
         for (int i = 0; i < t; i++){
             a[i] = scan.nextInt();
         }
         
         for (int i = 0; i < t; i++){
             System.out.println(a[t]);
         }
         
         */
         
         
         
         /*
        Carte c1 = new Carte();
        c1.Carte();
        System.out.println(c1);
        
        
        //String Carte = Romane("Ion", "Liviu Rebreanu");
        //System.out.println("Romanul este: " + Carte.adaugaCarte());
        
                
        Carte c2 = new Carte();
        c2.Carte();
        System.out.println(c2);
        
        Carte c3 = new Carte();
        c3.Carte();
        System.out.println(c3);
        
        
        
        /*
        Poezii p1 = new Poezii();
        p1.Poezii();
        System.out.println(p1);
        
        Romane r1 = new Romane();
        r1.Romane();
        System.out.println(r1);
        
        
        //Carte c1 = new Carte();
        //System.out.println( CartePoezii.Carte());
        //CartePoezii.afiseazaCarte();
        
        /*Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        
        System.out.println("Introduceti Numele cartii: " + s);
        
        String Autor = scanner.nextLine();
        System.out.println("Introduceti Numele autorului: " + adaugaCarte());
        
        
        String Titlu = scanner.nextLine();
        System.out.println(" Introduceti titlul cartii: " + adaugaTitlu());
        
        
        
        Carte c1 = new Carte();
        System.out.println("ai ales:" + c1.Autor + " " + c1.Titlu);
        
        
        Carte <Romane> rRomane = new Carte <Romane>(new Romane());
        Carte <Poezii> pPoezii = new Carte <Poezii>(new Poezii());
        
        rRomane.afiseazaCarte();
        Carte.afiseaza( new Romane(), new Poezii());*/
        
        
          /*
        
    public void Carte(String titlu, String autor, int pag){
        afiseazaTitlu(titlu);
        afiseazaAutor(autor);
        afiseazaNrPag(pag);
        
    }
    
    
    void Carte(String titlu, String autor){
        
        afiseazaTitlu(titlu);
        afiseazaAutor(autor);
    }*/
    
    
       /*
      String titlu;
      String autor;
     int pag;
     String gen;
    */
   
       
/*    
 Carte poezii = new Poezii();
         poezii.afiseazaCarte();
         System.out.println(poezii.afiseazaGen1());
         
         
         
         Carte roman = new Romane();
         roman.afiseazaCarte();
         System.out.println(roman.afiseazaGen2());

    /*
     void adaugaRoman(){
         System.out.println("Adaugati carte");
                  
     }
     
     void adaugaPoezie(){
         
         System.out.println("ati adaugat o carte de poezie");
     }
     
     void afiseazaAutor() throws Exception{
         
         System.out.println("Autorul cartii este: ");
         
     }
     
     
     void afiseazaCarti(){
         System.out.println("Cartile din biclioteca sunt: ");
     }
     
     void afiseazaCartiSortate(){
         
         System.out.println("Cartile au fost sortate");
         
     }
     
     
    public String afiseazaGen1(){return "Poezie";}
    public String afiseazaGen2(){return "Roman";}
   /* 
    * 
    */
  /* // public /*abstract void afiseazaCarte(){
        System.out.println("cartea este: ");
    }
    
    public final void afiseazaAutor(){
        System.out.println("autorul este: ");
        
           
    }*/
    
    /*
    private String titlu;
    private String autor;
    private int pag;
    
    
     public String Carte(){
        this.titlu = titlu;
        titlu = "vasile";
        this.autor = autor;
        autor = "ion";
        
                return(Carte());
    }*/
    
    
    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /*private String poezii;
    private String roman;
    private String gen;
    String gen1 = "politist";
    String gen2 = "dragoste";
    String gen3 = "crima";*/
    
    /*void Carte(String titlu, String autor, int pag){
        
                System.out.println("Cartea este: " + titlu + autor);
        
    }
    */
     /*public  String adaugaCarte(String autor, String titlu, int pag){
        
        this.autor = autor;
        this.titlu = titlu;
        this.pag = pag;
        
        setAutor(autor);
        setTitlu(titlu);
        setpag(pag);
        return ("nume carte");
    }
    */
    
   /* public int afiseazaNrPag(int pag){
        
        if (pag < 1){
            pag = 1;
        }
        return (this.pag = pag);
        
    }
    
   /*  public String setGen(String gen){
        if ( gen.length() == 0){
            
            gen = gen1;
            
        }
        else 
        {
            gen = gen2;
        }
        return ("nu sunt romane disponibile");
    }
    */
    
  
    /*
        public String getAutor(){
        return autor;
    }
    
    public int compareTo( Carte carte2){
        return(this.getpag() - carte2.getpag());
    }
    
    
    public String afiseazaCarte(){
        
        return "cartea este: ";
    }
    */
    //public  void afiseazaMesaj();
        
    /*public  void adaugaCartea(){
        
      
    }*/
    
            
    /*
        public String getAutor(){
               
        return autor;   
    }
     
    public String getTitlu(){
        return titlu;
    }
           
    public int getpag(){
        return pag;
    }
       
    
    /*
    public String getRomane(){
        return romane;
    }*/
    
    
    /*
    public String setAutor(String autor){
        
        return autor;
    }
     
    public String setTitlu(String titlu){
        
        return titlu;
    
    }
    
    public int setpag(int pag){
        
        return pag;
    }
    
    public String setRomane (String romane){
        return romane;
    }
    
    public String setPoezii(String poezii){
        return poezii;
    }
    
    */
    
    /*
    public String setGen(String gen){
        return gen;
    }*/



    
     /*
      //@Override
        public Poezii(String titlu, String autor, int nrPag, int nrDePoezii ){
          super(titlu, autor, nrPag);
          this.nrDePoezii = nrDePoezii;
          
        }
        
        @Override
        public String toString(){
            return titlu + autor + nrPag + nrDePoezii;
        
        }
          */
          /*
          this.titlu = titlu;
          this.autor = autor;
          this.nrPag = nrPag;
          
          
          
          String t1 = "Ghiocelul";
          String t2 = "Pasarele"; 
          String a1 = "Eminescu";
          String a2 = "Eminescu";
          
          int p1 = 30;
          int p2 = 25;
          
          
        System.out.println("Cartea " + t1 + " " + " de " + a1 + " " + " si are " + " " + p1);
        System.out.println("Cartea " + t2 + " " + " de " + a2 + " " + " si are " + " " + p2);
          
          */
          
          
      
      
      
      
     /* 
    String autor;
    int pag;
    String titlu;
    int nrPoezii;
    
     static String Poezii(String autor, String titlu){
       
         return ("autor " + autor + "titlu" + titlu);
       }
        
       public String Poezii(){
           autor = "Ion Popescu";
           titlu = "calm";
           pag = 45;
           
           return(autor + " " + " " + titlu + " " + pag);
           
       }
         
       //System.out.println( "ati ales cartea: " );*/
   
    






  
    /*
    
     String adaugaCarte(String autor, String titlu, int pag){
        
        this.autor = autor;
        this.titlu = titlu;
        this.pag = pag;
        this.gen = gen;
    
       setAutor(autor);
        setTitlu(titlu);
        setpag(pag);
        return ("nume carte");
    }
    */
   // public abstract void afiseazaNumecarte();
   
   
   
       
    
    
    
    /*
    
    public String afiseazaAutor(){
        String autor1 = "nume autor" +  autor;
        return autor1;
    }
    
    
    public String afiseazaCartiSortat(){
        
       String ordine /*= "prima carte este: " + titlu + " si este " + gen;*/
       // return (this.getAutor() + this.getTitlu());
        
        
    
    
       /* 
    public String getAutor(){
              
        return autor;   
    }
     
    public String getTitlu(){
        return titlu;
    }
           
    public int getpag(){
        return pag;
    }
       
    public String getRomane(){
        return romane;
    }
    
    public String getPoezii (){
        return poezii;
    }
    
    public String getGen (){
        return gen;
    }
    
    public String setAutor(String autor){
        
        return autor;
    }
    */

     /*
    public String setTitlu(String titlu){
        
        return titlu;
    
    }
    
    public int setpag(int pag){
        
        return pag;
    }
    
    public String setRomane (String romane){
        return romane;
    }
    
    public String setPoezii(String poezii){
        return poezii;
    }
    
    public String setGen(String gen){
        return gen;
    }
    */
    /*
    
    Carte (String autor, String gen){
        setAutor(autor);
        setGen(gen);
    }
    */
    // facem o metoda de afisare a cartii
    
    /*public String afiseazaCarte(){
        
        String carte = "Titlul cartii este: " + titlu + " de autor " + autor + " si are " + pag;
        return carte;
        
    }
    
    //public abstract void afiseazaCarte();
    //face metoda de afisare a autorului
    
    
    
    
    //*/

        
        
          
         // System.out.println("Romanul este: ");
          
          
          
          
          /*
          
          String titlu = titlu;
         String autor = autor;
          int pag = 1;
          String t1 = "Ion";
          String t2 = "Atacul"; 
          String a1 = "L.R";
          String a2 = "Charlie s";
          int p1 = 230;
          int p2 = 340;
         
          
        System.out.println("Cartea " + t1 + " " + " de " + a1 + " " + " si are " + " " + p1);
        System.out.println("Cartea " + t2 + " " + " de " + a2 + " " + " si are " + " " + p2);
        
        */
      
      
      
      
     
     
    /* 
    String autor;
    int pag;
    String titlu;
    String gen;
        
    
    static String Romane(String autor, String titlu, String gen){
       
         return( autor + " "   + titlu + " " + gen);
       }
    public  Romane(){
        
            autor = "vasilache";
            titlu = "este";
            gen = "politist";
            
          System.out.println( autor + " "   + titlu + " " + gen);
        }*/

    


