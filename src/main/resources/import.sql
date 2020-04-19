INSERT INTO ROLE (ID,NOME) VALUES (2,'USER');
INSERT INTO ROLE (ID,NOME) VALUES (1,'ADMIN');
INSERT INTO CARRINHO (ID, PRECO_CARRINHO) VALUES ( 2, 0.0);

INSERT INTO USUARIO ( ID, EMAIL, PASSWORD, CARRINHO_ID) VALUES ( 1, 'admin@hotmail.com', '$2a$10$whxgvtMJq.M5iwqd.dQtDeEvUrtQ6t/UMBqZ8RfGpqZP1jAQrQJk.', 2);

INSERT INTO USUARIO_ROLES(USUARIO_ID, ROLES_ID) VALUES (1, 1);

INSERT INTO CATEGORIA (ID, NOME) VALUES (1,'Limpeza');
INSERT INTO CATEGORIA (ID, NOME) VALUES (2,'Cozinha');

INSERT INTO PRODUTO( ID,NOME,VALOR) VALUES ( 1, 'Água Sanitária', 23.90);
INSERT INTO PRODUTO( ID,NOME,VALOR) VALUES ( 2, 'Água', 23.90);

INSERT INTO PRODUTO_CATEGORIAS( PRODUTO_ID, CATEGORIAS_ID) VALUES(1,1);
INSERT INTO PRODUTO_CATEGORIAS( PRODUTO_ID, CATEGORIAS_ID) VALUES(1,2);



