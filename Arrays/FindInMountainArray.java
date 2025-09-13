
interface MountainArray {
    public int get(int index);
    public int length();
}


class MountainArrayImpl implements MountainArray {
    private int[] arr;

    public MountainArrayImpl(int[] arr) {
        this.arr = arr;
    }

    @Override
    public int get(int index) {
        return arr[index];
    }

    @Override
    public int length() {
        return arr.length;
    }
}


class FindInMountainArray {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peek = peekElement(mountainArr);//to find the peek element
        int ans = orderAgnosticBinarySearch(target, mountainArr, 0, peek);//to find the answer
        int arrlength = mountainArr.length();

        if (ans != -1) { //if ans is found on asc part
            return ans;
        }
        return orderAgnosticBinarySearch(target, mountainArr, peek + 1, arrlength - 1);//if ans is not found on asc part
    }

    //To Find peek Element
    public int peekElement(MountainArray mountainArr) {
        int start = 0;
        int end = mountainArr.length() - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (mountainArr.get(mid) > mountainArr.get(mid + 1)) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

        //To search the target in both part
    public int orderAgnosticBinarySearch(int target, MountainArray mountainArr, int start, int end) {
        boolean asc = mountainArr.get(start) < mountainArr.get(end);

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == mountainArr.get(mid)) {
                return mid;
            }

            if (asc) {
                if (target > mountainArr.get(mid)) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (target < mountainArr.get(mid)) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

    
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 6, 4, 2, 3};
        MountainArray mountainArr = new MountainArrayImpl(arr);

        FindInMountainArray solution = new FindInMountainArray();
        int target = 3;
        int result = solution.findInMountainArray(target, mountainArr);

        System.out.println("Target found at index: " + result);
    }
}
