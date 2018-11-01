public class Ejercicio11_6 {
  public static void main(String [] args) {


	//Escribe un programa que muestre 20 notas generadas al azar. Las notas deben
	//aparecer de la forma: suspenso, suficiente, bien, notable o sobresaliente. Al
	//final aparecerá el número de suspensos, el número de suficientes, el número
	//de bienes, etc
	
	System.out.println("Vamos a mostrar 20 notas.");
	
	int numero;
	int insuficiente = 0;
	int suficiente = 0;
	int bien = 0;
	int notable = 0;
	int sobresaliente = 0;
	
	for (int i = 0; i < 20;i++){
		
		numero = (int)(Math.random()*11);
		
		if (numero < 5){
				System.out.println("Suspenso");
				insuficiente++;
			}else if ((numero<6) && (numero>=5)) {
				System.out.println("Suficiente");
				suficiente++;
			}else if ((numero<8) && (numero>=6)) {
				System.out.println("Bien");
				bien++;
			}else if ((numero<10) && (numero>=8)) {
				System.out.println("Notable");
				notable++;
			}else if (numero == 10) {
				System.out.println("Sobresaliente");
				sobresaliente++;
		}
	}
	System.out.println("Ha obtenido " + suficiente + " suficientes, " + bien + " bien, " + notable + " notables, y  " + sobresaliente + " sobresalientes.");
	System.out.println("Ha suspendido " + insuficiente + " examenes");
  }
}
		
		
