public class ejercicio4_9 {
  public static void main(String [] args) {
  
    System.out.println("Este programa resuelve una ecuacion de segundo grado (ax2 + bx + c = 0");
    
    double a;
    double b;
    double c;
    double x;
    
    System.out.println("Por favor, introduce el valor de a: ");
    a = Double.parseDouble(System.console().readLine());
    System.out.println("Por favor, introduce el valor de b: ");
    b = Double.parseDouble(System.console().readLine());
    System.out.println("Por favor, introduce el valor de c: ");
    c = Double.parseDouble(System.console().readLine());
    
    if (( a == 0) && ( b == 0) && ( c == 0)){ // a,b y c igual a 0
		System.out.println("La ecuacion tiene infinitas soluciones");
	}
	if ((a == 0) && ( b == 0) && (c != 0)) { // c distinto a 0
		System.out.println("La ecuacion no tiene solucion");
	}
	if ((a == 0) && ( b != 0) && (c != 0)) { // b y c distintos a 0
		x = -c/b;
		System.out.println("Solucion = " +x);
	}	
	if ((a != 0) && (b != 0) && (c == 0)) {
		System.out.println("Solucion x1 = 0");
		System.out.println("Solucion x2 = " + (-b/a));
	}
		
	if ((a!=0) && ( b != 0) && (c != 0)) {	// a, b y c distintos a 0
		double discriminante = ((b * b) - (4 * a * c));
		double raiz = Math.sqrt (discriminante);
		double x1 = ((b+raiz) / ( 2 * a));
		System.out.println("El valor de la X es igual a: " + x1);
		double x2 = ((b- raiz) / ( 2 * a));
		System.out.println("El valor de la X es igual a: " + x2);
    }
  }
}

    
