package billing;

import java.util.Map;

public class Bill {

    private static int lastBillId = 1;

    private final int billId;
    private final Cart cartItems;
    private final ProductList productList;

    public Bill(Cart cartItems, ProductList productList){

        this.billId = lastBillId++;
        this.cartItems = cartItems;
        this.productList = productList;

    }

    public void generateBill(){

        System.out.println("\n=========== BILL ===========");
        System.out.println("Bill ID : "+billId);
        System.out.println("-------------------------------------");

        System.out.printf("%-20s %-5s %-8s %-8s\n",
                "DESCRIPTION","QTY","PRICE","TOTAL");

        System.out.println("-------------------------------------");

        float totalAmount = 0;

        for(Map.Entry<Integer,Integer> item : cartItems.cartItems.entrySet()){

            int productId = item.getKey();
            int qty = item.getValue();

            Product p = productList.getProductById(productId);

            if(p!=null){

                float price = p.getPrice();
                float total = price * qty;

                totalAmount += total;

                System.out.printf("%-20s %-5d %-8.2f %-8.2f\n",
                        p.getName(),qty,price,total);
            }

        }

        System.out.println("-------------------------------------");

        System.out.printf("%-20s %-5s %-8s %-8.2f\n",
                "TOTAL","","", totalAmount);

        System.out.println("=====================================");

    }

}