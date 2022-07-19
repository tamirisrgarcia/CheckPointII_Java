import entities.itens.Item;
import entities.veiculos.Caminhao;
import entities.veiculos.Caminhonete;
import entities.veiculos.Veiculo;

import java.util.ArrayList;

public class Program {

    public static void main(String[] args) throws Exception {

        try
        {
            ArrayList<Veiculo> veiculos = new ArrayList<>();

            Caminhao caminhao = new Caminhao(1, "SAD1234");
            caminhao.adicionarItem(new Item("Arroz", 1000));
            caminhao.adicionarItem(new Item("Café", 2500));

            veiculos.add(caminhao);

            Caminhonete caminhonete = new Caminhonete(2, "BYE4735");
            caminhonete.adicionarItem(new Item("Feijão", 1000));
            caminhonete.adicionarItem(new Item("Milho", 500));
            //caminhonete.adicionarItem(new Item("Açúcar", 1750)); //Tratamento de exceção em caso de limite de peso excedido


            veiculos.add(caminhonete);

            for (Veiculo item : veiculos) {
                System.out.println("Veículo atual: " + item.getTipo());
                System.out.println("Peso atual dos itens: " + item.obterPesoAtual());
                System.out.println("Quantidade de itens transportados: " + item.obterQuantidadeItens());
                System.out.println("Itens transportados:");
                for (Item item1 : item.getListaItens()){
                    System.out.println(item1.getNome() + "; ");
                }

                System.out.println("---------------------");
            }
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
