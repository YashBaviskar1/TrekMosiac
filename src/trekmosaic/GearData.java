/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trekmosaic;

/**
 *
 * @author khand
 */
public class GearData {
    private static String name;
    private static String feature1;
    private static String feature2;
    private static String feature3;
    private static int price;
    
    public static void setName(String GearName){
        name = GearName;
    }
    
    public static String getName(){
        return name;
    }
    
    public static void setfeature1(String txt){
        feature1 = txt;
    }
    
    public static String getfeature1(){
        return feature1;
    }
    
    public static void setfeature2(String txt){
        feature2 = txt;
    }
    public static String getfeature2(){
        return feature2;
    }
    
    public static void setfeature3(String txt){
        feature3 = txt;
    }
    
    public static String getfeature3(){
        return feature3;
    }
    
    public static void setPrice(int num){
        price = num;
    }
    
    public static int getPrice(){
        return price;
    }
}
