package entities;

import java.util.ArrayList;
import java.util.Date;

public class Evento {

	private String titulo;
	private String descricao; 
	private Date dataDeInicio; 
	private Date dataDeFim;
	private String localizacao; 
	private DiaSemana dia;
	private ArrayList<Participante> listaParticipantes = new ArrayList();
	
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getDataDeInicio() {
		return dataDeInicio;
	}

	public void setDataDeInicio(Date dataDeInicio) {
		this.dataDeInicio = dataDeInicio;
	}

	public Date getDataDeFim() {
		return dataDeFim;
	}

	public void setDataDeFim(Date dataDeFim) {
		this.dataDeFim = dataDeFim;
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

	public DiaSemana getDia() {
		return dia;
	}

	public void setDia(DiaSemana dia) {
		this.dia = dia;
	}

	public ArrayList<Participante> getListaParticipantes() {
		return listaParticipantes;
	}

	public void setListaParticipantes(ArrayList<Participante> listaParticipantes) {
		this.listaParticipantes = listaParticipantes;
	}

	public Evento(String titulo, String descricao, Date dataDeInicio, Date dataDeFim, String localizacao, DiaSemana dia) {
		this.titulo = titulo;
		this.descricao = descricao;
		this.dataDeInicio = dataDeInicio;
		this.dataDeFim = dataDeFim;
		this.localizacao = localizacao;
		this.dia = dia;
	}

	public boolean adicionarParticipantes(Participante participante) {
		
		if ( participante != null && !listaParticipantes.contains(participante) ) {
			this.listaParticipantes.add(participante);
			return true;
		}
		
		return false;
	}
	
	public boolean removerParticipantes(Participante participante) {
		
		if ( participante != null && listaParticipantes.size() > 0 && listaParticipantes.contains(participante) ) {
			this.listaParticipantes.remove(participante);
			return true;
		}
		
		return false;
	}	
	
	public void listarParticipantes() {
	
		System.out.println();
		if (listaParticipantes.isEmpty()) {
			System.out.println("Participante" + this.titulo + "não possui nenhum participante");
		}
		else {
			System.out.println("Evento" + this.titulo);
			for (Participante p : this.listaParticipantes ) {
				System.out.println("\tParticipante: " + p.getNome()
						+ " (CPF: " + p.getCPF() + ") "); 
			}
		}
	}
	
	
}
