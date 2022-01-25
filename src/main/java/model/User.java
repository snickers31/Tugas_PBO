/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author MSiUser
 */
public class User {
    public static String username;
    private String password;
    public static String nama;
    
    
    
    
//    public User(String username, String password, String nama) {
//        this.username = username;
//        this.password = password;
//        this.nama = nama;
//    }
    
    
    public  String getUsername(){
        return username;
    }
    
    public void setUsername(String username){
        this.username = username;
    }
    
    public String getPassword(){
        return password;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    
    
    
}
