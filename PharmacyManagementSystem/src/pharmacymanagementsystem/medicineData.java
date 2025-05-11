/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacymanagementsystem;

import java.sql.Date;


public class medicineData {
    
    private final Integer medicineId;
    private final String brand;
    private final String productName;
    private final String type;
    private final String status;
    private final Double price;
    private final Date date;
    private final String image;
    // MAKE SURE YOU  WILL FOLLOW THESE DATA TYPES
    public medicineData(Integer medicineId, String brand ,String productName, String type
            , String status ,Double price, String image, Date date){
        this.medicineId = medicineId;
        this.brand = brand;
        this.productName = productName;
        this.type = type;
        this.status = status;
        this.price = price;
        this.date = date;
        this.image = image;
    }
    
    public Integer getMedicineId(){
        return medicineId;
    }
    public String getBrand(){
        return brand;
    }
    public String getProductName(){
        return productName;
    }
    public String getType(){
        return type;
    }
    public String getStatus(){
        return status;
    }
    public Double getPrice(){
        return price;
    }
    public String getImage(){
        return image;
    }
    public Date getDate(){
        return date;
    }
    
}
