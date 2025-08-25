package App;
import subsistema1.crm.CrmService;

public class Main {
    public static void main(String[] args) {
        CrmService.Cliente cliente = new CrmService.Cliente(
                "Victor",
                "01234-567",
                "São Paulo",
                "SP"
        );

        CrmService.gravarCliente(cliente);
    }
}