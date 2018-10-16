
public class Carro extends Veiculo {
    private String tipo;
    private int qtdPortas;
    private int qtdPassageiros;
    private String tipoCombustivel;
    private String versao;
    
    public void cadastrar(String tipo, int qtdPortas, int qtdPassageiros, String tipoCombustivel, String versao){
        setTipo(tipo);
        setQtdPortas(qtdPortas);
        setQtdPassageiros(qtdPassageiros);
        setTipoCombustivel(tipoCombustivel);
        setVersao(versao);
    }
    
    public void cadastrar(String cor, String marca, String modelo, int anoFab, String placa, 
                        String tipo, int qtdPortas, int qtdPassageiros, String tipoCombustivel, String versão){
        super.cadastrar(cor, marca, modelo, anoFab, placa);
        this.cadastrar(tipo, qtdPortas, qtdPassageiros, tipoCombustivel, versão);
        
    }
    
    @Override
    public String exibir(){
        return super.exibir()+
                "\nTipo: "+tipo+
                "\nQuantidade de portas: "+qtdPortas+
                "\nQuantidade passageiros: "+qtdPassageiros+
                "\nTipo combustivel: "+tipoCombustivel+
                "\nVersão: "+versao;
    }
    
    
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getQtdPortas() {
        return qtdPortas;
    }

    public void setQtdPortas(int qtdPortas) {
        this.qtdPortas = qtdPortas;
    }

    public int getQtdPassageiros() {
        return qtdPassageiros;
    }

    public void setQtdPassageiros(int qtdPassageiros) {
        this.qtdPassageiros = qtdPassageiros;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public String getVersao() {
        return versao;
    }

    public void setVersao(String versao) {
        this.versao = versao;
    }
    
    
}
