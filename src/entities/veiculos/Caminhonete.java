package entities.veiculos;

import java.util.ArrayList;

public class Caminhonete extends Veiculo {
    public Caminhonete(int id, String placa) {
        this.id = id;
        this.placa = placa;
        this.tipo = "Caminhonete";
        this.listaItens = new ArrayList<>(){};
    }

    @Override
    protected int obterPesoMaximo() {
        return 2000;
    }
}
