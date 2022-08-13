
package selsort;

/**
 *
 * @author Zulfiqar
 */
public class Selsort {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
       
        int[] a = new int[]{2,1,5,8,6};
        int m=a[0];
        for(int i=1;i<a.length;i++)
        {
            if(a[i]<m)
            {
                m=a[i];
            }
            
        }
        System.out.println("The minmum value in this array is "+m);
    }
    
}
