package entities.itens;

// interface criada para tratamento dos itens transportados utilizando informações do id, nome e peso

public interface IItemTransportado {

    int getId();
    void setId(int id);
    String getNome();
    void setNome(String nome) ;
    int getPeso();
    void setPeso(int peso);
}
