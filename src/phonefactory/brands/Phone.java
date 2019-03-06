/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonefactory.brands;

import phoneFactory.components.Camera;
import phoneFactory.components.InternalStorage;
import phoneFactory.components.MotherBoard;
import phoneFactory.components.PhoneCase;
import phoneFactory.components.Processor;
import phoneFactory.components.Ram;
import phoneFactory.components.Screen;
import phonefactory.display.Serial;
/**
 *
 * @author Darragh
 */
public abstract class Phone {
    
        //object components
    private String screen;
    private String motherBoard;
    private String processor;
    private String storage;
    private Ram ram;
    private String camera;
    private Camera rearCamera;
    private String phoneCase;
     private static int counter; 
      private int iD;
        //field components
    
    private String model; 
    private String speakers;
    private boolean mic;
    private boolean antenna;
    private boolean flash;
    private boolean nfc;
    private boolean blueTooth;
    private boolean isSDtray;
    private String brand;
    
    private String  [] appleModel;
    private String [] huaweiModel;
    private String [] nokiaModel;
    private String [] sonyModel;
    
       //public Member()
    {
        counter++; // every time constructor is called we add 1 to this value
        this.iD = counter; // we use the new value to supply the iD
    }


    /**
     * @return the screen
     */
    public String getScreen() {
        return screen;
    }

    /**
     * @param screen the screen to set
     */
    public void setScreen(String screen) {
        this.screen = screen;
    }

    /**
     * @return the motherBoard
     */
    public String getMotherBoard() {
        return motherBoard;
    }

    /**
     * @param motherBoard the motherBoard to set
     */
    public void setMotherBoard(String motherBoard) {
        this.motherBoard = motherBoard;
    }

    /**
     * @return the processor
     */
    public String getProcessor() {
        return processor;
    }

    /**
     * @param processor the processor to set
     */
    public void setProcessor(String processor) {
        this.processor = processor;
    }

    /**
     * @return the storage
     */
    public String getStorage() {
        return storage;
    }

    /**
     * @param storage the storage to set
     */
    public void setStorage(String storage) {
        this.storage = storage;
    }

    /**
     * @return the ram
     */
    
    public Ram getRam() {
        return ram;
    }

    /**
     * @param ram the ram to set
     */
    
    public void setRam(Ram ram) {
        this.ram = ram;
    }
    
    /**
     * @return the frontCamera
     */
    public String getFrontCamera() {
        return camera;
    }

    /**
     * @param frontCamera the frontCamera to set
     */
    public void setFrontCamera(String frontCamera) {
        this.camera = frontCamera;
    }

    /**
     * @return the rearCamera
     */
    public Camera getRearCamera() {
        return rearCamera;
    }

    /**
     * @param rearCamera the rearCamera to set
     */
    public void setRearCamera(Camera rearCamera) {
        this.rearCamera = rearCamera;
    }

    /**
     * @return the phoneCase
     */
    public String getPhoneCase() {
        return phoneCase;
    }

    /**
     * @param phoneCase the phoneCase to set
     */
    public void setPhoneCase(String phoneCase) {
        this.phoneCase = phoneCase;
    }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
        
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the speakers
     */
    public String getSpeakers() {
        return speakers;
    }

    /**
     * @param speakers the speakers to set
     */
    public void setSpeakers(String speakers) {
        this.speakers = speakers;
    }

    /**
     * @return the mic
     */
    public boolean isMic() {
        return mic;
    }

    /**
     * @param mic the mic to set
     */
    public void setMic(boolean mic) {
        this.mic = mic;
    }

    /**
     * @return the antenna
     */
    public boolean isAntenna() {
        return antenna;
    }

    /**
     * @param antenna the antenna to set
     */
    public void setAntenna(boolean antenna) {
        this.antenna = antenna;
    }

    /**
     * @return the flash
     */
    public boolean isFlash() {
        return flash;
    }

    /**
     * @param flash the flash to set
     */
    public void setFlash(boolean flash) {
        this.flash = flash;
    }

    /**
     * @return the nfc
     */
    public boolean isNfc() {
        return nfc;
    }

    /**
     * @param nfc the nfc to set
     */
    public void setNfc(boolean nfc) {
        this.nfc = nfc;
    }

    /**
     * @return the blueTooth
     */
    public boolean isBlueTooth() {
        return blueTooth;
    }

    /**
     * @param blueTooth the blueTooth to set
     */
    public void setBlueTooth(boolean blueTooth) {
        this.blueTooth = blueTooth;
    }

    /**
     * @return the isSDtray
     */
    public boolean isIsSDtray() {
        return isSDtray;
    }

    /**
     * @param isSDtray the isSDtray to set
     */
    public void setIsSDtray(boolean isSDtray) {
        this.isSDtray = isSDtray;
    }

    /**
     * @return the brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * @param brand the brand to set
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * @return the iD
     */
    public int getiD() {
        return iD;
    }

    /**
     * @param appleModel the appleModel to set
     */
    public String setAppleModel(String appleModel) {
       // this.appleModel = appleModel;
       return appleModel;
    }

    /**
     * @param huaweiModel the huaweiModel to set
     */
    public String setHuaweiModel(String huaweiModel) {
        return huaweiModel;
    }

    /**
     * @param nokiaModel the nokiaModel to set
     */
    public String setNokiaModel(String nokiaModel) {
        return nokiaModel;
    }

    /**
     * @param sonyModel the sonyModel to set
     */
    public String setSonyModel(String sonyModel) {
        return sonyModel;
    }
    
     @Override
    public String toString() 
    {
        return "Brand \n  " + this.brand +"\n model = "+model+"\n screen type : " + screen + ",\n MotherBoard Type :" + motherBoard + ",\n Processor Model : " +
                processor + ",\n Internal Storage : " + storage + ",\n" + ram + ",\n Camera stats : " + camera + 
                ",\n Rear Camera Model :" + rearCamera + ",\n Case size in cms = " + phoneCase + ", \n" + speakers +
                ",\n Is mic functioning =" + mic + ",\n Is antenna functioning = " + antenna + ", \n Is flash installed=" + flash + ",\n nfc=" +
                nfc + ",\n blueTooth capability = " + blueTooth + ",\n is the SD Tray operating=" + isSDtray + ",\n Serial iD :" + iD + " End Report " + '}';
    }
    
    
}
