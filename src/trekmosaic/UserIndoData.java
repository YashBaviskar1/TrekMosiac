/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trekmosaic;

/**
 *
 * @author khand
 */
public class UserIndoData {
    private static String name;
    private static String location;
    private static int age;
    private static String email;
    private static String username;
    private static String Trek;
    private static String MyTrek;
    
    public static void setMyTrekName(String name){
        MyTrek = name;
    }
    public static String getMyTrekName(){
        return MyTrek;
    }
    public static void setTrekName(String enterName){
        Trek = enterName;
    }
    public static String getTrekName(){
        return Trek;
    }
    
    public static void setName(String enterName){
        name = enterName;
    }
    
    public static String getName(){
        return name;
    }
    
    public static void setLocation(String enterlocation){
        location = enterlocation;
    }
    
    public static String getLocation(){
        return location;
    }
    
    public static void setAge(int a){
        age = a;
    }
    
    public static int getAge(){
        return age;
    }
    
    public static void setEmail(String Email){
        email = Email;
    }
    
    public static String getEmail(){
        return email;
    }
    
    
    public static void setUsername(String Username){
        username = Username;
    }
    
    public static String getUsername(){
        return username;
    }
}

