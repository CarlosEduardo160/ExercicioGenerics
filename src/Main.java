import Entidade.Barco;
import Entidade.Carro;
import Entidade.Moto;
import Service.AluguelService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Carro> carros = new ArrayList<>(List.of(new Carro("Maverick"), new Carro("BMW"), new Carro("Ferrari")));
        List<Moto> motos = new ArrayList<>(List.of(new Moto("160"), new Moto("Honda"), new Moto("Yamaha")));
        List<Barco> barcos = new ArrayList<>(List.of(new Barco("Focker"), new Barco("Rossini"), new Barco("Cimitarra")));

        AluguelService<Barco> aluguelService = new AluguelService<>(barcos);

        Barco veiculo = aluguelService.buscarVeiculosDisponiveis();
        aluguelService.devolverVeiculo(veiculo);

        System.out.println("------------");

        aluguelService.listarVeiculos(barcos);
        aluguelService.listarVeiculos(carros);
        aluguelService.listarVeiculos(motos);
    }
}
