INSERT INTO PERFIL(id_perfil, perfil) VALUES(1,'ADMIN');
INSERT INTO PERFIL(id_perfil, perfil) VALUES(2, 'COMUM');

INSERT INTO USUARIO(id_usuario,usuario,senha,id_perfil) VALUES (1,'admin','123456',1);
INSERT INTO USUARIO(id_usuario,usuario,senha,id_perfil) VALUES (2,'comum','123456',2);