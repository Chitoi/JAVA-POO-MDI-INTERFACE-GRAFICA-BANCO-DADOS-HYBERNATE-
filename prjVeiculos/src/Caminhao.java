
public class Caminhao extends Veiculo{
        
        private int qtdEixos;
        private String tipo;
        private int cargaMaxima;
        private float comprimento;
        private boolean tacografoOk;
        
        public void cadastrar(int qtdEixos, String tipo, int cargaMaxima, float comprimento, boolean tacografoOk){
            setQtdEixos(qtdEixos);
            setTipo(tipo);
            setCargaMaxima(cargaMaxima);
            setComprimento(comprimento);
            setTacografoOk(tacografoOk);
            
        }
        
        public void cadastrar(String cor, String marca, String modelo, int anoFab, String placa, 
                              int qtdEixos, String tipo, int cargaMaxima, float comprimento, boolean tacografoOk){
            
            super.cadastrar(cor, marca, modelo, anoFab, placa);
            this.cadastrar(qtdEixos, tipo, cargaMaxima, comprimento, tacografoOk);
        }
        
        @Override
        public String exibir(){
           
            
            return super.exibir()+
                    "Quantidade de eixos: "+qtdEixos+
                    "\nTipo: "+tipo+
                    "\nCarga maxima: "+cargaMaxima+
                    "\nComprimento: "+comprimento+
                    "\nTacografo: "+tacografoOk;
        
        }
        
        
        
        

    public int getQtdEixos() {
        return qtdEixos;
    }

    public void setQtdEixos(int qtdEixos) {
        this.qtdEixos = qtdEixos;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCargaMaxima() {
        return cargaMaxima;
    }

    public void setCargaMaxima(int cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }

    public float getComprimento() {
        return comprimento;
    }

    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }

    public boolean isTacografoOk() {
        return tacografoOk;
    }

    public void setTacografoOk(boolean tacografoOk) {
        this.tacografoOk = tacografoOk;
    }
        
        
}
