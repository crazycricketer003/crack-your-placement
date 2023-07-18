public class SetMatrixZero {
    int m=matrix.length;
    int n=matrix[0].length;


     int row[]=new int[m];
     int col[]=new int[n];

    for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            if(matrix[i][j]==0){
                row[i]=1;
                col[j]=1;
            }
        }
    }

    

    System.out.println(Arrays.toString(row));
    System.out.println(Arrays.toString(col));

    for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            if(row[i]==1 || col[j]==1)
                 matrix[i][j]=0;
        }
    }
}
