    public static Node createBSTfromALForMergeBST(ArrayList<Integer> arr,int start,int end){
        if(start>end){
            return null;
        }
        int mid=(start+end)/2;
        Node root=new Node(arr.get(mid));
        root.left=createBSTfromALForMergeBST(arr,start,mid-1);
        root.right=createBSTfromALForMergeBST(arr,mid+1,end);
        return root;
    }
