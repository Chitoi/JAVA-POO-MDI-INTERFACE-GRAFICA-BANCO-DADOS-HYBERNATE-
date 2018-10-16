/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lanchonete;


public class Produto {
    private String nome;
    private float preco;
    private float peso;
   

    public void cadastrar(String nome, float preco, float peso){
        setNome(nome);
        setPeso(peso);
        setPreco(preco);
    }
    
    public String exibir(){
        return "Nome: "+nome+
               "\nPreço: R$"+preco+
               "\nPeso: "+peso+"g";
    
    }
    
    public static float calcularPrecoMedio(Produto[] prods){
        float media=0;    
        int aux;
        
        
       
            for( aux=0; aux<prods.length&&prods[aux]!=null; aux++){
                media+=prods[aux].preco;
            }
            media=media/aux;
       
       
        
        return media;   
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
    
    
    
    
}
