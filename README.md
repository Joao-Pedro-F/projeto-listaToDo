# 📝 Gerenciador de Tarefas Full Stack (To-Do List)

Este é um projeto Full Stack completo, apresentando uma API robusta em Java e uma interface web moderna e responsiva. O sistema permite criar, listar, concluir (com efeitos visuais) e excluir tarefas, tudo com persistência de dados em um banco de dados MySQL.

## 🚀 Funcionalidades
- **CRUD Completo:** Cadastro, Leitura, Atualização (Patch) e Deleção de tarefas.
- **Efeitos Visuais:** Integração com a biblioteca Canvas-Confetti ao concluir tarefas.
- **Modo Noturno:** Interface adaptável para temas claro e escuro.
- **Segurança:** Configuração de CORS e uso de variáveis de ambiente para credenciais de banco de dados.

## 🛠️ Tecnologias Utilizadas

### Back-end
- **Java 25** (OpenJDK)
- **Spring Boot 3**
- **Spring Data JPA** (Hibernate)
- **MySQL Driver**
- **Maven** (Gerenciador de dependências)

### Front-end
- **HTML5 & CSS3** (Variáveis CSS para temas)
- **JavaScript (ES6+)** (Fetch API para consumo de dados assíncronos)
- **Canvas-Confetti** (Feedback visual de sucesso)

---

## ⚙️ Configuração do Banco de Dados (LEIA COM ATENÇÃO!)

Para que o projeto funcione corretamente, você **não** precisa criar o banco manualmente no MySQL, mas precisa configurar as **variáveis de ambiente** para que o Spring consiga se conectar.

### 1. Variáveis de Ambiente Necessárias:
No seu IDE (Eclipse/IntelliJ/VS Code), configure as seguintes variáveis no "Run Configurations":

- `DB_NAME`: O nome que você deseja dar ao banco (ex: `db_tarefas`).
- `DB_PASSWORD`: A senha do seu usuário `root` do MySQL.

### 2. Como a conexão funciona:
A URL de conexão no arquivo `application.properties` está configurada como:
`jdbc:mysql://localhost:3306/${DB_NAME}?createDatabaseIfNotExist=true`

> **Nota:** O parâmetro `createDatabaseIfNotExist=true` garante que o MySQL crie o banco automaticamente caso ele ainda não exista.

---

## 🏃 Como rodar o projeto

### Passo 1: Back-end (Java)
1. Importe a pasta `api-tarefas` como um **Existing Maven Project** no Eclipse.
2. Configure a variável de ambiente `DB_PASSWORD` em **Run Configurations > Environment**.
3. Execute a classe `ApiTarefasApplication.java`.
4. O servidor iniciará em `http://localhost:8080`.

### Passo 2: Front-end (Web)
1. Navegue até a pasta `frontend`.
2. Abra o arquivo `index.html` utilizando o **Live Server** do VS Code (ou qualquer servidor local).
   - *Importante:* Abrir o arquivo clicando duas vezes (via protocolo `file://`) pode causar erros de CORS ou bloqueio de scripts de confete.

---

## 📁 Estrutura do Repositório
```text
/
├── api-tarefas/    # Código fonte do Back-end (Spring Boot)
├── templates/       # Interface do usuário (HTML/CSS/JS)
├── .gitignore      # Arquivos ignorados pelo Git
└── README.md       # Documentação do projeto