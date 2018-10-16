/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mongodemo;

import com.mongodb.DB;
import com.mongodb.MongoClient;


public class ConectDB {
    
    public static void connect(){
        try{
        MongoClient mongoClient = new MongoClient("localhost", 27017);
        DB db = (DB) mongoClient.getDatabase("test");
        System.out.println("Connected sucess");       
        }catch(Exception e){
            System.out.println(e);
           
        }
    }
    
    
}
