/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mongodemo;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;


/**
 *
 * @author victor
 */
public class MongoDemo {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) {
        
        try{
        MongoClient mongoClient = new MongoClient("localhost", 27017);
        DB db= mongoClient.getDB("test"); 
        System.out.println("Connected sucess");
        
        BasicDBObject pessoa = new BasicDBObject();
        pessoa.put("nome", "Miguel");
        pessoa.put("sobrenome", "Rosa");
        pessoa.put("telefone", "(15)3531-3464");
        
        BasicDBObject endereco = new BasicDBObject();
        endereco.put("rua", "31 de março");
        endereco.put("numero", "150");
        endereco.put("bairro","vila osorio");
        
        pessoa.put("endereco", endereco);
        
        DBCollection colecaoPessoas= db.getCollection("pessoa");
        colecaoPessoas.insert(pessoa);
        
        }catch(Exception e){
            System.out.println(e);
        }
        
    }
    
}
