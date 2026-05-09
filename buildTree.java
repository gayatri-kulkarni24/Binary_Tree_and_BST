public static int idx=-1;
    public static Node buildTree(int nodes[]){
        idx++;
        if (idx >= nodes.length || nodes[idx] == -1) {
        return null;
        }

        Node newnode=new Node(nodes[idx]);
        newnode.left=buildTree(nodes);
        newnode.right=buildTree(nodes);
        return newnode;
    }  
