/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonefactory.setup;

import java.util.ArrayList;
import phonefactory.brands.Phone;
import java.util.ArrayList;
import phonefactory.brands.Phone;
import phonefactory.setup.CompletePhone;
import phonefactory.setup.PhoneLogic;

/**
 *
 * @author Darragh
 */
public class CompletePhone {
        private ArrayList <Phone> brands = new ArrayList<>(); //this will store our bikes

PhoneLogic pL = new PhoneLogic(); //this is instance of our build class that contains the methods we need


    
   
public ArrayList brands(ArrayList brands){

brands = pL.buildBrands(brands);
return brands;
}

    /**
     * @return the brands
     */
    public ArrayList <Phone> getBrands() {
        return brands;
    }
    
}
