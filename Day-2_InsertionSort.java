

class Main {
    public static void insertion(int[] arr){
        for(int i=1;i<arr.length;i++){
            int key=arr[i];
            for(int j=0;j>=0;j--){
                if(arr[j]>key){
                    arr[j+1]=arr[j];
                    arr[j]=key;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={5,4,3,7,9};
        insertion(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        
    }
}
