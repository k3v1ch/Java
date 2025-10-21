module org.example.todo1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.todo1 to javafx.fxml;
    exports org.example.todo1;
}