public class Programa {

    static class Produto {

        private String nome;
        private double preco;
        private int quantidade;

        private static int totalProdutos = 0;

        public Produto(String nome, double preco, int quantidade) {
            this.nome = nome;

            if (preco >= 0) {
                this.preco = preco;
            } else {
                this.preco = 0;
                System.out.println("Preço inválido! Definido como 0.");
            }

            if (quantidade >= 0) {
                this.quantidade = quantidade;
            } else {
                this.quantidade = 0;
                System.out.println("Quantidade inválida! Definida como 0.");
            }

            totalProdutos++;
        }

        public String getNome() {
            return nome;
        }

        public double getPreco() {
            return preco;
        }

        public int getQuantidade() {
            return quantidade;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public void setPreco(double preco) {
            if (preco >= 0) {
                this.preco = preco;
            } else {
                System.out.println("Erro: preço não pode ser negativo.");
            }
        }

        public void setQuantidade(int quantidade) {
            if (quantidade >= 0) {
                this.quantidade = quantidade;
            } else {
                System.out.println("Erro: quantidade não pode ser negativa.");
            }
        }

        public double calcularValorEstoque() {
            return preco * quantidade;
        }

        public static int getTotalProdutos() {
            return totalProdutos;
        }

        public void exibirDados() {
            System.out.println("Nome: " + nome);
            System.out.println("Preço: R$ " + preco);
            System.out.println("Quantidade: " + quantidade);
            System.out.println("Valor em estoque: R$ " + calcularValorEstoque());
        }
    }

    public static void main(String[] args) {

        Produto p1 = new Produto("Notebook", 3500.00, 5);
        Produto p2 = new Produto("Mouse", 80.00, 20);
        Produto p3 = new Produto("Teclado", 150.00, 10);

        p1.exibirDados();
        p2.exibirDados();
        p3.exibirDados();

        double valorTotal =
                p1.calcularValorEstoque() +
                p2.calcularValorEstoque() +
                p3.calcularValorEstoque();

        System.out.println("Valor total do estoque: R$ " + valorTotal);

        System.out.println("Total de produtos criados: "
                + Produto.getTotalProdutos());

        System.out.println("Testando valores inválidos:");

        p1.setPreco(-500);
        p2.setQuantidade(-10);

        Produto p4 = new Produto("Monitor", -1000, -5);

        p4.exibirDados();

        System.out.println("Total de produtos criados: "
                + Produto.getTotalProdutos());
    }
}