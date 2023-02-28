
public class Manipula_Cadenas {

	public static void main(String[] args) {
		
		String nombre= "pablito";
		
		System.out.println("Mi nombre es " + nombre);
		
		System.out.println("Mi nombre tiene " + nombre.length()+ " letras");
		
		System.out.println( nombre + " comienza con la letra " + nombre.charAt(0));
		
		int ultimaletra;
		
		ultimaletra= nombre.length()-1;
		
		System.out.println("La ultima letra del nombre " + nombre + " es la " + nombre.charAt(ultimaletra) );
		//primer comentario para git
		
		
		
		

	}

}
