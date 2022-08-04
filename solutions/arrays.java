import java.net.Socket;
import java.text.Format;
import java.util.Arrays;

//1.[Build Array from Permutation](https://leetcode.com/problems/build-array-from-permutation/)
/* 
Input: nums = [0,2,1,5,3,4]
Output: [0,1,2,4,5,3]
Explanation: The array ans is built as follows: 
ans = [nums[nums[0]], nums[nums[1]], nums[nums[2]], nums[nums[3]], nums[nums[4]], nums[nums[5]]]
    = [nums[0], nums[2], nums[1], nums[5], nums[3], nums[4]]
    = [0,1,2,4,5,3]
*/


public class arrays {
    public static void main(String[] args) {
        int[] nums={0,2,1,5,3,4};
        int[] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i]=nums[nums[i]];
        }
        System.out.println(Arrays.toString(ans));
    } 
} 

//2.[Concatenation of Array](https://leetcode.com/problems/concatenation-of-array/)
/***
Input: nums = [1,2,1]
Output: [1,2,1,1,2,1]
Explanation: The array ans is formed as follows:
ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
ans = [1,2,1,1,2,1]
*/


public class arrays {
    public static void main(String[] args) {
        int[] arr={1,2,1};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }   
    }
}


//3.[Running Sum of 1d Array](https://leetcode.com/problems/running-sum-of-1d-array/)
/*
Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4]. 
*/

public class arrays {
    public static void main(String[] args) {
        int[] ques={1,2,3,4};
        int[] ans=new int[ques.length];
        int sum=0;
        for(int i=0;i<ques.length;i++){
            sum+=ques[i];
            ans[i]=sum;
        }
        System.out.println(Arrays.toString(ans));
    }
}


//4.[Richest Customer Wealth](https://leetcode.com/problems/richest-customer-wealth/)
/*
Input: accounts = [[1,5],[7,3],[3,5]]
Output: 10
Explanation: 
1st customer has wealth = 6
2nd customer has wealth = 10 
3rd customer has wealth = 8
The 2nd customer is the richest with a wealth of 10.
 */

public class arrays {
    public static void main(String[] args) {
        int[][] num={{1,5},{7,3},{3,5}};
        
        int high=0;
        for(int i=0;i<num.length;i++){
            //System.out.println(Arrays.toString(num[i])); //[1,5],[7,3],[3,5]
            int sum=0;
            for(int j=0;j<num[i].length;j++){
                sum=sum+num[i][j];
                //System.out.println(sum);
            }
            if(sum>high){
                high=sum;
            }
        }
        System.out.println(high);
    }
}


//5.[Shuffle the Array](https://leetcode.com/problems/shuffle-the-array/)
/*
Input: nums = [2,5,1,3,4,7], n = 3
Output: [2,3,5,4,1,7] 
Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].
*/


public class arrays {
    public static void main(String[] args) {
        int[] arr={2,5,1,3,4,7};
        int n=3;
        int[] ans=new int[arr.length];
        for(int i=0;i<n;i++){
            ans[i*2]=arr[i]; //for even
            ans[2*i+1]=arr[n+i];//for odd

        }
        System.out.println(Arrays.toString(ans));
    } 
}



//6. [Kids With the Greatest Number of Candies](https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/)
/**Input: candies = [2,3,5,1,3], extraCandies = 3
Output: [true,true,true,false,true] 
Explanation: If you give all extraCandies to:
- Kid 1, they will have 2 + 3 = 5 candies, which is the greatest among the kids.
- Kid 2, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
- Kid 3, they will have 5 + 3 = 8 candies, which is the greatest among the kids.
- Kid 4, they will have 1 + 3 = 4 candies, which is not the greatest among the kids.
- Kid 5, they will have 3 + 3 = 6 candies, which is the greatest among the kids. */
//Algo:find the largest number of the give array then compare.

public class arrays {
    public static void main(String[] args) {
        int[] num={2,3,5,1,3};
        String[] ans=new String[num.length];
        int n=3;
        int max=0;
        for(int i:num){
            if(i>max){
                max=i;
            }
        }
        System.out.println(max);
        for(int i=0;i<num.length;i++){
            int m=num[i]+n;
            if(max>=m){
                ans[i]="false";
            }
            else{
                ans[i]="true";
            }
            
    }
    System.out.println(Arrays.toString(ans));
  }
}

//7. [Number of Good Pairs](https://leetcode.com/problems/number-of-good-pairs/)
/*Given an array of integers nums, return the number of good pairs.
A pair (i, j) is called good if nums[i] == nums[j] and i < j.
Input: nums = [1,2,3,1,1,3]
Output: 4
Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
 */

public class arrays{
    public static void main(String[] args) {
        int[] arr={1,2,3,1,1,3};
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    if(i<j){
                    System.out.printf("The good pairs are (%d,%d)",i,j);
                    System.out.println(" "); 
                    count++;
                    }
                }
            }
        }
        System.out.println("output:"+count);
    }
}

//9. [Create Target Array in the Given Order](https://leetcode.com/problems/create-target-array-in-the-given-order/)
/* 
Input: nums = [0,1,2,3,4], index = [0,1,2,2,1]
Output: [0,4,1,3,2]
Explanation:
nums       index     target
0            0        [0]
1            1        [0,1]
2            2        [0,1,2]
3            2        [0,1,3,2]
4            1        [0,4,1,3,2]
*/

public class arrays {
public static void main(String[] args) {
        int[] nums={0,1,2,3,4};
        int[] index={0,1,2,2,1};
        int[] target=new int[nums.length];
        for(int i=index.length-1;i>=0;i--){
            for(int j=0;j<nums.length;j++){
                target[index[i]]=nums[j];
            }
        }
        System.out.println(Arrays.toString(target));
        }
        
}
