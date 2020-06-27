package parcial;

public class Test {

	public static void main(String[] args) {
		
		
		
		Concurso concurso = new Concurso("Quarantine Bakers");
		
		concurso.agregarParticipante("14723980", "Agustina", "Gonzales");	
		concurso.agregarParticipante("14723980", "Samantha", "Pérez");
		concurso.agregarParticipante("36581454", "Damian", "Martínez");	
		concurso.agregarParticipante("17606987", "Martina", "Luna");	
		concurso.agregarParticipante("3388725", "Emilio", "Caxi");	
		
		concurso.votarParticipante("123456789");
		concurso.votarParticipante("14723980");
		concurso.votarParticipante("36581454");
		concurso.votarParticipante("36581454");
		concurso.votarParticipante("17606987");
		concurso.votarParticipante("33887253");
		concurso.cantParticipantes();
		concurso.eliminarParticipante("17606987");
		concurso.eliminarParticipante("99999999");
		concurso.cantParticipantes();
		concurso.listarPorPuntaje(2);
		concurso.mostrarParcipanteConMasVotos();
		
	}

}
