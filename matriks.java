import java.util.Scanner;

class Matriks {
    /* ATRIBUT */
    int MaxRow = 10;
    int MaxCol = 10;
    int NRowEff, NColEff;
    float[][] Mat = new float[MaxRow+1][MaxCol+1];

    /* METHOD */
    Matriks() {
        for (int i = 0; i <= this.MaxRow; i++) {
            for(int j = 0; j<= this.MaxCol; j++) {
                this.Mat[i][j] = 0;
            }
        }
    }

    void BacaMatriks() {
        Scanner baca = new Scanner(System.in);
        System.out.print("Baris: "); this.NRowEff = baca.nextInt();
        System.out.print("Kolom: "); this.NColEff = baca.nextInt();
        for (int i = 1; i <= this.NRowEff; i++) {
            for (int j = 1; j <= this.NColEff; j++) {
                this.Mat[i][j] = baca.nextFloat();
            }
        }  
    }
    
    void TulisMatriks() {
        for (int i = 1; i <= this.NRowEff; i++) {
            for (int j = 1; j <= this.NColEff; j++) {
                System.out.print(this.Mat[i][j]+"\t");
            }
            System.out.println();
        }
    }
    /*
    void Gauss(int row, int col) {
        //jika matrix[1][1]=0 tukar baris
        //jika nggak 0
        for (int i=1;i<row-1;i++){
            for(int j=1;j<col;j++){
                for(int k=i+1;k<row;k++){
                    matrix[k][j] = matrix[k][j] - (matrix[k][i]/matrix[i][i])*matrix[i][j];
                } 
            }
        }
    }
    
    void Transpose() {
        int i, j;
        Matriks M_transpose;
        M_transpose.NRowEff = 
        for (i=0; i<=M.NColEff; i++) {
            for (j=0; j<M.NRowEff; j++) {
                this.Mat[j][i] = this.Mat[i][j];
            }
        }
    }
    */
}