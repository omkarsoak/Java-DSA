import java.util.Arrays;

public class sorting
{
    static void bubblesort(int[] arr,int n)
    {
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    static void selectionsort(int[] arr,int n)
    {
        for(int i=0;i<n;i++)
        {
            int min = i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]<arr[min]) min = j;
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    static void insertionsort(int[] arr,int n)
    {
        for(int i=1;i<n;i++)
        {
            int key = arr[i];
            int j = i -1;
            while(j>=0 && arr[j]>key)
            {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
    
    static void merge(int[] arr,int low,int mid,int high)
    {
        int p1 = low;
        int p2 = mid+1;
        int[] temp = new int[high+1];
        int k=low;
        while(p1<=mid && p2<=high)
        {
            if(arr[p1]<=arr[p2])
            {
                temp[k] = arr[p1];k++;
                p1++;
            }
            else
            {
                temp[k] = arr[p2];k++;
                p2++;
            } 
        }
        while(p1<=mid) 
        {
            temp[k] = arr[p1];k++;
            p1++;
        }
        while(p2<=high) 
        {
            temp[k] = arr[p2];k++;
            p2++;
        }
        for(int i=low;i<high+1;i++)
        {
            arr[i] = temp[i];
        }
    }

    static void mergeSort(int[] arr,int low,int high)
    {
        if(low>=high) return;
        int mid = (low+high)/2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid+1, high);
        merge(arr,low,mid,high);
    }

    static int partition(int[] arr,int low,int high)
    {
        int pivot = arr[low];
        int i = low, j=high;
        while(i<j)
        {
            while(arr[i]<=pivot && i<=high) i++;
            while(arr[j]>pivot && j>=low) j--;
            if(i<j)
            {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[j];
        arr[j] = arr[low];
        arr[low] = temp;

        return j;
    }
    static void quicksort(int[] arr,int low,int high)
    {
        int partitionIndex = 0;
        if(low<high)
        {
            partitionIndex = partition(arr,low,high);
            quicksort(arr, low, partitionIndex-1);
            quicksort(arr, partitionIndex+1, high);
        }
    }

    public static void main(String[] args) 
    {
        int[] arr = {4,2,6,3,7,12};
        int n = arr.length;
        //bubblesort(arr,n);
        System.out.println(Arrays.toString(arr));
        //selectionsort(arr, n);
        //System.out.println(Arrays.toString(arr));
        //insertionsort(arr, n);
        //System.out.println(Arrays.toString(arr));
        //mergeSort(arr, 0, n-1);
        //System.out.println(Arrays.toString(arr));
        quicksort(arr, 0, n-1);
        System.out.println(Arrays.toString(arr));


    }
}