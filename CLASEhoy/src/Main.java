import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		//Ejercicio 1: Programa para transformar grados a f
		//Scanner scan = new Scanner(System.in);
		/*
		System.out.print("Introduzca los grados Farenheit: \n");
		float far = scan.nextFloat();
		float cel = ((far - 32)*5)/9;
		System.out.println("El valor en grados Celsius es: " + cel + "�C.");
		scan.close();
		*/
	
		
		//Ejercicio 2
		/*
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduzca el valor del radio; ");
		float r = scan.nextFloat();
		final float PI = 3.14f;
		float area = 4 * PI * r * r;
		System.out.println("El �rea es: " + area);
		System.out.println("El volumen es: " + ((area * r)/3));
		scan.close();
		*/
		
		//Ejercicio 3
		
		//Scanner scan = new Scanner(System.in);
		/*
		System.out.println("Introduzca una nota ( entre 0 y 10 )");
		int nota = scan.nextInt();
		if( nota <5) {
			System.out.println("SUSPENSO");
		} else if ( nota < 7) {
			System.out.println("APROBADO");
		} else if ( nota <9) {
			System.out.println("NOTABLE");
		} else {
			System.out.println("SOBRESALIENTE");	
		}
		scan.close();
		*/

		//Ejercicio 4

		//Scanner scan = new Scanner(System.in);
	/*
		int a = 0, e = 0, i = 0, o = 0, u = 0;
		String entrada;
		for (int x = 0; x <20; x++) {
			System.out.println("Introduzca un caracter;");
			entrada = scan.nextLine();
			switch(entrada) {
			case "a":
				a++;
				break;
			case "e":
				e++;
				break;
			case "i":
				i++;
				break;
			case "o":
				o++;
				break;
			case "u":
				u++;
				break;
			default:
				break;
			}
		}
		System.out.println ("N�mero de a: " + a + "\n"
				+ "N�mero de e: " + e + "\n"
				+ "N�mero de i: " + i + "\n"
				+ "N�mero de o: " + o + "\n"
				+ "N�mero de u: " + u + "\n");
		scan.close();
		*/
	
	 //Ejercicio 5
	//Scanner scan = new Scanner (System.in);
	/*
	int n1, n2;
	String ch = "";
	while(!ch.equals("0")) { // ch !="0"
		System.out.println("Introduzca el primero n�mero: ");
		n1 = scan.nextInt();
		System.out.println("Introduzca el segundo n�mero: ");
		n2 = scan.nextInt();
		System.out.println("Seleccione una operaci�n (+,-,^,/,%):\n"
				+ "Pulse 0 para salir. ");
		ch = scan.next();
		switch (ch) {
			case "+":
				System.out.println("El resultado es: " + (n1 + n2));
				break;
			case "-":
				System.out.println("El resultado es: " + (n1 - n2));
				break;
			case "*":
				System.out.println("El resultado es: " + (n1 * n2));
				break;
			case "/":
				System.out.println("El resultado es: " + (n1 / n2));
				break;
			case "%":
				System.out.println("El resultado es: " + (n1 % n2));
				break;
			case "0":
				System.out.println("Fin del programa.");
				break;
				default:
					System.out.println("ERROR: Operando Incorrecto.");
					break;
		}//Fin switch
		
	}//fin while
	scan.close();
	*/
	
	// Ejercicio 6
	
	//Scanner scan = new Scanner (System.in);
	/*
	float num, sum = 0;
	for ( int i=0;i<20;i++) {
		System.out.println("Introduzca un valor:");
		num = scan.nextFloat();
		sum += num; // Esto es lo mismo que: sum = sum + num;
	}
	scan.close();
	
	System.out.println ("La media es: " + (sum/20) + "\n");
	*/
	
	// Ejercicio7
	//Scanner scan = new Scanner (System.in);
	/*
		int n, fac = 1;
		System.out.println("Introduzca un n�mero: \n");
		n = scan.nextInt();
		if (n!=0) {
		for(int =1 ; i <=n ; i++) {
			fac = fac * i ; // fac*= i
			}
		} else {
			fac = 0;
		}
		System.out.println("El factorial de" + n + "es: " + fac);
		scan.close();
	*/
		
		//Ejercicio 8
		/*
		//Scanner scan = new Scanner (System.in);
		int n, sum = 0;
		System.out.println("Introduzca el n�mero de impares: ");
		n = scan.nextInt();
		n = n*2;
		for(int i =1; i<n; i++) {
			sum = sum + i; // sum += 1
			i++;
		}
		scan.close();
		System.out.println("El resultado es: " + sum);
		*/
	
		//Ejercicio 9
		
		/*
		int res = 0;
		for(int i = 1; i<500; i++) {
			if((i%5) == 0 && (i%/7) ==0) {
				res += i;
			}
		}
		//for(int i =1; i<500; i++) if( (i%5) == 0 && (i%/7) ==0 ) res += i; {}
		System.out.println("El resultado es: " + res );
		*/
		
		//Ejercicio 10
		/*
		String tuit;
		//Scanner scan = new Scanner(System.in);
		System.out.println("Introduzca el tuit a evaluar: ");
		tuit = scan.nextLine();
		if (tuit.length() <= 280) {
			System.out.println("Tuiteable");
		} else {
			System.out.println("No Tuiteable");
		}
		scan.close();
		 */
	
	
		//Ejercicio 11
		/*
		Scanner scan = new Scanner(System.in);
		int min, d, h;
		System.out.println("Introduzca los minutos totales: ");
		min = scan.nextInt();
		d = (min/60)/24;
		h = min/60;
		h = h -  (d*24);
		System.out.println(d + " d�as, " + h + "horas y " + min + " minutos.");
		scan.close();
		*/
	
		//Ejercicio 12
		/*
		Scanner scan = new Scanner (System.in);
		int n1, n2, n3;
		System.out.println("Introduzca el primer n�mero");
		n1 = scan.nextInt();
		System.out.println("Introduzca el segundo n�mero");
		n2 = scan.nextInt();
		System.out.println("Introduzca el tercer n�mero");
		n3 = scan.nextInt();
		if(( n1 % 2 == 0 && n2 % 2 == 0) ||
				( n2 % 2 == 0 && n3 % 2 == 0) || 
				( n1 % 2 == 0 && n3 % 2 == 0) ) {
			System.out.println("Al menos dos de los n�meros son pares");
		} else {
			System.out.println("No hay n�meros pares");
		scan.close();
		}
		*/
		//Ejercicio 13
		/*
		Scanner scan = new Scanner (System.in);
		int n1, n2;
		System.out.println("Introduzca el primer n�mero");
		n1 = scan.nextInt();
		System.out.println("Introduzca el segundo n�mero");
		n2 = scan.nextInt();
		if (n1 == 0 && n2 == 0 ) //M�TODO XIAN 
			System.out.println("El producto es nulo");
		} else if((n1 < 0 && n2 < 0) || (n1 > 0 && n2 > 0)) {
			System.out.println("El producto es positivo");
		} else { 
			System.out.println("El producto es negativo");
		}
		scan.close();
		*/
		
		//Ejercicio 14
		/*
		Scanner scan = new Scanner (System.in);
		int x, y, res = 1;
		System.out.println("Introduzca el n�mero");
		x = scan.nextInt();
		System.out.println("Introduzca la potencia");
		y = scan.nextInt();
		if (x > 0 && y > 0) {
		for (int i = 0; i<y ; i++) {
			res *=x; // res = res * x
		}
		//System.out.println(Math.pow(x, y)); formula valida
		System.out.println(x "+ elevado a " + y + "es" + res);
	} else {
			System.out.println("Los n�mero deben ser naturales");
		}
		scan.close();
		*/
		
		// Ejercicio 15
		/*
		Scanner scan = new Scanner (System.in);
		float min,max,entrada;
		System.out.println("Introduzca el 1 valor:");
		min = max = entrada = scan.nextFloat();
		for(int i= 1; i< 20; i++ ) }
			System.out.printl("Introduzca el " + (1+i) + // le estoy pidiendo un valor para que el usuario sepa que valor estoy pidiendo en cada momento
					"valor:");
			entrada = scan.nextFloat();
			if (entrada < max) {
				max = entrada;
			} else if { entrada <min) {
				min = entrada
			}
			System.out,println("El m�ximo es " + max + )
		*/
		
		// Ejercicio 16
		/*
		Scanner scan = new Scanner (System.in);
		int x;
		do {
			System.out.println("Introduzca el un valor"
					+ " entre 1 y 9 ");
			x = scan.nextInt();
		} while(x <= 0 && || x >= 10);
		if( x == 4 || x == 6 || x >= 8) {
			System.out.println(x + " no es un n�meor primo:");
		} else {
			System.out.println(x +" es un n�mero primo.");
			
			
		}
		scan.close();
		*/
		
		//Ejercicio 17
		/*
		Scanner scan = new Scanner (System.in);
		int x;
		do {
			System.out.println("Introduzca un valor positivo: \n" 
					+ "Pulse 0 para salir");
			x = scan.nextInt();
			if (x== 0) break;
		} while(x < 1);
		while(x!= 0) {
			if(x > anterior); {
			anterior = x;
			} else if (x <0) {
			System.out.println("El n�mero debe ser "
					+ "positivo");
			} else {
				System.out.println("El n�mero debe ser "
						+ "mayor que el anterior");
			}
			System.out.println("El n�mero debe ser "
					+ "mayor que el anterior");
					+ "Pulse 0 para salir");
		}
		System.out.println ("BYE!");
		scan.close();
		*/
		
		//Ejercicio 18
		/*
		Scanner scan = new Scanner (System.in);
			int sumPares = 0, sumImpar = 0, nImpar = 0;
			for (int i = 0; i <10 ; i++) {
				System.out.println("Introduzca el " + (i+i)+
						"valor.");
				n = scan.nextInt();
				if (n % 2 == 0) {
					sumPares += n; // sumPares = sumPares +n;
				} else {
					sumImpar += n; // sumPares = sumPares +n;
					nImpar++;
				}
			}	
			System.out.println("La suma de los pares es " + sumPares);
			System.out.println("El total pares es" + (10 - nImpar));
			System.out.println("La media de los impares es" + (sumImpar/nImpar));
			scan.close();
			*/
		
		//Ejercicio 20
/*		
		Scanner scan = new Scanner (System.in);
		int n, sumPares = 0, resto;
		System.out.println("Introduza el valor.");
		n = scan.nextInt();
		while (n!= 0) {
			resto = n % 10;
			if(resto % 2 == 0) {
				sumPares += resto; // sumPares = sumPares
			}
			n = n/10; //n /=10;
			System.out.println(resto);
		}
		System.out.println("La suma de los pares es " + sumPares);
		scan.close();
*/
		
//		Ejercicio 19
		
	}
	
}
		
		
		
		