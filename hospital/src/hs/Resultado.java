package hs;

import hs.dados.Base;
import hs.impressao.Imprimir;
import hs.modelos.Pacientes;

public class Resultado {
	
	private static Imprimir im = new Imprimir();
	private static Base bs = new Base();
	
	public static void main(String[] args) {
		// Lista preliminar
		im.imprimir("Lista de Pacientes");
		for (Pacientes pr : bs.professores())
			im.imprimir(pr);
		
	}

}
