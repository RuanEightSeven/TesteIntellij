module com.testeintellij.testeintellij {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.testeintellij.testeintellij to javafx.fxml;
    exports com.testeintellij.testeintellij;
}