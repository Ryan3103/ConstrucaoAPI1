create database ControleEstoque;
use ControleEstoque;

create table if not exists usuario (
id int,
nome varchar (60),
endereco varchar (60),
setor varchar (80)
);

create table if not exists produtos (
id int,
nome varchar (60), 
quantidade int,
status varchar (80)
);

create table if not exists saida (
id int,
data date, 
id_usuario int,
id_produto int,
quantidade_saida int 
);