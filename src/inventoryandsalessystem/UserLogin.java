package inventoryandsalessystem;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author thasi
 */
public class UserLogin {
    private String user_id;
    private String pass;
    public UserLogin(String user_id, String pass){
        this.user_id = user_id;
        this.pass=pass;
    }
    public String GetUserId(){
        return this.user_id;
    }
     public String GetPass(){
        return this.pass;
    }
    
}
