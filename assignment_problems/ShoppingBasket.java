public class ShoppingBasket {
    private double[] prices;
    private int itemCount;
    private final String basketId;

    public ShoppingBasket(String basketId, int maxItems) {
        this.basketId = basketId;
        prices = new double[maxItems];
        itemCount = 0;
    }

    public void addItem(double price) {
        if (itemCount < prices.length) {
            prices[itemCount] = price;
            itemCount++;
        }
    }

    public double getTotal() {
        double total = 0;

        for (int i = 0; i < itemCount; i++) {
            total += prices[i];
        }

        return total;
    }

    public int getItemCount() {
        return itemCount;
    }

    public static void main(String[] args) {
        ShoppingBasket basket = new ShoppingBasket("CART-5", 20);

        basket.addItem(250);
        basket.addItem(99);
        basket.addItem(151);

        System.out.println("Total: " + basket.getTotal());
        System.out.println("Item count: " + basket.getItemCount());
    }
}