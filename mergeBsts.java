public static Node mergeBsts(Node root1,Node root2){
        ArrayList<Integer> arr1=new ArrayList<>();
        getInorderforMergeBSt(root1,arr1);
        ArrayList<Integer> arr2=new ArrayList<>();
        getInorderforMergeBSt(root2,arr2);

        ArrayList<Integer> finalArr=new ArrayList<>();
        int i=0,j=0;
        while(i<arr1.size() && j<arr2.size()){
            if(arr1.get(i) <= arr2.get(j)){
                finalArr.add(arr1.get(i));
                i++;
            }else{
                finalArr.add(arr2.get(j));
                j++;
            }
        }
        while(i<arr1.size()){
            finalArr.add(arr1.get(i));
            i++;
        }
        while(j<arr2.size()){
            finalArr.add(arr2.get(j));
            j++;
        }
        return createBSTfromALForMergeBST(finalArr,0,finalArr.size()-1);
    }
