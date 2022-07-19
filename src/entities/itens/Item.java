package entities.itens;

public class Item implements IItemTransportado {

    public Item(String nome, int peso) {
        this.nome = nome;
        this.peso = peso;
    }

    private int id;
    private String nome;
    private int peso;

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int getPeso() {
        return peso;
    }

    @Override
    public void setPeso(int peso) {
        this.peso = peso;
    }
}
