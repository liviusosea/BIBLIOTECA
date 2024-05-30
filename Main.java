import java.lang.String;
import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Collections;
import java.util.Comparator;


public class Main{
    
    
    
    public static void main(String [] args) throws CarteaNuExistaException {
         
      String input;
      String[] param;
        
        Biblioteca biblioteca = Biblioteca.getInstance();
         Scanner scanner = new Scanner (System.in);
         
         
         
      
        while(true){
            System.out.println("Alege optiunea: ");
            System.out.println("1. ADD_POEZII");
            System.out.println("2. ADD_ROMANE");
            System.out.println("3. AF_CARTI");
            System.out.println("4. AF_AUTOR");
            System.out.println("5. SORTEAZA_CARTI");
            //System.out.println("6. AFISEAZA TOATE CARTILE");
            System.out.println("6. INCHIDE BIBLIOTECA");
            System.out.println("Alege o optiune!");
            int optiune = scanner.nextInt();
            scanner.nextLine();
            //param = input.split("  ");
            
            
            
                switch(optiune){
                    case 1:
                        System.out.print("introduceti titlul poeziei: ");
                        String poeziiTitlu = scanner.nextLine();
                        System.out.println("Introduceti numele autorului: ");
                        String poeziiAutor = scanner.nextLine();
                        System.out.println("introduceti nr de pag: ");
                        int poeziiPag = scanner.nextInt();// schimb o cu asta de mai jos
                        System.out.println("introduceti nr de poezii:");
                        int poeziiNrDePoezii  = scanner.nextInt();//schimb aici 
                        biblioteca.adaugaPoezii(poeziiTitlu, poeziiAutor, poeziiPag, poeziiNrDePoezii);
                        System.out.println("Cartea cu poezii a fost adaugata cu succes!");
                        break;
                        
                    case 2: 
                        
                                               
                        System.out.print("introduceti titlul romanului: ");
                        String romaneTitlu = scanner.nextLine();
                        System.out.println("Introduceti numele autorului: ");
                        String romaneAutor = scanner.nextLine();
                        System.out.println("introduceti numarul de pagini: ");
                        int romanePag = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Introduceti genul romanului: ");
                        String romaneGen = scanner.nextLine();
                        biblioteca.adaugaRomane(romaneTitlu, romaneAutor, romanePag, romaneGen);
                        System.out.println("Romanul a fost adaugat!");
                        break;
                        
                     case 3:
                         
                         
                         System.out.println("AF_CARTI:");
                         String carteTitlu = scanner.nextLine();
                         biblioteca.afiseazaCartile();
                         break;
                         
                    case 4:
                        System.out.println("AF_AUTOR: ");
                        //String autor = scanner.nextLine();
                        biblioteca.afiseazaAutori();
                        break;
                        
                    case 5: 
                        biblioteca.afiseazaCartiSortate();
                        break;
                        
                    case 6:
                        System.out.println("Inchide Biblioteca!");
                        System.out.println("Biblioteca s-a inchis");
                        scanner.close();
                        System.exit(0);
                        
                    default :
                        System.out.println("Date incorecte");
                    }
                                
            
                }
            }
        }
    
            
    
    
    
    
    