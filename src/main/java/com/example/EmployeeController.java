package com.example;

import java.util.List;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class EmployeeController {

    @FXML
    private TableColumn<Employee, String> cityCol;

    @FXML
    private TextField cityField;

    @FXML
    private TableColumn<Employee, Integer> idCol;

    @FXML
    private TextField idField;

    @FXML
    private TableColumn<Employee, String> nameCol;

    @FXML
    private TextField nameField;

    @FXML
    private TableColumn<Employee, Integer> salaryCol;

    @FXML
    private TextField salaryField;

    @FXML
    void onClickAddButton(ActionEvent event) {

    }

    @FXML
    void onClickDelButton(ActionEvent event) {

    }

    @FXML
    void onClickModifyButton(ActionEvent event) {

    }

    @FXML
    void onClickSaveButton(ActionEvent event) {

    }

    @FXML 
    private TableView<Employee> table;

    

    @FXML
    void initialize() {
        System.out.println("Működik");
        idCol.setCellValueFactory(new PropertyValueFactory<>("id"));
        nameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
        cityCol.setCellValueFactory(new PropertyValueFactory<>("city"));
        salaryCol.setCellValueFactory(new PropertyValueFactory<>("salary"));

        EmployeeRepository repo = new EmployeeRepository();
        List<Employee> empList = repo.readEmployee();
        table.getItems().addAll(empList);
    }

}
