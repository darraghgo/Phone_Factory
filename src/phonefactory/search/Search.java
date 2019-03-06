/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonefactory.search;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import phonefactory.brands.Phone;
import phonefactory.brands.Sony;
import phonefactory.display.Menu;
import phonefactory.setup.PhoneLogic;

/**
 *
 * @author Darragh
 */
public class Search {

        public HashMap<Integer, String> Search(){
                
            Menu me = new Menu();
            
            int input = me.sc.nextInt();

                  ArrayList <Phone> brands = new ArrayList<>(); //this will store our bikes
                  PhoneLogic pL = new PhoneLogic(); //this is instance of our build class that contains the methods we need
                  
                 
                  brands  = pL.buildBrands(brands);
                  brands  = pL.buildPhone(brands);

               HashMap<Integer,String> hMap = new HashMap<Integer,String>();
                  
        for(int i = 0;i<brands.size();i++)
        {
     hMap.put(brands.get(i).getiD(),brands.get(i).getBrand()+brands.get(i).getModel());
        }
       
            int x = input;
            boolean exit = true;
          do  {
            switch(x){
                case 1:
                            Set set1 = hMap.entrySet();
        Iterator itr1 = set1.iterator();
                    while(itr1.hasNext()){
                    Map.Entry mEntry = (Map.Entry)itr1.next();
                   System.out.println("The Serial Number is: " + mEntry.getKey() + " and the phone and model is: " + mEntry.getValue());}
           
                    me.Menu();
   
          
              break;
      
                case 2:
                    System.out.println("Enter the serial number to view Phone and Components");
                       int input2 = me.sc.nextInt();                       
                   int y = input2;
                    System.out.println(" ");
                    System.out.println("");
                    System.out.println("");
                    System.out.println(brands.get(y).toString());
                    System.out.println("");
                    
                   
            me.Menu();
            
                break;
                
                case 3:
                    for(int i =0;i<brands.size();i++){
                    brands.get(i);
                    if(brands.get(i).getBrand().startsWith("S")){
                        System.out.println("Serial Number : " + brands.get(i).getiD() + " Phone Make and Model : "+ brands.get(i).getBrand() + brands.get(i).getModel());
                    }
                    }
                    me.Menu();
                    break;
                    
                case 4:
                                       for(int i =0;i<brands.size();i++){
                    brands.get(i);
                    if(brands.get(i).getBrand().startsWith("A")){
                        System.out.println("Serial Number : " + brands.get(i).getiD() + " Phone Make and Model : "+ brands.get(i).getBrand() + brands.get(i).getModel());
                    }
                    }
                                       me.Menu();
                                       break;
                                       
                case 5:
                                       for(int i =0;i<brands.size();i++){
                    brands.get(i);
                    if(brands.get(i).getBrand().startsWith("N")){
                        System.out.println("Serial Number : " + brands.get(i).getiD() + " Phone Make and Model : "+ brands.get(i).getBrand() + brands.get(i).getModel());
                    }
                    }
                                       me.Menu();
                                       break;
                case 6:
                                       for(int i =0;i<brands.size();i++){
                    brands.get(i);
                    if(brands.get(i).getBrand().startsWith("H")){
                        System.out.println("Serial Number : " + brands.get(i).getiD() + " Phone Make and Model : "+ brands.get(i).getBrand() + brands.get(i).getModel());
                    }
                        
                    }
                                       me.Menu();
                                       break;
                default:
                    System.out.println("Good Bye");
                    exit = true;
        }
        } while (!exit);

      return hMap;
    }
         
      public void showAll(HashMap<Integer,String>hMap){
          System.out.println("from SHow all" );
          for(int i=0;i<hMap.size();i++){
            hMap.get(i);
      }
    
      }
        }
             

             
             
        
    
