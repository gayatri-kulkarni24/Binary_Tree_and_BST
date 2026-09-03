public static void printRootToLeaf(Node root,ArrayList<Integer> path){
        if(root==null){
            return;
        }
        path.add(root.data);
        if(root.left==null && root.right==null){
            printPath(path);
        }
        printRootToLeaf(root.left,path);
        printRootToLeaf(root.right,path);
        path.remove(path.size()-1);

    }
