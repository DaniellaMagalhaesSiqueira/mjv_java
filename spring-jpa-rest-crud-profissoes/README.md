# Curso Java MJV
# Classe ProfissaoController

### Criação dos métodos profissaoPorId e profissaoPorNome
- criação dos métodos do verbo GET através da anotation @GetMapping com parâmetro value:
no método profissaoPorId, apenas o parâmetro e a anotation @PathVariable
no método profissaoPorNome o atributo value tem /nome/ para identificar que é por nome e na
classe [ProfissaoRepository](/src/main/java/mjv/spring/jpa/rest/repository/ProfissaoRepository.java)
declaração do método findByNome para ser usado no método profissaoPorNome
- Teste no Postman com sucesso dos métodos supra cidatos

### Criação do incremento da modelagem dos atributos emails e telefones
- modificação da classe [Cadastro](/src/main/java/mjv/spring/jpa/rest/model/Cadastro.java)
- criação do atributo emails com a anotation @ElementCollection, o que faz com que o JPA crie uma tabela de emails com os respectivos ids de cadastro como chave estrangeira. A declaração da variável List<String> emails pode ser acessada como qualquer outro atributo.
- modificação da classe [Application](/src/main/java/mjv/spring/jpa/rest/start/Application.java) para realização de testes
tanto para a inserção de telefones quanto de e-mails.
- criação da classe [Telefone](/src/main/java/mjv/spring/jpa/rest/model/Telefone.java) com os atributos da modelagem sugerida pelo diagrama de classes
- criação do enum [TelefoneTipo](/src/main/java/mjv/spring/jpa/rest/model/TelefoneTipo.java)
- criação do mapeamento do relacionamento com as anotations @OneToMany e @ManyToOne nas classes Cadastro e Telefone respectivamente. Utilização da anotation @JoinColumn para identificação do id_cadastro criando uma chave estrangeira na tabela telefone.
#### Ponto relevante: No teste realizado na classe Application é essencial que se faça um setTelefones(listaTelefones) no objeto cadastro e que se faça um setCadastro(objetoCadastro) no objeto cadastro para que os dados sejam persistidos