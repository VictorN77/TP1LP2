module com.mycompany.gestao.entregasview {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.gestao.entregasview to javafx.fxml;
    exports com.mycompany.gestao.entregasview;
}
