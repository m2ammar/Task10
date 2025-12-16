public class Array2DPF1 {
    public static void main(String[] args){
        int[][] a={{1,5},{2,6}};

        for (int[] ints : a) {  //or for(int i=0; i<a.length; i++){
            for (int j = 0; j < ints.length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();// we have to do this in outer loop bcz we want new line after one row.if we do this in inner
            // loops it will take to columns
        }

        int[][] b=new int[3][2];//3x2
        for(int i=0; i<b.length; i++){
            for(int j=0; j<b[i].length; j++){
                b[i][j]=0;
            }
        }
    }
}
