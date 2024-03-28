package entities;

import java.util.Date;

public class eventoRecorrente extends Evento {

	
	public eventoRecorrente(String titulo, String descricao, Date dataDeInicio, Date dataDeFim, String localizacao,
			DiaSemana dia) {
		super(titulo, descricao, dataDeInicio, dataDeFim, localizacao, dia);
	}
}
