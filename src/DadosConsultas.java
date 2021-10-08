import java.util.ArrayList;
public class DadosConsultas {
	private ArrayList<Consulta> vetCon = new ArrayList<Consulta>();
	public void cadastrar(Consulta c) {
	this.vetCon.add(c);
	System.out.println("Total de consultas: ");
	System.out.println(this.vetCon.size());
	}
	public void listar(){
	for (Consulta objeto: this.vetCon) {
	//objeto.mostrarDados();
	//método mostrarDados();
	}
	}

	/*public Consulta buscar(String ?) {
	Consulta c = null;
	for ( Consulta objeto: this.vetCon) {
	if (objeto.getCon().equals(?)) {
	c = objeto;
	break;
	}
	}
	return c;
	}
	
	public boolean excluir(String ?){
	Consulta c = this.buscar(?);
	if (c != null) {
	this.vetCon.remove(c);
	return true;
	}
	else {
	return false;
	}
	}
	*/
}
