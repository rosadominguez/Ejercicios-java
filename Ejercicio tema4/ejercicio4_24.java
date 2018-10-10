public class ejercicio4_24 {
  public static void main(String [] args) {
    
    
    System.out.println("Este programa creara una nomina desglosada");
    
    
    System.out.println("Introduzca el numero al que corresponda su puesto de trabajo");
    System.out.println(" 1 - Programador Junior");
    System.out.println(" 2 - Programador Senior");
    System.out.println(" 3 - Jefe de proyecto");
       int puesto = Integer.parseInt(System.console().readLine());
    
    System.out.println("Introduzca los dias de viaje visitando clientes");
	   int diasVisita = Integer.parseInt(System.console().readLine());
	
	System.out.println("Introduzca el numero al que corresponda su Estado Civil");
	System.out.println(" 1 - Soltero");
	System.out.println(" 2 - Casado");
	 int estadoCivil = Integer.parseInt(System.console().readLine());
   
     double sueldoBase = 0;
     
    switch (puesto) {
		
		case 1:
		sueldoBase = 950;
		break;
		
		case 2:
		sueldoBase = 1200;
		break;
		
		case 3:
		sueldoBase = 1600;
		break;
	}
	
	double irpf = 0;
	
	if (estadoCivil == 1) {
		irpf = 25;
	}
	if (estadoCivil == 2) {
		irpf = 20;
	}
	
	double sueldoBruto = sueldoBase + (diasVisita * 30);
	double sueldoNeto = sueldoBruto - (sueldoBruto * irpf/ 100);
	
	System.out.println("///////////////////////////");
	System.out.println("Sueldo Base:  " + sueldoBase);
	System.out.println("Dietas:       " + (diasVisita * 30));
	System.out.println("///////////////////////////");
	System.out.println("Sueldo Bruto: " + sueldoBruto);
	System.out.println("IRPF:         " + irpf + "%");
	System.out.println("///////////////////////////");
	System.out.println("Sueldo Neto:  " + sueldoNeto);
	
	
  }
}
