
public class ClasseProdutos {
	
	String cor;
	float preco;
	
	public ClasseProdutos(String c, float p){
		this.cor = c;
		this.preco = p;
	}
	
	public float getPreco(){
		return preco;
	}
	public String getCor(){
		return cor;
	}
	public void setCor(String color){
		this.cor = color;
	}
	public void setPreco(float price){
		this.preco = price;
	}
}
