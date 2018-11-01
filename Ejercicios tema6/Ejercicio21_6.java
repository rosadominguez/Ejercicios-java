public class Ejercicio21_6 {
  public static void main(String [] args) {
  
	//Realiza un programa que genere una secuencia de cinco monedas de curso
	//legal lanzadas al aire. Las monedas disponibles son de 1 céntimo, 2 céntimos,
	//5 céntimos, 10 céntimos, 20 céntimos, 50 céntimos, 1 euro y 2 euros. Las dos
	//posiciones posibles son cara y cruz.
	
	System.out.println("Tiraremos 5 monedas");
	
	int moneda;
	String valor = " ";
	int lados;
	String lado = " ";
	
	for(int i = 0; i < 5; i++){
		
		
		moneda = (int)(Math.random()*8)+1;
		
		switch (moneda) {
			
			case 1:
			valor = " 1 centimo";
			break;
			
			case 2:
			valor = " 2 centimos";
			break;
			
			case 3:
			valor = " 5 centimos";
			break;
			
			case 4:
			valor = " 10 centimos";
			break;
			
			case 5:
			valor = " 20 centimos";
			break;
			
			case 6:
			valor = " 50 centimos";
			break;
			
			case 7:
			valor = " 1 euro";
			break;
			
			case 8:
			valor = " 2 euros";
			break;
		}
		
		lados = (int)(Math.random()*2)+1;
		
		switch (lados){
			
			case 1:
			lado = " cara ";
			break;
			
			case 2:
			lado = " cruz ";
			break;
			
		}
		
		System.out.print(valor +" - " + lado);
		System.out.println(" ");
	}
}
}
			
			
			
			
