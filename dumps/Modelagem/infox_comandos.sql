-- Comentários
-- A linha abixo cria um banco de dados
create database dbinfox;
-- A linha abaixo escolhe o banco de dados a ser usado
use dbinfox;
-- O bloco de instruções abaixo cria uma tabela
create table tbusuarios(
iduser int primary key,
usuario varchar(50) not null,
fone varchar(15),
login varchar(15) not null unique,
senha varchar(15) not null
);
-- O comando abaixo descreve a tabela
describe tbusuarios;
-- A linha abaixo insere dados na tabela (CRUD)
-- create
insert into tbusuarios(iduser,usuario,fone,login,senha)
values(1,'Giovanni Chaves','9-9999-9999','giovannichaves','123321');

-- A linha abaixo exibe os dados da tabela (CRUD)
-- read -> select
select * from tbusuarios;

insert into tbusuarios(iduser,usuario,fone,login,senha)
values(2,'Adriane Regina Fernandes','9-9999-9999','arf','12344321');
insert into tbusuarios(iduser,usuario,fone,login,senha)
values(3,'Teste de Teste','9-9999-9999','txt','1234554321');

-- A linha abaixo modifica dados na tabela (CRUD)
-- update -> update
update tbusuarios set login='gvc' where iduser=1;
update tbusuarios set usuario='Giovani V. Chaves' where iduser=1;

-- A linha abaixo apaga um registro da tabela (CRUD)
-- delete -> delete
delete from tbusuarios where iduser=3;

create table tbclientes(
idcli int primary key auto_increment,
nomecli varchar(50) not null,
endcli varchar(100),
fonecli varchar(50) not null,
emailcli varchar(50)
);

describe tbclientes;

insert into tbclientes(nomecli,endcli,fonecli,emailcli)
values('Giovani V. Chaves','Marechal Rondon 387','9-9999-9999','teste@teste.com');

select * from tbclientes;

use dbinfox;

create table tbos(
os int primary key auto_increment,
data_os timestamp default current_timestamp,
equipamento varchar(150) not null,
defeito varchar(150) not null,
servico varchar(150),
tecnico varchar(30),
valor decimal(10,2),
idcli int not null,
foreign key(idcli) references tbclientes(idcli)
);

describe tbos;

insert into tbos(equipamento,defeito,servico,tecnico,valor,idcli)
values('Notebook','Não liga','Troca da fonte','Giovanni',450.00,1);

select * from tbos;

-- O código abaixo traz informações de duas tabelas
select
O.os,equipamento,defeito,servico,valor,
C.nomecli,fonecli
from tbos as O
inner join tbclientes as C
on (O.idcli = C.idcli);

-- O codigo abaixo adiciona uma coluna na tabela
alter table tbusuarios add column chave varchar(20) not null;

-- O codigo abaixo deleta uma coluna da tabela
alter table tbusuarios drop column chave;

alter table tbusuarios add column perfil varchar(20) not null;

update tbusuarios set perfil='admin' where iduser=1;
update tbusuarios set perfil='admin' where iduser=2;
update tbusuarios set perfil='user' where iduser=3;

select * from tbusuarios;
select * from tbclientes;
select * from tbos;

alter table tbos add column tipo varchar(50) not null;
alter table tbos add column situacao varchar(50) not null;

select * from tbclientes;
-- A instrução abaixo seleciona e ordena por nome todos os clientes cadastrados
select * from tbclientes order by nomecli;

-- O campo abaixo une colunas de uma tabela com outra
select
OSER.os,data_os,tipo,situacao,equipamento,valor,
CLI.nomecli,fonecli
from tbos as OSER
inner join tbclientes as CLI
on (CLI.idcli = OSER.idcli);
