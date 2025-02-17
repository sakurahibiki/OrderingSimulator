/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template

*/
package backEnd;



import backEnd.Order;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

/**
 *
 *
 */
public class OrderLoader {
    
    public static Tree<String, Order> orders = new Tree<>();
    
        public static boolean open (String filename){

            try {
            FileReader file = new FileReader(filename);
            Scanner scanner = new Scanner(file);

            String headers = scanner.nextLine();

            while(scanner.hasNext()) {
                String line = scanner.nextLine();
                Order order = Order.parseString(line);
            
                orders.insert(order.getOrderId(), order);

            }
            scanner.close();
            }

            catch(Exception ex) {
                System.err.print(ex);
                return false;
            }
            return true;
        }


        
        
  
        
           
    
    
    
}
