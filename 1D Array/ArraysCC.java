import java.util.Arrays;

public class ArraysCC {
    public static void printArray(int marks[]) {
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
    }

    public static void updateArray(int marks[], int rollNO) {
        rollNO += 1;
        for (int i = 0; i < marks.length; i++) {
            marks[i] += 1;
        }
        printArray(marks);
    }

    public static int linearSearch(int arr[], int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return i;
            }
        }
        return -1;
    }

    public static int getLargetstN(int arr[]) {
        int largeN = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (largeN < arr[i]) {
                largeN = arr[i];
            }
        }
        return largeN;
    }

    public static int getMIN_N(int arr[]) {
        int minN = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (minN > arr[i]) {
                minN = arr[i];
            }
        }
        return minN;
    }

    public static int binarySearch(int arr[], int key) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == key) {
                return mid;
            }
            if (key > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void reverseArray(int arr[]) {
        int first = 0;
        int last = arr.length - 1;

        while (first < last) {
            int temp = arr[last];
            arr[last] = arr[first];
            arr[first] = temp;
            first++;
            last--;
        }
    }

    public static void pairsArray(int arr[]) {
        System.out.println("[");
        int totalPairs = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("(" + arr[i] + "," + arr[j] + ")" + " ");
                totalPairs++;
            }
            System.out.println();
        }
        System.out.println("]");
        System.out.println("Total Pairs => " + totalPairs);
    }

    public static void printSubArrays(int arr[]) {
        int sum = 0;
        int totalSubArray = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                    sum += arr[k];
                }
                System.out.print("And Sum is => " + sum);
                totalSubArray++;
                System.out.println();
                sum = 0;
            }
            System.out.println();
        }
        System.out.println("Total SubArray => " + totalSubArray);
    }

    public static void maxSubArraySum(int arr[]) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }
                if (maxSum < sum) {
                    maxSum = sum;
                }
                sum = 0;
            }

        }
        System.out.println("Max Sum => " + maxSum);
    }

    public static void subSumPrefixArry(int arr[]) {
        int currSum = 0;
        int prefixArr[] = new int[arr.length];
        prefixArr[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            prefixArr[i] = prefixArr[i - 1] + arr[i];
        }

        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                currSum = i == 0 ? prefixArr[j] : prefixArr[j] - prefixArr[i - 1];
            }
            if (maxSum < currSum) {
                maxSum = currSum;
            }
            currSum = 0;

        }
        System.out.println("Max Sum => " + maxSum);
    }

    public static void kadans(int number[]) {
        int cs = 0;
        int ms = Integer.MIN_VALUE;

        for (int i = 0; i < number.length; i++) {
            cs += number[i];
            if (cs < number[i]) {
                cs = number[i];
            }
            ms = Math.max(cs, ms);
        }
        System.out.println("Max subArray sum => " + ms);
    }

    public static int trappedWater(int height[], int width) {
        int n = height.length;
        int leftMax[] = new int[n];
        int rightMax[] = new int[n];
        leftMax[0] = height[0];
        rightMax[n - 1] = height[n - 1];

        for (int i = 1; i < n; i++) {
            // if (height[i] >= leftMax[i - 1]) {
            // leftMax[i] = height[i];
            // } else {
            // leftMax[i] = leftMax[i - 1];
            // }
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }

        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }

        int trappedWater = 0;
        for (int i = 0; i < n; i++) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappedWater += (waterLevel - height[i]) * width;
        }
        return trappedWater;
    }

    public static int maxStockProfit(int prices[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (buyPrice < prices[i]) {
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(profit, maxProfit);
            } else {
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }

    // public static int numWaterBottles(int numBottles, int numExchange) {
    // return numBottles + ((numBottles - 1) / (numExchange - 1));
    // }

    public int numWaterBottles(int numBottles, int numExchange) {

        // We use Carry Approach

        int ans = numBottles;

        while (numBottles >= numExchange) {
            ans += numBottles / numExchange;
            int carry = numBottles % numExchange;
            numBottles = (numBottles / numExchange) + carry;
        }

        return ans;
    }

    

    public static void main(String[] args) {
        // int marks[] = new int[50];

        // Scanner sc = new Scanner(System.in);

        // marks[0] = sc.nextInt();
        // marks[1] = sc.nextInt();
        // marks[2] = sc.nextInt();

        // System.out.println("Marks of Physics " + marks[0]);
        // System.out.println("Marks of Chem " + marks[1]);
        // System.out.println("Marks of Math " + marks[2]);
        // System.out.println("Array Address " + marks);
        // System.out.println("Array Length " + marks.length);

        // int myMarks[] = { 73, 34, 35 };
        // int rollNO = 35;

        // updateArray(myMarks, rollNO);
        // System.out.println("Update Roll No. " + rollNO + "this is call by value
        // because our rollNo is not change");
        // System.out.println("Our array is works on call by reference b/c its value is
        // changed");

        // int linearSearch[] = { 1, 2, 3, 23, 34, 37 };
        // int number = 34;

        // System.out.println("Linear Search => key at index " +
        // linearSearch(linearSearch, number));

        // System.out.println("Largest Number => " + getLargetstN(linearSearch));
        // System.out.println("MIN Number => " + getMIN_N(linearSearch));

        // int binarySearch[] = { 1, 2, 3, 23, 34, 37 };
        // System.out.println("Index => " + binarySearch(binarySearch, 3));

        // int reverseArr[] = { 1, 2, 3, 23, 34, 37 };
        // reverseArray(reverseArr);
        // printArray(reverseArr);

        // int pairsArr[] = { 1, 2, 3, 23, 34, 37 };
        // pairsArray(pairsArr);

        // int subArr[] = { 1, -2, 6, -1, 3 };
        // subSumPrefixArry(subArr);

        // int kadanesNum[] = { -3, -5, -2, -8 };
        // kadans(kadanesNum);

        // int trappedArr[] = { 4, 2, 0, 6, 3, 2, 5 };
        // int width = 2;
        // System.out.println(trappedWater(trappedArr, width));

        int prices[] = { 7, 1, 5, 3, 6, 4, 2 };
        System.out.println(maxStockProfit(prices));

    }
}
