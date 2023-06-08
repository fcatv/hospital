package hs.modelos;

public class Pacientes {

	private Integer id;
	private String nome;
	
	public Pacientes(Integer id, String nome) {
		this.id = id;
		this.nome = nome;
	}
	
	public Integer getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}

	@Override
	public String toString() {
		return "Professor => id: " + (id < 10 ? " " : "") + id + " nome: " + nome + "";
	}
	
}
