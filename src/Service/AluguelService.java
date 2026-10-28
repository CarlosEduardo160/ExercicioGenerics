package Service;

import Entidade.Carro;
import Entidade.Veiculo;

import java.util.List;

public class AluguelService<T> {
    private List<T> veiculos;

    public AluguelService(List<T> veiculos) {
        this.veiculos = veiculos;
    }

    public T buscarVeiculosDisponiveis() {
        System.out.println("Buscando veículo disponivel... ");
        T t = veiculos.remove(0);
        System.out.println("Alugando veículo: " + t);
        System.out.println("Veículos disponíveis para aluguel: ");
        System.out.println(veiculos);
        return t;
    }

    public void devolverVeiculo(T t){
        System.out.println("Devolvendo veículo: " + t);
        veiculos.add(t);
        System.out.println("Veículos disponíveis:");
        System.out.println(veiculos);
    }

    public void listarVeiculos(List<? extends Veiculo> veiculos){
        for (Veiculo veiculo : veiculos){
            System.out.println(veiculo);
        }
    }
}
