package rifqimuhammadaziz.javafxcomponent.collection;

import javafx.collections.FXCollections;
import javafx.collections.ObservableMap;

public class DemoObservableMap {

    public static void main(String[] args) {
        // key, value
        ObservableMap<String, Integer> map1 = FXCollections.observableHashMap();
        map1.put("Key1", 100);
        map1.put("Key2", 500);
        map1.put("Key3", -200);
        map1.put("Key4", 1_000);
        System.out.println("After creating and adding element map: " + map1);
        map1.put("Key3", 350);
        System.out.println("After replacing element: " + map1);
        System.out.println("Get value in Key1: " + map1.get("Key1"));
    }
}
