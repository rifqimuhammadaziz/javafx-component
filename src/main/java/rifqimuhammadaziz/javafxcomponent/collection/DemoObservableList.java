package rifqimuhammadaziz.javafxcomponent.collection;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class DemoObservableList {

    public static void main(String[] args) {
        ObservableList<String> list = FXCollections.observableArrayList("One", "Two");
        System.out.println("After creating list: " + list);
        list.add("Three"); // add single data
        list.addAll("Four", "Five", "Six"); // add multiple data
        System.out.println("After adding elements: " + list);
        list.remove(0); // remove 'One'
        list.remove(0, 1); // remote 'Two', 'Two'
        System.out.println("After remove elements: " + list);

        ObservableList<String> list2 = FXCollections.observableArrayList();
        list2.addAll("Cat", "Frog");
        System.out.println("Second list: " + list2);

        ObservableList<String> list3 = FXCollections.concat(list, list2);
        System.out.println("After join first list and second list: " + list3);
    }
}
