/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
public class Professor extends Pessoa {
    private int cargaHoraria;
    private float valorHora;

  
    
    public void cadastrar(String nome, String sexo, int idade, int cargaHoraria, float valorHora){
        super.cadastrar(nome, sexo, idade);
        setCargaHoraria(cargaHoraria);
        setValorHora(cargaHoraria);
        
    }
    
    public float calcularSalario(){
        return cargaHoraria*valorHora* (float)4.5;
    }
    
    @Override
    public String exibir(){
        float salario = calcularSalario();
       String sal = String.format("%.2f", salario);
        
        return super.exibir()+
                "\nCarga Horaria: "+cargaHoraria+
                "\nValor hora: "+valorHora+
                "\nSalario: "+sal;
    }
    
    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(int valorHora) {
        this.valorHora = valorHora;
    }
    
    
    
}
