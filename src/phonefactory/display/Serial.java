/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonefactory.display;

/**
 *
 * @author Darragh
 */
public class Serial {
    


    

    private static int counter; // ensures only one instance of the variable
    

   
    private int iD;
    
    public Serial()
    {
        counter++; // every time constructor is called we add 1 to this value
        this.iD = counter; // we use the new value to supply the iD
    }

// getters and setters
    
    // only a getter for iD, it is set in the constructor
    // no getter or setter for our static int  count.
    public int getiD() 
    {
        return iD;
    }
    
   







  // @Override
 //  public String toString() 
 //  {
   //    return "Serial{" + iD" iD }";
  // }



    
    
}