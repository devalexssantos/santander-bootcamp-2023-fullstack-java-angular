public class Smarttv {

    boolean statusLigada = false;
    int volume = 10;
    int canal = 1;

    public void ligarOuDesligar() {

        String statusEscrito;

        if(statusLigada == false) {
            statusLigada = true;
            statusEscrito = "Ligada!";
        } else {
            statusLigada = false;
            statusEscrito = "Desligada!";
            volume = 0;
            canal = 0;
        }

        System.out.println("A TV está: " + statusEscrito);
    }

    public void aumentarVolume() {
        if(volume == 100) {
            volume = 100;
            System.out.println("O volume está no máximo!");
        } else {
            volume++;
        }

        System.out.println("Volume atual: " + volume);
    }

    public void diminuirVolume() {
        if(volume == 0) {
            volume = 0;
            System.out.println("O volume está no mínimo!");
        } else {
            volume--;
        }

        System.out.println("Volume atual: " + volume);
    }

    public void aumentarCanal () {
        canal++;
        System.out.println("Canal atual: " + canal);
    }

    public void diminuirCanal () {

        if(canal == 1) {
            System.out.println("Você está no primeiro canal, tente subir.");
        } else {
           canal--;

        }
        System.out.println("Canal atual: " + canal);
    }

}