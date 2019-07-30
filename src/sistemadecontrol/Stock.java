/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemadecontrol;

import java.util.ArrayList;

/**
 *
 * @author Desarrollo Web
 */
public class Stock {
    ArrayList<ItemStock> items= new ArrayList<>();

    public ArrayList<ItemStock> getItems() {
        return items;
    }

    public void setItems(ArrayList<ItemStock> items) {
        this.items = items;
    }
    
    
}
