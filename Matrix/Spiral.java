package Matrix;

import java.util.ArrayList;
import java.util.List;

public class Spiral {
    
            List<Integer> l=new ArrayList<>();

           

          int top=0;
          int bottom=matrix.length-1;

          int left=0;
          int right=matrix[0].length-1;



          while(top<=bottom && left<=right){

              for(int i=left;i<=right;i++){
                  l.add(matrix[top][i]);
              }
              top++;

              for(int i=top;i<=bottom;i++){
                  l.add(matrix[i][right]);
              }
              right--;


            if(!(top<=bottom && left<=right)){
                break;
            }
              for(int i=right;i>=left;i--){
                  l.add(matrix[bottom][i]);
              }

              bottom--;

              for(int i=bottom;i>=top;i--){
                  l.add(matrix[i][left]);
              }

              left++;
          }
          return l;

}
