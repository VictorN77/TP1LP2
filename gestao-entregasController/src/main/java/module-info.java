module com.mycompany.gestao.entregascontroller {
    requires com.mycompany.gestao.entregasentidades;
    requires com.mycompany.gestao.entregasdao;

    opens com.mycompany.gestao.entregascontroller;
    exports com.mycompany.gestao.entregascontroller;
}