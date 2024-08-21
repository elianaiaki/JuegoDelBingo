
	boolean hayLinea(int[][] carton, int[] bolillas) {
		for (int i = 0; i < carton.length; i++) {
            boolean lineaCompleta = true;
            for (int j = 0; j < carton[i].length; j++) {
                boolean encontrado = false;
                for (int k = 0; k < bolillas.length; k++) {
                    if (bolillas[k] == carton[i][j]) {
                        encontrado = true;
                        break;
                    }
                }
                if (!encontrado) {
                    lineaCompleta = false;
                    break;
                }
            }
            if (lineaCompleta) {
                return true;
            }
        }
        return false;
	}