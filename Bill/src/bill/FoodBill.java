/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bill;

/**
 *
 * @author INT105
 */
public class FoodBill extends Bill{
    public static long count;

    public FoodBill(Customer cust, double totalPrice) {
        super(cust, totalPrice);
        billId=++count;
    }

    public static long getNumOfBill() {
        return count;
    }
    @Override
    public String toString() {
        return "FoodBill"+super.toString();
    }
}
