/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 * public int get(int index) {}
 * public int length() {}
 * }
 */
// https://leetcode.com/problems/find-in-mountain-array/description/
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        /*
        1. Find the Peak element
        2. Binary Search in the Asc part(0,Peak Element)
        3. If not found, do Binary Search in Desc Part(peak+1,arrlength-1)
        -->Use OrderAgnosticBS
        */
        int arrLength = mountainArr.length();
        int peakIndex = findPeakElementIndex(mountainArr, arrLength);
        int answer = binarySearch(mountainArr, 0, peakIndex, target);
        if (answer != -1) {
            return answer;
        } else {
            return binarySearch(mountainArr, peakIndex + 1, arrLength - 1, target);
        }
    }

    int findPeakElementIndex(MountainArray mountainArr, int arrLength) {
        int start = 0, end = arrLength - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (mountainArr.get(mid) > mountainArr.get(mid + 1)) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return end;
    }

    int binarySearch(MountainArray mountainArr, int start, int end, int target) {
        boolean isAsc = mountainArr.get(start) < mountainArr.get(end);
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mountainArr.get(mid) == target) {
                return mid;
            }
            if (isAsc) {
                if (target < mountainArr.get(mid)) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > mountainArr.get(mid)) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
