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
    private Curso curso;
    private float media;
    
    public void cadastrar(String nome, String sexo, int idade, Curso curso, float media){
        super.cadastrar(nome, sexo, idade);
        setCurso(curso);
        setMedia(media);
    }
    
     public boolean isAprovado(){
        return media >=7;
    }
    
    @Override
    public String exibir(){
        String situacao = isAprovado()?"aprovado":"reprovado";
        
        String med = String.format("%.2f", media);
        
        return super.exibir()+
                "\nMedia: "+med+
                "\nSituação "+situacao+
                curso.exibir();
    }
    
   

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public float getMedia() {
        return media;
    }

    public void setMedia(float media) {
        this.media = media;
    }
    
    
    
}
