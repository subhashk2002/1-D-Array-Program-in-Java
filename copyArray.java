import java.util.*;
class copyArray{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int arr[]={1,2,3,4,5};
        int arr1[]=new int[arr.length];
         //printing original array
         for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
         }
         System.out.println();
         //copying arr into arr1
         for(int i=0; i<arr.length; i++){
            arr1[i]=arr[i];
        
         }
         System.out.println();
         //printing element of an array after copying the element 
         for(int i=0; i<arr.length; i++){
            System.out.print(arr1[i]+" ");
         }

    }

}