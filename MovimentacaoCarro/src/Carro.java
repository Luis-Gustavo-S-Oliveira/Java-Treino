public class Carro {
    boolean ligado;
    int velocidade;
    int marcha;

    public Carro(){
        this.ligado = false;
        this.velocidade = 0;
        this.marcha = 0;
    }

    public void desacelerar() {
        if (this.ligado) {
            if (this.velocidade >= 1) {
                this.velocidade -= 10;
            } else {
                this.velocidade = 0;
            }
            System.out.println("Desacelerando. Velocidade atual: " + this.velocidade + " km/h");
        } else {
            System.out.println("O carro está desligado. Ligue o carro primeiro.");
        }
    }

    public void marchar(){
        if (this.ligado) {
            if (this.velocidade < 20) {
                this.marcha = 1;
            } else if (this.velocidade < 40) {
                this.marcha = 2;
            } else if (this.velocidade < 60) {
                this.marcha = 3;
            } else if (this.velocidade < 80) {
                this.marcha = 4;
            } else if (this.velocidade < 100) {
                this.marcha = 5;
            } else {
                this.marcha = 6; 
            }
            System.out.println("Marcha atual: " + this.marcha);
        } else {
            System.out.println("O carro está desligado. Ligue o carro primeiro.");
        }
    }

    public void ligar() {
        this.ligado = true;
        System.out.println("Carro ligado.");
    }

    public void acelerar () {
        if (this.ligado) {
            this.velocidade += 10;
            System.out.println("Acelerando. Velocidade atual: " + this.velocidade + " km/h");
            if (this.velocidade >= 120){
                System.out.println("Velocidade máxima atingida. Reduzindo a velocidade.");
                this.velocidade = 120;
            }
        } else {
            System.out.println("O carro está desligado. Ligue o carro primeiro.");
        }
    }

    public void desligar () {
        if (this.velocidade != 0){
            System.out.println("Não é possível desligar o carro enquanto ele está em movimento. Reduza a velocidade primeiro.");
            }else if (this.ligado) {
            this.ligado = false;
            System.out.println("Carro desligado.");
            }
    }


}
