package inventorymanager;

import java.util.*;

public class FlashSaleInventoryManager {

    private HashMap<String,Integer> stock = new HashMap<>();

    public void addProduct(String productId,int quantity){
        stock.put(productId,quantity);
    }

    public String purchaseItem(String productId){

        int currentStock = stock.getOrDefault(productId,0);

        if(currentStock>0){
            stock.put(productId,currentStock-1);
            return "Purchase successful. Remaining stock: "+(currentStock-1);
        }

        return "Out of stock";
    }

}
