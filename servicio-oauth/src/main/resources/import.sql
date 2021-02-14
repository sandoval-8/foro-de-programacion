INSERT INTO usuario (username, password, enabled, nombre, apellido, email) VALUES ('lucas_1', '$2a$10$qjAZKmqFSMiBqNambEmuC.SsUq6W1NuZItDGi21xqyIU3c5UxKnC2', true, 'lucas', 'sandoval', 'sandovalucas@gmail.com');
INSERT INTO usuario (username, password, enabled, nombre, apellido, email) VALUES ('flor_2', 'moro', true, 'florencia', 'migueles', 'flor_ctm@gmail.com');
INSERT INTO usuario (username, password, enabled, nombre, apellido, email) VALUES ('diana_3', '123456', true, 'diana', 'sandoval', 'diana_kb@gmail.com');

INSERT INTO role (id, role) VALUES (1, 'ROLE_USER');
INSERT INTO role (id, role) VALUES (2, 'ROLE_MANAGER');
INSERT INTO role (id, role) VALUES (3, 'ROLE_ADMIN');

INSERT INTO usuario_roles (usuario_id, roles_id) VALUES (1, 1);
INSERT INTO usuario_roles (usuario_id, roles_id) VALUES (2, 2);
INSERT INTO usuario_roles (usuario_id, roles_id) VALUES (3, 2);
INSERT INTO usuario_roles (usuario_id, roles_id) VALUES (3, 3);
