/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonefactory.search;

import java.util.ArrayList;
import java.util.Scanner;
import phonefactory.brands.Phone;
import phonefactory.setup.PhoneLogic;
import java.util.HashMap;

/**
 *
 * @author Darragh
 */
public class HashMapData {
   
public void HashMapData(){}
/*

    /**
     * @param args the command line arguments
     */
/*
  ArrayList <Phone> brands = new ArrayList<>(); //this will store our bikes
                  PhoneLogic pL = new PhoneLogic(); //this is instance of our build class that contains the methods we need
                  
        // TODO code application logic here
                  brands  = pL.buildBrands(brands);
                  brands  = pL.buildPhone(brands);
        
       
   
         HashMap<Integer,String> phoneMap = new HashMap<Integer,String>(){

      
                 


//b.buildThem(branded) // this wont work cause buildThem sends them to arraylist of empty phones but next one will




        
               //HashMap<Integer,String> phoneMap = new HashMap<Integer,String>();
                  
                  

                 // Scanner sc = new Scanner(System.in);
        //adding elements to HashMap , map (K,V)
        
      //  for(int i = 0;i<brands.size();i++)
      //  {
       // hMap.put(brands.get(i).getiD(), brands.get(i).getBrand() + " The processor is Generation : "+ brands.get(i).getProcessor().getGen() + " The Screen Size is : " + brands.get(i).getScreen().getScreenSize() + " the motherboard make is : " + brands.get(i).getMotherBoard().getMake());//I can change this to .getSpeakers,nothing else
        //hMap.put(brands.get(i).getiD(),brands.get(i).getBrand()+brands.get(i)+brands.get(i).getModel()+brands.get(i).getFrontCamera()+brands.get(i).getMotherBoard()+brands.get(i).getPhoneCase()+brands.get(i).getProcessor()+brands.get(i).getRam()+brands.get(i).getRearCamera()+brands.get(i).getScreen()+brands.get(i).getStorage()+brands.get(i).isAntenna()+        hMap.put(brands.get(i).getiD(),brands.get(i).getBrand()+brands.get(i)+brands.get(i).getModel()+brands.get(i).getFrontCamera()+brands.get(i).getMotherBoard()+brands.get(i).getPhoneCase()+brands.get(i).getProcessor()+brands.get(i).getRam()+brands.get(i).getRearCamera()+brands.get(i).getScreen()+brands.get(i).getStorage()+brands.get(i).isAntenna()+brands.get(i).isBlueTooth()+brands.get(i).isFlash()+brands.get(i).isIsSDtray()+brands.get(i).isMic()+brands.get(i).isNfc()));
          // phoneMap.put(brands.get(i).getiD(),brands.get(i).getBrand()+brands.get(i).getModel());
       // }
      //  };
        //print using Iterator
        
        //Set set1 = hMap.entrySet();
        //Iterator itr1 = set1.iterator();
       // while(itr1.hasNext())
        //{
          //  Map.Entry mEntry = (Map.Entry)itr1.next();
           // System.out.println("Key is: " + mEntry.getKey() + " & Brand is: ");
           // System.out.println(mEntry.getValue());
        //}
            //System.out.println();
       

        /*
        //remove values using key
        hMap.remove(6);
        System.out.println("Map key and values after removal: ");
        Set set2 = hMap.entrySet();
        Iterator itr2 = set2.iterator();
        System.out.println("while loop: ");
        while(itr2.hasNext())
        {
            Map.Entry mentry2 = (Map.Entry)itr2.next();
            System.out.println("Key is: " + mentry2.getKey() + " & Value is : ");
            System.out.println(mentry2.getValue());
        
        }
        System.out.println();
        */
        /////////////////////////////////
        /*
                System.out.println("for each loop:");
                System.out.println("enter a brand ");
                String x = sc.next();
        for(Map.Entry mE : hMap.entrySet())
        {
            if(mE.getValue().equals(x))
                    System.out.println("Key: " + mE.getKey() + " & Value: " + mE.getValue());
            else {
        System.out.println();
                }
        }
        */
        ////////////////////////////////
        //for loop
       /* System.out.println("for each loop:");
        for(Map.Entry mE : hMap.entrySet())
        {
            System.out.println("Key: " + mE.getKey() + " & Value: " + mE.getValue());
           
        }
        System.out.println();
        
        /*
        System.out.println("Functional Operators");
        //as a function
        hMap.entrySet().stream().forEach((mE) ->
        {
            System.out.println("Key: " + mE.getKey() + " & Value: " + mE.getValue());
        });
        */
       // System.out.println("hello " + brands.get(2).getScreen().getThickness() );
// System.out.println("This " + brands.get(0).getBrand());
      //  System.out.println("plus " + brands.get(0).getModel());
     // System.out.println("end");
  
        //public void keySearch(){
  //get values using key WITH SEARCH FUNCTION
      //System.out.println("Enter number");
        //int x = sc.nextInt();
       //String va1 = hMap.get(x);
      // System.out.println("The Brand and Model of phone identified by serial number  " + x + " is : " + va1);
    
            
             //public HashMap<Integer,String>getPhoneMap(){
             
            // return phoneMap;
             //};

//}
      

         }