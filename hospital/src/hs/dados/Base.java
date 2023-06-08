package hs.dados;

import java.util.ArrayList;
import java.util.List;

import hs.modelos.Pacientes;

public class Base {
	
	public List<Pacientes> professores(){
		List<Pacientes> lista = new ArrayList<Pacientes>();
		for (int i = 0; i < 10; i++) 
			lista.add(new Pacientes( (i+1), "Paciente" + (((i * 6) + 6) < 10 ? "0" : "") + ((i * 6) + 6)));
		return lista;
	}

}
