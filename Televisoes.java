public class Televisoes {

    static class Televisao {

        private int tamanhoTela;
        private int volume;
        private String marca;
        private int voltagem;
        private int canal;
        private boolean ligada;

        public Televisao(int tamanhoTela, String marca, int voltagem) {
            this.tamanhoTela = tamanhoTela;
            this.marca = marca;
            this.voltagem = voltagem;
            this.volume = 5;
            this.canal = 1;
            this.ligada = false;
        }

        public void ligar() {
            ligada = true;

            int consumo = tamanhoTela * voltagem;

            System.out.println("TV ligada.");
            System.out.println("Consumo: " + consumo);
        }

        public void desligar() {
            ligada = false;
            System.out.println("TV desligada.");
        }

        public void aumentarVolume() {
            if (volume < 10) {
                volume++;
            }

            System.out.println("Volume: " + volume);
        }

        public void diminuirVolume() {
            if (volume > 1) {
                volume--;
            }

            System.out.println("Volume: " + volume);
        }

        public void subirCanal() {
            canal++;
            System.out.println("Canal: " + canal);
        }

        public void descerCanal() {
            if (canal > 1) {
                canal--;
            }

            System.out.println("Canal: " + canal);
        }
    }

    public static void main(String[] args) {

        Televisao tv = new Televisao(50, "Samsung", 220);

        tv.ligar();
        tv.aumentarVolume();
        tv.aumentarVolume();
        tv.subirCanal();
        tv.subirCanal();
        tv.diminuirVolume();
        tv.descerCanal();
        tv.desligar();
    }
}