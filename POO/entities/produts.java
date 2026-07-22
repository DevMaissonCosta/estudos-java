package POO.entities;

public class produts {

    public String nome;
    public double price;
    public int quantidade;

    public double totalValueInStock(){
        return price * quantidade;
    }

    public void addProducts (int quantidade) {
        this.quantidade += quantidade;
    }

    public void removeProducts(int quantidade){
        this.quantidade -= quantidade;
    }
}
