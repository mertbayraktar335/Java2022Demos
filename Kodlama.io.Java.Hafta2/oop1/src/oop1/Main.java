package oop1;

public class Main {
    public static void main(String[] args) {

        Product product1 = new Product();
        product1.setName("Delonghi Kahve Makinesi");
        product1.setDiscount(7);
        product1.setUnitPrice(5500);
        product1.setUnitsInStock(3);
        product1.setImageUrl("image1.png");

        Product product2 = new Product();
        product2.setName("Smeg Kahve Makinesi");
        product2.setDiscount(3);
        product2.setUnitPrice(6500);
        product2.setUnitsInStock(5);
        product2.setImageUrl("image2.png");

        Product product3 = new Product();
        product3.setName("Kitchen Aid Kahve Makinesi");
        product3.setDiscount(6);
        product3.setUnitPrice(7500);
        product3.setUnitsInStock(3);
        product3.setImageUrl("image3.png");

        Product[] products = { product1, product2, product3 };
        // System.out.println("<ul>");
        // for (Product product : products) {
        //     System.out.println("<li>" + product.getName() + "</li>");
        // }
        // System.out.println("</ul>");

        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setPhoneNumber("05555555555");
        individualCustomer.setCustomerNumber("12345");
        individualCustomer.setFirstName("Mert");
        individualCustomer.setLastName("Bayraktar");


        CorporateCustomer corporateCustomer = new CorporateCustomer(0, null, null);
        corporateCustomer.setId(2);
        corporateCustomer.setPhoneNumber("02322222222");
        corporateCustomer.setCustomerNumber("123123");
        corporateCustomer.setCompanyName("AGAMEMNON A.Ş");
        corporateCustomer.setTaxNumber("4949129491");

        Customer[] customers = {individualCustomer,corporateCustomer};

        for (Customer customer : customers) {

            System.out.println(corporateCustomer.toString());
            
        }
        

    }
}
