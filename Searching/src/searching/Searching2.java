package searching;


public class Searching2 {
    public static void main(String[] a){
        int[] A = {1,2,3,4,5,6,7,8,9,11,12,13,15,17};
        int key = 4;
        boolean found = search(A, key);
        if(found){
            System.out.println("Found");
        }else{
            System.out.println("Not found");
        }
    }

    private static boolean search(int[] A, int key) {
        boolean found = false;
        for(int i=0; i<A.length; i++){
            if(A[i]==key){
                found = true;
                break;
            }
        }
        return found;
    }
}
