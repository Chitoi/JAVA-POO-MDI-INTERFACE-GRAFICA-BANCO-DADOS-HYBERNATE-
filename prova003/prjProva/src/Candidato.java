/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
public class Candidato extends Pessoa {
    private int especificos;
    private int gerais;
    
    public void cadastrar(int especificos, int gerais, String nome, int idade){
        setEspecificos(especificos);
        setGerais(gerais);
    }
    
    public boolean isAprovado(int qtdEsp, int qtdGer){
        double minEsp = qtdEsp * 0.5, minGer = qtdGer * 0.2;
        
        double minTot = (qtdEsp + qtdGer) * 0.85;
        
        return (especificos >= minEsp && gerais >= minGer || ((especificos+gerais) >= minTot));
    }
    
    public String exibir(int qtdEsp,  int qtdGer){
        String aprovado = isAprovado(qtdEsp, qtdGer)?"Sim":"Não";
        
        return super.exibir()+
                "\nAcertos C. Gerais: "+qtdGer+
                "\nAcertos C. Especificos: "+qtdEsp+
                "\nAprovado: "+aprovado;
    }
    
    public static String exibirRanking(Candidato[] cands, int qtdEsp, int qtdGer){
        int aux, aux2;
        String resp = "";
        Candidato temp = new Candidato();
        
        for(aux = 0; aux < cands.length && cands[aux] != null; aux++){
            
            for(aux2 = aux+1; aux2 < cands.length && cands[aux2] != null; aux2++){
                if(cands[aux2].especificos > cands[aux].especificos){
                    
                    temp = cands[aux];
                    cands[aux] =  cands[aux2];
                    cands[aux2] = temp;
                }
            }
            resp += cands[aux].exibirDados(qtdEsp, qtdGer)+"\n";
        }
        
        return resp;
    }
    
    private String exibirDados(int qtdEsp, int qtdGer){
        
        double percEsp = especificos * 100 / qtdEsp;
        
        double percGer = gerais * 100 / qtdGer;
        
        double percTot = (especificos + gerais) * 100 / (qtdEsp + qtdGer);
        
        String situacao = isAprovado(qtdEsp, qtdGer)?"Sim":"Não";
        
        return getNome() + " - Espe. " +especificos+
                String.format("%.2f %%", percEsp)+
                " - C. Geral "+gerais+
                String.format("%.2f %%", percGer) +
                " - Total "+(especificos+gerais)+
                String.format("%.2f", percTot)+
                " - Aprovado? "+ situacao;
    }
    
    public int getEspecificos() {
        return especificos;
    }

    public void setEspecificos(int especificos) {
        this.especificos = especificos;
    }

    public int getGerais() {
        return gerais;
    }

    public void setGerais(int gerais) {
        this.gerais = gerais;
    }

    void cadastrar(int especifica, int geral) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
