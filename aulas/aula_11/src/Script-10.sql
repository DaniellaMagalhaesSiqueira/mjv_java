
CREATE TABLE ficha_cadastral_cliente(
    nome VARCHAR(50) not null,
    email VARCHAR(30) not null,
    data_de_nascimento date,
    cpf varchar(11) not null,
    sexo char(1),
    salario_minimo numeric(8,2),
    telefone VARCHAR(30),
    logradouro VARCHAR(100),
    bairro VARCHAR(100),
    numero numeric(3),
    cep varchar(8)
    );