import iPhone.Phone;
import iPhone.iPod;
import iPhone.internet;

public class testeap {
    public static void main(String[] args) throws Exception {

     iPod ipd = new iPod();
       ipd.tocarMusica();
       ipd.Pausar();
       ipd.selecioneMusica();
       System.out.println("-------------------");
       

       
    
       Phone phn = new Phone();
       phn.Atende();
       phn.Ligar();
       phn.iniciarCorreioVoz();
        

        internet inter = new internet();
        inter.adicionarNovaAba();
        inter.atualizarPagina();
        inter.exibirPagina();



}
}
