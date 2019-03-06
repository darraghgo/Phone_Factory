/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonefactory.setup;

/**
 *
 * @author Darragh
 */

    public class Data {
    //arrays for phones
    private String [] appleModel;
    private String [] huaweiModel;
    private String [] nokiaModel;
    private String [] sonyModel;
  

    //arrays for components
    private String [] camera;
    private String [] internalStorage;
    private String [] motherboard;
    private String [] phoneCase;
    private String [] processor;
    private String [] ram;
    private String [] screen;

    
    public Data(){
    
    this.appleModel = new String [] {"gen6","gen7","gen8","genX"};
    this.huaweiModel = new String[]{"Grade 10 ","Honor 9","Grade B "};
    this.nokiaModel = new  String [] {"8110","3.1","7 plus","3310"};
    this.sonyModel = new  String [] {"L2","XZ2","XA2"};
    this.screen = new String [] {"Plexi Glass","2 inch","Glass","Diamond"};
    this.motherboard = new String [] {"Intell","Dual Core","Quad Core","OutTell"};
    this.processor = new String [] {"Pentium D","Pent E","Celeron D","AMD Athlon"};
    this.internalStorage = new String [] {"ROM-a","RAM-xz","Cache","Max2000"};
    this.camera = new String [] {"Fuji","Cannon","Niko","Polaroid"};
    this.phoneCase = new String [] {"7","8","14","15","10"};

    }
    
    
    
    public String[] getAppleModel() {
        return appleModel;
    }

    /**
     * @return the huaweiModels
     */
    public String[] getHuaweiModel() {
        return huaweiModel;
    }

    /**
     * @return the nokiaModels
     */
    public String[] getNokiaModel() {
        return nokiaModel;
    }

    /**
     * @return the sonyModels
     */
    public String[] getSonyModel() {
        return sonyModel;
    }

    /**
     * @return the camera
     */
    public String[] getCamera() {
        return camera;
    }

    /**
     * @return the internalStorage
     */
    public String[] getInternalStorage() {
        return internalStorage;
    }

    /**
     * @return the motherboard
     */
    public String[] getMotherboard() {
        return motherboard;
    }

    /**
     * @return the phoneCase
     */
    public String[] getPhoneCase() {
        return phoneCase;
    }

    /**
     * @return the processor
     */
    public String[] getProcessor() {
        return processor;
    }

    /**
     * @return the ram
     */
    public String[] getRam() {
        return ram;
    }

    /**
     * @return the screen
     */
    public String[] getScreen() {
        return screen;
    }
    
    
}
