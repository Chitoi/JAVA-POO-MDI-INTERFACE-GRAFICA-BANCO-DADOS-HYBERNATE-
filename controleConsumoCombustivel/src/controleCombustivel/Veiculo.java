
package controleCombustivel;

public class Veiculo {
    private String modelo;
    private String marca;
    private int capacidTanqeCombust;
    private double consuMedio;
    private double distViagem;
    
    public double totalDeLitrosParaViagem(){
        return distViagem/consuMedio;
    }    
    
    public String abastecerCarro(){
        if(totalDeLitrosParaViagem()>capacidTanqeCombust){
            double resto= totalDeLitrosParaViagem()-capacidTanqeCombust;
            return "Ira sobrar "+resto+"litros de combústivel";
            
        }else if(totalDeLitrosParaViagem()==capacidTanqeCombust){
            return "Não vai faltar combustivel para viagem e nem sobrar:";
       
        }else{
            double faltaCombust=capacidTanqeCombust-totalDeLitrosParaViagem();
            return "Ira faltar combustivel: "+faltaCombust+"litros de combustivel";
        }
    }
    
    public static String veicEconomico(Veiculo[] v){
        int aux, economico=0;
        double economicoAtual, maisEconomico ;
        String resp= "Mais econômico \n";

        maisEconomico = v[economico].consuMedio;
        
        resp += v[economico].exibir()+"\n--------------------\n";
        
        for(aux=1; aux<v.length && v[aux] != null; aux++){
            economicoAtual = v[aux].consuMedio;
            if(economicoAtual > maisEconomico){
            maisEconomico = economicoAtual;
            resp="Mais econômico \n"+v[aux].exibir();
            }else if(economicoAtual == maisEconomico){
                resp+=v[aux].exibir()+
                        "-------------\n";
            }       
        }
        return resp;
    }
    
    public double autonomia(){
        return capacidTanqeCombust*consuMedio;
    } 
    
     public static String maiorAutonomia(Veiculo[] v){
        int aux, autonomia=0;
        double autonomiaAtual, maiorAutonomia ;
        String resp= "Mais econômico \n";

        maiorAutonomia = v[autonomia].autonomia();
        
        resp += v[autonomia].exibir()+"\n--------------------\n";
        
        for(aux=1; aux<v.length && v[aux] != null; aux++){
            autonomiaAtual = v[aux].autonomia();
            if(autonomiaAtual > maiorAutonomia){
            maiorAutonomia = autonomiaAtual;
            resp="Mais econômico \n"+v[aux].exibir();
            }else if(autonomiaAtual == maiorAutonomia){
                resp+=v[aux].exibir()+
                        "-------------\n";
            }       
        }
        return resp;
    }
     
    public static double mediaAutonomia(Veiculo[] v){
        double total=0, media=0;
        int aux;
        for(aux=0; aux<v.length; aux++){
            total=total+v[aux].autonomia();
        }
        return media=total/(aux+1);
        
    } 
    
    public static String menorAutonomiaMedia(Veiculo[] v){
        int aux, autonomia=0;
        double  menorAtual, menorAutonomia;
        
        String resp="Menor autonomia\n";
        
        menorAutonomia=v[autonomia].autonomia();
        resp+=v[autonomia].exibir()+"\n-----------\n";
        
        for(aux=0; aux<v.length&&v[aux]!=null; aux++){
            menorAtual=v[aux].autonomia();
            
            if(menorAtual<mediaAutonomia(v)){
                menorAutonomia=menorAtual;
                resp="Menor autonomia da media\n"+v[aux].exibir();
            }else if(menorAtual==menorAutonomia){
                resp+=v[aux].exibir()+"-----------\n";
            }
        }
        return resp;
        
    }
    
    
    public String exibir(){
        return "Modelo: "+modelo+
               "\nMarca: "+marca+
               "\nCapacidade tanque combustivel: "+capacidTanqeCombust+
               "\nConsumo medio litros/km: "+consuMedio+
               "\nDistançia da viagem: "+distViagem; 
    }
    
    
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCapacidTanqeCombust() {
        return capacidTanqeCombust;
    }

    public void setCapacidTanqeCombust(int capacidTanqeCombust) {
        this.capacidTanqeCombust = capacidTanqeCombust;
    }
    
    
   
    public double getConsuMedio() {
        return consuMedio;
    }

    public void setConsuMedio(double consuMedio) {
        this.consuMedio = consuMedio;
    }

    public double getDistViagem() {
        return distViagem;
    }

    public void setDistViagem(double distViagem) {
        this.distViagem = distViagem;
    }

}
