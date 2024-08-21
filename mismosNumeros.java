boolean mismosNumeros(int[][] carton1, int[][] carton2) {
		// Declaracion de 2 arreglos de enteros.
		int[] nrosCarton1 = new int[15];
        int[] nrosCarton2 = new int[15];
        
        // Se almacenan las matrices en arreglos unidimensionales.
        int posicion = 0;
        for (int i = 0; i < carton1.length; i++) {
            for (int j = 0; j < carton1[i].length; j++) {
                nrosCarton1[posicion] = carton1[i][j];
                nrosCarton2[posicion] = carton2[i][j];
                posicion++;
            }
        }
        // Se ordenan los arreglos por el método sort para poder compararlos.
        Arrays.sort(nrosCarton1);
        Arrays.sort(nrosCarton2);
        
        // Se comparan los arreglos
        for (int i = 0; i < nrosCarton1.length;i++) {
        	if (nrosCarton1[i] != nrosCarton2[i]) {
        		return false;
        	}
        }
        return true;
		
	}
