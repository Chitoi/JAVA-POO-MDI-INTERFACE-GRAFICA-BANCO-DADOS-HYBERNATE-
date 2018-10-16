/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
public class Fiscal extends Pessoa {
    private char sexo;
    private double valor;
    
    
    //Sobrecarga, chamando um super com os atributos dessa classe no mesmo metodo
    public void Cadastrar(String nome, int idade, char sexo, double valor){
        super.cadastrar(nome, idade);
        setSexo(sexo);
        setValor(valor);
    }
    
    //Exibir de outra forma, parecido como na linguagem C
    @Override
    public String exibir(){
        String s = sexoPorExtenso();
        
        return String.format("Nome : %s\n" +
                             "Idade: %d\n" +
                             "Sexo: R$ %.2f\n",
                             getNome(), getIdade(), s, valor);
    }
    
    public static String totalizarCusto(Fiscal[] fiscs){
        double total = 0;
        int aux;
        
        for(aux=0; aux < fiscs.length && fiscs[aux] != null; aux++){
            total += fiscs[aux].getValor();
        }
        
        return String.format("Custos com os fiscais: R$ %.2f", total);
    }
    
    public static String participacaoPorSexo(Fiscal[] fiscs){
        
        int masc = 0, fem = 0, aux;
        double percMasc, percFem;
        
        for(aux=0; aux < fiscs.length && fiscs[aux] != null; aux++){
            
            if(fiscs[aux].sexo == 'M'){
                masc++;
            }
        }
        fem = aux - masc;
        
        percMasc = (masc * 100) / aux;
        
        percFem = 100 - percMasc;
        
        return String.format(
                "Fiscais por sexo -> Masculino: %d (%.2f %%)"+
                " | Feminino: %d (%.2f %%)",
                masc, percMasc, fem, percFem);
    }
    
    public String sexoPorExtenso(){
        return sexo == 'M'?"Masculino":
                sexo == 'F'?"Feminino":"";
    }
    
    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    
}
