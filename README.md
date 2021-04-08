# SpringBootOne
Spring Boot API REST: Construa uma API

<h1 align="center">
    <a href="https://www.java.com/pt-BR/">🔗 Spring Boot </a>
</h1>
<p align="center">🚀 Formulário de proposta de solução - Spring Boot API REST: Construa uma API 🚀 </p>

<h4 align="center"> 
	🚧  🚀 Spring Boot...  🚧
</h4>

### Features

- [x] Cadastrar novos(as) alunos(as)
- [x] O nome do aluno não pode ter mais de 30 caracteres
- [x] O email do aluno pode ter no máximo 30 caracteres
- [x] Idade dos alunos precisa ser maior ou igual a 18 anos
- [x] Retornar um status 200 para a aplicação cliente em caso de sucesso ou 400 em caso de falha de validação
- [x] Detalhes de cada aluno(a) possam ser acessados
- [x] Identificação do(a) aluno(a) será feita pelo id do banco de dados e deve fazer parte do endereço de acesso
- [x] Para o detalhe, só precisamos exibir o nome e o email


<p align="justify"> :robot: Usando o que foi visto durante o curso,  descreva todos os passos que você faria desde conseguir tratar a requisição feita para determinado endereço até retornar as informações do(a) aluno(a) em formato JSON.  :robot: </p>

- [x] O nome do aluno não pode ter mais de 30 caracteres
- [x] O email do aluno pode ter no máximo 30 caracteres
- [x] Idade dos alunos precisa ser maior ou igual a 18 anos

<p align="justify"> :robot: Inicialmente vou criar minha classe cadastro "SpringBootOne/domain/Cadastro", adiciono os atributos necessários e também adiciono um id. Uso o @Entity em cima da classe e o @Id em cima do atributo id. @Entity explica para o Hibernate que aquela classe vai ser uma tabela no banco e o @Id explica que aquele atributo vai ser a chave primaria na tabela. Utilizo tambem @GeneratedValue(strategy = GenerationType.IDENTITY) para que o id seja incrementado de forma automática. Os outros atributos eu não preciso mapear porque ele já vai mapear para colunas do mesmo nome.:robot: </p>

```
@Entity
public class Cadastro {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
```
  

<p align="justify"> :robot: Utilizando no atributo nome as anotações: @NotBlank(message = "nome em branco!") 	@Size(min = 3, max = 30, message = "Nome deve conter de 3 a 30 caracteres!") 	@Column (unique = true), não vamos permitir que o atributo receba um valor vazio ou nulo, bem como deve possuir o minimo de 3 caracteres e máximo de 30, sendo o valor inserido único no banco de dados, não sendo aceito caso seja repetido ("unique"). :robot: </p>

```
	@NotBlank(message = "nome em branco!")
	@Size(min = 3, max = 30, message = "Nome deve conter de 3 a 30 caracteres!")
	@Column (unique = true) 
	private String nome;
```

<p align="justify"> :robot: Utilizando no atributo email as anotações: @NotBlank, @Size e @Email não permitindo que o atributo receba um valor vazio ou nulo, bem como deve possuir o minimo de 3 caracteres e máximo de 30 e por fim para verificar se o valor corresponde a um endereço de e-mail válido.:robot: </p>

```
@Size(min = 3, max = 30, message = "Email deve conter de 3 a 30 caracteres!")
	@NotBlank(message = "email em branco!")
	@Email(message = "email inválido")
	private String email;
 ```

<p align="justify"> :robot: Para que o atributos idade nao receba valores nulos ou em branco, bem como a  idade cadastrada sejam maior ou igual a 18 vamos utilizar as anotações @NotBlank e @Min. :robot: </p>

 ```
	@NotNull(message = "Data em branco!")
	@Min(value = 18 , message = "Idade necessita ser maior ou igual a 18 anos")
	private Integer idade;
 ```


  
