package subsistema1.crm;

public class CrmService {

    private CrmService() {
        super();
    }

    // ✅ Método melhorado que recebe um Cliente como objeto
    public static void gravarCliente(Cliente cliente) {
        if (cliente == null) {
            System.out.println("Cliente está nulo. Nada foi gravado.");
            return;
        }

        System.out.println("Cliente salvo no sistema de CRM:");
        System.out.println(cliente.getNome());
        System.out.println(cliente.getCep());
        System.out.println(cliente.getCidade());
        System.out.println(cliente.getEstado());
    }

    // 🧱 Classe interna representando o Cliente
    public static class Cliente {
        private String nome;
        private String cep;
        private String cidade;
        private String estado;

        public Cliente(String nome, String cep, String cidade, String estado) {
            this.nome = nome;
            this.cep = cep;
            this.cidade = cidade;
            this.estado = estado;
        }

        public String getNome() {
            return nome;
        }

        public String getCep() {
            return cep;
        }

        public String getCidade() {
            return cidade;
        }

        public String getEstado() {
            return estado;
        }
    }
}