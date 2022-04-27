package rifqimuhammadaziz.javafxcomponent.collection;

import javafx.collections.FXCollections;
import javafx.collections.ObservableSet;

public class DemoObservableSet {

    public static void main(String[] args) {
        ObservableSet<String> set1 = FXCollections.observableSet("One", "Two");
        System.out.println("After creating set: " + set1);
        set1.add("Three"); // add single data
        set1.add("Four"); // add single data
        set1.add("Five"); // add single data
        System.out.println("After adding elements: " + set1);
        set1.remove(0); // remove 'One'
        System.out.println("After removing elements: " + set1);

        // unordered output and no data duplication
        ObservableSet<Integer> set2 = FXCollections.observableSet();
        set2.add(1);
        set2.add(2);
        set2.add(8);
        set2.add(20);
        set2.add(20);
        System.out.println("After creating set2: " + set2);

    }
}
