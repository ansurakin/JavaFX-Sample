package ru.alexander.javafx.sample.interfaces.impl;

import java.util.List;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import ru.alexander.javafx.sample.interfaces.AddressBook;
import ru.alexander.javafx.sample.object.Person;

public class CollectionAddressBook implements AddressBook{
    
    private ObservableList<Person> personList = FXCollections.observableArrayList();

    @Override
    public void add(Person person) {
        this.personList.add(person);
    }

    @Override
    public void update(Person person) {
        
    }

    @Override
    public void delete(Person person) {
        this.personList.remove(person);
    }

    public ObservableList<Person> getPersonList() {
        return personList;
    }
    
    public void print(){
        int number = 0;
        System.out.println();
        for(Person person : personList){
            number++;
            System.out.println(number+") fio = "+person.getFio()+"; phone = "+person.getPhone());
        }
    }

    public void fillTestData(){
        personList.add(new Person("Иван Печкин", "23948723948"));
        personList.add(new Person("Роман Романов", "345345345"));
        personList.add(new Person("Антон Иванов", "345345345"));
        personList.add(new Person("Джон Маклейн", "23423423"));
        personList.add(new Person("Джек Воробей", "234234"));
        personList.add(new Person("Алиса Ивановна", "456456"));
        personList.add(new Person("Боб Марли", "34534345"));
    }

}
