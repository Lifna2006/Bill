package randomclasses;

import billing.ProductList;
import billing.Cart;
import billing.Bill;

import java.util.Scanner;

public class Main {

    public static ProductList createRepo(){

        return new ProductList();
    }

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        ProductList productList = createRepo();

        Cart cart1 = new Cart();

        while(true){

            System.out.println("Enter product Id");
            int prodId = scan.nextInt();

            System.out.println("Enter Quantity");
            int qty = scan.nextInt();

            if(productList.isValidCode(prodId))
                cart1.addItem(prodId,qty);
            else
                System.out.println("Invalid code");

            System.out.println("Choose Generate bill (n) / Continue (y)");

            char repeat = scan.next().charAt(0);

            if(repeat=='n')
                break;

        }

        Bill bill = new Bill(cart1,productList);

        bill.generateBill();

    }

}