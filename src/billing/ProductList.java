package billing;

import java.util.ArrayList;
import java.util.List;

public class ProductList {

    List<Product> products;

    public ProductList() {

        products = new ArrayList<>();

        products.add(new Product("colgatepaste",20.0f,20));
        products.add(new Product("hamamsoap",10.5f,20));
        products.add(new Product("udayam dhal",60.5f,50));
        products.add(new Product("idhayam oil",90.5f,100));
        products.add(new Product("himalaya shampoo",120.0f,100));

    }

    public boolean isValidCode(int id){

        for(Product p : products){

            if(p.getId() == id)
                return true;
        }

        return false;
    }

    public Product getProductById(int id){

        for(Product p : products){

            if(p.getId() == id)
                return p;
        }

        return null;
    }

}