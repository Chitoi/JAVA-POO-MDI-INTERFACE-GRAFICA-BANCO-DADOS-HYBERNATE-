/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
public class Aluno extends Pessoa {
    private int ra;
    private double nota;
    private int anoInicio;
    
    public void cadastar(String nome, int idade, char sexo, String email, int ra, double nota, int anoInicio){
        super.cadastrar(nome, idade, sexo, email);
        setAnoInicio(anoInicio);
        setNota(nota);
        setRa(ra);
    }
    
    public boolean isAprovado(){
        return nota >= 7;
    }
    
    

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public int getAnoInicio() {
        return anoInicio;
    }

    public void setAnoInicio(int anoInicio) {
        this.anoInicio = anoInicio;
    }
    
    
    
}
