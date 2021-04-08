#Spring Boot API REST: Construa uma API

- [x] O Spring boot serve para facilitar a configuração de projetos que querem utilizar a stack do Spring. Através de auto configurações, quase sempre fornecida por starters, a configuração das tecnologias é bem facilitada.
- [x] Crio a classe Aluno, adiciono os atributos necessários e também adiciono um id. Adiciono o Id para mapear como chave primária para o banco de dados.
- [x] Mapeio a classe Aluno para ser entendida pelo HIbernate. Uso o @Entity em cima da classe e o @Id em cima do atributo id. Poderia colocar também o @Id no email. A @Entity explica para o Hibernate que aquela classe vai ser uma tabela no banco e o @Id explica que aquele atributo vai ser a chave primaria na tabela. Os outros atributos eu não preciso mapear pq ele já vai mapear para colunas do mesmo nome.
- [x] Já configuro o acesso ao banco de dados no application.properties com o login/senha e banco de dados local específico.
- [x] Crio o controller relativo a alunos
- [x] Crio o método que vai receber os dados de cadastro e anoto com @PostMapping

- [x] Crio a classe que representa os dados de entrada e anoto cada atributo com as anotações específicas da Bean Validation. Nesse caso poderia usar @Length, @Email, @Min
- [x] Crio um método na classe que representa os dados de entrada(DTO) que é responsável por criar um objeto do tipo Aluno a partir dos dados de entrada
- [x] Crio a classe que representa o Aluno
- [x] Mapeio a classe para a utilização do Hibernate
- [x] Volto no controller, recebo injetado o EntityManager e salvo o objeto criado do tipo Aluno. Podia ter usado um Repository também, mas não é necessário.
- [x] Deixo o retorno do método como void.
- [x] Agora eu crio outro método no controller mapeado para receber get
- [x] Coloco o id como parte do endereço
- [x] Já defino que o retorno vai ser um objeto do específico para a saída do detalhe apenas com nome e email.
- [x] Recebo o id como argumento do método usando a annotation @PathVariable
- [x] Utilizo o EntityManager dentro do método para carregar o objeto do tipo Aluno pelo id.
- [x] Instancio o objeto do tipo de saída, passo o objeto do tipo aluno como argumento no construtor  e já retorno ele no método.
- [x] Agora eu crio a classe que representa a saída, com os atributos específicos, além do construtor. Adiciono os getters, e apenas eles, para expor os dados que preciso.
