public class Carros {

    static class Carro {

        private String modelo;
        private double velocidade;
        private double aceleracao;
        private int marcha;
        private boolean ligado;

        public Carro(String modelo, double aceleracao) {
            this.modelo = modelo;
            this.aceleracao = aceleracao;
            this.velocidade = 0;
            this.marcha = 0;
            this.ligado = false;
        }

        public void ligar() {
            ligado = true;
            System.out.println("Carro ligado.");
        }

        public void desligar() {
            ligado = false;
            velocidade = 0;
            System.out.println("Carro desligado.");
        }

        public void acelerar() {
            if (ligado) {
                velocidade += aceleracao;
                System.out.println("Velocidade atual: " + velocidade + " km/h");
            } else {
                System.out.println("Ligue o carro primeiro.");
            }
        }

        public void desacelerar() {
            if (velocidade > 0) {
                velocidade -= aceleracao;

                if (velocidade < 0) {
                    velocidade = 0;
                }

                System.out.println("Velocidade atual: " + velocidade + " km/h");
            }
        }

        public void virarDireita() {
            System.out.println("Virando à direita.");
        }

        public void virarEsquerda() {
            System.out.println("Virando à esquerda.");
        }

        public void subirMarcha() {
            marcha++;
            System.out.println("Marcha atual: " + marcha);
        }

        public void descerMarcha() {
            if (marcha > 0) {
                marcha--;
            }

            System.out.println("Marcha atual: " + marcha);
        }
    }

    public static void main(String[] args) {

        Carro carro = new Carro("Civic", 10);

        carro.ligar();
        carro.acelerar();
        carro.subirMarcha();
        carro.acelerar();
        carro.virarDireita();
        carro.desacelerar();
        carro.virarEsquerda();
        carro.descerMarcha();
        carro.desligar();
    }
}