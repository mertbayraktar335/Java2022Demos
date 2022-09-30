public class ProductValidator {
    
    static{
        System.out.println("Static Yapıcı Blok Çalıştı");
    }
    
    //çalışması için newlemek gerekir.
    public ProductValidator(){
        System.out.println("Yapıcı blok Çalıştı");
    }
    public static boolean isValid(Product product){
        if(product.price>0 && !product.name.isEmpty()){
            return true;

        }else{
            return false;
        }
    } 

   
    //inner class
    public static class AnotherClass{
        public static void delete(){

        }
    }
}
