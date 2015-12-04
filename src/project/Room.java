/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.util.ArrayList;

/**
 *
 * @author KAS6570
 */
public class Room {
    int number;
    ArrayList<Meeting> meetings = new ArrayList<Meeting>();
    // cannot hold more than one meeting in one time slot
    Room(int number) {
        this.number = number;
    }
    
    
}
