drop table if exists reservas;
drop table if exists rutas;
drop table if exists buses;
drop table if exists usuarios;
create table buses (
	id serial not null,
	nombre varchar(50) not null,
	capacidad_maxima int not null,
	disponible boolean not null,
	constraint buses_pk primary key (id)
);
insert into buses (nombre,capacidad_maxima, disponible) values
	('TransEsmeraldas', 30,true),
	('TransPichinca', 40,false),
	('LosMasRapidos', 20,true),
	('FastAndF', 10,true),
	('BusesFast', 35,false);

select * from buses;

create table usuarios (
	id char(3) not null,
	nombre varchar(50) not null,
	apellido varchar(50) not null,
	correo_electronico varchar(100) not null,
	constraint usuarios_pk primary key (id)
);

insert into usuarios (id,nombre,apellido,correo_electronico) values
('101','Elias','Lozada','lozadaelias@gmail.com'),
('102','Edison','España','espanaEdison@gmail.com'),
('103','David','Romero','romeroDavid@gmail.com'),
('104','Angel','Ordoñez','ordonezAngel@gmail.com'),
	('105','Jared','Roa','roaJared@gmail.com');

select * from usuarios;

create table rutas (
	id serial not null,
	origen char(50) not null,
	destino char(50) not null,
	horario_salida timestamp without time zone not null,
	horario_llegada timestamp without time zone not null,
	id_bus int not null,
	disponible boolean not null,
	constraint rutas_pk primary key (id),
	constraint rutas_fk foreign key (id_bus) references buses(id)
);
insert into rutas (origen,destino,horario_salida,horario_llegada,id_bus,disponible) values
('Esmeraldas','Quito','20/12/2024 11:30:02','21/12/2024 08:10:20',1,true),
('Esmeraldas','LandCity','19/12/2024 10:30:10','22/12/2024 07:10:30',2,false),
('Esmeraldas','City','18/12/2024 09:30:40','23/12/2024 06:10:15',3,false),
('Esmeraldas','ciudad4','17/12/2024 08:30:20','24/12/2024 05:10:23',4,true),
('Esmeraldas','Machala','16/12/2024 07:30:12','25/12/2024 04:10:12',5,true);
select * from rutas;

create table reservas(
id serial not null,
id_usuario char(3) not null,
id_ruta int not null,
constraint reservas_pk primary key (id),
constraint r_usuario_fk foreign key (id_usuario) references usuarios(id),
constraint r_ruta_fk foreign key (id_ruta) references rutas(id)
);
insert into reservas (id_usuario,id_ruta) values
('101',1),
('102',2),
('103',3),
('104',4),
('105',5);
select * from reservas;
