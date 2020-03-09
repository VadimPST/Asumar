package sumador;

public class ASumar {
	private int numero1;
	private int numero2;
	private int numero3;
	private int numero4;
	
	
	public ASumar() {
		numero1=0;
		numero2=0;
		numero3=0;
		numero4=0;
	}
	
	
    public String mostrar(String cad) {
        String numero = cad;
        if (numero.length() == 1) {
            return (numero + " = " + numero);
        } 
        else return numero;

    	}
}
