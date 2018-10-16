
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author victor
 */

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;


public class TesteMongoDB {

    private MongoCollection<Document> col;
    private MongoDatabase db;
    private MongoClient mongo;
    private Aluno a;
    private Document doc;
    

    public boolean conectar(){
        try{
            mongo = new MongoClient("localhost", 27017);
            db = mongo.getDatabase("teste");
            col = db.getCollection("aluno");
        }catch(Exception ex){
            ex.printStackTrace();
            return false;
        }
        return true;
    }
    
    public boolean desconectar(){
        try{
            mongo.close();
        }catch(Exception ex){
            ex.printStackTrace();
            return false;
        }
        return true;
    }
    
    public void executar(Aluno a){
        if(conectar()){
            //INSERIR OS ALUNOS.

            Document doc = new Document("nome", a.getNome())
            .append("idade" , a.getIdade())
            .append("sexo"  , a.getSexo())        
            .append("curso" , a.getCurso())
            .append("Nota1", a.getNota1()) 
            .append("Nota2", a.getNota2())        
            .append("media" , a.getMedia());
            col.insertOne(doc);
        
        desconectar(); 
        }    
    }    
     
    public String exibirCadastros(){
        String docExib = " ";
        if(conectar()){
        MongoCursor<Document> cursor = col.find().iterator();
        
            while (cursor.hasNext()){
                doc=cursor.next();
                docExib += doc.get("nome")+ "--" +doc.get("idade")+ "--" +
                           doc.get("sexo")+ "--" +doc.get("curso")+ "--" +
                           doc.get("Nota1")+ "--" +doc.get("Nota2")+ "--" +
                           doc.get("media")+ "\n";
                
               // System.out.println(doc.get("nome")+ " : " +doc.get("idade")+ " : " +doc.get("sexo")+ " : "
                              //    +doc.get("curso")+ " : " +doc.get("Nota1")+ " : " +doc.get("Nota1")+ " : "  
                               //   +doc.get("media"));
            }
            
            cursor.close();
            desconectar(); 
        }
            return docExib;  
    }

  
    
    
}

