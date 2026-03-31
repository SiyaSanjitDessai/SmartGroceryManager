package app.service;

import app.model.GroceryList;
import java.io.*;

public class FileService {

    public static void save(GroceryList list) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data/groceries.dat"))) {
            oos.writeObject(list);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static GroceryList load() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data/groceries.dat"))) {
            return (GroceryList) ois.readObject();
        } catch (Exception e) {
            return new GroceryList();
        }
    }
}