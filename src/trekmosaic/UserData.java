/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trekmosaic;

/**
 *
 * @author ADMIN
 */
public class UserData {
    
    public static int check = 0;
    public static int verify = 0;
    public static int cost = 0;
    public static String CheckSignIn;
    public static int upload = 0;
    public static String filename;
    
    public static void setFilename(String txt){
        filename = txt;
    }
    
    public static String getFilename(){
        return filename;
    }
    
    public static void setChecksignIn(String name){
        CheckSignIn = name;
    }
    
    public static String getCheckSignIn(){
        if(check == 1)
            return CheckSignIn;
        else 
            return null; 
    }
}
