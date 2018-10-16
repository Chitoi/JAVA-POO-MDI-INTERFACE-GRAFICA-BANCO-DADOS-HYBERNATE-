package Aula1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class ConectBD {
    
    public static Connection getConexao(){
        String url =  "jdbc:postgresql://localhost:5432/BancoJava";
        String user = "postgres";
        String password = "123456";
        try{
        Class.forName("org.postgresql.Driver");    
        System.out.println("Conectado com sucesso");
        return DriverManager.getConnection(url, user, password);
        }catch (SQLException | ClassNotFoundException  e){
            e.printStackTrace();
        }
        return  null;
    }
    
    public static void close(Connection connection){
    try{
        if(connection != null)
        connection.close();    
        }catch (SQLException e){
            e.printStackTrace(); 
            }
        }  

    public static void close(Connection connection, Statement stnt){
        close(connection);
        try{
            if(stnt != null)
            stnt.close();    
        }catch (SQLException e){
            e.printStackTrace(); 
            } 
        }

    public static void save(Aluno aluno){
        String sql = "INSERT INTO  aluno (nome, idade, nota_1, nota_2, media) VALUES ('"+aluno.getNome()+"', '"+aluno.getIdade()+"','"+aluno.getNota1()+"', '"+aluno.getNota2()+"', '"+aluno.mediaAritmetica()+"')";
        Connection conn = ConectBD.getConexao();
        try{
            Statement stnt = conn.createStatement();
            System.out.println(stnt.executeUpdate(sql));
            close(conn, stnt);
            System.out.println("Registro inserido com sucesso!");
            }catch (SQLException e){
                e.printStackTrace();
                }
            }

    }
