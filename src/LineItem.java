/**
 * Created by Brandon Degarimore on 1/6/2015.
 */
public class LineItem {

    String name;
    int quantity;
    double pricePerUnit;

    //Default Constructor
    public LineItem(String name, int quantity, double pricePerUnit)
    {
        this.name = name;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
    }
    public double getCost()
    {
        return pricePerUnit;
    }
    public void setQuantity(int newQuantity)
    {
        quantity = newQuantity;
    }
}
