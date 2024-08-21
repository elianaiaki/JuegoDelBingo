void imprimirCarton(int[][] carton) {
    // Declaracion de matriz.
    int[][] llenarCarton = new int[3][9];
    
    // Se compara los elementos de "carton" y se almacena en otra matriz "llenarCarton" con nuevas dimensiones.
    for (int i = 0; i < carton.length; i++) {			 
        for (int j = 0; j < carton[i].length; j++) {		    	 
            if (carton[i][j] < 10) {	 
                llenarCarton[i][0] = carton[i][j];
            } else if (carton[i][j] >= 10 && carton[i][j] < 20){
                llenarCarton[i][1] = carton[i][j];
            } else if (carton[i][j] >= 20 && carton[i][j] < 30) {
                llenarCarton[i][2] = carton[i][j];
            } else if (carton[i][j] >= 30 && carton[i][j] < 40) {
                llenarCarton[i][3] = carton[i][j];
            } else if (carton[i][j] >= 40 && carton[i][j] < 50) {
                llenarCarton[i][4] = carton[i][j];
            } else if (carton[i][j] >= 50 && carton[i][j] < 60) {
                llenarCarton[i][5] = carton[i][j];
            } else if (carton[i][j] >= 60 && carton[i][j] < 70) {
                llenarCarton[i][6] = carton[i][j];
            } else if (carton[i][j] >= 70 && carton[i][j] < 80) {
                llenarCarton[i][7] = carton[i][j];
            } else if (carton[i][j] >= 80 && carton[i][j] <= 90) {
                llenarCarton[i][8] = carton[i][j];
            }
           
        }
     }
    
    // Imprime "llenarCaron".
    for (int i = 0; i < llenarCarton.length; i++) {			 
        for (int j = 0; j < llenarCarton[i].length; j++) {
            System.out.print(llenarCarton[i][j] + " "); // Imprime el número seguido de un tabulador
        }
        System.out.println(); // Salto de línea después de cada fila
    }
}
