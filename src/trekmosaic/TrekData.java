/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trekmosaic;

/**
 *
 * @author ADMIN
 */
public class TrekData {
    private static String trekName;
    private static String locName;
    private static String heightName;
    private static String transportationName;
    private static String itinary;
    private static String inclusionsName;
    private static String infoName;
    private static String price; 
    
    public static String getTrekname(){
        return trekName;
    }
    
    public static void setTrekname(String name ){
        trekName = name;
    }
    
    public static String getLocName(){
        return locName;
    }
    public static void setLocName(String location){
        locName = location;
    }
    
    public static String getHeightName(){
        return heightName;
    }
    
    public static void setHeightName(String height){
        heightName = height;
    }
    
    public static String getTransportationName(){
        return transportationName;
    }
     public static void setTransportationName(String transport){
         transportationName = transport;
     }
     public static String getItinary(){
        return itinary;
    }
     public static void setItinary(String Itinary){
         itinary = Itinary;
     }
     
     public static String getInclusionsName(){
        return inclusionsName;
    }
     public static void setinclusionsName(String inclusions){
         inclusionsName = inclusions;
     }
     
     public static String getinfoName(){
        return infoName;
    }
     public static void setinfoName(String info){
         infoName = info;
     }
     
     public static String getPrice(){
        return price;
    }
     public static void setPrice(String Price){
         price = Price;
     }
     

    static void setTrekname() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
