
package selectionsort;
public class selsort{
    public int[] sort(int[] b){
        int m;
        int tmp;
        for(int i=0;i<b.length-1;i++){
            m=i;
            for(int j=i;j<b.length;j++){
                if(b[j]<b[m]){
                    m=j;
                   tmp=b[j];
                b[j]=b[i];
                b[i]=tmp;  
                }
               
            }
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
        selsort a = new selsort();
        a.sort(A);
    a.print(A);
     
    }
    
}
        