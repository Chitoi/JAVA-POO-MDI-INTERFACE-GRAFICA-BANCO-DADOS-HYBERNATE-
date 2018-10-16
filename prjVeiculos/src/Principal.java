
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
public class Principal {

    public static void main(String[] args) {
        Caminhao ca = new Caminhao();
        Carro c = new Carro();
        
        int menu;
            do{
                menu = Integer.valueOf(JOptionPane.showInputDialog(
                        "1 - Cadastrar caminhão:"+
                        "\n2 - Cadastrar carro"+
                        "\n3 - Exibir caminhão"+
                        "\n4 - Exibir carro"+
                        "\n0 - Sair"        
                ));
                
                switch(menu){
                    case 1:{
                        int qtdEixos; 
                        String tipo; 
                        int cargaMaxima;
                        float comprimento;
                        boolean tacografoOk;
                        String cor;
                        String marca;
                        String modelo;
                        int anoFab;
                        String placa;
                                
                        cor = JOptionPane.showInputDialog("Informe a cor ");
                        marca = JOptionPane.showInputDialog("Informe a marca ");
                        modelo = JOptionPane.showInputDialog("Informe o modelo");
                        anoFab = Integer.valueOf(JOptionPane.showInputDialog("Informe o ano de fabricação"));
                        placa = JOptionPane.showInputDialog("Informe a placa");
                        qtdEixos = Integer.valueOf(JOptionPane.showInputDialog("Informe quantidade de eixos"));
                        tipo = JOptionPane.showInputDialog("Informe o tipo do caminhão");
                        cargaMaxima = Integer.valueOf(JOptionPane.showInputDialog("Informe a carga maxima"));
                        comprimento = Float.valueOf(JOptionPane.showInputDialog("Informe o comprimento do caminhão"));
                        tacografoOk = Boolean.valueOf(JOptionPane.showInputDialog("Tacografo: "));
                        
                        ca.cadastrar(cor, marca, modelo, anoFab, placa, qtdEixos, tipo, cargaMaxima, comprimento, tacografoOk);
                    }break;
                    case 2:{
                        String tipo;
                        int qtdPortas;
                        int qtdPassageiros;
                        String tipoCombustivel;
                        String versao;
                        String cor;
                        String marca;
                        String modelo;
                        int anoFab;
                        String placa;
                                
                        cor = JOptionPane.showInputDialog("Informe a cor ");
                        marca = JOptionPane.showInputDialog("Informe a marca ");
                        modelo = JOptionPane.showInputDialog("Informe o modelo");
                        anoFab = Integer.valueOf(JOptionPane.showInputDialog("Informe o ano de fabricação"));
                        placa = JOptionPane.showInputDialog("Informe a placa");
                        tipo = JOptionPane.showInputDialog("Tipo do carro: ");
                        qtdPortas = Integer.valueOf(JOptionPane.showInputDialog("Informe a quantidade de portas"));
                        qtdPassageiros = Integer.valueOf(JOptionPane.showInputDialog("Quantidade de passageiros:"));
                        tipoCombustivel = JOptionPane.showInputDialog("Tipo de combustivel:");
                        versao = JOptionPane.showInputDialog("Versão do carro:");
                        
                        c.cadastrar(cor, marca, modelo, anoFab, placa, tipo, qtdPortas, qtdPassageiros, tipoCombustivel, versao);
                        
                    }break;
                    case 3:{
                        JOptionPane.showMessageDialog(null, ca.exibir());
                        
                    }break;
                    case 4:{
                        JOptionPane.showMessageDialog(null, c.exibir());
                    }break;
                    case 0:break;
                }
                
                
                
            
            }while(menu != 0);
                
    }
    
}
