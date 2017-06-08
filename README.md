# testeMatera

Foram criados 3 serviços para atender os requisitos solicitados na proposta.

1 - Notas
server.port = 8091
Nesse serviço é acessado pela URL:
Get: /alunos/{cpf}/notas -> é fornecido as notas do CPF fornecido na pesquisa

2 - Alunos
server.port = 8090
Nesse serviço é acessado pela URL:
Get: /alunos -> é fornecido uma listagem dos alunos cadastrados

3 - MalaDireta
server.port = 8080
Nesse Serviço ele acessa o serviço de alunos para pegar a lista de alunos cadastrados 
e com os dados do aluno eu acesso o serviços para pegar a lista de notas do aluno.

Verifica se existe alguma nota inferior e elege o aluno para ser enviado um email para orienta-lo para ir a Secretaria.

Orientação:
Subir os 3 servidores e acessar e fazer um acesso POST:
Http://localhost:8080/malaDireta

Para mais informações entrar em contato: 
oleandro.ti@gmail.com

