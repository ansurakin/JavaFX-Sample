/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.alexander.javafx.sample.interfaces;

import ru.alexander.javafx.sample.object.Person;

/**
 *
 * @author Alex
 */
public interface AddressBook {
    
    void add(Person person);
    
    void update(Person person);
    
    void delete(Person person);
    
}
