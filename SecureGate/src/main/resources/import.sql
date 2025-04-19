-- Sistemas
INSERT INTO systems (id, code, name, description, active) VALUES ('00000000-0000-0000-0000-000000000001', 'sistema-a', 'Sistema A', 'Sistema de gestão A', true);
INSERT INTO systems (id, code, name, description, active) VALUES ('00000000-0000-0000-0000-000000000002', 'sistema-b', 'Sistema B', 'Sistema de controle B', true);

-- Clientes OAuth2
INSERT INTO oauth_clients (id, client_id, client_secret, scopes, system_id, active) VALUES ('11111111-0000-0000-0000-000000000001', 'client-a', 'secret-a', 'read,write', '00000000-0000-0000-0000-000000000001', true);
INSERT INTO oauth_clients (id, client_id, client_secret, scopes, system_id, active) VALUES ('11111111-0000-0000-0000-000000000002', 'client-b', 'secret-b', 'read', '00000000-0000-0000-0000-000000000002', true);

-- Usuário
INSERT INTO users (id, username, password, active) VALUES ('22222222-0000-0000-0000-000000000001', 'frank', '{noop}123456', true);

-- Roles por sistema
INSERT INTO roles (id, name, system_id) VALUES ('33333333-0000-0000-0000-000000000001', 'ADMIN', '00000000-0000-0000-0000-000000000001');
INSERT INTO roles (id, name, system_id) VALUES ('33333333-0000-0000-0000-000000000002', 'SUPERVISOR', '00000000-0000-0000-0000-000000000001');
INSERT INTO roles (id, name, system_id) VALUES ('33333333-0000-0000-0000-000000000003', 'OPERATOR', '00000000-0000-0000-0000-000000000002');

-- Permissões por sistema
INSERT INTO permissions (id, name, system_id) VALUES ('44444444-0000-0000-0000-000000000001', 'VIEW_DASHBOARD', '00000000-0000-0000-0000-000000000001');
INSERT INTO permissions (id, name, system_id) VALUES ('44444444-0000-0000-0000-000000000002', 'MANAGE_USERS', '00000000-0000-0000-0000-000000000001');
INSERT INTO permissions (id, name, system_id) VALUES ('44444444-0000-0000-0000-000000000003', 'EXPORT_REPORTS', '00000000-0000-0000-0000-000000000002');

-- Vinculo do usuário ao sistema A
INSERT INTO user_system_permissions (id, user_id, system_id) VALUES ('55555555-0000-0000-0000-000000000001', '22222222-0000-0000-0000-000000000001', '00000000-0000-0000-0000-000000000001');

-- Roles vinculadas
INSERT INTO user_permission_roles (user_permission_id, role_id) VALUES ('55555555-0000-0000-0000-000000000001', '33333333-0000-0000-0000-000000000001');
INSERT INTO user_permission_roles (user_permission_id, role_id) VALUES ('55555555-0000-0000-0000-000000000001', '33333333-0000-0000-0000-000000000002');

-- Permissões vinculadas
INSERT INTO user_permission_perms (user_permission_id, permission_id) VALUES ('55555555-0000-0000-0000-000000000001', '44444444-0000-0000-0000-000000000001');
INSERT INTO user_permission_perms (user_permission_id, permission_id) VALUES ('55555555-0000-0000-0000-000000000001', '44444444-0000-0000-0000-000000000002');
