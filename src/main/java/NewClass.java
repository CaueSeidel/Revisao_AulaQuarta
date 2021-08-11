/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Caue
 */
public class NewClass {
    

public static void main(String[] argss){
        
        int num, contPar = 0, contImpar = 0;
        
        for(int i = 1; i <= 5; i++){
            System.out.println("Digite o " + i + "º número");
            num = i;
            
            if(num % 2 == 0){
                contPar++;
            }

           
            
            if(num % 2 == 1){
                contImpar++;
            }
            
        }
        
        System.out.println("Foram digitados " + contPar + " números pares \n");
        System.out.println("E " + contImpar + " números ímpares");
        
    }
}