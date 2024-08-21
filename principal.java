public class Bingo {
	
	void mainBingo() {
			
		int[] tirada1 = { 29, 43, 88, 36,  65, 80, 18, 87, 38, 17, 71, 7, 19, 48, 52, 59, 79};
		
		int [] tirada2 = {17, 29, 47, 67, 2, 12, 27, 88, 38, 56};
		
		int[][] carton1 = { {21, 38, 40, 50, 80},
							{ 2, 12, 27, 61, 86},
							{ 8, 17, 54, 64, 71}
							};
		
		int[][] carton2 = { {21, 38, 54, 50, 80},
							{ 2, 12, 27, 61, 86},
							{ 8, 17, 40, 64, 71}
				};
		int[][] carton3 = { { 18, 36, 43, 65, 80},
							{ 29, 38, 52, 71, 87},
							{  7, 19, 48, 59, 79}
				};
		int[][] carton4 = { { 11, 32, 44, 62, 73},
							{  8, 25, 38, 56, 80},
							{ 17, 29, 47, 67, 88}
				};
		int[][] carton5 = { { 26, 30, 55, 60, 81},
							{ 11, 37, 48, 76, 87},
							{  2, 19, 49, 69, 77}
				};
		int[][] carton6 = { {  2, 30, 55, 74, 86},
							{ 12, 28, 48, 64, 99},
							{  9, 16, 35, 58, 76}
				};
		int[][] carton7 = { { 4, 14, 38, 41, 86},
							{ 7, 19, 22, 45, 74},
							{25, 48, 57, 67, 78}
				};
		
		boolean mismos = mismosNumeros(carton1, carton2);
		System.out.println("CARTON 1 idem CARTON 2     " + (mismos ? "SI" : "NO") + " => " + ( mismos ? "OK!!!" : "FAIL!!!"));
		mismos = mismosNumeros(carton1, carton3);
		System.out.println("CARTON 1 idem CARTON 3     " + (mismos ? "SI" : "NO") + " => " + (!mismos ? "OK!!!" : "FAIL!!!"));
		
		boolean valido = esValido(carton1);
		System.out.println("CARTON 1 es valido?        " + (valido ? "SI" : "NO") + " => " + ( valido ? "OK!!!" : "FAIL!!!"));
		valido = esValido(carton4);
		System.out.println("CARTON 4 es valido?        " + (valido ? "SI" : "NO") + " => " + ( valido ? "OK!!!" : "FAIL!!!"));
		valido = esValido(carton6);
		System.out.println("CARTON 6 es valido?        " + (valido ? "SI" : "NO") + " => " + (!valido ? "OK!!!" : "FAIL!!!"));
		valido = esValido(carton7);
		System.out.println("CARTON 7 es valido?        " + (valido ? "SI" : "NO") + " => " + (!valido ? "OK!!!" : "FAIL!!!"));

		boolean hayLinea = hayLinea(carton3, tirada2);
		System.out.println("CARTON 3 tiene linea?      " + (hayLinea? "SI" : "NO") + " => " + (!hayLinea? "OK!!!" : "FAIL!!!"));

		hayLinea = hayLinea(carton4, tirada2);
		System.out.println("CARTON 4 tiene linea?      " + (hayLinea? "SI" : "NO") + " => " + ( hayLinea? "OK!!!" : "FAIL!!!"));

		boolean hayBingo = hayBingo(carton3, tirada1);
		System.out.println("CARTON 3 tiene bingo?      " + (hayBingo? "SI" : "NO") + " => " + ( hayBingo? "OK!!!" : "FAIL!!!"));

		hayBingo = hayBingo(carton4, tirada1);
		System.out.println("CARTON 4 tiene bingo?      " + (hayBingo? "SI" : "NO") + " => " + (!hayBingo? "OK!!!" : "FAIL!!!"));

		System.out.println("Los cartones");
		System.out.println("CARTON 1");
		imprimirCarton(carton1);
		System.out.println("CARTON 2");
		imprimirCarton(carton2);
		System.out.println("CARTON 3");
		imprimirCarton(carton3);
		System.out.println("CARTON 4");
		imprimirCarton(carton4);
		System.out.println("CARTON 5");
		imprimirCarton(carton5);
		System.out.println("CARTON 6");
		imprimirCarton(carton6);
		System.out.println("CARTON 7");
		imprimirCarton(carton7);
		
				
	}
