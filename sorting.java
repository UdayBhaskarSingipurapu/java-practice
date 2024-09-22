public class sorting {
    public static void main(String[] args) {
        
        {
            // BUBBLE SORT  O(n^2)
            int[] arr={7,8,3,1,2};
            int n=arr.length;
            for(int i=0;i<n-1;i++){
                for(int j=0;j<n-i-1;j++){
                    if(arr[j] > arr[j+1]){
                        // SWAP
                        int t=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=t;
                    }
                }
            }
            for(int i=0;i<n;i++) System.out.print(arr[i]+ " ");
        }
        System.out.println();
        {
            // SELECTION SORT  O(n^2)
            int arr[]={8,6,9,10,2,3};
            int n=arr.length;
            for(int i=0;i<n-1;i++){
                int mini=i;
                for(int j=i+1;j<n;j++){
                    if(arr[j]<arr[mini]) mini=j;
                }
                int t=arr[i];
                arr[i]=arr[mini];
                arr[mini]=t;

            }
            for(int i=0;i<n;i++) System.out.print(arr[i]+ " ");
        }
        System.out.println();
        {
            // INSERTION SORT
            int arr[]={8,6,9,10,2,3};
            int n=arr.length;
            for(int i=1;i<n;i++){
                int k=arr[i],j=i-1;
                while(j>=0 && k<arr[j]){
                    arr[j+1]=arr[j];
                    j--;
                }
                arr[j+1]=k;
            }
            for(int i=0;i<n;i++) System.out.print(arr[i]+ " ");
        }
    }
}
