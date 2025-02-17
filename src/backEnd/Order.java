/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package backEnd;

/**
 *
 * @author Adjatay
 */
public class Order {

    
    private String orderId;
    private String name;
    private String style;
    
    
    
    public Order() {
        orderId = null;
        name = null;
        style = null;
    }
    public String getOrderId() {
        return orderId;
    }

    public String getName() {
        return name;
    }

    public String getStyle() {
        return style;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStyle(String style) {
        this.style = style;
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        
        sb.append(orderId);   sb.append(",");
        sb.append(name);    sb.append(",");
        sb.append(style);       sb.append("\n");
        
        return sb.toString();
    }
    
    public static Order parseString(String text) {
        Order order = new Order();
        
        String pieces[] = text.split(",");
        
        order.orderId = pieces[0];
        order.name = pieces[1];
        order.style = pieces[2];
        
        return order;
    }
    
   }
    

