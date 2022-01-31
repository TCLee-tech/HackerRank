import java.util.ArrayList;


public class priceCheck {

    public static void main(String[] args) {

ArrayList<String> products = new ArrayList<>();
products.add("egg");
products.add("milk");
products.add("cheese");

ArrayList<String> productPrices  = new ArrayList<>();
productPrices.add("2.89");
productPrices.add("3.29");
productPrices.add("5.79");

  
ArrayList<String> productSold = new ArrayList<>();
productSold.add("eggs");
productSold.add("eggs");
productSold.add("cheese");
productSold.add("milk");


ArrayList<String> soldPrice = new ArrayList<>();
soldPrice.add("2.89");
soldPrice.add("2.99");
soldPrice.add("5.97");
soldPrice.add("3.29");



int count = 0;

for (int i = 0; i < productSold.size(); i++) {

    for (int j = 0; j < products.size(); j++) {
        if (productSold.get(i).equals(products.get(j))) {
            
            if (!soldPrice.get(i).equals(productPrices.get(j))) {
                count++;
            } else {
            break;
            }

        }
    }
}
System.out.println(count);
}

}