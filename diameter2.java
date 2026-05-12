    public static Info diameter2(Node root){
        if(root==null){
            return new Info(0,0);
        }
        Info leftInfo=diameter2(root.left);
        Info rightInfo=diameter2(root.right);
        int selfDiam=leftInfo.ht + rightInfo.ht +1;
        int diam=Math.max(selfDiam,Math.max(leftInfo.diam,rightInfo.diam));
        int ht=Math.max(leftInfo.ht,rightInfo.ht)+1;
        return new Info(diam,ht);
    }
