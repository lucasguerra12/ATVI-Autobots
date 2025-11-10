# 🤖 ATVI-Autobots

Projeto desenvolvido em **Java** utilizando **Maven** como gerenciador de dependências.  
Este repositório faz parte de uma atividade acadêmica e tem como objetivo aplicar conceitos de **programação orientada a objetos**, **arquitetura de software** e **automação**.
 
> “O ATVI-Autobots é um sistema para gerenciamento de robôs automatizados, que permite o cadastro, listagem e controle de bots responsáveis por diferentes tarefas. O projeto foi desenvolvido como parte da disciplina de Programação Orientada a Objetos.”

---

## 📂 Estrutura do Projeto

ATVI-Autobots/
├── .mvn/ # Configuração do Maven Wrapper
├── mvnw / mvnw.cmd # Scripts do Maven Wrapper
├── pom.xml # Arquivo de configuração Maven
├── src/
│ ├── main/java/... # Código-fonte principal
│ ├── main/resources/... # Arquivos de configuração e recursos
│ └── test/java/... # Testes automatizados
└── target/ # Pasta gerada após compilação

---

## ⚙️ Requisitos

Antes de rodar o projeto, verifique se você possui os seguintes itens instalados:

| Requisito | Descrição |
|------------|------------|
| **Java JDK** | Versão 8 ou superior |
| **Maven** | Não obrigatório (projeto já possui Maven Wrapper) |
| **Git** | Para clonar o repositório |
| **IDE (opcional)** | IntelliJ IDEA, Eclipse, VSCode com extensão Java |

---

## 🧠 Conceitos Envolvidos

- Programação Orientada a Objetos (POO)
- Criação e uso de classes, interfaces e herança
- Gerenciamento de dependências com Maven
- Organização de pacotes
- (opcional) Frameworks: Spring Boot, JPA, etc. *(verificar no pom.xml)*

---

## 🚀 Como Rodar o Projeto

Siga os passos abaixo para configurar e executar o projeto no seu ambiente local:

### 1. Clone o repositório
git clone https://github.com/lucasguerra12/ATVI-Autobots.git
cd ATVI-Autobots

2. Verifique a versão do Java
java -version

4. Compile o projeto
Use o Maven Wrapper (já incluído no projeto):

No Linux/Mac:
./mvnw clean install

No Windows:
mvnw.cmd clean install

4. Execute o projeto
Dependendo da configuração do pom.xml, você pode rodar de duas formas:

🔹 Caso seja um projeto Spring Boot:
./mvnw spring-boot:run

🌐 Como Usar
Após executar, o sistema iniciará no terminal ou em um servidor local.
http://localhost:8080/
Voce pode testar os endpoints com ferramentas como Postman ou Insomnia.

Exemplos de Endpoints (caso seja uma API):
GET    /api/autobots        -> lista todos os bots
POST   /api/autobots        -> cria um novo bot
PUT    /api/autobots/{id}   -> atualiza um bot
DELETE /api/autobots/{id}   -> remove um bot

⚠️ Problemas Comuns
Erro	Possível Solução
mvnw: Permission denied	Execute chmod +x mvnw no terminal
JAVA_HOME not set	Configure a variável de ambiente do JDK
Porta já está em uso	Altere a porta em application.properties

👥 Autores
Nome	Função	GitHub
Lucas Guerra	Desenvolvedor Principal	@lucasguerra12		

📝 Licença
Este projeto é de uso acadêmico.
Sinta-se livre para clonar, estudar e modificar conforme necessário.


💡 Sugestões de Melhoria
Adicionar descrição detalhada no pom.xml

✨ Desenvolvido como parte de uma atividade prática de desenvolvimento em Java.
