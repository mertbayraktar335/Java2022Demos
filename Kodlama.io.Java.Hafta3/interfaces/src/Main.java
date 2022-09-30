public class Main {
    public static void main(String[] args) throws Exception {
        CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());

        customerManager.add();
    }
}
