package Practice;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {3,4,7,7,2,1};
//        ArrayList<Integer> list1 = findAllIndex1(arr,7,0,list);
        System.out.println(findAllIndex2(arr,7,0));
    }

    static boolean ls1(int[] arr,int target,int index){
        if(index == arr.length){
            return false;
        }
        return arr[index] == target || ls1(arr,target,index+1);
    }

    static boolean ls2(int[] arr,int target, int index){
        if (index == -1){
            return false;
        }
        return arr[index] == target || ls2(arr,target,index-1);
    }

    static int ls3(int[] arr,int target, int index){
        if(index == arr.length){
            return -1;
        }else if(arr[index] == target){
            return index;
        }
        return ls3(arr,target,index+1);
    }

    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex(int arr[],int target,int index){
        if(index == arr.length){
            return;
        }
        if(arr[index] == target){
            list.add(index);
        }
        findAllIndex(arr,target,index+1);
    }

    static ArrayList<Integer> findAllIndex1(int arr[],int target,int index,ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        return findAllIndex1(arr, target, index+1, list);
    }

    static ArrayList<Integer> findAllIndex2(int arr[],int target,int index){
        if(index == arr.length){
            return list;
        }
        ArrayList<Integer> list = new ArrayList<>();
        if(arr[index] == target){
            list.add(index);
        }
        list.addAll(findAllIndex2(arr,target,index+1));
        return list;
    }
}