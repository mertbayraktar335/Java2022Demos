package oopWithNLayeredApp.business;
import java.util.List;

import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.entities.Product;

public class ProductManager {

    private ProductDao productDao;
    private Logger[] loggers;
    private List<Logger> loggers2;
    
    public ProductManager(ProductDao productDao,Logger[] loggers,List<Logger> loggers2) {
        this.productDao = productDao;
        this.loggers=loggers;
        this.loggers2 = loggers2;
    }



    public void add(Product product) throws Exception{
        //iş kuralları
        if(product.getUnitPrice()<10){
            throw new Exception("10 TL altında olamaz");
        }
        productDao.add(product);

        for (Logger logger : loggers) {
            logger.log(product.getName());
        }
        for (Logger logger : loggers2) {
            logger.log(product.getName());
        }
    }
}
