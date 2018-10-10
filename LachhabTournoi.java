    /*by        A y o u b l a c h h a b
Temps De réalisation : Présque 2 semaine 
Gestion Tournoi de Tennis*/ 

import java.util.*;
public class LachhabTournoi {

	
    public static void main(String[] args) {
        Scanner SC = new Scanner (System.in);
        Random rand = new Random();
        int i=0;
        String Ta[]=new String[8];
        String Tb[]=new String[8];
        String TabGagnantHome[]=new String[4];
        String TabGagnantFemme[]=new String[4];
        
        
        System.out.println("`\tDonnez le nom complet de 8 joueur Homme  ");
        System.out.println("\t Exemple :    Ayoub lachhab ");
         for (i=0;i<8;i++){
             Ta[i] = SC.nextLine(); 
         }
        System.out.println("`\tDonnez le nom complet de 8 joueur Femmme ");
        System.out.println("\t Exemple :    Kawtar Ozouhou ");
        for (i=0;i<8;i++){
             Tb[i] = SC.nextLine();
        }
        System.out.println("\t**************la liste des participants homme************** " );
        System.out.println("\n" );
        for(i=0;i<8;i++){
              System.out.println(Ta[i]);  
        } 
        System.out.println("\t**************la liste des participants Femme************** " );
        System.out.println("\n" );  
        for(i=0;i<8;i++){
              System.out.println(Tb[i]);  
        } 
        
        
        System.out.println("\t**************Tour 1 (Hommme)************** " );
        System.out.println("\n" );
        for(i=0;i<8;i+=2){
              System.out.println(Ta[i]+"\tVS\t"+Ta[i+1]);
        } 
        System.out.println("\t**************Tour 1 (femme)************** " );
        System.out.println("\n" );
        for(i=0;i<8;i+=2){
              System.out.println(Tb[i]+"\tVS\t"+Tb[i+1]);
        } 
        
        
        System.out.println("\t**************Tour 1 Les matches  (Hommme) **************" );
        System.out.println("\n" );
        
        int j = 0;
        for(i=0;i<8;i+=2){
               System.out.println(Ta[i]+"\tVS\t"+Ta[i+1]);
               int r = rand.nextInt(2);
               if (r == 0) {
                     System.out.println("\t le gagnant c'est   "+Ta[i]);
                     TabGagnantHome[j] = Ta[i];
                     j++;
                } 
                else if (r == 1) {
                     System.out.println("\t le gagnant c'est   "+Ta[i+1]);
                     TabGagnantHome[j] = Ta[i+1];
                     j++;
                }
        }
        
                
        System.out.println("Fin de tour 1 (Hommme)" );
        System.out.println("\t**************Tour 1 Les matches**************  (femme)" );
        System.out.println("\n" );
        j = 0;
        for(i=0;i<8;i+=2){
               System.out.println(Tb[i]+"\tVS\t"+Tb[i+1]);
               int r = rand.nextInt(2);
               if (r == 0) {
                     System.out.println("\t le gagnante c'est   "+Tb[i]);
                     TabGagnantFemme [j] = Tb[i];
                     j++;
                } 
                else if (r == 1) {
                     System.out.println("\t le gagnante c'est   "+Tb[i+1]);
                     TabGagnantFemme [j] = Tb[i+1];
                     j++;
                }
        }          
        
        System.out.println("Fin de tour 1 (Femme)" );
        
        System.out.println("\t**************Tour 2 Demi Final (Hommme) **************" );
        System.out.println("\n" );
        for(i=0;i<4;i+=2){
              System.out.println(TabGagnantHome[i]+"\tVS\t"+TabGagnantHome[i+1]);
        } 
        
        
        System.out.println("\t**************Tour 2 Demi Final (Femme) **************" );
        System.out.println("\n" );
        for(i=0;i<4;i+=2){
              System.out.println(TabGagnantFemme[i]+"\tVS\t"+TabGagnantFemme[i+1]);
        }
        
        
      
        System.out.println("\t**************Tour 2 Les matches**************  (Homme)" );
        System.out.println("\n" );
        
        String TFinal[] = new String [2];
        j = 0;
        for(i=0;i<4;i+=2){
               System.out.println(TabGagnantHome[i]+"\tVS\t"+TabGagnantHome[i+1]);
               int r = rand.nextInt(2);
               if (r == 0) {
                     System.out.println("\t le gagnant c'est   "+TabGagnantHome[i]);
                     TFinal [j] = TabGagnantHome[i];
                     j++;
                } 
                else if (r == 1) {
                     System.out.println("\t le gagnant c'est   "+TabGagnantHome[i+1]);
                     TFinal [j] = TabGagnantHome[i+1];
                     j++;
                }
        }
        //ICI
        System.out.println("\t**************Tour 2 Les matches**************  (femme)" );
        System.out.println("\n" );
        
        String TFinaal[] = new String [2];
        j = 0;
        for(i=0;i<4;i+=2){
               System.out.println(TabGagnantFemme[i]+"\tVS\t"+TabGagnantFemme[i+1]);
               int d = rand.nextInt(2);
               if (d == 0) {
                     System.out.println("\t le gagnante c'est   "+TabGagnantFemme[i]);
                     TFinaal [j] = TabGagnantFemme[i];
                     j++;
                } 
                else if (d == 1) {
                     System.out.println("\t le gagnante c'est   "+TabGagnantFemme[i+1]);
                     TFinaal [j] = TabGagnantFemme[i+1];
                     j++;
                }
        }
        
       System.out.println("\t**************Tour 3 Final**************  (Homme)" );
        System.out.println("\n" );
        j = 0;
               System.out.println(TFinal[0]+"\tVS\t"+TFinal[1]);
               int r = rand.nextInt(2);
               if (r == 0) {
                     System.out.println("\t le gagnant Du Tournoi c'est   "+TFinal[0]);
                } 
                else if (r == 1) {
                     System.out.println("\t le gagnant Du Tournoi c'est   "+TFinal[1]);}
                     // Ayoub Lachhab
             
               
              System.out.println("\t**************Tour 3 Final**************  (femme)" );
               System.out.println("\n" );
               j = 0;
                      System.out.println(TFinaal[0]+"\tVS\t"+TFinaal[1]);
                      int d = rand.nextInt(2);
                      if (d == 0) {
                            System.out.println("\t le gagnante Du Tournoi  c'est   "+TFinaal[0]);
                       } 
                       else if (d == 1) {
                            System.out.println("\t le gagnante Du Tournoi c'est   "+TFinaal[1]);
               
 
}}}