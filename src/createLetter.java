public class createLetter {
    public static void main(String[] args) {

        String[][] letterP = new String[6][4];

        for (int i = 0; i < letterP.length; i++) {
            for (int j = 0; j < letterP[i].length; j++){
                if (i == 0  || i == 3){
                    letterP[i][j] = " * ";
                }else if (j == 0){
                    letterP[i][j] = " * ";
                } else if ((i == 1 && j == 3) || (i == 2 && j == 3) ) {
                    letterP[i][j] = " * ";
                } else {
                    letterP[i][j] = "   ";
                }
            }
        }

        //herbir satırı gezmesi için forEach döngüsüne sokuyoruz.

        for (String[] row : letterP) {
            for (String col : row) {
                System.out.print(col);
            }

            System.out.println();
        }
    }
}