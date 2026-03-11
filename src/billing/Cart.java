package billing;

import java.util.HashMap;
import java.util.Map;

public class Cart {

    public Map<Integer,Integer> cartItems;

    public Cart(){

        cartItems = new HashMap<>();

    }

    public void addItem(int productCode,int qty){

        cartItems.put(productCode,qty);

    }

    public void removeItem(int productCode){

        cartItems.remove(productCode);

    }

}