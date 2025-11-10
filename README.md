# 🤖 ATVI-Autobots (Automanager)

![Java](https://img.shields.io/badge/Java-21-blue.svg?logo=java)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.2.0-brightgreen.svg?logo=spring)
![Maven](https://img.shields.io/badge/Maven-3.8-red.svg?logo=apache-maven)

Este projeto é um micro-serviço de **Gestão de Clientes** desenvolvido como uma atividade académica. Ele utiliza Java e o framework Spring Boot para criar uma API REST completa para operações de CRUD (Criar, Ler, Atualizar, Excluir) de clientes e seus dados associados.

## ✨ Funcionalidades

O **Automanager** permite gerir as seguintes entidades através de uma API REST:

* **Clientes:** Cadastro, listagem, atualização e exclusão de clientes.
* **Endereços:** Atualização e exclusão de endereços (associados a um cliente).
* **Telefones:** Adição, atualização e exclusão de telefones (associados a um cliente).
* **Documentos:** Adição, atualização e exclusão de documentos (associados a um cliente).

## 🛠️ Tecnologias Utilizadas

Este projeto foi construído com as seguintes tecnologias modernas:

* **Java 21:** A versão mais recente do Java (LTS).
* **Spring Boot 3.2.0:** Framework principal para a criação da API REST.
* **Spring Data JPA (Hibernate):** Para persistência de dados e comunicação com o banco.
* **H2 Database:** Um banco de dados em memória para facilitar o desenvolvimento e os testes.
* **Maven Wrapper:** Garante que o projeto use sempre a versão correta do Maven, facilitando a compilação.

## ✅ Pré-requisitos

Antes de executar este projeto, garanta que você tem os seguintes requisitos instalados e **corretamente configurados** no seu sistema:

1.  **Git:** Para clonar o repositório.
2.  **Java JDK 21:** É essencial ter o JDK na versão 21 (ou superior).
3.  **Variável de Ambiente `JAVA_HOME`:** Este é o passo mais importante.
    * O Maven Wrapper (`mvnw.cmd`) **exige** que a variável de ambiente `JAVA_HOME` esteja configurada no seu sistema, apontando para a pasta raiz da sua instalação do JDK 21 (ex: `C:\Program Files\Java\jdk-21`).
    * Não basta ter o Java no `Path`, a variável `JAVA_HOME` é obrigatória.

## 🚀 Como Executar o Projeto

Siga estes passos para clonar e executar a aplicação localmente:

1.  **Clone o repositório:**
    ```bash
    git clone [https://github.com/lucasguerra12/ATVI-Autobots.git](https://github.com/lucasguerra12/ATVI-Autobots.git)
    ```

2.  **Navegue até a pasta do projeto:**
    ```bash
    cd ATVI-Autobots
    ```

3.  **Verifique sua configuração (Opcional, mas recomendado):**
    * Abra um **novo** terminal e verifique se o `JAVA_HOME` está correto:
    ```bash
    # No Windows (CMD ou PowerShell)
    echo %JAVA_HOME%
    
    # No Linux/Mac
    echo $JAVA_HOME
    ```
    * O resultado deve ser o caminho para o seu JDK 21.

4.  **Compile o projeto com o Maven Wrapper:**
    * O wrapper irá baixar as dependências e compilar o código.
    ```bash
    # No Windows
    .\mvnw.cmd clean install
    
    # No Linux/Mac
    ./mvnw clean install
    ```

5.  **Execute a aplicação:**
    * Após o "BUILD SUCCESS", inicie o servidor Spring Boot:
    ```bash
    # No Windows
    .\mvnw.cmd spring-boot:run
    
    # No Linux/Mac
    ./mvnw spring-boot:run
    ```

6.  **Acesse a aplicação:**
    * O servidor estará a correr em `http://localhost:8080/`.
    * O banco de dados H2 (em memória) pode ser acedido em `http://localhost:8080/h2-console` (verifique as configurações no seu terminal para o URL e a senha, caso estejam ativados).

## 📡 Endpoints da API

Use ferramentas como o Postman, Insomnia ou o próprio navegador para interagir com a API.

### Cliente
* `POST /cliente/cadastro` - Cadastra um novo cliente.
* `GET /cliente/clientes` - Lista todos os clientes.
* `GET /cliente/cliente/{id}` - Obtém um cliente por ID.
* `PUT /cliente/atualizar/{id}` - Atualiza um cliente por ID.
* `DELETE /cliente/excluir/{id}` - Exclui um cliente por ID.

### Documento
* `POST /documento/adicionar/{clienteId}` - Adiciona um documento a um cliente.
* `PUT /documento/atualizar/{documentoId}` - Atualiza um documento (pelo ID do documento).
* `DELETE /documento/excluir/{clienteId}/{documentoId}` - Exclui um documento de um cliente.

### Telefone
* `POST /telefone/adicionar/{clienteId}` - Adiciona um telefone a um cliente.
* `PUT /telefone/atualizar/{telefoneId}` - Atualiza um telefone (pelo ID do telefone).
* `DELETE /telefone/excluir/{clienteId}/{telefoneId}` - Exclui um telefone de um cliente.

### Endereço
* `PUT /endereco/atualizar/{clienteId}` - Atualiza o endereço de um cliente.
* `DELETE /endereco/excluir/{clienteId}` - Exclui o endereço de um cliente.

## ⚠️ Solução de Problemas Comuns

* **ERRO: `Error: JAVA_HOME not found in your environment.`**
    * **Causa:** O script `mvnw.cmd` não encontrou a variável de ambiente `JAVA_HOME`.
    * **Solução:** Siga o **Passo 3** da secção "Pré-requisitos". Crie a variável de ambiente `JAVA_HOME` no seu sistema, apontando para a pasta do JDK 21 (ex: `C:\Program Files\Java\jdk-21`). **Lembre-se de fechar e reabrir o terminal/VSCode** após criar a variável.

* **ERRO: Porta 8080 já está em uso (`Port already in use`)**
    * **Causa:** Outro serviço (ou uma instância antiga desta aplicação) está a usar a porta 8080.
    * **Solução:** Pare o outro processo ou mude a porta da aplicação editando o ficheiro `src/main/resources/application.properties` e adicionando a linha:
        `server.port=8081`

---