package interfaces;

public interface Product {
    
    String getName();
    void setName(String name);

    default double getPrice() {
        return 0;
    };
    default  void setPrice(double price) {};
}
