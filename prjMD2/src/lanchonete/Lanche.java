/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lanchonete;


public class Lanche extends Produto{
    private String recheioPrincipal;
    private int quantidade;
    private String segundoRecheio;
    private String terceiroRecheio;
    
    public void cadastrar(String recheioPrincipal, int quantidade, String segundoRecheio, String terceiroRecheio){
        setRecheioPrincipal(recheioPrincipal);
        setQuantidade(quantidade);
        setSegundoRecheio(segundoRecheio);
        setTerceiroRecheio(terceiroRecheio);            
    }
    
    public void cadastrar(String nome, float preco, float peso, 
                          String recheioPrincipal, int quantidade, String segundoRecheio, String terceiroRecheio){
        super.cadastrar(nome, preco, peso);
        this.cadastrar(recheioPrincipal, quantidade, segundoRecheio, terceiroRecheio);
    }
    
    @Override
    public String exibir(){
        return super.exibir()+
                "\nRecheio principal: "+recheioPrincipal+
                "\nQuantidade: "+quantidade+
                "\nSegundo recheio:"+segundoRecheio+
                "\nTerceiro recheio: "+terceiroRecheio;
    }
    

    public String getRecheioPrincipal() {
        return recheioPrincipal;
    }

    public void setRecheioPrincipal(String recheioPrincipal) {
        this.recheioPrincipal = recheioPrincipal;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getSegundoRecheio() {
        return segundoRecheio;
    }

    public void setSegundoRecheio(String segundoRecheio) {
        this.segundoRecheio = segundoRecheio;
    }

    public String getTerceiroRecheio() {
        return terceiroRecheio;
    }

    public void setTerceiroRecheio(String terceiroRecheio) {
        this.terceiroRecheio = terceiroRecheio;
    }
    
    
    
    
}
