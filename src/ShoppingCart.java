/**
 * Created by Brandon Degarimore on 1/6/2015.
 */
public class ShoppingCart {

    private int max = 10;
    private LineItem[] items;
    private double total;
    private int ItemAmount;

    //Default Constructor
    public ShoppingCart(int size)
    {
        max = size;

        this.total = 0;

        //initialize
        items = new LineItem[max];

        ItemAmount = 0;
    }

    public void add(LineItem newItem)
    {
        //If the list is less than ten items to a new order
        if(ItemAmount < max-1)
        {
            items[ItemAmount++] = newItem;

            //Update the cost now:
            total += newItem.pricePerUnit * newItem.quantity;
        }
    }

    //Return the total cost
    public double getTotalCost(){

        return total;
    }

}
