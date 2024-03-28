package entities;

import java.util.Date;

public class eventoPeriodico extends Evento{

	public int intervalo; 
	
	public eventoPeriodico(String titulo, String descricao, Date dataDeInicio, Date dataDeFim, String localizacao,
			DiaSemana dia, int intervalo) {
		super(titulo, descricao, dataDeInicio, dataDeFim, localizacao, dia);
		this.intervalo = intervalo;
	}

}
