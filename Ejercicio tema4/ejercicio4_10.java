public class ejercicio4_10 {
  public static void main(String [] args) {
  
    System.out.println("Vamos a decirte tu horoscopo!");
    System.out.println("Introduce tu mes de nacimiento en numeros");
    int mes = Integer.parseInt(System.console().readLine());
    System.out.println("Introduce el dia de nacimiento");
    int dia = Integer.parseInt(System.console().readLine());
    
    String horoscopo = " ";
    
    switch (mes) {
		
		case 1:
		if (dia <= 20) {
		   horoscopo = "capricornio";
		} else {
		   horoscopo = "acuario";
		}
		break;
		
		case 2:
		if (dia <= 19) {
		   horoscopo = "acuario";
		} else {
		   horoscopo = "piscis";
		}
		break;
		
		case 3:
		if (dia <= 20) {
		   horoscopo = "piscis";
		} else {
		   horoscopo = "aries";
		}
		break;
		
		case 4:
		if (dia <= 20) {
		   horoscopo = "aries";
		} else {
		   horoscopo = "tauro";
		}
		break;
		
		case 5:
		if (dia <= 21) {
		   horoscopo = "tauro";
		} else {
		   horoscopo = "geminis";
		}
		break;
		
		case 6:
		if (dia <= 21) {
		   horoscopo = "geminis";
		} else {
		   horoscopo = "cancer";
		}
		break;
		
		case 7:
		if (dia <= 22) {
		   horoscopo = "cancer";
		} else {
		   horoscopo = "leo";
		}
		break;
		
		case 8:
		if (dia <= 22) {
		   horoscopo = "leo";
		} else {
		   horoscopo = "virgo";
		}
		break;
		
		case 9:
		if (dia <= 22) {
		   horoscopo = "virgo";
		} else {
		   horoscopo = "libra";
		}
		break;
		
		case 10:
		if (dia <= 22) {
		   horoscopo = "libra";
		} else {
		   horoscopo = "escorpio";
		}
		break;
		
		case 11:
		if (dia <= 22) {
		   horoscopo = "escorpio";
		} else {
		   horoscopo = "sagitario";
		}
		break;
		
		case 12:
		if (dia <= 21) {
		   horoscopo = "sagitario";
		} else {
		   horoscopo = "capricornio";
		}
		break;
		default:
		   horoscopo = "El mes no existe";
	}
	 System.out.println("Tu horoscopo es " + horoscopo);
  }
}
		
		
