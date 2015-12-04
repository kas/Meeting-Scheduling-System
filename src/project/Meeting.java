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
public class Meeting {
    String name;
    Room room;
    int time;   // 24-hour clock
    ArrayList<Person> people = new ArrayList<Person>();
}
