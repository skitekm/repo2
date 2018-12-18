package pl.bae.csv.kolekcje;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>();
        stringList.add("jeden");
        stringList.add("dwa");
        stringList.add("trzy");

        stringList.size(); //zwraca wielkosc listy
        stringList.isEmpty(); //sprawdza czy jest pusta
        stringList.remove(2); //usuwa wartosc z pola
        //stringList.get(2); // zwraca wartosc z pola

        Person person1 = new Person("Jan", "Kowalski",1);
        Person person2 = new Person("Karol", "Nowak",2);

        List<Person> personList = new ArrayList<Person>();
        personList.add(person1);
        personList.add(person2);

        for (Person p: personList){
            System.out.println(p.getLastName());
        }



    }
}
