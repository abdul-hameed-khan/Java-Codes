
package insertionsort;


public class InsertionSort {
    public int[] insertsort(int[] b){
       
        for(int j=1;j<b.length;j++){
            int key=b[j];
            int i;
            for(i=j-1;i>=0 && b[i]>key;i--){
             
                 b[i+1]=b[i];      
            }
           b[i+1]=key; 
        }
       
        return b;
    }
       
    public void print(int[] A){
          for(int i=0;i<A.length;i++){
            System.out.println(A[i]);
        } 
    }

    public static void main(String[] args) {
       int[] A = {2,1,5,8,6,4,8,1,0,6,45,89,23,45,78,12,23,62,51,84};
   InsertionSort a = new InsertionSort();
        a.insertsort(A);
    a.print(A);
    }
    
}
