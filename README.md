# HospitalVet

Uma API que recebe o ID do médico e retorna o primeiro paciente pet da lista, levando em consideração se o tipo de atendimento é prioritário, ou normal.

Foi Desenvolvido o Web Service utilizando Java com framework Spring Boot.

Java 8 e Spring Boot 1.3.3 RELEASE

Ao iniciar o servidor Spring boot:(Run as, Java Application)

Para cadastrar http://localhost:8080/cadastrar/pet e http://localhost:8080/cadastrar/med

Acessar o browser: http://localhost:8080/consulta/1

No exemplo: "1" é o id do médico cadastrado, com isso será retornado os dados do próximo "paciente" pet, a ser atendido por este médico. Podendo ser alterado para o id desejado, que esteja previamente cadastrado.
