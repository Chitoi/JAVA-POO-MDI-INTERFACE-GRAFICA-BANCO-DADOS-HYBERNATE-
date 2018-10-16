
public class Curso {
    private String nome;
    private float valorTotal;
    private float mensalidade;
    private int duracao;
    
    public void cadastrar(String nome, float valorTotal, float mensalidade, int duracao){
        setNome(nome);
        setValorTotal(valorTotal);
        setMensalidade(mensalidade);
        setDuracao(duracao);
    }
    
    public String exibir(){
        String total = String.format("%.2f", valorTotal); 
        String mensal = String.format("%.2f", mensalidade);
        
        return "Curso: "+nome+" "+
               "Valor total: R$"+total+" "+
               "Mensalidade: R$"+mensal+" "+
               "Duracao: "+duracao+" anos"; 
    }
        

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public float getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(float mensalidade) {
        this.mensalidade = mensalidade;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
    
    
    
    
    
    
}
