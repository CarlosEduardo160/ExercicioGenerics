package Entidade;

public class Moto extends Veiculo {
    private String nome;

    public Moto(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Moto{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
