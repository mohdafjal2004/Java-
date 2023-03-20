package ArrayRecursion;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 88, 9 };
        int target = 88;
        System.out.println(find(arr, target, 0));
        System.out.println(findIndex(arr, target, 0));// searching from first element
        System.out.println(findIndexLast(arr, target, arr.length - 1));// searching from last element

    }

    // find the element using Linear S.A in recursion
    static boolean find(int[] arr, int target, int index) {
        if (index == arr.length) {
            return false;
        }
        return arr[index] == target || find(arr, target, index + 1);
    }

    // find the index of the elemeent from start of the elements using L.S.A in
    // recursion
    static int findIndex(int[] arr, int target, int index) {
        if (index == arr.length) {
            return -1;
        }

        if (arr[index] == target) {
            return index;
        } else {

            return findIndex(arr, target, index + 1);
        }
    }

    // find the index of the elemeent from end of the elements using L.S.A in
    // recursion
    static int findIndexLast(int[] arr, int target, int index) {
        if (index < 0) {
            return -1;
        }

        if (arr[index] == target) {
            return index;
        } else {

            return findIndex(arr, target, index - 1);
        }
    }

}
