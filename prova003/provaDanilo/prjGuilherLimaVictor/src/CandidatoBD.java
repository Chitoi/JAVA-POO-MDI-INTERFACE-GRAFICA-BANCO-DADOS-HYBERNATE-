/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.DriverManager;
public class CandidatoBD {
    
     public static void save(Candidato cand, int espe, int ger){
        String sql = "INSERT INTO  candidato (nome, idade, espec, gerais, situacao ) "
        + "VALUES ('"+cand.getNome()+"', '"+cand.getIdade()+"' , '"+cand.getEspecificos()+"', '"+cand.getGerais()+"', '"+cand.situacao(espe, ger)+"')";
        Connection conn = ConecaoBD.getConexao();
        try{
        Statement stnt = conn.createStatement();
        System.out.println(stnt.executeUpdate(sql));
        ConecaoBD.close(conn, stnt);
        System.out.println("Registro inserido com sucesso!");
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
}
