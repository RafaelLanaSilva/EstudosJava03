README.md

# CRUD JDBC PostgreSQL

Este projeto é um exemplo de um CRUD (Create, Read, Update, Delete) utilizando JDBC para conexão com um banco de dados PostgreSQL. Ele demonstra como realizar operações básicas de banco de dados em uma aplicação Java.
## Pré-requisitos

Antes de executar o projeto, certifique-se de ter os seguintes itens instalados e configurados:

1. **Java Development Kit (JDK) 21**:

- Faça o download do JDK 21 no [site oficial da Oracle](https://www.oracle.com/java/technologies/javase/jdk21-archive-downloads.html).
- Configure a variável de ambiente `JAVA_HOME` e adicione o JDK ao `PATH`.
2. **Eclipse IDE**:
- Faça o download do Eclipse IDE no [site oficial](https://www.eclipse.org/downloads/).
- Instale e configure o Eclipse para usar o JDK 21.
3. **PostgreSQL**:
- Faça o download e instale o PostgreSQL no [site oficial](https://www.postgresql.org/download/).
- Durante a instalação, anote o nome de usuário e senha que você configurou para o PostgreSQL.
4. **Driver JDBC PostgreSQL**:
- Baixe o arquivo `.jar` do driver JDBC PostgreSQL no [site oficial](https://jdbc.postgresql.org/download/).
- Adicione o arquivo `.jar` ao classpath do seu projeto no Eclipse.
## Configuração do Banco de Dados
1. Crie um banco de dados chamado `bd_aula03` no PostgreSQL
2. Execute o conteúdo do arquivo script.sql para criação da tabela de pessoa.