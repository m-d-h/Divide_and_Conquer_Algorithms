import java.util.Scanner; 
import java.util.Arrays;



class Majority_Element_2
{
    public static void main(String[] args)
    {

        Scanner scan = new Scanner(System.in);

        int arr_size = scan.nextInt();

        int[] arr = new int[arr_size];

        for(int i = 0 ; i < arr_size ; i++ )
        {
            arr[i] = scan.nextInt();
        }

        System.out.println("" + majority_Element(arr));

    }

    public static int majority_Element(int[] arr)
    {
        Arrays.sort(arr);
        int num = arr[0] ;
        int count = 0 ;
        int majority = (int) (arr.length/2);
        //System.out.println("Maj " + majority);

        for(int i = 0 ; i < arr.length ; i++)
        {
            //System.out.println("count = " + count) ;
            if(arr[i] == num)
            {
                count = count + 1 ;
            }
            else 
            {
                num = arr[i];
                count = 1 ;
            }

            if(count > majority)
            {
                //System.out.println("" + count) ;
                return 1 ;
            }
        }

        return 0 ;

    }
}