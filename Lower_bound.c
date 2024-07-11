#include<stdio.h>
void main(){
    int n,target,idx=0;
    printf("Enter Size of Array: ");
        scanf("%d",&n);
    int arr[n];
    printf("\nEnter Elements for the Array (in sorted order):\n");
    for(int i=0;i<n;i++)
        scanf("%d",&arr[i]);
    printf("\nEnter Target Element: ");
        scanf("%d",&target);
    //process starts
    int low=0,high=n-1;
    while(low<=high){
        int mid=(high-low+low+low)/2;
        if(arr[mid]>=target){
            idx=mid;
            high=mid-1;
        }
        else
            low=mid+1;
    }
    printf("\nEntered Array is:\n");
    for(int i=0;i<n;i++)
        printf("%d ",arr[i]);
    printf("\n\nThe lowerbound of %d is %d",target,idx);    
}