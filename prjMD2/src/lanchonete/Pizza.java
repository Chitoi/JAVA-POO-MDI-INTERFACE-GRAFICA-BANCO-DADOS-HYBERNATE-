/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lanchonete;

public class Pizza extends Produto{
    private String coberturaPrincipal;
    private String tipoDeQueijo;
    private int fatia;
    private boolean bordaRecheada;
    private String recheioBorda;
    
    public void cadastrar(String coberturaPrincipal, String tipoDeQueijo, 
                          int fatia, boolean bordaRecheada, String recheioBorda){
        setCoberturaPrincipal(coberturaPrincipal);
        setTipoDeQueijo(tipoDeQueijo);
        setFatia(fatia);
        setBordaRecheada(bordaRecheada);
        setRecheioBorda(recheioBorda);
    }
    
    public void cadastrar(String nome, float preco, float peso,
                          String coberturaPrincipal, String tipoDeQueijo, 
                          int fatia, boolean bordaRecheada, String recheioBorda){
        super.cadastrar(nome, preco, peso);
        this.cadastrar(coberturaPrincipal, tipoDeQueijo, fatia, bordaRecheada, recheioBorda);
    }
    
    @Override
    public String exibir(){
        return super.exibir()+
                "\nCobertura principal: "+coberturaPrincipal+
                "\nTipo de queijo: "+tipoDeQueijo+
                "\nQuantidade de fatias: "+fatia+
                "\nBorda recheada? "+bordaRecheada+
                "\nRecheio da borda recheada"+recheioBorda;
    }
    

    public String getCoberturaPrincipal() {
        return coberturaPrincipal;
    }

    public void setCoberturaPrincipal(String coberturaPrincipal) {
        this.coberturaPrincipal = coberturaPrincipal;
    }

    public String getTipoDeQueijo() {
        return tipoDeQueijo;
    }

    public void setTipoDeQueijo(String tipoDeQueijo) {
        this.tipoDeQueijo = tipoDeQueijo;
    }

    public int getFatia() {
        return fatia;
    }

    public void setFatia(int fatia) {
        this.fatia = fatia;
    }

    public boolean isBordaRecheada() {
        return bordaRecheada;
    }

    public void setBordaRecheada(boolean bordaRecheada) {
        this.bordaRecheada = bordaRecheada;
    }

    public String getRecheioBorda() {
        return recheioBorda;
    }

    public void setRecheioBorda(String recheioBorda) {
        this.recheioBorda = recheioBorda;
    }
    
    
    
}
