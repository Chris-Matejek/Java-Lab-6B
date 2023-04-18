module com.mycompany.addapp {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.addapp to javafx.fxml;
    exports com.mycompany.addapp;
}
