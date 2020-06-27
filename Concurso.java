package parcial;

import java.util.ArrayList;


public class Concurso {
	
	private String nombre;	
	private ArrayList<Participante> participantes;
	
	
	public Concurso(String nombre) {
		
		participantes = new ArrayList<>();
		this.nombre = nombre;
		
	}

	public String getNombre() {
		return nombre;
	}

	public ArrayList<Participante> getParticipantes() {
		return participantes;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private void setParticipantes(ArrayList<Participante> participantes) {
		this.participantes = participantes;
	}
	
	
	
	public Participante buscar(String dni) { // buscar participante
		Participante ParticipanteEncontrado=null;
		int i=0;
		Participante partlista;
		while(i<participantes.size()&&ParticipanteEncontrado==null) {
			partlista=participantes.get(i);
			if(partlista.getDni().equals(dni)) {
				ParticipanteEncontrado=partlista;
			}else
			{
				i++;
			}
			
		}
		
		return ParticipanteEncontrado;
	}
	
	public boolean agregarParticipante(String dni, String nombre, String apellido) { // agregar participante
		boolean pude= false;
		Participante nuevoParticipante;
		if(buscar(dni)==null) {
					nuevoParticipante=new Participante(dni,nombre, apellido);
					participantes.add(nuevoParticipante);
					pude=true;
					System.out.println("Se agregó participante " + dni);
					
		} else {
		
			System.out.println("No se puede agregar a " + dni);
		}
		
		return pude;
	}
	
	public boolean eliminarParticipante(String dni) { // elimiar un participante
		boolean pude= false;
		Participante deleteParticipante;
		deleteParticipante=buscar(dni);
		if(deleteParticipante!=null) {
			participantes.remove(deleteParticipante);
					pude=true;
		System.out.println("Se eliminó participante " + dni);			
		} else {
			System.out.println("No se elimino porque no existe " + dni);			
		}
		return pude;
	}
	
	
	
	public void cantParticipantes() { // cantidad de participantes
		
		System.out.println("Cantidad participantes " + participantes.size());
		 
	}
	
	public void votarParticipante(String dni) { //votar a participante
		Participante participante;
		int votos= 1;
		int aux;
		
		
		 participante = buscar(dni);
		 
		 if(participante != null) {
			 if (participante.getDni().equals(dni)) {
				
				aux = participante.getVotos();
				participante.setVotos(aux += votos);
				 System.out.println("Voto para " + dni); 
			 } else {
				System.out.println("Voto inválido: Dni inexistente"); 
			 }
		 }
		 
		
		 }
	
	 	public void mostrarParcipanteConMasVotos() {
	 		int i = 0;
	 		int aux = 0;	 		
	 		int max = 0;
	 		String MasVotado = "";
	 		if (!(participantes.size() == 0)) {
	 		while (i < participantes.size()) {
	 			aux =participantes.get(i).getVotos();	 			
	 			if (aux > max) {
	 				max = aux;
	 				 MasVotado = participantes.get(i).getDni();
	 				 
	 			}	 			
	 			i++;
	 			
			} 
	 		System.out.println("DNI participante con mayor cantidad de votos DNI: " + MasVotado);
	 		
			} else {
	 			
				System.out.println("No hay participantes inscriptos ");	 		
		 
	 }
}
	 	public void listarPorPuntaje(int puntaje) {
	 		int votos;
	 		for (Participante participante : participantes) {
	 			votos = participante.getVotos();
	 			if(votos <= puntaje) {
	 				System.out.println(participante);
	 			}
			}
	 	}
}


			 
		 
		
		
		
	
		
	
	


	
	




