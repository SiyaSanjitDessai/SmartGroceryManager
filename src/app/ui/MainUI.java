package app.ui;

import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import app.model.*;
import app.service.FileService;

public class MainUI {

    private GroceryList list = FileService.load();
    private ListView<GroceryItem> listView = new ListView<>();

    public void start(Stage stage) {

        TextField nameField = new TextField();
        nameField.setPromptText("Item");

        TextField priceField = new TextField();
        priceField.setPromptText("Price");

        Button addBtn = new Button("Add");
        addBtn.setOnAction(e -> {
            GroceryItem item = new GroceryItem(nameField.getText(), Double.parseDouble(priceField.getText()));
            list.addItem(item);
            refresh();
        });

        Button saveBtn = new Button("Save");
        saveBtn.setOnAction(e -> FileService.save(list));

        Button claimBtn = new Button("Claim");
        claimBtn.setOnAction(e -> {
            GroceryItem item = listView.getSelectionModel().getSelectedItem();
            if (item != null) {
                item.claim("User1");
                refresh();
            }
        });

        VBox root = new VBox(10, nameField, priceField, addBtn, claimBtn, saveBtn, listView);
        refresh();

        stage.setScene(new Scene(root, 400, 500));
        stage.setTitle("Smart Grocery Manager");
        stage.show();
    }

    private void refresh() {
        listView.getItems().setAll(list.getItems());
    }
}