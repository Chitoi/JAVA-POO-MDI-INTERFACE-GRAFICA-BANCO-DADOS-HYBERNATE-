package model;
// Generated 11/02/2016 14:38:46 by Hibernate Tools 4.3.1



/**
 * Produto generated by hbm2java
 */
public class Produto  implements java.io.Serializable {


     private Integer id;
     private String nome;
     private String marca;
     private float precoCompra;
     private float margemLucro;
     private int estoque;

    public Produto() {
    }

    public Produto(String nome, String marca, float precoCompra, float margemLucro, int estoque) {
       this.nome = nome;
       this.marca = marca;
       this.precoCompra = precoCompra;
       this.margemLucro = margemLucro;
       this.estoque = estoque;
    }
    
    public String[] popTable(Produto p){
        String[] resp = (new String[]{
                    p.getId().toString(),
                    p.getNome(),
                    p.getMarca(),
                    String.valueOf(p.getPrecoCompra()),
                    String.valueOf(p.getMargemLucro()),
                    String.valueOf(p.getEstoque()),
                    p.precoDeVenda(),
                    p.precoDeEstoque()
            }
        );
        
        return resp;
    }
    
    
    
    //METODO IGUAL AO POPTABELA() 
    public String[] toLinha(){
       
        
        
        return new String[]{
               id.toString(),
               nome,
               marca,
               String.format("R$%.2f",precoCompra),
               String.format("%.2f%%",margemLucro),
               String.format("%d",estoque),
               precoDeVenda(),
               precoDeEstoque()
        };
        
    }
    
    
    public String precoDeVenda(){
        float pVenda = precoCompra+(precoCompra*(margemLucro/100));
        
        return String.format("R$%.2f", pVenda);
    }
   
    public String precoDeEstoque(){
        float pEstoque = precoCompra*estoque;
        
        return String.format("R$%.2f", pEstoque);
    }
    
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getMarca() {
        return this.marca;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public float getPrecoCompra() {
        return this.precoCompra;
    }
    
    public void setPrecoCompra(float precoCompra) {
        this.precoCompra = precoCompra;
    }
    public float getMargemLucro() {
        return this.margemLucro;
    }
    
    public void setMargemLucro(float margemLucro) {
        this.margemLucro = margemLucro;
    }
    public int getEstoque() {
        return this.estoque;
    }
    
    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }




}


