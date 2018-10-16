/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
public class Calculadoraa {
    private double num1;
    private double num2;
    private int operacao;
    private int contador[] = new int[4];
    
    public String somar(){
        contador[0]++;
        return String.format("%.2f", num1+num2);
    }
    
    public String subtrair()
    {
        contador[1]++;
        return String.format("%.2f", num1-num2);
    }
    
    public String multiplicar()
    {
        contador[2]++;
        return String.format("%.2f", num1*num2);
    }
    
    public String dividir()
    {
        contador[3]++;
        return String.format("%.2f", num1/num2);
    }
    
    private boolean podeDividir(){
        return num2 !=0;
    }
    
    public boolean ehOperacaoValida(){
        return operacao > 0 && operacao <5;
    }
    
    public String exibirMenu(){
       return "1-somar ["+contador[0]+"]\n"+
              "2-subtrair ["+contador[1]+"]\n"+
              "3-multiplicar["+contador[2]+"]\n"+
              "4-dividir ["+contador[3]+"]\n"+
              "0-Sair";
    }
    
    public String exibirTotal(){
        int aux, total=0;
        
        for(aux=0; aux<4; aux++)
        {
            total += contador[aux];
        }
        return "total de calculos executados: "+total;
    }
    
    public String calcular(){
        String resp;
        switch(operacao)
        {
            case 1:
                resp= somar();
            break;
            case 2:
                resp = subtrair();
            break;
            case 3:
                resp = multiplicar();
            break;
            case 4:
                resp = podeDividir()?dividir():"não pode dividir por zero";
            break;
            case 0:
                resp = exibirTotal();
            break;
            default:
                resp = "opção incorreta";
        }
        return resp;
    }
    
    public boolean ehPraRepetir(){
        return operacao !=0;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public int getOperacao() {
        return operacao;
    }

    public void setOperacao(int operacao) {
        this.operacao = operacao;
    }

    public int[] getContador() {
        return contador;
    }
    
    
}
