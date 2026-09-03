public static void printPath(ArrayList<Integer> path){
        for(int i=0;i<path.size();i++){
            System.out.print(path.get(i) + "->");
        }
        System.out.println("null");
    }
