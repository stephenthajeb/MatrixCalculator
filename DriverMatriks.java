import java.util.*;

class DriverMatriks {
    public static void main(String[] args) {
        // Scanner scan = new Scanner(System.in);
        
        Matriks M = new Matriks();
        Matriks M2 = new Matriks();

        M.BacaMatriks();

        System.out.println("Isi matriks: ");
        M.TulisMatriks();
        System.out.println();

        
        M2.CopyMatriks(M);
        M2.TulisMatriks();
        System.out.println();

        // M.TransposeMatriks();
        // M.TulisMatriks();
        // System.out.println();
        float[] temp;
        temp = M.Mat[2];
        M.Mat[2] = M.Mat[3];
        M.Mat[3] = temp;
        
        M.TulisMatriks();

        // System.out.println(M.Determinan());
    }
}