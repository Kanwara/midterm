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
public class GoodsBill extends Bill{
    private static long count;

    public GoodsBill(Customer cust,double price) {
        super(cust,price);
        billId=++count;
    }
    
    public static long getNumOfBill(){
        return count;
    }

    @Override
    public String toString() {
        return "GoodsBill" +super.toString();
    }
    
    
    
}