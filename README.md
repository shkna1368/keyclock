Add realm:ShababRealm
make client:ShababClient
make redirect:http://localhost:7075/*
make user:ShababUser-ShababAdmin 123

in clients menu,go to Roles,make roles:ShababUserRole and ShababAdminRole

go to clients,From the Client Roles drop-down menu, select ShababClient and assign ShababUserRole,ShababAdminRole,
select keycloak-app and assign ShababUserRole
For admin, choose both ShababUserRole,ShababAdminRole.


http://localhost:7075/
http://localhost:7075/customers
http://localhost:7075/admin
http://localhost:7075/visitor



