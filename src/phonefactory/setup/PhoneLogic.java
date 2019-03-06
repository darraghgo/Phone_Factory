/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonefactory.setup;

import java.util.ArrayList;
import java.util.Random;
import phoneFactory.components.Camera;
import phoneFactory.components.InternalStorage;
import phoneFactory.components.MotherBoard;
import phoneFactory.components.PhoneCase;
import phoneFactory.components.Processor;
import phoneFactory.components.Screen;
import phonefactory.brands.Apple;
import phonefactory.brands.Nokia;
import phonefactory.brands.Huawei;
import phonefactory.brands.Sony;
import phonefactory.brands.Phone;
import phonefactory.display.Serial;
/**
 *
 * @author Darragh
 */
public class PhoneLogic {
    
    
    Data d = new Data();
    Random rGen = new Random();
    String [] temp;
    int high = 3000; //Max number of objects built
    int low = 1500; //Minimum number of objects built
    int amt = rGen.nextInt(high-low)+low; //generates random quantity of objects to be built
    int brand = rGen.nextInt(4)+1; //used to create random number of Brands in the switch
   ;
    
    
    
    public ArrayList buildBrands(ArrayList<Phone> brands){ // ArrayList which stores Phone Objects

        for(int i=0;i<amt;i++){
        int theSwitch = rGen.nextInt(4)+1;
            switch(theSwitch) //Switch used to change between different brands of Phone
                    {
                ///WE KEEP these empty so it is less hassel for our Big O
                        case 1:
                        Apple a = new Apple(); //Creates new Apple Object which extends Phone object
                        a.setBrand("Apple ");
                        temp = d.getAppleModel(); //gives random model from Data class
                        String str =  a.setAppleModel(temp[rGen.nextInt(temp.length)]);
                        a.setModel(str);
                        
                        
                      
                       
                        
                        brands.add(a);
                       // serial.getiD();
                            
                    break;
                    
                    case 2:
                    
                        Huawei h = new Huawei();
                        h.setBrand("Huawei ");
                        temp = d.getHuaweiModel();
                        String str2 = h.setHuaweiModel(temp[rGen.nextInt(temp.length)]);
                        h.setModel(str2);
                        brands.add(h);
                      //  serial.getiD();
                        break;
                        
                        case 3:
                        
                        Nokia n = new Nokia();
                        n.setBrand("Nokia ");
                        temp = d.getNokiaModel();
                        String str3 = n.setNokiaModel(temp[rGen.nextInt(temp.length)]);
                        n.setModel(str3);
                        brands.add(n);
                      //  serial.getiD();
                        break;
                        
                        default:
                    Sony s = new Sony();
                    s.setBrand("Sony ");
                    temp = d.getSonyModel();
                    String str4 = s.setSonyModel(temp[rGen.nextInt(temp.length)]);
                    s.setModel(str4);
                    brands.add(s);
                
                    }
            
        
            
        }
       
        return brands;
    }
    
    public  ArrayList buildPhone(ArrayList<Phone> brands)
             
    {
   
    for(Phone p : brands)
   
    {
       
   
    
    //Add Components
           temp = d.getScreen();
        p.setScreen(temp[rGen.nextInt(temp.length)]); //This Randomly gets a Screen Type from the Data file

        temp = d.getMotherboard();
        p.setMotherBoard(temp[rGen.nextInt(temp.length)]);

        temp = d.getProcessor();
        p.setProcessor(temp[rGen.nextInt(temp.length)]);
        
        
    temp = d.getCamera();
    Camera frontC = new Camera();
    frontC.setMake("Fuiji");
    frontC.setPixels(rGen.nextInt(50+10));
    p.setFrontCamera(temp[rGen.nextInt(temp.length)]);
  

    

    
    

   
   temp = d.getInternalStorage();
p.setStorage(temp[rGen.nextInt(temp.length)]);
   
   temp = d.getPhoneCase();
   p.setPhoneCase(temp[rGen.nextInt(temp.length)]);

   
       
    //fields
    p.setSpeakers("Speakers - loud");
    p.setMic(rGen.nextBoolean());
    p.setAntenna(rGen.nextBoolean());
    p.setFlash(true);
    p.setNfc(rGen.nextBoolean());
    p.setBlueTooth(true);
    p.setIsSDtray(rGen.nextBoolean());
    p.getiD();
    p.getSpeakers();
    
    
  
    
    }
      return brands;
    } 
    }

     
       

    
    
    
    
