package one.digitalinnovation.gof.facade;

import subsistema1.crm.CrmService;

public class Facade {

    public void registrarCliente(String nome, String cep, String cidade, String estado) {
        CrmService.Cliente cliente = new CrmService.Cliente(nome, cep, cidade, estado);
        CrmService.gravarCliente(cliente);
    }
}