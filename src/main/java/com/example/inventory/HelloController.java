package com.example.inventory;

import com.example.inventory.database.dao.ProductDao;
import com.example.inventory.models.Product;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private Label welcomeText;
    @FXML
    TableView<Product> tblProducts;
    ProductDao productDao = new ProductDao();
    List<Product> productList = new ArrayList<>();

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle){
        productList = productDao.findAll();
        tblProducts.setItems(FXCollections.observableArrayList(productList));
    }
}