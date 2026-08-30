
class Solution {
    void nextPermutation(int[] arr) {
        // code here
        int n=arr.length;
        int p=-1;
        for(int i=n-1;i>0;i--){
            if(arr[i-1]<arr[i]){
                p=i-1;
                break;
            }
        }
        if(p==-1){
            reverse(arr,0,n-1);
            return;
        }
        for(int i=n-1;i>p;i--){
            if(arr[i]>arr[p]){
                int temp=arr[p];
                arr[p]=arr[i];
                arr[i]=temp;
                break;
            }
        }
        reverse(arr,p+1,n-1);
        }

        
        static void reverse(int[] arr,int s,int e){
            while(s<e){
                int temp=arr[s];
                arr[s]=arr[e];
                arr[e]=temp;
                s++;
                e--;
            }
        }
     }   
    