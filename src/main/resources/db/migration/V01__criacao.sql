create table ESTADO (
	CODIGO_ESTADO bigint primary key,
	SIGLA char(2),
	NOME char(50)
);

create table CIDADE (
	CODIGO_CIDADE bigint primary key,
	NOME char(100),
	CODIGO_ESTADO bigint not null,
	foreign key (CODIGO_ESTADO) references ESTADO(CODIGO_ESTADO)
);