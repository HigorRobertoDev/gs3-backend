# Desafio GS3 Backend (LEIAME)
1. Executar `mvn clean install` para realizar o download das dependências do projeto.
2. Executar o comando `mvn spring-boot:run` no terminal para iniciar o container do springboot.
3. Para validação de api's utilizar o caminho http:localhost:8080
4. Para esse projeto, utilizei a versão 11 do Java.
# Collections 
1. O arquivo com exemplos de api's encontra-se no caminho: https://github.com/HigorRobertoDev/gs3-backend/clientes.postman_collection.json
2. Caso realize o clone ou download do projeto, o mesmo se encontra na pasta raiz.

# Banco de dados
1. A aplicação utiliza banco em memória (H2DataBase), para acesso as informações gravadas e histórico (conforme solicitado no desafio)
acessar o caminho:
   http://localhost:8080/h2-console , para visualizar tabelas.

Os dados de acesso para conexão são: 

JDBCUrl: jdbc:h2:mem:gs3Backend
Username: admin
Password: 123456 conforme imagem anexada [img.png](img.png)
