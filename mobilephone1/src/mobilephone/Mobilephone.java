
package mobilephone;

import java.util.*;

public class Mobilephone {
        
         private String manufacturer;
         private String model;
         private String colour;
         private double prices;
         private String mobile_phone_parts;
    

 public Mobilephone(String manufactur,String mod,String color,double price,String mobile){
     
        this.manufacturer=manufactur;
        this.model=mod;
        this.colour=color;
        this.prices=price;
        this.mobile_phone_parts=mobile;
 }
    public String getmanufacturer() {
        return manufacturer;
    }
    public void setmanu(String man){
         this.manufacturer = man;
    }
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getPrices() {
        return prices;
    }

    public void setPrices(double prices) {
        this.prices = prices;
    }

    public String getMobile_phone_parts() {
        return mobile_phone_parts;
    }

    public void setMobile_phone_parts(String mobile_phone_parts) {
        this.mobile_phone_parts = mobile_phone_parts;
    }
    
    @Override
    public String toString() {
        return manufacturer + " , " + model + " , " + colour + " , " + prices + " , " + mobile_phone_parts;
    }
    
}

