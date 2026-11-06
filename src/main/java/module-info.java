module com.example {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;
    requires hu.szit.resclient;
    
    opens com.example to javafx.fxml, com.google.gson;
    exports com.example;
}
