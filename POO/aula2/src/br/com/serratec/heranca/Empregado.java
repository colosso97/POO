package br.com.serratec.heranca;

import java.util.Objects;

public class Empregado {
	private String nome;
	private String email;
	private String teledone;
	protected Double salario;
	
	
	public Empregado(String nome, String email, String teledone, Double salario) {
		this.nome = nome;
		this.email = email;
		this.teledone = teledone;
		this.salario = salario;
	}

	public Double getSalario() {
		return salario;
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

	public String getTeledone() {
		return teledone;
	}

	public void setTeledone(String teledone) {
		this.teledone = teledone;
	}
	
	public Double aumentarSalario(Double valor) {
		return salario = salario + (salario * valor / 100);
	}
	
	@Override
	public String toString() {
		return "nome: "+nome + "email: "+email + "salario: " +salario;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empregado other = (Empregado) obj;
		return Objects.equals(nome, other.nome);
	}
	
	
	
	
}
