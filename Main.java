

public class Main {
    public static void main(String[] args) {
        
        //ControleRemoto é uma classe ou um tipo referenciado, precisam ser declarados e alocado
        //SEMPRE precisa declarar e alocar

        ControleRemoto controleTV;// declaração - controleTV é um objeto da classe ControleRemoto 
        controleTV = new ControleRemoto(); //alocação

        ControleRemoto controleRadio = new ControleRemoto(); // declarando e alocando

        //int numero; //int é um tipo de dado primitivo não precisa instanciar, só declarar

        controleTV.ligarDesligar();
        controleTV.mudarCanal(20);
        controleTV.mudarVolume('+');
        controleTV.mudarVolume('m');
        controleTV.mudarVolume('m');
        controleTV.mudarVolume('J');
        controleTV.ligarDesligar();
    }
}