
package searching;

public class Searching {
    public static boolean linearSearch(int[] A, int key){
        boolean found = false;
        for(int i=0; i<A.length;i++){
            if(A[i]==key){
                found = true;
                break;
            }
        }
        return found;
    }
    public static boolean binarySearch(int[] A, int key){
        boolean found = false;
        int l=0,u=A.length-1;
        while(l<=u){
            int m=(l+u)/2;
            if(A[m]==key){
                found = true;
                break;
            }else if(A[m]<key){
                l=m+1;
            }else{
                u=m-1;
            }
        }
        return found;
    }
    public static void main(String[] args) {
        int[] A = {1,2,4,5,7,8,9,11,12,15,16,18,18,18,22,23,35,56};
        int key = 23;
        System.out.println("Linear search");
        if(linearSearch(A, key)){
            System.out.println("Found");
        }else{
            System.out.println("Not found");
        }
        System.out.println("Binary search");
        if(binarySearch(A, key)){
            System.out.println("Found");
        }else{
            System.out.println("Not found");
        }
    }
    
}
