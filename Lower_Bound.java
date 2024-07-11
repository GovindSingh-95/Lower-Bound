import java.util.*;
public class Lower_Bound{
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.print("Enter Size of Array: ");
        int n=Sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter Elements of Array: ");
        for(int i=0;i<n;i++)
            arr[i]=Sc.nextInt();
        Arrays.sort(arr);
        System.out.print("Enter Target Element: ");
        int target=Sc.nextInt();
        //process Starts
        int low=0,high=n-1;
        int idx=n;
        while(low<=high){
            int mid=(high-low+low+low)/2;
            if(arr[mid]>=target){
                idx=mid;
                high=mid-1;
            }
            else
                low=mid+1;
        }
        System.out.println("Entered Array is:");
        for(int ele:arr) System.out.print(ele+" ");
        System.out.println("\nThe lower bound of the "+target+" element is: "+idx);
    }
}
