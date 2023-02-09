create database NNMercado;

use nnmercado;

create table Nota_Fiscal(
codigo serial primary key not null,
data_nota_fiscal date not null,
quantidade integer not null,
nome_supermercado varchar(40) not null
);

create table Funcionario(
idfuncionario serial primary key not null,
nome varchar(30) not null,
cargo varchar(20) not null,
cpf integer  not null,
hora_Entrada timestamp not null,
hora_Saida timestamp not null
);

create table Categoria(
idCategoria serial not null,
Setor varchar(20) not null
);

create table Usuario(
iduser serial primary key not null,
usuario varchar(20) not null,
senha varchar(20) not null
);

create table Produto(
idProduto serial primary key not null,
nome varchar(40) not null,
Cod_Barras integer not null,
preco double not null,
marca varchar(30) not null
);

create table Endereco(
funcionario_idfuncionario serial foreign key not null,
rua varchar(40) not null,
numero_casa integer not null,
bairro varchar(20) not null,
cep varchar(10) not null,
cidade varchar(30) not null,
estado varchar(20) not null
);

create table Endereco_Supermercado(
nota_fiscal_codigo serial foreign key not null,
rua varchar(40) not null,
bairro varchar(20) not null,
cep varchar(10) not null,
cidade varchar(30) not null,
estado varchar(20) not null
);

create table Detalhe_Venda(
id_venda serial primary key not null,
nota_fiscal_codigo serial not null,
funcionario_idfuncionario serial not null,
preco_unitario double not null,
preco_total double not null,
quantidade_produto integer not null,
data_detalhe date not null
);