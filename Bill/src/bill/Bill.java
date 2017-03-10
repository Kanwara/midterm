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
public abstract class Bill {
    protected long billId;
    private Customer cust;
    private double totalPrice;
    private double promoPrice;

    public Bill() {
    }

    
    public Bill(Customer cust, double price) {
        this.cust = cust;
        this.totalPrice = price;
    }

    public Customer getCust() {
        return cust;
    }

    public void setCust(Customer cust) {
        this.cust = cust;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
    

    public void setPromoPrice(Bill bill, double minPrice, double percentPro, double maxPro) {
        if(this.cust.getCustId()==bill.cust.getCustId() && bill instanceof FoodBill && this instanceof GoodsBill && this.totalPrice>=minPrice ){
            this.promoPrice = bill.totalPrice * percentPro;
            this.promoPrice = (promoPrice > maxPro)? maxPro : promoPrice; 
            
        }
    }

    @Override
    public String toString() {
        return ", Bill id: "+billId+cust+
                "\nTotal price: "+totalPrice+" Promotion price: "+promoPrice+
                "\nNet: "+(totalPrice - promoPrice);
    }
    
    
}
