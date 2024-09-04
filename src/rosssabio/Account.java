/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rosssabio;

import java.util.Scanner;
   
public class Account {
     private int id;
     private String firstName;
     private String lastName;
     private String email;
     private String username;
     private String password;
     
     public Account(int id,String firstName,String lastName,String email,String username,String password){
         this.id = id;
         this.firstName = firstName;
         this.lastName = lastName;
         this.email = email;
         this.username = username;
         setPassword(password);
         
     }
     public int getId(){
        return id; 
     }
     public String getFirstName(){
         return firstName;
     }
     public String getLastName(){
         return lastName;
}  
     public String getEmail(){
         return email;
     }
     public String getUsername(){
         return username;
     }
     public String getPassword(){
         return password;
     }
      public void setPassword(String password){
          validatePassword(password);
          this.password = password;
      }    
      private void validatePassword(String password){
          if (password.length() < 8){
              System.out.println("Error: Password must be at least 8 characters long.");
              return;
                 
        }
        if(!password.matches(",*[A-Z],*") || !password.matches(",*[a-z],")){
         System.out.println("Error: Password must contain at least one uppercase and one lowercase letter,");
         return;
     }
        if(!password.matches(".*\\d,*")){
            System.out.println("Error: Password must contain at least one number,");
          return;
        }
     }
      
}
      

      
