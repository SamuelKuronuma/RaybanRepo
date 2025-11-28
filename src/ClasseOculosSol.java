
public class ClasseOculosSol extends ClasseProdutos{

	String corLente;
	
	public ClasseOculosSol(String cor, float preco, String pigmentacao){
		super(cor, preco);
		
		this.corLente = pigmentacao;
	}
	
	public void setColorLente(String pigmento){
		this.corLente = pigmento;
	}
	
	public String getCorLente(){
		return corLente;
	}
	
}
