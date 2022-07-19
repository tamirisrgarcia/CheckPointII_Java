package entities.veiculos;

import java.util.ArrayList;

public class Caminhao extends Veiculo {
    public Caminhao(int id, String placa) {
        this.id = id;
        this.placa = placa;
        this.tipo = "Caminhão";
        this.listaItens = new ArrayList<>(){};
    }

    @Override
    protected int obterPesoMaximo() {
        return 5000;
    }
}
