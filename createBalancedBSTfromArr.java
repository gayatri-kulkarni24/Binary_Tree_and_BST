public static Node createBalancedBSTfromArr(int arr[],int start,int end){
        if(start>end){
            return null;
        }
        int mid=(start+end)/2;
        Node root=new Node(arr[mid]);
        root.left=createBalancedBSTfromArr(arr,start,mid-1);
        root.right=createBalancedBSTfromArr(arr,mid+1,end);
        return root;
    }
