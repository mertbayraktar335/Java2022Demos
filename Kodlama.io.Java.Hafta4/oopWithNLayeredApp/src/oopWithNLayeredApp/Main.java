package oopWithNLayeredApp;

import java.util.List;
import oopWithNLayeredApp.business.ProductManager;
import oopWithNLayeredApp.core.logging.DatabaseLogger;
import oopWithNLayeredApp.core.logging.FileLogger;
import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.core.logging.MailLogger;
import oopWithNLayeredApp.dataAccess.HibernateProductDao;
import oopWithNLayeredApp.entities.Product;

public class Main {
    public static void main(String[] args) throws Exception {
        Product product1 = new Product(1, "IPhone Xr", 90);

        Logger[] loggers = {new DatabaseLogger(),new FileLogger(),new MailLogger()};
        List<Logger> loggers2 = List.of(new DatabaseLogger(),new FileLogger(),new MailLogger());
        
        ProductManager productManager = new ProductManager(new HibernateProductDao(),loggers,loggers2);
        productManager.add(product1);
        
    }
}
