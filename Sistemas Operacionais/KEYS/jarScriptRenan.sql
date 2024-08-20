create database projeto;
USE projeto;

CREATE TABLE empresa(
idEmpresa INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
nomeFantasia VARCHAR(100) NOT NULL,
CNPJ CHAR(14) NOT NULL,
telefone CHAR(11) NOT NULL,
email VARCHAR(100) NOT NULL,
senha VARCHAR(100) NOT NULL
);

CREATE TABLE funcionario(
idFuncionario INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
fkEmpresa INT NOT NULL,
CONSTRAINT fkEmpresa FOREIGN KEY (fkEmpresa) REFERENCES empresa (idEmpresa),
nome VARCHAR(100) NOT NULL,
cargo VARCHAR(100) NOT NULL,
email VARCHAR(100) NOT NULL,
senha VARCHAR(100) NOT NULL
);

CREATE TABLE linha(
idLinha INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
fkEmpresa INT NOT NULL,
CONSTRAINT fkEmpresaLinha FOREIGN KEY (fkEmpresa) REFERENCES empresa (idEmpresa),
nome VARCHAR(100) NOT NULL,
numero INT NOT NULL
);

CREATE TABLE estacao(
idEstacao INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
fkLinha INT NOT NULL,
CONSTRAINT fkLinha FOREIGN KEY (fkLinha) REFERENCES linha (idLinha),
nome VARCHAR(100)
);

CREATE TABLE maquinaMonitorada (
idMaquina INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
fkEstacao INT NOT NULL,
CONSTRAINT fkEstacao FOREIGN KEY (fkEstacao) REFERENCES estacao (idEstacao)
);

CREATE TABLE disco (
idDisco INT PRIMARY KEY AUTO_INCREMENT,
-- fkMaquina INT NOT NULL,
-- CONSTRAINT fkMaquina FOREIGN KEY (fkMaquina) REFERENCES maquinaMonitorada (idMaquina),
velocidadeLeitura VARCHAR (40) NOT NULL,
espacoTotal VARCHAR (40) NOT NULL,
espacoDisponivel VARCHAR (40) NOT NULL
);

CREATE TABLE ram (
idRam INT PRIMARY KEY AUTO_INCREMENT,
memoriaDisponivel VARCHAR (40),
memoriaTotal VARCHAR(40),
memoriaUtilizada VARCHAR (40)
);

CREATE TABLE processador (
idCpu INT PRIMARY KEY AUTO_INCREMENT,
-- fkMaquina INT NOT NULL,
-- CONSTRAINT FOREIGN KEY (fkMaquina) REFERENCES maquinaMonitorada (idMaquina),
nomeCPU VARCHAR (255),
frequencia VARCHAR (40),
tempoAtividade VARCHAR (255)
);

CREATE TABLE rede(
idRede INT PRIMARY KEY AUTO_INCREMENT,
nomeDominio varchar(255),
ip varchar(255),
enderecoMac varchar(255),
bytesEnviados varchar(255)
);

INSERT INTO empresa VALUES (1,'Renan', '12345678901234', '11987654321', 'contato@minhaempresa.com', '12345');

select * from empresa;
select * from ram;

select * from disco , ram ,processador, rede;
select * from rede;
select * from processador;

