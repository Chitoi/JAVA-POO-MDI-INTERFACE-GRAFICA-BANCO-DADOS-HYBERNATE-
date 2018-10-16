/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
public class Veiculo {
    private String cor;
    private String marca;
    private String modelo;
    private int anoFab;
    private String placa;

    public void cadastrar(String cor, String marca, String modelo, int anoFab, String placa){
            setCor(cor);
            setMarca(marca);
            setModelo(modelo);
            setAnoFab(anoFab);
            setPlaca(placa);
    }
    
    public String exibir(){
        
        return "Modelo: "+modelo+
               "\n Marca: "+marca+
               "\nCor: "+cor+
               "\nPlaca: "+placa+
               "\nAno fabricação: "+anoFab; 
    }
    
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnoFab() {
        return anoFab;
    }

    public void setAnoFab(int anoFab) {
        this.anoFab = anoFab;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
    
}
