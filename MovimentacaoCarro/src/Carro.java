public class Carro {
    private boolean ligado;
    private int velocidade;
    private int marcha;

    public Carro(){
        this.ligado = false;
        this.velocidade = 0;
        this.marcha = 0;
    }

    public int getVelocidade() {
        return this.velocidade;
    }   

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
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
            if (this.marcha == 0){
                System.out.println("aumentando marcha. Marcha atual: " + (++this.marcha));
            };
            if (((this.velocidade / marcha) == 20)) {
                System.out.println("Aumentando marcha. Marcha atual: " + (++this.marcha));
            } else if (!((this.velocidade / marcha) == 20)) {
                System.out.println("Velocidade insuficiente para aumentar a marcha.");
            }
            System.out.println("Marcha atual: " + (this.marcha));
        } else if (!this.ligado) {
            System.out.println("O carro está desligado. Ligue o carro primeiro.");
        } else if (!((this.velocidade / marcha) == 20)) {
            System.out.println("Você já está na marcha máxima para a velocidade atual.");
        }
    }

    public void ligar() {
        this.ligado = true;
        System.out.println("Carro ligado.");
    }

    public void acelerar () {
        if(this.marcha == 0) {
            System.out.println("Por favor, troque a marcha antes de acelerar.");
            return;
        }
        if (this.ligado && !((this.velocidade / marcha) == 20)) {
            this.velocidade += 10;
            System.out.println("Acelerando. Velocidade atual: " + this.velocidade + " km/h");
            
            if (this.velocidade >= 120){
                System.out.println("Velocidade máxima atingida. Reduzindo a velocidade.");
                this.velocidade = 120;
            }
        } else if (!this.ligado){
            System.out.println("O carro está desligado. Ligue o carro primeiro.");
        } else if ((this.velocidade / marcha) == 20) {
            System.out.println("Você já está na velocidade máxima para a marcha atual.");
        }
    }

    public void desligar () {
        if (this.velocidade != 0){
            System.out.println("Não é possível desligar o carro enquanto ele está em movimento. Reduza a velocidade primeiro.");
            }else if (this.ligado) {
            this.ligado = false;
            System.out.println("Carro desligado.");
            }else if(!this.ligado) {
            System.out.println("O carro já está desligado.");
            }
    }

    public void virar(String direcao) {
        direcao = direcao.toLowerCase().trim();
        if (this.ligado && this.velocidade > 10 && this.velocidade <= 40) {
            if (direcao.equalsIgnoreCase("esquerda")) {
                System.out.println("Virando para a esquerda.");
            } else if (direcao.equalsIgnoreCase("direita")) {
                System.out.println("Virando para a direita.");
            } else {
                System.out.println("Direção inválida. Use 'esquerda' ou 'direita'.");
            }
        } else if (!this.ligado){
            System.out.println("O carro está desligado. Ligue o carro primeiro.");
        }  else if (this.velocidade <= 10) {
            System.out.println("Velocidade muito baixa para virar. Acelere um pouco mais.");
        } else if (this.velocidade > 40) {
            System.out.println("Velocidade muito alta para virar com segurança. Reduza a velocidade.");
        }
    }


}
