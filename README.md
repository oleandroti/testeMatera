# testeMatera

Foram criados 3 serviços para atender os requisitos solicitados na proposta. </br> </br>

1 - Notas  </br>
server.port = 8091 </br>
Nesse serviço é acessado pela URL: </br>
Get: /alunos/{cpf}/notas -> é fornecido as notas do CPF fornecido na pesquisa

2 - Alunos  </br>
server.port = 8090 </br>
Nesse serviço é acessado pela URL: </br>
Get: /alunos -> é fornecido uma listagem dos alunos cadastrados

3 - MalaDireta  </br>
server.port = 8080 </br>
Nesse Serviço ele acessa o serviço de alunos para pegar a lista de alunos cadastrados 
e com os dados do aluno apos acessa o serviços para pegar a lista de notas do aluno.
 </br>
  </br>
Verifica se existe alguma nota inferior a7 e elege o aluno para ser enviado um email para orienta-lo para ir a Secretaria.
 </br>
Orientação: </br>
Subir os 3 servidores, acessar e fazer um acesso POST: </br>
Http://localhost:8080/malaDireta

Para mais informações entrar em contato:  </br>
oleandro.ti@gmail.com

