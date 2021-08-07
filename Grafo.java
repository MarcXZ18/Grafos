import java.util.ArrayList;
import java.util.List;

public class Grafo {
	private List<Vertice> vertices;	
	private List<Arco> listAd;
	
	public Grafo() {
		this.vertices = new ArrayList<>();		
		this.listAd = new ArrayList<>();		
	}
	
	public void insertar(String dato) {
		Vertice nuevoVertice = new Vertice(dato);
		vertices.add(nuevoVertice);		
		
	}
	
	public void eliminar(String dato) {
		for (Vertice vertice : vertices) {
			if(vertice.getDato().contentEquals(dato)) {
				for(Arco arco : listAd) {
					if(arco.getOrigen().getDato().equals(dato)) {
						arco = null;
					}
					if(arco.getDestino().getDato().equals(dato)) {
						arco = null;
					}
				}
				vertices.remove(vertice);
			}
		}
	}
	
	public void buscar() {
		
	}	

	public void listar() {
		
	}
	
	
	
}
