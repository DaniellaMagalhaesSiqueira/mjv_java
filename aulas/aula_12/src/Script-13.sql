

-- id_cliente int auto_increment primary key not null

create table tab_cliente(
	id_cliente serial primary key not null,
	nome varchar(50)
);

create table tab_conta(
	id_conta serial primary key not null,
	numero varchar(10),
	agencia varchar(4),
	id_cliente int not null,
	constraint fk_cliente_conta
	foreign key (id_cliente) references tab_cliente(id_cliente)
);

insert into tab_cliente values(default, 'Daniella');
insert into tab_cliente values(default, 'Lucas');
insert into tab_cliente values(default, 'Wagner');
insert into tab_cliente values(default, 'Alberto');

insert into tab_conta values (default, '099988', '0021', 1);
insert into tab_conta values (default, '099989', '0021', 2);
insert into tab_conta values (default, '099970', '0021', 3);
insert into tab_conta values (default, '099917', '0021', 4);

insert into tab_conta values (default, '300988', '0021', 1);
insert into tab_conta values (default, '300989', '0021', 2);
insert into tab_conta values (default, '300970', '0021', 3);
insert into tab_conta values (default, '300917', '0021', 4);

select * from tab_cliente;
select * from tab_conta;

select cl.id_cliente as codigo_cliente, cl.nome, co.numero as conta, co.agencia as agencia 
from tab_cliente cl join tab_conta co on cl.id_cliente = co.id_cliente;

select cl.id_cliente as codigo_cliente, cl.nome, co.numero as conta, co.agencia as agencia 
from tab_cliente cl, tab_conta co where cl.id_cliente = co.id_cliente and cl.id_cliente = 2;



