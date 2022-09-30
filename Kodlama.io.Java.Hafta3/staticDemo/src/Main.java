import javax.xml.crypto.Data;

public class Main {
    public static void main(String[] args) throws Exception {
        ProductManager manager = new ProductManager();
        Product product =new Product();
        product.price= 10;
        product.name ="";
        manager.add(product);

        DatabaseHelper.Crud.delete();

        DatabaseHelper.Connection.createConnection();
    }
}
