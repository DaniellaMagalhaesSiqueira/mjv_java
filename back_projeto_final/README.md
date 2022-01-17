# Curso Java MJV
# Backend do Projeto Final (Easy Job) MJV
### 17/01/2022 (commit: "iniciando projeto final easy job, modelando o banco e fazendo a primeira testagem")
- Criação do projeto pela extensão do eclipse
- 1. Spring Starter Project -> escolha das dependências para o pom -> PostgreSQL, DevTools (para não ter que reiniciar o projeto após mudanças), DataJPA e Web.
2. criação de pacotes model, controller e repository
3. configuração do arquivo application.properties com as informações do sistema de gerenciamento do banco, apontamento do banco easy_job e comportamento do hibernate para que faça update e mostre no console o script sql.
4. criação das classes [RegistroProfissional](/easy_job/src/main/java/mjv/easy_job/model/RegistroProfissiona.java), [Endereco](/easy_job/src/main/java/mjv/easy_job/model/Endereco.java), [Escolaridade](/easy_job/src/main/java/mjv/easy_job/model/Escolaridade.java), [UnidadeFederativa](/easy_job/src/main/java/mjv/easy_job/model/UnidadeFederativa.java), [Sexo](/easy_job/src/main/java/mjv/easy_job/model/Sexo.java), [RegistroProfissionalRepository](/easy_job/src/main/java/mjv/easy_job/repository/RegistroProfissionalRepository.java) e [RegistroProfissionalController](/easy_job/src/main/java/mjv/easy_job/controller/RegistroProfissionalController.java).
5. modelagem do banco easy_job com duas tabelas RegistroProfissional e Endereco, com mapeamento um para um usando documentação do Hibernate -> RegistroProfissional tem uma chave estrangeira da tabela endereco. Uso das anotations OneToOne e JoinColumn.
6. correção dos erros de nomenclatura dos atributos nas anotations (deve ser nomeado conforme está na classe e não como ficará no banco - atenção ao camelcase)
7. criação do banco a partir da execução da aplicação

