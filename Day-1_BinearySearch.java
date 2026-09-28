// Online Java Compiler (Editor)
// Write and run Java online using this editor.

class Main {
    public static int binary_search(int[] arr,int target){
        int left=0;
        int right=arr.length-1;
        while(left<right){
            int mid=(left+right)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(target<arr[mid]){
                right=mid-1;
            }
            else {
                left=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7,8,9};
        int target=7;
        int result=binary_search(arr,target);
        if (result!=-1){
            System.out.println("Target found "+result);
        }
        else{
            System.out.println("Target not found");
        }
    }
}
