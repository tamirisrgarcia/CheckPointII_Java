package entities.veiculos;

import entities.itens.Item;

import java.util.ArrayList;
import java.util.Comparator;

// Criação da classe abstrata Veiculo com atributos genéricos e lista de itens que serão inclusos para transporte
public abstract class Veiculo {

    protected int id;
    protected String tipo;
    protected String placa;
    protected ArrayList<Item> listaItens;

    public ArrayList<Item> getListaItens() {
        return listaItens;
    }

    public void setListaItens(ArrayList<Item> listaItens) {
        this.listaItens = listaItens;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    // Método abstrato para obter o peso máximo dos itens que serão transportados. Caso exceda o valor máximo suportado pelo tipo de veículo, há exibição de Exceção.
    protected abstract int obterPesoMaximo();

    public void removerItem(int id) throws Exception{
        Item itemParaRemover = null;

        for (Item item : listaItens) {
            if (item.getId() == id){
                itemParaRemover = item;
            }
        }

        if (itemParaRemover != null){
            listaItens.remove(itemParaRemover);
        }
        else{
            throw new Exception("Item não encontrado");
        }
    }

    // Método para adicionar itens a serem transportados pelo veículo com tratamento de Exceção.
    public void adicionarItem(Item item) throws Exception
    {
        if ((obterPesoAtual() + item.getPeso()) > obterPesoMaximo()){
            throw new Exception("Peso ultrapassado para o veículo do tipo " + this.tipo + ". Peso limite: " + this.obterPesoMaximo());
        }

        item.setId(obterItemIdAtual() + 1);
        listaItens.add(item);
    }

    // Método para obter a quantidade de itens que serão transportados
    public int obterQuantidadeItens(){
        return listaItens.size();
    }

    // Método para retornar o maior identificador para os itens
    private int obterItemIdAtual(){
        if (obterQuantidadeItens() == 0){
            return 0;
        }

        int valorMaximo = 0;
        for (Item item : listaItens) {
            if (item.getId() > valorMaximo){
                valorMaximo = item.getId();
            }
        }

        return valorMaximo;
    }

    // Método para calcular o peso atual de cada um dos itens inseridos
    public int obterPesoAtual() {
        int pesoAtual = 0;

        for (Item item : listaItens) {
            pesoAtual += item.getPeso();
        }

        return pesoAtual;
    }
}
