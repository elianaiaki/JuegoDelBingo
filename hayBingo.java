
	boolean hayBingo(int[][] carton1, int[] bolillas) {
		for (int i =0; i<carton1.length;i++) {
			for (int j = 0; j<carton1[i].length;j++) {
				boolean encontrado = false;
				for (int bolilla: bolillas) {
					if (bolilla == carton1[i][j]) {
						encontrado = true;
					}
				}
				if (!encontrado)
					return false;
			}
		}
		return true;
	}