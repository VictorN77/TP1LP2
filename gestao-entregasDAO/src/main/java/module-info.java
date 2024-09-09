module com.mycompany.gestao.entregasdao {
    requires com.mycompany.gestao.entregasentidades;


    opens com.mycompany.gestao.entregasdao;
    exports com.mycompany.gestao.entregasdao;
    requires java.persistence;
}