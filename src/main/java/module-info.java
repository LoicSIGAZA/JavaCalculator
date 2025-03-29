module com.example.softwaretesting_22805969 {
    requires java.desktop;
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.softwaretesting_22805969 to javafx.fxml;
    exports com.example.softwaretesting_22805969;
}