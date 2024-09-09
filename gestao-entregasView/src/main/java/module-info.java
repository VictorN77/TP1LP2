
module com.mycompany.gestao.entregasview {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;
    requires com.mycompany.gestao.entregascontroller;
    requires com.mycompany.gestao.entregasentidades;
    requires java.instrument;
    requires java.sql;
    

    opens com.mycompany.gestao.entregasview to javafx.fxml;
    exports com.mycompany.gestao.entregasview;
}