package entities;

import java.util.Date;

public class eventoUnico extends Evento{

	public eventoUnico(String titulo, String descricao, Date dataDeInicio, Date dataDeFim, String localizacao,
			DiaSemana dia) {
		super(titulo, descricao, dataDeInicio, dataDeFim, localizacao, dia);
		
	}
	
}
