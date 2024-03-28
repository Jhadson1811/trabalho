package entities;

import java.util.Objects;

public class Participante {
	
	private String nome;
	private String CPF;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public Participante(String nome, String cPF) {
		super();
		this.nome = nome;
		CPF = cPF;
	}
	@Override
	public String toString() {
		return "Participante [nome=" + nome + ", CPF=" + CPF + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(CPF, nome);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Participante other = (Participante) obj;
		return Objects.equals(CPF, other.CPF) && Objects.equals(nome, other.nome);
	}
	
	

}
