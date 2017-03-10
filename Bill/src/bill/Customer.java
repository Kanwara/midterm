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
class Customer {
    private long custId;
    private static long count;

    public Customer() {
        custId = ++count;
    }

    public long getCustId() {
        return custId;
    }

    public long getCount() {
        return count;
    }

    @Override
    public String toString() {
        return " Customer id: " + custId;
    }
    
    
}
