/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonefactory.display;

import java.util.HashMap;
import java.util.Scanner;
import phonefactory.search.Search;

/**
 *
 * @author Darragh
 */
public class Menu {
    
    Search search = new Search();
    
   public Scanner sc = new Scanner(System.in);
    
    int men2;
    public void Menu(){
        System.out.println("");
        System.out.println("Welcome To The Phone Factory Quality Control Interface");
        System.out.println("Press 1 to begin inspection");
        System.out.println("");
        System.out.println("Press zero to exit");
        int x = sc.nextInt();
       
        switch(x){
            case 1:
                System.out.println("Enter 1 to view all phones and brands");
                System.out.println("Enter 2 to search for a specific model");
                System.out.println("Enter 3 to view all Sony Phones");
                System.out.println("Enter 4 to view all Apple Phones");
                System.out.println("Enter 5 to view all Nokia Phones");
                System.out.println("Enter 6 to view all Huawei Phones");
                System.out.println("");
                System.out.println("Press zero exit");
                search.Search();
                
                break;
            case 2:
                System.out.println("Good Bye");
        
            
            
        
                break;
            default:
                System.out.println("Good Bye");
                break;
                    
        
        }
        
    
    
    
    }
}
