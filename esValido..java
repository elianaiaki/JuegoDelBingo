
	boolean esValido(int[][] carton) {
	    if (carton.length != 3 || carton[0].length != 5) {
	        return false;
	    }

	    boolean[] numerosVistos = new boolean[91];
	    int[] conteoDecenas = new int[9];

	    for (int i = 0; i < 3; i++) {
	        for (int j = 0; j < 5; j++) {
	        	
	            int num = carton[i][j];
	            if (num < 1 || num > 90 || numerosVistos[num]) {
	                return false; 
	            }
	            numerosVistos[num] = true;
	            conteoDecenas[(num - 1) / 10]++;
	        }
	    }

	    for (int i = 0; i < conteoDecenas.length; i++) {
	        if (conteoDecenas[i] < 1 || conteoDecenas[i] > 2) {
	            return false;
	        }
	    }

	    return true; 
	}