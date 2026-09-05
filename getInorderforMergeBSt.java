public static void getInorderforMergeBSt(Node root,ArrayList<Integer> arr){
        if(root==null){
            return;
        }
        getInorderforMergeBSt(root.left,arr);
        arr.add(root.data);
        getInorderforMergeBSt(root.right,arr);
    }
