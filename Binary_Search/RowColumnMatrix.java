import java.util.Arrays;

public class RowColumnMatrix 
{
    //for row and column sorted matrix O(n+m)
    public static int[] search_2D(int[][] matrix,int key)
    {
        int row = 0;
        int col = matrix[0].length - 1;
        while(row < matrix.length && col >=0)
        {
            if(matrix[row][col] == key)
            {
                return new int[] {row,col};
            }

            if(matrix[row][col] < key)
            {
                row++;
            }
            else
            {
                col--;
            }
        }
        return new int[] {-1,-1};
    }

    public static int BinarySearch(int[] arr,int key)
    {
        int low = 0;
        int high = arr.length - 1;
        int mid = 0;
        while(low<=high)
        {
            mid = low + (high - low)/2;
            if(key == arr[mid])
            {
                return mid;
            }
            else if(key < arr[mid])
            {
                high = mid - 1;
            }
            else if(key > arr[mid])
            {
                low = mid + 1;
            }
        }
        return -1;
    }

    //for complete sorted matrix O(logn + logm)
    public static int[] Search_2D(int[][] matrix,int key)
    {
        //int row = 0;
        int col = (matrix[0].length-1)/2;

        int rowLow = 0;
        int rowHigh = matrix.length -1;
        int mid;
        while(rowLow<(rowHigh-1))
        {
            mid = rowLow + (rowHigh-rowLow)/2;
            if(matrix[mid][col] == key)
            {
                return new int[] {mid,col};
            }
            if(matrix[mid][col]>key)
            {
                rowHigh = mid;
            }
            else
            {
                rowLow = mid;
            }
        }
        int[] ans = {-1,-1};
        ans[0] = rowLow;
        ans[1] = BinarySearch(matrix[rowLow],key);
        if(ans[1]==-1)
        {
            ans[0] = rowHigh;
            ans[1] = BinarySearch(matrix[rowHigh],key);
        }
        if(ans[1]==-1)
        {
            ans[0] = -1;
        }
        return ans;
    }

    public static void main(String[] args) 
    {
        int[][] matrix = {
            {10,20,30,40},
            {15,25,35,45},
            {28,29,37,49},
            {33,34,38,50},
        };
        System.out.println(Arrays.toString(search_2D(matrix, 35)) );

        int[][] matrix2 = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };

        System.out.println(Arrays.toString(Search_2D(matrix2, 0)));
        //System.out.println(matrix.length);
    }
}
