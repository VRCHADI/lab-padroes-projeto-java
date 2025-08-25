# 🧱 Projeto: Lab Padrões de Projeto Java

Este projeto demonstra a aplicação de diversos padrões de projeto em Java, com foco em boas práticas de arquitetura e organização de código.

## ✨ Melhoria Implementada: Refatoração com Padrão Facade

### 🔍 Contexto

Anteriormente, o método `gravarCliente` da classe `CrmService` recebia múltiplos parâmetros soltos (`nome`, `cep`, `cidade`, `estado`). Isso tornava o código menos coeso e dificultava a manutenção e evolução da lógica de negócio.

### ✅ O que foi feito

- Criada a classe interna `Cliente` dentro de `CrmService`, encapsulando os dados do cliente.
- Refatorado o método `gravarCliente` para receber um objeto `Cliente` ao invés de múltiplos parâmetros.
- Atualizada a classe `Facade` para instanciar e enviar o objeto `Cliente` ao `CrmService`.
- Adicionado o método `registrarCliente` na `Facade`, centralizando a lógica de registro.

### 🧠 Benefícios

- **Encapsulamento**: Os dados do cliente agora estão agrupados em uma única entidade.
- **Manutenção facilitada**: Mudanças futuras no modelo de cliente exigem menos alterações no código.
- **Legibilidade**: O código ficou mais limpo e intuitivo.
- **Aderência ao padrão Facade**: A `Facade` abstrai a complexidade dos subsistemas, oferecendo uma interface simples.

### 📦 Exemplo de uso

```java
Facade facade = new Facade();
facade.registrarCliente("Victor", "01234-567", "São Paulo", "SP");