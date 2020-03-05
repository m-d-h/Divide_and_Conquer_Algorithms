import java.util.Scanner ;
import java.lang.Math;

class Binary_Search_1
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in) ;

        int size = scan.nextInt();

        int[] arr = new int[size];

        for(int i = 0 ; i < size ; i++)
        {
            arr[i] = scan.nextInt();
        }

        
        int size2 = scan.nextInt();

        int[] elements_to_find = new int[size2] ;

        for(int i = 0 ; i < size2 ; i++)
        {
            elements_to_find[i] = scan.nextInt();
        }
        
        int[] key_index_arr = new int[size2] ;

        
        for(int i = 0 ; i < size2 ; i++)
        {
            key_index_arr[i] = key_index(arr, elements_to_find[i]);
        }
        

        
        for(int i = 0 ; i < size2 ; i++)
        {
            System.out.print("" + key_index_arr[i]);
            System.out.print(" ");
        }
        

       
        
        

    }

    public static int key_index(int[] arr, int key)
    {
       
        int num  = key ;
        int low = 0 ;
        int high = arr.length - 1 ;

        while(low <= high)
        {
            int mid = (int) Math.floor(low +  (high - low) / 2)  ;

            if(arr[mid] == num)
            {
                return mid ;
            }
            else if( num > arr[mid])
            {
                low =  mid + 1 ;
            }
            else
            {
                high = mid - 1 ;
            }

        }

        return -1 ;
    }

    
}