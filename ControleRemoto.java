public class ControleRemoto {
    //atributos - privados
    private boolean estaLigado; // false ou true
    private int volume;
    private int volumeMudo;
    private boolean estaMudo;
    private int canal;

    //métodos - públicos
    //void não retorna nada

    //método contrutor - sempre o mesmo nome da classe
    public ControleRemoto(){
        estaLigado = false;
        volume = 10;
        estaMudo = false;
        canal = 1;
    }

    public void ligarDesligar(){
        /*
        if(estaLigado == true)
            estaLigado = false;
        else
            estaLigado = true;
        */
        /*
         * !estaligado
         * false -> true
         * true -> false
         * 
         */
        estaLigado = !estaLigado;
        if(estaLigado)
            System.out.println("O aparelho foi ligado");
        else
            System.out.println("O aparelho foi desligado");
    }

    public void mudarVolume(char teclaVolume){
        if(estaLigado){
            System.out.println("Volume atual: " + volume);

            if(teclaVolume == '+' && volume != 100){
            //if(teclaVolume == '+' && volume < 100){
            //if(teclaVolume == '+' && volume ,= 99){  
                volume++;
                System.out.println("Novo volume: " + volume);
            }
            else if(teclaVolume == '-' && volume != 0){
            //else if(teclaVolume == '-' && volume > 0){
            //else if(teclaVolume == '-' && volume >= 1){
                volume--;
                System.out.println("Novo volume: " + volume);
            }
            else if(teclaVolume == 'm' || teclaVolume == 'M'){
                if(estaMudo == false){
                    volumeMudo = volume;
                    volume = 0;
                }
                else{
                    volume = volumeMudo;
                }
                estaMudo = !estaMudo;
                if(estaMudo)
                    System.out.println("Mudo ativado");
                else
                    System.out.println("Mudo desativado");
            }
        }
    }

    public void mudarCanal(char teclaCanal){ //assinatura: mudarCanal(char)
        if(estaLigado){
            if(teclaCanal == '+' && canal != 999){
                    canal++;
                }
                else if(teclaCanal == '-' && canal != 1){
                    canal--;
                }
            System.out.println("Canal atual: " + canal);
        }
    }

    public void mudarCanal(int numeroCanal){//assinatura: mudarCanal(int)
        if(estaLigado){
            if(numeroCanal >= 1 && numeroCanal <= 999 && canal != numeroCanal)
                canal = numeroCanal;
            System.out.println("Canal atual: " + canal);
        }
    }

    //exemplo válido
    public void mudarCanal(int qqCoisa, String nomeCanal){//assinatura: mudarCanal(int, String)
       
    }
    //exemplo válido
    public void mudarCanal(String nomeCanal, int qqCoisa){//assinatura: mudarCanal(String, int)
       
    }

}
