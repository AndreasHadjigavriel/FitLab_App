package Classes;

import java.util.ArrayList;
import java.util.List;

public class Administrator {
    private String username;
    private String email;
    private String password;
    private List<Order> orderList;
    private List<Product> productList;
    private Double discountPer;
    private Boolean validationOrder;
    private Double discount;
    
    public Administrator(String username, String email, String password, Double discountPer){
        this.username = username;
        this.email = email;
        this.password = password;
        this.discountPer = discountPer;
        
        this.orderList = new ArrayList<Order>();
        this.productList = new ArrayList<Product>();        
    }   
    
    public Boolean validateOrder(){
        
        return validationOrder;
    }
    
    public List<Order> getOrder(){
        
        return orderList;
    }
    
    public void calculateOffer(){
        
    }
    
    public Double getDiscount(){
        
        return discount;
    }
    
    public String getEmail(){
        
        return email;
    }
    
    public String getPassword(){
        
        return password;
    }
}
