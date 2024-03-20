/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.slide11ex1;

/**
 *
 * @author galvao
 */
public class Slide11ex1 {

    public static void main(String[] args) {
        for(int i=1; i<=100; i++){
            if(i%2==0){
                System.out.println("O numero "+i+" é par.");
            }
            if(i%2==1){
                System.out.println("O numero "+i+" é impar.");
            }
            if(i%3==0){
                System.out.println("O numero "+i+" é multipolo de 3.");
            }
            if(i%4==0){
                System.out.println("O numero "+i+" é multipolo de 4.");
            }
            if(i%5==0){
                System.out.println("O numero "+i+" é multipolo de 5. ");
                
                for (int j=i-5; j>0; j-=5)
                    System.out.print(j+" ");
                    System.out.println("");
        }
    
    }
    }
}
 
//        for(int i=1; i<=10; i++){
//        if(i%2==0){
//            System.out.println("Numero "+i+" é par. Pares antes: ");
//            for(int j=1; j<i; j++){
//                if(j%2==0){
//                    System.out.println(j+ " ");
//                }
//            }
//            System.out.println();
//        }else{
//            System.out.println("Numero "+i+" é impar.");
//        }
//        }
//        
//    }

