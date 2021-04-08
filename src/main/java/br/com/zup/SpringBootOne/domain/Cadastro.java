package br.com.zup.SpringBootOne.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import br.com.zup.SpringBootOne.dto.CadastroResponse;

@Entity
public class Cadastro {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotBlank(message = "nome em branco!")
	@Size(min = 3, max = 30, message = "Nome deve conter de 3 a 30 caracteres!")
	@Column (unique = true) 
	private String nome;
	@Size(min = 3, max = 30, message = "Email deve conter de 3 a 30 caracteres!")
	@NotBlank(message = "email em branco!")
	@Email(message = "email inválido")
	private String email;
	@NotNull(message = "Data em branco!")
	@Min(value = 18 , message = "Idade necessita ser maior ou igual a 18 anos")
	private Integer idade;

	@Deprecated
	public Cadastro() {

	}

	public Cadastro(String nome, String email, Integer idade) {
		
		this.nome = nome;
		this.email = email;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public 
	Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public CadastroResponse toResponse() {
		return new CadastroResponse(this.email, this.nome);
	}

}