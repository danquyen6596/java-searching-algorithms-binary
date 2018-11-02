package vn.codegym.QuyenLeSy;

public class BinarySearch {
    static int[] list = {2,4,5,8,9,11,13,15,24,27,30,36,39};

    static int binarySearch(int[] list, int key){
        int low = 0;
        int high = list.length - 1;
        while (high >= low)
        {
            int mid = (low + high)/2;
            if(key < list[mid])
                high = mid - 1;
            else if (key == list[mid])
                return mid;

            else
                low = mid + 1;
        }
        return -1;
    }
}
