import java.util.Scanner;
import java.util.Arrays;
import java.util.Random ;



class Improving_Quicksort_3
{
    public static void main(String[] args)
    {
        //Scanner scan = new Scanner(System.in);
        Random rd = new Random();
        boolean flag = true ;

        //int size = scan.nextInt();
        int size = 50 ;

        int[] arr = new int[size];
        int[] arr2 = new int[size] ;

        while(flag)
        {

            for(int i = 0 ; i < size ; i++ )
            {
                //arr[i] = scan.nextInt();
                arr[i] = rd.nextInt() ; 
            }

            for(int i = 0 ; i < size ; i++)
            {
                arr2[i] = arr[i] ;
            }

            Arrays.sort(arr);

            Quicksort(arr2, 0 , size-1);

            for(int i = 0 ; i < size ; i++)
            {
                if(arr[i] != arr2[i])
                {
                    flag = false ;
                }
            }

            //System.out.println("Success");

        }

        for(int i = 0 ; i < size ; i++)
        {
            System.out.print("" + arr[i] + " ");
        }
        System.out.println();

        for(int i = 0 ; i < size ; i++)
        {
            System.out.println("" + arr[i] + "  ");
        }

        /*for(int i = 0 ; i < size ; i++)
        {
            System.out.println(""+arr[i]);
        }
        */

       

    }





    public static int HoarePartition(int[] arr, int start_index , int end_index)
    {
        int start = start_index ;
        int end   = end_index ;
        int pivot = arr[start];
        int temp = 0 ;

        for(int j = start_index + 1 ; j <= end_index ; j++ )
        {
            if(arr[j] <= pivot)
            {
                start = start + 1 ;
                temp = arr[j];
                arr[j] = arr[start];
                arr[start] = temp ;
                
            }
        }

        temp = arr[start_index];
        arr[start_index] = arr[start];
        arr[start] = temp ;
        

        return start ;
    

    }

    
    public static void Quicksort(int[] arr, int start_index , int end_index)
    {
        if(start_index < end_index)
        {
            int q = HoarePartition(arr, start_index, end_index);

            Quicksort(arr, start_index, q-1);
            Quicksort(arr, q+1, end_index);
        }
    }
    
    
}