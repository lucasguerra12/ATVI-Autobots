# 🤖 ATVI-Autobots

Projeto desenvolvido em **Java** utilizando **Maven** como gerenciador de dependências.  
Este repositório faz parte de uma atividade acadêmica e tem como objetivo aplicar conceitos de **programação orientada a objetos**, **arquitetura de software** e **automação**.

> 🧩 *Preencha abaixo com a descrição completa do projeto:*
>
> Exemplo:  
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

yaml
Copiar código

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
```bash
git clone https://github.com/lucasguerra12/ATVI-Autobots.git
cd ATVI-Autobots
2. Verifique a versão do Java
bash
Copiar código
java -version
3. Compile o projeto
Use o Maven Wrapper (já incluído no projeto):

No Linux/Mac:
bash
Copiar código
./mvnw clean install
No Windows:
bash
Copiar código
mvnw.cmd clean install
4. Execute o projeto
Dependendo da configuração do pom.xml, você pode rodar de duas formas:

🔹 Caso seja um projeto Spring Boot:
bash
Copiar código
./mvnw spring-boot:run
🔹 Caso gere um arquivo .jar:
bash
Copiar código
java -jar target/nome-do-jar-gerado.jar
📝 Dica: o nome exato do .jar aparece no final do processo de build (ex: target/atvi-autobots-1.0-SNAPSHOT.jar).

🌐 Como Usar
(Ajuste conforme o funcionamento real do sistema — veja a classe Main ou controladores no código.)

Após executar, o sistema iniciará no terminal ou em um servidor local.

Se for uma aplicação de console, siga as instruções que aparecem no terminal.

Se for uma aplicação web, abra no navegador:

arduino
Copiar código
http://localhost:8080/
Se for uma API REST, você pode testar os endpoints com ferramentas como Postman ou Insomnia.

Exemplos de Endpoints (caso seja uma API):
bash
Copiar código
GET    /api/autobots        -> lista todos os bots
POST   /api/autobots        -> cria um novo bot
PUT    /api/autobots/{id}   -> atualiza um bot
DELETE /api/autobots/{id}   -> remove um bot
🧪 Executando Testes
Para rodar os testes automatizados (se existirem):

bash
Copiar código
./mvnw test
Os resultados aparecerão no terminal.
Os testes estão localizados em src/test/java.

⚠️ Problemas Comuns
Erro	Possível Solução
mvnw: Permission denied	Execute chmod +x mvnw no terminal
JAVA_HOME not set	Configure a variável de ambiente do JDK
Porta já está em uso	Altere a porta em application.properties

📖 Personalização
Você pode editar este README para incluir:

Capturas de tela do projeto

Diagrama UML das classes

Explicação da arquitetura usada (MVC, camada de serviço, etc.)

Lista de autores / equipe do projeto

👥 Autores
Nome	Função	GitHub
Lucas Guerra	Desenvolvedor Principal	@lucasguerra12
(adicione outros membros aqui)		

📝 Licença
Este projeto é de uso acadêmico.
Sinta-se livre para clonar, estudar e modificar conforme necessário.

Caso deseje aplicar uma licença específica (MIT, Apache, GPL etc), adicione um arquivo LICENSE na raiz do repositório.

💡 Sugestões de Melhoria
Adicionar descrição detalhada no pom.xml

Criar documentação dos endpoints (caso API REST)

Adicionar testes automatizados

Incluir logs e mensagens de status

Criar uma interface gráfica simples (JavaFX, HTML ou React)

✨ Desenvolvido como parte de uma atividade prática de desenvolvimento em Java.