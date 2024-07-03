public class Basic {

    // 1***) Find peak element(Adjacent vanda equal or greater) using binary search
    /*
     * 
     * // Left check and Right check satisfy vaye
     * //left: 0 ma ho ki left vanda thulo cha
     * //right: Last ma ho ki right vanda thulo cha
     * if ((mid == 0 || arr[mid] >= arr[mid - 1]) && (mid == n - 1 || arr[mid] >=
     * arr[mid + 1])) {
     * return mid;
     * }
     * //Mid ko el left neighbor vanda sano vaye search in left half natra right
     * half
     * 
     */

    // 2) Power of 2 ho ki haina n (Binary ma 100, 1000, 10000 vaye ho)

    /*
     * while(q>2){
     * rem = q%2;
     * if(rem != 0){
     * return false;
     * }
     * q=q/2;
     * }
     */

    // 3) CharArray to string
    // String strRev = new String(chArr);

    // 4)HashMap(map.get(key), map.put(key, value)) For example anagram check

    // map.continsKey(key)
    // map.containsValue(val)
    // map.isEmpty()
    // map.remove(key)
    // map.getOrDefault(key, default_value)
    // map.putAll(anotherMap);
    // map.clear();
    // int size = map.size();
    // map.replace("B", 3); (If B exists)
    // map.putIfAbsent("Z", 28);
    // map.replace("Y", 25, 27); (If only Y value is 25)

    // Add items in map
    /*
     * for(int i=0; i<N; i++){
     * 
     * //Add A[i]
     * if(map.containsKey(A[i])){
     * map.put(A[i], map.get(A[i]) + 1);
     * }else{
     * map.put(A[i], 1);
     * }
     * 
     * }
     */

    // Remove items from map
    /*
     * for(int i=0; i<N; i++){
     * //Remove B[i]
     * if(!map.containsKey(B[i])){
     * return false;
     * }else{
     * // Decrement the count
     * int newCount = map.get(B[i]) - 1;
     * 
     * // If the count reaches zero, remove the key from the map
     * if (newCount == 0) {
     * map.remove(B[i]);
     * } else {
     * // Otherwise, update the count in the map
     * map.put(B[i], newCount);
     * }
     * 
     * }
     * 
     * }
     * 
     */

    // 5***)Reverse in Group (Array) Reverse every sub-array group of size K

    /*
     * for (int i = 0; i < n; i += k) {
     * // Determine the end index of the current group
     * int end = Math.min(i + k - 1, n - 1);
     * 
     * // Reverse the current group
     * reverse(arr, i, end);
     * }
     */

    // 6***) A2[] subset ho ki haina A1[] ko

    // A1 ko map , A2 ko loop ma !containsKey vaye false otherwis map decrement

    // 7) Cyclically rotate an array by 1

    /*
     * int temp = arr[n-1];
     * for(int i= n - 1; i>=1; i--){
     * arr[i] = arr[i-1];
     * }
     * arr[0] = temp;
     */

    // 8) Fibonacci=> prev, current, next

    // 9) Linked list in java

    /*
     * Node current = head;
     * 
     * while(current.next != null){
     * 
     * current = current.next;
     * }
     * 
     * current.next = new_node;
     */

    // 10) Min in a BST (leftmost item)

    /*
     * int minValue(Node root) {
     * // code here
     * 
     * if(root == null){
     * return -1;
     * //target found (base case)
     * }else if(root.left == null){
     * return root.data;
     * }else{
     * //next iteration change node
     * return minValue(root.left);
     * }
     * 
     * 
     * }
     */

    // 11***) Find index of substring(x) at another string(s)

    /*
     * int strstr(String s, String x)
     * {
     * 
     * int sLen = s.length();
     * int xLen = x.length();
     * 
     * //All possible i can be start of the smaller string
     * for(int i=0; i<= sLen - xLen ; i++){
     * 
     * 
     * //match can still remain true if x loop terminates, thats our check
     * boolean match = true;
     * 
     * //
     * for(int j=0; j<xLen; j++){
     * 
     * //character of s at i+j can be start of smaller string (character of x at j)
     * //Each char should be checked so != used
     * //If single item is not equal, we dont need to iterate further so break
     * if(s.charAt(i+j) != x.charAt(j)){
     * match = false;
     * break;
     * }
     * }
     * 
     * 
     * if(match){
     * return i;
     * }
     * }
     * 
     * 
     * return -1;
     * 
     * }
     */

    // 12) Stack using arrays in java
    // top wala variable chaincha bcz we cant do .pop(), .push() & .shift() in java
    // push => arr[++top] = val;
    // pop => return arr[top--];

    // 13)preOrder traversal of a BST, ArrayList parameter ma passed, root.left
    // and root.right directly checked inside recursive function

    /*
     * if(root != null){
     * res.add(root.data);
     * preOrderHelper(root.left, res);
     * preOrderHelper(root.right, res);
     * 
     * }
     * 
     */

    // 14) Detect cycle in a linked list ma edge cases
    // Node fast = head.next;
    // while(fast != null && fast.next!=null)

    // 15**) N vanda muni ka perfect squares ko count (not including N)
    // return (int)Math.ceil(Math.sqrt(N)-1);

    // 16) Queue ma items are added at the rear
    // (also known as the back) and removed from the front .
    // if(rear>=capacity) Queue overflow
    // if(front>=rear) Queue is empty

    // 17) Stack with linkedlist ma:
    // push on top
    // pop from top

    // 18**) Identical linkedlist check ma (&& ra return both null)

    /*
     * while(curr1 != null && curr2 != null){
     * if(curr1.data != curr2.data){
     * return false;
     * }
     * 
     * curr1 = curr1.next;
     * curr2 = curr2.next;
     * }
     * 
     * return curr1==null && curr2==null;
     */

    // 19) Arrays sort using built in Arrays class

    // Arrays.sort(arr);

    // 20) Left rotation of array by d (Aagadi bata)

    /*
    *   reverse(arr, 0, d-1);//reverse the first d elements (agadi bata)
        reverse(arr, d, n-1);//reverse the last half d to n-1 elements
        reverse(arr, 0, n-1);//Full array reverse
    */

    // 21) Right rotation(pachadi bata) of array by k

    /*
        reverse(nums, n-k, n-1);//Reverse the last 'k' elements (pachadi bata)
     *  reverse(nums, 0, n-k-1);//reverse the first 'n-d' elements 
        reverse(nums, 0, n-1);//Full array reverse
    */

    // 22) Fill array with zeros and ones


    /*
     * // Fill the first N-onesCount elements with zeros
        Arrays.fill(A, 0, N-onesCount, 0);

        // Fill the next 7 elements with ones
        Arrays.fill(A, N-onesCount, N, 1);
    */
    

    // 23) Count leaves of BST


    /*
     * int countLeaves(Node node) 
    {
        if(node == null){
            return 0;
        }
        
        if(node.left==null && node.right==null){
            return 1;
        }
        
        return countLeaves(node.left) + countLeaves(node.right);
         
    }
    */


    //24) Insert in the middle of a linked list : You can perform action
    //on the slow pointer and you can return head;

    /*
     * while(fast.next != null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        
        new_node.next = slow.next;
        slow.next = new_node;
        
        return head;
    */


    //25) Max occuring char, collision vaye lexicographically smaller return

        //Foreach loop  in java:
        //for (char ch : line.toCharArray())
        //for (int count : map.values()) //Count matra herna
        //for (Character key : map.keySet()) //map.get(key)
        //for (Map.Entry<Character, Integer> entry : map.entrySet())

        //Operations that we can perform on last foreach loop:
        // map.put(ch, map.getOrDefault(ch, 0) + 1); //Add each char on map
        //entry.getKey(),entry.getValue()
        

    //26) Third largest find garna 3 wata variables rakheko

    /*
     *  if(a[i] > first){
	            third = second;
	            second = first;
	            first = a[i];
	        }else if(a[i] > second){
	            third = second;
	            second = a[i];
	        }else if(a[i] > third){
	            third = a[i];
	        }
    */


    //27) GCD and LCM

    //LCM*GCD = A*B

    //Two piles wala algorithm

    /*
     * static long gcd(long A, long B){
        
        if(B == 0){
            return A;
        }
        
        return gcd(B, A%B);
    }

    function euclideanAlgorithm(a, b) {
            // Ensure a is greater than or equal to b
            if (b > a) {
                [a, b] = [b, a];
            }

            // Iterate until b becomes 0
            while (b !== 0) {
                // Calculate the remainder using the modulo operator
                const remainder = a % b;

                // Update a and b for the next iteration
                a = b;
                b = remainder;
            }

            // The GCD is the last non-zero remainder
            return a;
        }

*/

    //28)Queue using LinkedList ma (push in rear, pop in front)

    //push garda rear==null vaye front=rear=new_node;

    //pop garda if front==null, rear pani null banaune







    //29) count the number of bits needed to be flipped to convert A to B.

    /*The XOR operation between two numbers returns a number with the 
    bits flipped where the two input numbers differ. */
    /*
     *  int res = a^b;
        
        int count = Integer.bitCount(res);
    */


    //30) Two item array return garna

    // return new long[]{min, second};



    //31) Find last occurence of 1 in a binary string

    //int index = s.lastIndexOf('1');




    //32****) number closest to N and divisible by M. If there are more
    // than one such number, then output the one having maximum absolute
    // value.


    /*
     * // Calculate the remainder when N is divided by M
        int rem = N % M;
        
        // Calculate the potential closest multiples of M
        int a, b;
        
        // For positive M, we calculate a and b as usual
        // For negative M, a and b should switch roles since we want to find closest negative multiples of M
        if (rem >= 0) {
            a = N - rem; // Closest multiple of M below N or at N
            b = a + M; // Closest multiple of M above N
        } else {
            a = N - rem; // Closest multiple of M above N or at N (rem is negative)
            b = a - M; // Closest multiple of M below N
        }
    */



    //33) Certain position (index) ma pugna in a LinkedList

    /*
     *  int count = 1;
       while(count<ind){
           curr = curr.next;
           count++;
       }
       
       return curr.data;
    */



    //34)Find the characters that are not common in the two strings A and B.
    
    
    //aMap ra bMap banauni ( aMap.put(ch, aMap.getOrDefault(ch, 0) + 1);)

    //aMap ko keys ma loop launi, !b ka keys 3rd List ma halne
       /*if (!bMap.containsKey(ch)) {
                uncommonChars.add(ch);
            }*/


    //bMap ko keys ma loop launi, !a ka keys 3rd List ma halne

    //3rd list sort garne ra string banayera return garne.

        
    

    //35) BST search for a value



    /*
     * target small vaye left ma jane natra right ma
     * null vaye false return target hit gare true return garne
    */



    //36) Remove consecutive characters (add if not same, first char always)


    /*
     * str.append(chArr[0]);
        
        for(int i=1; i<chArr.length; i++){
            
            if(chArr[i] != chArr[i-1]){
            
                str.append(chArr[i]);
            }
            
            
        }
     * 
    */


    //37***) Delete current node in Doubly Linked List

    //curr samma pugna (bich mai LinkedList end huna ni sakcha)

    /*
     * int count = 1;

        // Traverse the list to find the node at the specified position
        while (count < x) {
            if (curr == null) {
                // If the position is out of bounds, return the original head
                return head;
            }
            curr = curr.next;
            count++;
        }
    */

    //curr lai hatauni logic

    /*
     * if (curr.prev != null) {
            curr.prev.next = curr.next;
        }
        if (curr.next != null) {
            curr.next.prev = curr.prev;
        }
    */



    //38) Char manipulation in string or Integer:
    
    //Integer to string,
    //StringBuilder and append
    //foreach loop on charArray
    //Integer.parseInt

    /*
     * String str = String.valueOf(num);
        
        StringBuilder stb = new StringBuilder();
        
        for(char ch : str.toCharArray()){
            if(ch == '0'){
                stb.append('5');
            }else{
                stb.append(ch);
            }
        }
        
        return Integer.parseInt(stb.toString());
    */

    

    //39***) Earliest repeated char find garne
    /*eg. (Input:
    S = "geeksforgeeks"
    Output: g
    Explanation: g, e, k and s are the repeating
    characters. Out of these, g occurs first. )*/


    //Map of char and lastindex (LinkedHashMap)

    //if char repeat hit is found, lastindex is extracted and compared
    //with variable currentEarliestIndex and earliestRepeatedChar

    //else we put char in the map


    /*
     * Map<Character, Integer> map = new LinkedHashMap<>();
        
        int currentEarliest = S.length();
        char earliestRepeated = '#';
        
         for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);
            
           // If the character is already in the set, it is a repeated character
            if(map.containsKey(ch)){
                //Repeat hit vayo 
                
                 int firstIndex = map.get(ch);
                 
                 if(firstIndex < currentEarliest){
                     currentEarliest = firstIndex;
                     earliestRepeated = ch;
                 }
            }else{
                
               map.put(ch, i);
            }
           
        }
    */


    //40 Exceptionally odd(euta odd number of times appear garcha)

    //Add all items in Hashmap

    //Loop through entrySet() and find odd entry.getValue() and return 
    //its corresponding entry.getKey();



    //41 Insert in a Doubly LinkedList

    //move curr and prev_node and tya reach vayesi assign


    /*
         //right part
		new_node.next = curr;
		//left part
		new_node.prev = prev_node;
		
	    // Update pointers
        if (prev_node != null) {
            prev_node.next = new_node; // Link the previous node to the new node
        }
        
        if (curr != null) {
            curr.prev = new_node; // Link the next node to the new node
        }
        
    */    





    //42) Given a binary string S. The task is to count the number of 
    //substrings that start and end with 1. 

    //Ones indices(index) store garne array ma
    //i ,j=i+1 loop laye harek count means a new substring that 
    //starts at onesIndices.get(i) and ends at index onesIndices.get(j)
    //You can try an example


    /*
     *  // Calculate the number of substrings that start and end with '1'
        int count = 0;
        int size = onesIndices.size();
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                count++;
            }
        }
    */



    //Code to extract all substrings from a str in java

    /*
     *  for (int start = 0; start < binaryString.length(); start++) {
            // Iterate through each ending point of the substring
            for (int end = start + 1; end <= binaryString.length(); end++) {
                // Extract the substring from start to end
                String substring = binaryString.substring(start, end);
                // Add the substring to the list
                substrings.add(substring);
            }
        }
    */



    //43) Count number of items in a linkedlist

    /*
     * int count = 0;
        
        while(curr!=null){
            count++;
            curr = curr.next;
        }
    */

    
    //44) POsition of set bit in a single set bit binary number
    //Should be power of 2 so if condition checks that with bitwise
    //and operation with number below it
    
    /*
     * if((N & (N-1)) == 0){
            return Integer.numberOfTrailingZeros(N)+1;
        }
    */

    //45) Common of s1 and s2 removed and returned concatenated str


    //Only one hashset used : common
    //Stringbuilders, loop through s1 and s2 append char if not in common 




    //46) Anagram (S1 and s2 bata make anagram by only removing item) 
    //return count of number of items to be removed
    //New technique of using Array of 26
    

    /*
     *  int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        
        
        for(char ch : s.toCharArray()){
            freq1[ch - 'a']++;
        }
        for(char ch : s1.toCharArray()){
            freq2[ch - 'a']++;
        }
        
        int total_diff =0;
        
        for(int i=0; i<26; i++){

            //harek char ma count in freq1 ra freq2 ko difference ho chaiyeko
            total_diff += Math.abs(freq1[i] - freq2[i]);
        }
        
        return total_diff;
        
        
    */
    

    //47) Number is sparse or not,
    //Binary ma 1 lagatar aaye not sparse natra sparse
    
    //i ra i-1 ma '1'cha ki check garne

    //String binaryString = Integer.toBinaryString(n); 


    //48) Delete alternate characters of a string

/*
 *      int j=0;
        //Logic: New array created without new for loop
        for(int i=0; i<charArr.length; i+=2){
            resultArr[j++] = charArr[i];
        }
*/



//49)Alternate items in LinkedList delete garne technique:

/*
//curr.next chaina vane curr.next.next assign garna mildaina
 * while(curr!=null && curr.next!=null){
            
            curr.next = curr.next.next;

            //Naya shift vako node ma jane ani loop this till end
            curr = curr.next;
            
        }
*/


//50) Given an integer n, calculate the sum of the series
//1^3+2^3+4^3...


//(2n(n+1)​)2 is the answer


//51) Binary number to decimal


/*
 * for(int i=0; i<n; i++){
            if(chArr[i] == '1'){
                sum += (int)Math.pow(2, n-i-1);
            }
        }
*/




//52)Isogram test(Harek char different huna paryo)

//charArray ko loop, ch already cha vane return false , natra last
//ma return true


//53) Count size in a BST
//count+=size(node.left);

/*
 *  public static int getSizeHelper(Node node){
        int count = 0;
        
        if(node != null){
            count++;
            count += getSizeHelper(node.left);
            count += getSizeHelper(node.right);
        }
        
        return count;
    }
*/



//54) Sum of numbers in a string

//str char loop, if char is digit add to StringBuilder,
//if char not digit, stringbulder item to list or directly for sum. Empty sb
//if end of loop and stringbuilder has item, add it to list or send for sum.




//55)Elements in Range (Arr and range of int given, Arr ma all items 
//in range huna paryo)

//set create garne range ko, iterate through arr and remove items from set
//Last ma set empty vaye true return garni

//Alternative approach by chatGPT
//Boolean array of size B-A+1;

//loop through arr and if el is in range A to B, mark found[index] as true;
/*
 *   for (int i = 0; i < N; i++) {
            int element = arr[i];
            // Only mark the element if it's within the range [A, B]
            if (element >= A && element <= B) {
                // Calculate the index in the found array
                int index = element - A;
                found[index] = true;
            }
        }
*/




//56) Sort Matrix

//Create list of matrix items, sort it and create new matrix:

/*

        int[][] sorted = new int[N][N];
        
        
        int index = 0;
        
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                //matrixify
                sorted[i][j] = matrix.get(index++);
            }
        }
        
        return sorted;         
*/





//(****)57) Check for subsequence (A should be subsequence)
//order must match eg. (AXY is not subsequence of YADXCP)

//Two pointer approach (i, j)
//i ra j ka char in A and B equal vaye aarko i ma jane and check
//in the end i should be equal to lenA meaning all chars visited.

/*
 * while(i<lenA && j<lenB){
            if(A.charAt(i) == B.charAt(j)){
                i++;
            }
            j++;
        }
        
        return i == lenA;
*/


//58)First and last occurrences of X
//first and second variables track 
//first assigned first time, second assign in each new target find.

/*
 * for(int i=0; i<n; i++){
            if(arr[i] == x){
                if(first == -1){
                    first = i;
                }
                
                second = i;
            }
        }
*/


//59*****)Ways To Tile A Floor
/*Given a floor of dimensions 2 x n and tiles of dimensions 2 x 1, 
the task is to find the number of ways the floor can be tiled.
 A tile can either be placed horizontally i.e as a 1 x 2 tile or 
vertically i.e as 2 x 1 tile. return the answer with modulo 109+7*/


/*
 * 
class Solution {
    static int numberOfWays(int n) {
        // code here
        
        int MOD = 1000000007;
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }

        int horizontal = 1; // Base case for n=1
        int vertical = 1; // Base case for n=2

        for (int i = 3; i <= n; i++) {
            int newHorizontal = (vertical + horizontal) % MOD;
            int newVertical = horizontal;
            horizontal = newHorizontal;
            vertical = newVertical;
        }

        return (horizontal + vertical) % MOD;
        
    }
};
*/


//60) Set Kth bit from right

//Create mask with kth bit set (from right)
//perform OR operation with the mask


/*
 * 
 * 
        int mask = 1 << K;
        
        return mask | N ;
*/



//61) GCD of Array

//Use helper function for GCD of two numbers ( b = a % b)

//Harek sanga ko gcd last ma raheko answer

/*
 * int gcd = arr[0];
       
       for(int i=1; i<N; i++){
           gcd = gcdOfTwo(gcd, arr[i]);
       }
       
       return gcd;
*/


//62) Greater on right side (In O(N))

//Back loop, keep track of largest el found yet and assign each arr[i]
//to the curr_greatest element. Initialize curr_greatest with -1.




//63) Binary Search Tree sum of nodes



/*
 *  static int binarySumHelper(Node root){
        int sum = 0;
        
        if(root == null){
            return sum;
        }
        
        if(root != null){
            sum += root.data;
            sum += binarySumHelper(root.left);
            sum += binarySumHelper(root.right);
        }
        
        return sum;
    }
*/



//64) Find the Sum of Last N nodes of the Linked List

//starting positio(kth) ma pugne

//curr lai desired position ma lana while loop vanda for thik huncha
/*
 * for(int i=0; i<kth; i++){
          curr=curr.next;
      }

*/


//65) Pattern

//You can use StringBuilder and double j loops if you want




//66) Operating an array
/*
 * Given an array A of positive integers. Your task is to sort them 
 * in such a way that the first part of the array contains odd numbers 
 * sorted in descending order, 
 * rest portion contains even numbers sorted in ascending order.
*/

//Even ra odd ArrayList, sort them and arrayfy them arr[i++] = num;


//67)Check if a number is power of another number
//check if x and y are both 1 return true
//check if y is 1, return true
/*
 * while(power<=Y){
            
            if(power == Y){
                return 1L;
            }
            
            if (power > Long.MAX_VALUE / X) {
                break;
            }
            
            power *= X;
        }
*/


//68)Maximum in Struct Array

//arr[i].feet*12 + arr[i].inches;



//69) Anagram Palindrome
//check if str can be rearranged to form a palindrome
// count char occurence, if there are odd occurences more than once,
//its false

/*
 * 
 *  int oddCount = 0;
        for(int val: map.values()){
            if(val % 2 == 1){
                oddCount++;
            }
        }
        
        return oddCount>1 ? 0 : 1 ;
*/


//70)Merge two strings alternatively

//max kun ma cha tyo chaincha
//i<ch1.length vaye balla tesko append tyo gare euta loop ma sakincha




/*
 * int maxLength = Math.max(ch1.length, ch2.length);
        for (int i = 0; i < maxLength; i++) {
            // Append character from S1 if within bounds
            if (i < ch1.length) {
                mergedString.append(ch1[i]);
            }
            // Append character from S2 if within bounds
            if (i < ch2.length) {
                mergedString.append(ch2[i]);
            }
        }
*/





//71) Print the Kth Digit

//Given two numbers A and B, find Kth digit from right of A^B.

//for loop to find the exponent A^B
/*
 * for (int i = 0; i < B; i++) {
            result *= A;
        }
*/


//Kth digit from right using for loop
/*
 * for (int i = 1; i < K; i++) {
            result /= 10;
        }
*/

//// The Kth digit from the right is now the last digit of result
//return result % 10;

//72)GF series
/*
 * 
 * res[0]  = 0;
    res[1] = 1;
        
        for(int i=2; i<N; i++){
            res[i] = res[i-2]*res[i-2] - res[i-1];
        }
 */


 //73)Modular Node.

 /*
  * Given a singly linked list and a number k, you are required to complete the function modularNode() which returns the modular node of the linked list.
A modular node is the last node of the linked list whose Index is divisible by the number k, i.e. i%k==0.
Note: If no such node is available, return -1. We are following 1 indexing.

 */

 //keep track of curr.data when index%k==0;

 /*
  *  int index = 1;
        int val = -1;
        
        while(curr!= null){
            if(index % k ==0){
                val = curr.data;
            }
            
            
            curr = curr.next;
            index++;
        }
            
        return val;
 */


 //74)Count Non-Leaf Nodes in Tree

 /*
  * if(root!=null){
	        if(root.left!=null || root.right!=null){
	            count++;
	        }
	        count += countNonLeafNodesHelper(root.left);
	        count += countNonLeafNodesHelper(root.right);
	    }
 */



 //75)Pattern 8

 //nStars = 2*i - 1;
 //max = 2*n -1;
//for(int i=n; i>=1; i--)



//76)Extract Maximum

/*
 * Given a alphanumeric string S, extract maximum numeric value from S.
*/

//Extraction of numbers from str using StringBuilder
//Check ArrayList for the maximum



//77)Smallest divisible number

/*
 * Given a number N, find an integer denoting 
 * the smallest number evenly divisible by each number from 1 to n.
*/

//LCM of all from 1 to N
//LCM = A*B/GCD
//GCD (A,B) ma b = a % b wala (Eucledian algorithm)



//78)Finding Position

/*
 * Some people(n) are standing in a queue. A selection process
 *  follows a rule where people standing on even positions are 
 * selected. Of the selected people a queue is formed and again
 *  out of these only people on even position are selected. This 
 * continues until we are left with one person. 
 * Find out the position of that person in the original queue.
*/

// We are trying to find the largest power of 2 less than or equal to `n`.
// This can be found using the highest set bit in the binary representation of `n`.
 //eg 1001 vaye 8. 100 vaye 4 etc.
//1 << n-1 is the answer
        

//return Long.highestOneBit(n);





//79) Find unique

/*
 * Given an array of size n which contains all elements occurring in 
 * multiples of K, except one element which doesn't occur in multiple
 *  of K. Find that unique element.
*/



/*
 * for(Map.Entry<Integer, Integer> entry: map.entrySet() ){
            int val = entry.getValue();
            
            if(val % k != 0){
                return entry.getKey();
            }
        }
*/



//80)Good or Bad string

/*
 * In this problem, a String S is composed of lowercase alphabets and 
 * wildcard characters i.e. '?'. Here, '?' can be replaced by any of
 *  the lowercase alphabets. Now you have to classify the given String 
 * on the basis of following rules:

If there are more than 3 consonants together or more than 5 vowels
 together, the String is considered to be "BAD". A String is considered
  "GOOD" only if it is not “BAD”.

NOTE: String is considered as "BAD" if the above condition is satisfied 
even once. Else it is "GOOD" and the task is to make the string "BAD".
*/


//vowel ra cons count herni
//max exceed gare tei return 0
//wildcard ma just increment each values





//81)Find Number of Numbers

/*
 * Given an array A[]  of n elements. Your task is to complete the 
 * Function num which returns an integer denoting 
 * the total number of times digit k appears in the whole array.
*/


//Convert each A[i] to String, loop through each string and count++




//82)Check set bits

/*
 * Given a number N. You have to check whether every bit in the 
 * binary representation of the given number is set or not.
*/


//Sabai bits set huna 2^k-1 ko format ma huna parcha eg 3,7,15...

//so just check for return isPowerOfTwo(N+1) ? 1 : 0;



//83*****)Segregate even and odd in an array with O(n) of nlogn


//even ko count nikalne while loop ma chaincha
//

/*
 *   public void segregateEvenOddWithOrder(int[] arr) {
    int countEven = 0;
    int length = arr.length;
    for (int i = 0; i < length; i++) {
        if (arr[i]%2 == 0){
            countEven++;
        }
    }
    int i = 0;
    int j = i+1;
    while (i != countEven){
        if (arr[i]%2 == 0){
            i++;
            j = i + 1;

            //j ko right ma odd
            //i ko left ma even
            //Bich ma unchecked,
            //Odd encounter garne bittikai pointer ko right ma odd
            //ra left ma even rahancha
       
        }else if (arr[i]%2 == 1 && j < length){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j++;
        }
    }
}
*/




//84)Stack designer (Array to stack)


//Stack full print garne ramro tarika
/*
 * while(!s.isEmpty()){
        System.out.print(s.pop()+" ");
    }
*/



//85)Minimum difference pair

/*
 * Given an unsorted array, 
 * find the minimum difference between any pair in given array.
*/

//Sort array
//Consecutive differences ko lowest value return garne



//86) Maximum repeating number

/*
 *Given an array Arr of size N, the array contains numbers in 
 range from 0 to K-1 where K is a positive integer and K <= N.
  Find the maximum repeating number in this array. If there are two 
  or more 
 maximum repeating numbers return the element having least value.
*/

//Array items key ra frequency value ko freq array banako (freq[num]++)
//maxfrequecy track garni, max freq tie vaye smaller key line





/*
 * int maxRepeating(int[] arr, int n, int k) {
        // code here
        int[] freq = new int[k];
        
        // Count the frequency of each element
        for (int num : arr) {
            freq[num]++;
        }
        
        // Find the maximum frequency and the corresponding minimum element
        int maxFreq = 0;
        int minElem = -1;
        for (int i = 0; i < k; i++) {
            if (freq[i] > maxFreq) {
                maxFreq = freq[i];
                minElem = i;
            } else if (freq[i] == maxFreq) {
                minElem = Math.min(minElem, i);
            }
        }
        
        return minElem;
        
    }
*/


//87)Print an array in Pendulum Arrangement


/*
 * arr[] = {1, 3, 2, 5, 4}
Output :
5 3 1 2 4


arr[] = {11, 12, 31, 14, 5}
Output :
31 12 5 11 14
*/

//sort array
//left ra right variables track start from mid
//enter items in left and right in alternate fashion

/*
 * int left = mid;  // Starting from the center, going left
    int right = mid + 1;  // Starting from the center, going right
*/

/*
 * for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                // For even indices, place the next smallest number
                // in the left half
                res[left] = arr[i];
                left--;
            } else {
                // For odd indices, place the next smallest number
                // in the right half
                res[right] = arr[i];
                right++;
            }
        }
*/



//88)Count the characters

/*
 * Given a string S. Count the characters that have ‘N’ number of 
 * occurrences. If a character appears consecutively it is counted 
 * as 1 occurrence.
*/

//map ma enter garda consecutive lai treat as one

/*
 * for(int i=0; i<chArr.length; i++){
            char ch = chArr[i];
            //increment current in map
            map.put(ch, map.getOrDefault(ch, 0) + 1 );
            
            //harek consecutive check so while loop instead of if.else
            
            //****If next char is the same, skip it.
            while (i < S.length() - 1 && chArr[i] == chArr[i+1] ){
                i++;
            }
            
        }
*/


//89)Pattern 11

//consecutive 0's and 1's vaye
/*
 * for(int j=i; j>0; j--){
                if(j%2 == 0){
                    stb.append("0 ");
                }else{
                    stb.append("1 ");
                }
            }
*/


//90)Type of array


/*
 * You are given an array of size N having no duplicate elements. The array can be categorized into the following:
1.  Ascending
2.  Descending
3.  Descending Rotated
4.  Ascending Rotated
*/

//keep track of firstmin index, first max index, last min index, last max

/*
 * // Case 1: Ascending
        if (firstMinIdx == 0 && lastMaxIdx == n - 1) {
            return new pair(1, max);
        }
        // Case 2: Descending
        else if (firstMaxIdx == 0 && lastMinIdx == n - 1) {
            return new pair(2, max);
        }
        // Case 3: Descending Rotated
        else if (firstMaxIdx == lastMinIdx + 1) {
            return new pair(3, max);
        }
        // Case 4: Ascending Rotated
        else if (firstMinIdx == lastMaxIdx + 1) {
            return new pair(4, max);
        }
*/



//91)String with numbers at its end

/*Given string s that is appended with a number at last.
 The task is to check whether the 
length of string excluding that number is equal to that number. */

//Last ko extract using STB
//long numberAtEnd = Long.parseLong(stb.toString());
//Try catch for NumberFormatException (Long vanda ni badhi vaye num)

/*
 * try {
            long numberAtEnd = Long.parseLong(stb.toString());
            //return statements
        
        } catch (NumberFormatException e) {
            
            return 0;
        }
*/




//92)Minimum product of k integers

//sort the array and find product of first k elements
//Note: Since output could be large, 
//hence module 10^9+7 and then print answer.

// minProduct = (int)((long)minProduct * arr[i] % MOD);



//93)Permutations in array


/*
 * Given two arrays of equal size N and an integer K. 
 * The task is to check if after permuting both arrays,
 *  we get sum of their corresponding element greater than
 *  or equal to k i.e Ai + Bi >= K 
 * for all i (from 0 to N-1). Return true if possible, else false.
*/
//sort array a and reverse sort array b
//Reverse sort lai primitives haina object chaincha so, Long[] bArray = new Long[n];
//iterate through each element and if they dont satisfy return false
//condition => if(bArray[i] + a[i] < k){




//94)Matching Pair

/*
 * Given a set of numbers from 1 to N, each number is exactly 
 * present twice so there are N pairs. In the worst-case scenario, 
 * how many numbers X should be 
 * picked and removed from the set until we find a matching pair?
*/

// return N+1L;




//95)Sum of two fractions:

//Numerator ma multiply huncha LCM/den
//Fraction simplify if common found
//LCM = Math.abs((a / GCD(a, b)) * b);
//GCD found using eucledian algorithm; b = a % b

/*
 * 
        int denLCM = LCM(den1,den2);
        
        //Numerator ma multiply huncha LCM/den
        int newNum1 = num1 * (denLCM / den1);
        int newNum2 = num2 * (denLCM/den2); 
        
        int newNum = newNum1 + newNum2;
        
        
        //Fraction simplify if common found
        int common = GCD(newNum, denLCM);
        int num =  newNum/common;
        int den =  denLCM/common;
        
        System.out.println(num+"/"+den);
*/




//96)Height of heap


/*
 * Given a Binary Heap of size N in an array arr[].
 *  Write a program to calculate the height of the Heap.
*/

//So a heap with n nodes will have height floor(log2(n)) + 1

// return (int) Math.floor(Math.log(N) / Math.log(2));




//97) Circular linked list traversal

/*
 * do{
                System.out.print(curr.data+" ");
                 
                 curr = curr.next;
                 
             }while(curr != head);
*/




//98)longest substring containing '1'

//set ma contiguous counts add garne

/*
 * for(char ch: s.toCharArray()){
            if(ch == '1'){
                count++;
            }else{
                counts.add(count);
                count = 0;
            }
        }
        counts.add(count);
*/


//99)Sort the string

//Time optimal 
//Arrays.sort(charArray);
// reverse(charArray);


//100)Positive and negative elements

//Technique for Alternately entering arraylist items 

/*
 *      int i=0;
        int j=0;
        
        
        while(i<pos.size() && j<neg.size()){
            res.add(pos.get(i++));
            res.add(neg.get(j++));
        }
        
        while(i<pos.size()){
            res.add(pos.get(i++));
        }
        while(j<neg.size()){
            res.add(pos.get(j++));
        }
*/


//101****)Swap two nibbles in a byte

/*
 * Input:
N = 100
Output:
70
Explanation:
100 in binary is 01100100, 
two nibbles are (0110) and (0100)
If we swap the two nibbles, we get
01000110 which is 70 in decimal

*/


// return ((N & 0x0F) << 4) | ((N & 0xF0) >> 4);

//0x0F => 00001111 (N sanga & gare last ko 4 bits extract garna milcha)
//0xF0 => 11110000 (N sanga & gare first 4 bits extract garna milcha)
//left shift garna left nibble stays in left...
//right shift creates right nibble stays in right part
//Or opeartion merges them and gives the value;




//102)Reverse sub array

//left right swap . Make sure left means given left-1 and same with right



//103***)Count pair sum

/*
 * Given two sorted arrays(arr1[] and arr2[]) of size M and N of
 *  distinct elements. Given a value Sum. The problem is to count 
 * all pairs from both arrays whose sum is equal to Sum.
Note: The pair has an element from each array.
*/

/*
 * Input:
M=4, N=4 , Sum = 10
arr1[] = {1, 3, 5, 7}
arr2[] = {2, 3, 5, 8} 
Output: 2
Explanation: The pairs are: (5, 5) and (7, 3).  
*/

//i left bata jancha arr1 ko, j last bata jancha arr2 ko
//sum sano vaye i lai badhauni bcz its the lower end
//sum thulo vaye j lai ghatauni bcz its the higher end
//sum equal vaye count++


/*
 *  while(i<M && j>=0){
            if(arr1[i] + arr2[j] == x){
                count++;
                i++;
                j--;
            }else if(arr1[i] + arr2[j] < x){
                //sum sano vaye i agadhi badhauni coz its lower end
                i++;
            }else{
                //sum thulo vaye j ghatauni coz its higher end
                j--;
            }

        }
*/


//104)Remove Duplicates from unsorted array(return int array)

//Use set to find count of the array
//use that count to create new array
//Traverse through the original array and use set to insert to new array

/*
 * int[] res = new int[count];
        int index = 0;
        for(int num: A){
            if(set.contains(num)){
                res[index++] = num;
                set.remove(num);
            }
        }
*/



//105)Half N by M

/*
 * Given two values N and M. Give the value when N is halved M-1 times.
*/


/*
 *  
        int count = 0;
        int q = N;
        while(count<M-1){
            
            q = (int)Math.floor(q/2);
            count++;
        }
*/





//106****)Toggle bits in the given range

/*
 * Given a non-negative number n and two values l and r. 
 * The problem is to toggle the bits in the range l to r in
 *  the binary representation of n, i.e., to toggle bits from
 *  the lth least significant bit to the rth least significant 
 * bit (the rightmost bit as counted as the first bit).

    A toggle operation flips a bit 0 to 1 and a bit 1 to 0.

    (pachadi bata l to r)
*/


//XOR gare 1 sanga toggle huncha. SO suitable mask create garna parcha

/*
 * n = 10001 (17)
Mask =  00110 (l = 2, r = 3)  (least significant 2nd to 3rd bit set)
XOR  =  10111 (23)
*/

//int mask = ((1 << (r - l + 1)) - 1) << (l - 1);

/*
 *  this expression constructs a bitmask where the 
 * bits in the range [l, r] are set to 1 and all other 
 * bits are set to 0.
*/






//107)Absolute Difference of 1
/*
 * Given an array arr of size n. Print all the numbers less than k 
 * and should be such that the difference between every adjacent digit 
 * should be 1 in the array.
*/







//Adjacent diff 1 ho ki haina check:

/*
 * boolean isAdjacentTrue(long num){
        String str = Long.toString(num);
        
        for(int i=0; i<str.length() - 1 ; i++){
            long first = str.charAt(i) - '0';
            long second = str.charAt(i+1) - '0';
            
            if(Math.abs(first - second) != 1){
                return false;
            }
            
            
        }
        
        return true;
        
    }
*/


//ArrayList to array

/*
 * long[] ans = new long[res.size()];
        
        for(int i=0; i<res.size(); i++){
            ans[i] = res.get(i);
        }
*/


//108)Sum of primes


/*
 * Your task is to calculate sum  of primes present 
 * as digits of given number N.
*/


/*
 * for(int i=0; i<str.length(); i++){
            int num = str.charAt(i) - '0';
            
            if(isPrime(num)){
                sum += num;
            }
        }
*/


//check is prime 


//*****109)Thief trying to escape 

/*
 * A thief trying to escape from a jail has to cross N walls 
 * whose heights are given in arr[] each with varying heights.
 *  He climbs X feet every time. But, due to the slippery
 *  nature of those walls, every time he slips back by Y feet.
 *   Now the task is to calculate the total number of jumps
 *  required to cross all walls and escape from the jail.
*/

/*
 * Input: X = 4, Y = 1, N = 5
arr = {6, 9, 11, 4, 5}
Output: 12
Explaination: He will have to jump 2, 3, 4, 1 
and 2 times to cross all the walls.
*/


/*
 * int totalJumps(int X, int Y, int N, int arr[]){
        int jumps = 0, k, temp;
        
        // Iterating over the array of distances
        for(int i = 0;i < N;i++){
            
            // If the current distance is less than or equal to X,
            // increment the jumps count
    		if(arr[i] <= X)
    		    jumps++;
    		
    		// If the current distance is greater than X, additional
    		// jumps are required to cover the distance
    		else{
    			jumps++;
    			k = arr[i]-X;
    			
    			// Calculating how many additional jumps are required
    			temp = k/(X-Y);
    			
    			// If there are remaining distance after considering the
    			// additional jumps, increment the jumps count
    			if(temp*(X-Y) < k)
    			    jumps++;
    		    
    		    // Adding the additional jumps to the jumps count
			    jumps += temp;
    		}
    	}
    	
    	// Returning the total number of jumps required
    	return jumps;
    }
*/




//109***)Alternative Sorting



/*
 * Given an array arr[] of N distinct integers, output the array 
 * in such a way that the first element is first maximum and the 
 * second element is the first minimum, and so on.
*/


/*
 * Input: N = 7, arr[] = {7, 1, 2, 3, 4, 
                                5, 6}
Output: 7 1 6 2 5 3 4
Explanation:The first element is first 
maximum and second element is first 
minimum and so on.
*/




/*
 *  Arrays.sort(arr);
        
        int i=0;
        int j = arr.length - 1;
        
        boolean straight = true;
        while(i<N && j>=0){
            
            if(straight){
                
            res.add(arr[j--]);
            }else{
                
            res.add(arr[i++]);
            }
            straight = !straight;
        }
        
*/



//108)Remove repeated digits in a given number

/*
 * Given an integer N represented in the form 
 * of a string, remove consecutive repeated digits from it.
*/


//Char repeat vaye skip, natra push in stb

/*
 *   for(int i=0; i<str.length(); i++){
            
            char currentChar = str.charAt(i);
            stb.append(currentChar);
            
            while( i< str.length() -1 && str.charAt(i) == str.charAt(i+1)){
                i++;
            }
        }
        
*/


/*====================================================================*/


//109)Set the rightmost unset bit


//Find the position of the rightmost unset bit

/*
 * int position = 0;
        int temp = N;
        
        //last bit ma and garyo
        
        while ((temp & 1) == 1) {

            //values right tira saryo
            
            temp >>= 1;
            position++;
        }

        //unset vaye loop breaks
*/


//set the rightmost unset bit

// return N | (1 << position);




//110)Find duplicates under given constraints


/*
 * Given a sorted array A[] having 10 elements which contain 6 
 * different numbers in which only 1 number is repeated five times.
 *  Your task is to find the duplicate number using two 
 *  only.
*/

/*
 * public int findDuplicate(int A[])
    {
        // Your code goes here
       // Compare elements at positions 4 and 5
        if (A[4] == A[5]) {
            return A[4];
        } else {
            // If elements at positions 4 and 5 are different, the repeated number must be in the other segment
            // Since A is sorted, we know:
            // A[4] != A[5] means one of them is the start of the repeated sequence.
            // Check which one appears at positions 2 and 7 respectively.
            if (A[2] == A[3] && A[3] == A[4]) {
                return A[4];
            } else {
                return A[5];
            }
        }
    }
*/


//111)Check if the door is open or closed


/*
 * Given N doors and N persons. The doors are numbered from 1 to N 
 * and persons are given id’s numbered from 1 to N. Each door can 
 * have only two statuses i.e. open (1) or closed (0) . Initially 
 * all the doors have status closed. Find the final status of all 
 * the doors, when all the persons have changed the status of the 
 * doors of which they are authorized. i.e. if status open then
 *  change the status to closed and vice versa. A person with id ‘i’ 
 * is authorized to change the status of door numbered ‘j’ if ‘j’ is
 *  a multiple of ‘i’.
Note: A person has to change the current status of all the doors 
for which he is authorized exactly once.
*/


//toggle bits onb multiple of i

/*
 * int[] res = new int[N];
        
        
        for(int i=1; i<=N; i++){
            //Door toggle with multiples of i
            for(int j=i; j<=N; j=j+i){
                //toggle bits at position j
                 res[j - 1] = res[j - 1] == 0 ? 1 : 0;
            }
        }
        
        return res;
*/



//112*****)Remainder with 7

//Given a number as string(n) , find the remainder of the number
// when it is divided by 7


/*
 * // Your code here
        // Base case: If the string is empty or null, return 0
        if (num == null || num.length() == 0) {
            return 0;
        }

        int remainder = 0;
        int multiplier = 1;

        // Traverse the string from the rightmost digit
        for (int i = num.length() - 1; i >= 0; i--) {
            // Convert the character to an integer
            int digit = num.charAt(i) - '0';

            // Update the remainder*****
            remainder = (remainder + digit * multiplier % 7) % 7;

            // Update the multiplier
            multiplier = (multiplier * 10) % 7;
        }

        return remainder;
*/


//113)Middle Pattern

//Middle to end print using stb append
//start to middle print using same stb append




//114)Check if divisible by 4

/*
 * Given a number N. Check whether it is divisble by 4.
*/

/*
 * if(N.length() >= 2){
            
        int num = Integer.valueOf(N.substring(N.length()-2));
        return num % 4 == 0 ? 1 : 0;
        }else{
            int num = Integer.valueOf(N);
            return num % 4 == 0 ? 1 : 0;
        }
*/



//115***)Squares in a Matrix

/*
 * Input:
m = 2, n = 2
Output:
5
Explanation:
There are a total of 5 squares in a 2*2
matrix. Four 1*1 squares and one 2*2 square.
*/

// (m-k+1) * (n-k+1) technique


/*
 * long totalSquares = 0;
        int minSide = Math.min(m, n);
        
        for (int k = 1; k <= minSide; k++) {
            totalSquares += (long)(m - k + 1) * (n - k + 1);
        }
        
        return totalSquares;
*/



//116***)Minimum Difference among K


/*
 * Given an array of n integers and a positive number k.
 *  We are allowed to take any k integers from the given array. 
 * The task is to find the minimum possible value of the 
 * difference between maximum and minimum of k numbers.
*/

//sort array
//use sliding window protocol

/*
 * long minDiff = a[N-1] - a[0];
        
        for (int i = 0; i <= N - K; i++) {
            // Calculate the difference between the maximum and minimum values in the current window
            long diff = a[i + K - 1] - a[i];

            // Update the minimum difference if the current difference is smaller
            minDiff = Math.min(minDiff, diff);
        }
        
        return minDiff;
*/





//117)Nth Even Fibonacci Number


//3*n ma huncha hamro desired number

/*
 * const mod = 1000000007;
        //3X value of n
        N *= 3;
        //prestoring
        let dp = new Array(N + 5);
        //initializing dp[0] as 0
        dp[0] = 0;
        //initializing dp[1] as 1
        dp[1] = 1;
        for (let i = 2; i <= N; i++) {
            //as same as fibonacci formula f(i)=f(i-1)+f(i-2)
            dp[i] = (dp[i - 1] % mod + dp[i - 2] % mod) % mod;
        }
        //returning nth value
        return dp[N];
*/



//118***)Inverse Permutation


/*
 * Input:
N = 5
Arr[] = {2, 3, 4, 5, 1}
Output:
5 1 2 3 4
Explanation:
As index 1 has value 2 so 1 will b 
placed at index 2, similarly 2 has
3 so 2 will be placed at index 3
similarly 3 has 4 so placed at 4,
4 has 5 so 4 placed at 5 and 5 
has 1 so placed at index 1. 
*/

/*
 * for (int i = 0; i < n; i++) {
      res.set(arr[i]-1, i + 1); // Set the value at index arr[i] to i+1
    }
*/



//119)Unique Numbers


/*
 * In the given range [L, R], print all numbers having unique digits. 
 * e.g. In range 10 to 20 should print all numbers except 11.
*/


/*
 * for(int i=L; i<=R ; i++){
            
            String str = String.valueOf(i);
             if(isUnique(str)){
                 res.add(Integer.parseInt(str));
             }
        }
*/


/*
 * static boolean isUnique(String str){
        Set<Character> hashSet = new HashSet<>();
            
            for(char ch: str.toCharArray()){
                if(hashSet.contains(ch)){
                    return false;
                }
                hashSet.add(ch);
            }
            
        return true;    
    }
*/

//120*****)Sums of i-th row and i-th column

/*
 * Given a matrix A of dimensions NxM. Check whether the sum of the 
 * ith row is equal to the sum of the ith column.
Note: Check only up to valid row and column numbers i.e if the 
dimensions are 3x5, check only for the first 3 rows and columns,
 i.e. min(N, M).
*/

// rowSum += A[i][j]
// colSum += A[j][i]





/*
 * int sumOfRowCol(int N, int M, int A[][]) {
        // code here
        
        // Determine the minimum dimension to check up to
        int minDim = Math.min(N, M);

        // Loop through each index from 0 to minDim - 1
        for (int i = 0; i < minDim; i++) {
            // Calculate the sum of the i-th row
            int rowSum = 0;
            for (int j = 0; j < M; j++) {
                rowSum += A[i][j];
            }

            // Calculate the sum of the i-th column
            int colSum = 0;
            for (int j = 0; j < N; j++) {
                colSum += A[j][i];
            }

            // If the sums are not equal, return 0
            if (rowSum != colSum) {
                return 0;
            }
        }

        // If all sums are equal, return 1
        return 1;
    }
*/




//121)Power of Four
//Given a number N, check if N is power of 4 or not.

/*
 * int isPowerOfFour(long n)
    {
	// Your code here	
	    if (n <= 0) // If the number is non-positive, it can't be a power of 4
            return 0;
        
        // Loop until n becomes 1
        while (n > 1) {
            // If n is not divisible by 4, it's not a power of 4
            if (n % 4 != 0)
                return 0;
            // Divide n by 4 to check the next power of 4
            n /= 4;
        }
        
        return 1; // If the loop finishes and n is 1, it's a power of 4
	
    }
*/




//122**)Encrypt the string - 1


/*
 * Input:
s = "aabc"
Output: 1c1b2a
Explanation: aabc
Step1: a2b1c1
Step2: 1c1b2a
*/

//Consecutive chars ma count++ gardai jane while loop le




/*
 * // code here
        StringBuilder compressed = new StringBuilder();

        int i = 0;
        int n = s.length();
        
        while (i < n) {
            char currentChar = s.charAt(i);
            int count = 1;
            
            // Count occurrences of the current character
            while (i + 1 < n && s.charAt(i + 1) == currentChar) {
                count++;
                i++;
            }
            
            // Append character and its count to the compressed StringBuilder
            compressed.append(currentChar).append(count);
            
            // Move to the next character
            i++;
        }
        
        // Reverse the compressed string
        return compressed.reverse().toString();
*/




//123***)Check if the number is Fibonacci


// 5*N*N + 4 || 5*N*N - 4 perfect square vaye fibonacci number ho




//124***)Minimize string value

/*
 * Given a string of lowercase alphabets and a number k, the task
 *  is to find the minimum value of the string after removal of ‘k’ 
 * characters. 
The value of a string is defined as the sum of squares of the count 
of each distinct character.
For example consider the string “geeks”, here frequencies of characters
 are g -> 1, e -> 2, k -> 1, s -> 1 and value of the string
  is 12 + 22 + 12 + 12 = 7
*/

/*
 * Input: S = "abccc", K = 1
Output: 6
Explanation: Remove one 'c', then frequency
will be a -> 1, b -> 1, c -> 2.
12 + 12 + 22 = 6
*/

//Max frequencies bata k ghataudai lyauna parcha (Max heap chaiyo)
//Each decrement ma pheri heap ma rakhera new max bata ghatauni


/*
 *  int minValue(String S,int K) {
        // code here
        // Step 1: Count the frequency of each character
        int[] frequency = new int[26];
        for (char c : S.toCharArray()) {
            frequency[c - 'a']++;
        }
        
        // Step 2: Use a max-heap to store frequencies
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
        for (int freq : frequency) {
            if (freq > 0) {
                maxHeap.add(freq);
            }
        }

        //hamilai freq sanga matra sarokaar cha
        
        // Step 3: Remove k characters
        while (K > 0 && !maxHeap.isEmpty()) {
            int maxFreq = maxHeap.poll();
            maxFreq--;
            K--;
            if (maxFreq > 0) {
                maxHeap.add(maxFreq);
            }
        }
        
        // Step 4: Calculate the resulting value
        int minValue = 0;
        while (!maxHeap.isEmpty()) {
            int freq = maxHeap.poll();
            minValue += freq * freq;
        }
        
        return minValue;
    }
*/



//125)Rearrange the array


/*
 * n = 9
arr[] = {1, 9, 2, 8, 3, 7, 4, 6, 5}
Output:
1 9 2 8 3 7 4 6 5
Explanation:
Smallest number is 1. Largest number is 9. 
2nd smallest number is 2. Then 2nd largest
number is 8. And so on.
*/



/*
 * Arrays.sort(arr);
        
        int[] newArr = new int[n];
        
        
        int left = 0;
        int right = n - 1;
        boolean pickFromStart = true;
        for(int i=0; i<n; i++){
            if(pickFromStart){
                newArr[i] = arr[left++];
            }else{
                newArr[i] = arr[right--];
            }
            pickFromStart = !pickFromStart;
        }
*/


//126)Form largest number from digits


//Sort array in descending order and convert to string



//127)Pairs of prime number

//Find all pairs (sets) of prime numbers (p,q) such 
//that p*q <= n, where n is given number.


// n samma prime numbers extract from seive of eratosthenes

//isPrime true set garne paila
//is prime ho vane tesko multiples not prime ho
//sabai flag out vaye last ma array banauni ra return garne

/*
 * boolean[] isPrime = new boolean[n + 1];
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        for (int p = 2; p * p <= n; p++) {
            if (isPrime[p]) {
                for (int i = p * p; i <= n; i += p) {
                    isPrime[i] = false;
                }
            }
        }
*/




// i ra j ko loop ma i * j <= n vaye add to list



//128)Find N-th term in the series


/*Given a series 9, 33, 73, 129...  Find the n-th term of the series.*/

//difference(is AP): 24,40,56,72...
//difference of difference : 16

//return (sum of AP till n-1) + 9



//129)Pattern Jumping


/*
 * A frog starts at the point 0. In his first turn, he can 
 * make a jump of 1 unit. Now for all consequent turns, if 
 * the frog is currently at a distance x (from the start), 
 * his jump will take him x units forward. Given a leaf at
 *  a distance N, you have to find if the frog can reach that 
 * leaf or not.
*/

//2 ko power sth ma matra reach garcha (2,4,8,16,32...)

//Tesko binary ma herda N-1 sanga & operation garda zero aaucha

//return (N & (N-1)) == 0 ? "True" : "False";






//130)Java Operators(Arithmetic) | Set 1

/*
 * Given three numbers A,B and C. Find roots of quadratic 
 * equation Ax2 + Bx + C = 0. (A not equal to  0)
*/

//discriminant B*B - 4*A*C  zero vaye same eutai root,
//positive vaye two roots
//negative vaye no real roots





//131)Find the Number which contain the digit d


/*
 * Given two integer number n and d. The task is to find the number 
 * between 0 to n which contain the specific digit d.
*/



/*
 * String digit = Integer.toString(d);
        for(int i=0; i<=n; i++){
            if(Integer.toString(i).contains(digit)){
                res.add(i);
            }
            
        }
*/





//132)Length of Last word


/*
 * Given a string S consisting of upper/lower-case alphabets and 
 * empty space characters ‘ ‘. The string may contain spaces at
 *  the end. You will have return the length of last word which 
 * consists of alphabets only.
*/


//whitespace aaye stb reset
//Last ma whitespace vaye we need to store length but 
//last ma char nai thiyo vane we can simply find length of stb

//Hence we need a boolean flag (foundNonWhitespace) to identify it


/*
 * StringBuilder stb = new StringBuilder();
        int len = 0;
        boolean foundNonWhitespace = false;
        
        for(int i=0; i<chArr.length; i++){
            
            if(Character.isWhitespace(chArr[i])){
                //Last ma whitespace vaye reset huncha ra tyo preserve garna parcha
                if(foundNonWhitespace){
                    len = stb.length();
                    foundNonWhitespace = false;
                    
                }
                stb.setLength(0);
            }else{
                stb.append(chArr[i]);
                foundNonWhitespace = true;
                
            }
        }
        
        if(foundNonWhitespace){
            len = stb.length();
        }
        
        
        return len;
*/



//133)Longest increasing subarray


/*
 * Given an array containing n numbers. The problem is to find the 
 * length of the longest contiguous subarray such that every element
 *  in the subarray is strictly greater than its previous element 
 * in the same subarray.
*/

//for loop vitra check adjacent numbers for desired condition
//increase len of occurence of the condition
//if condition not met, we accumulate max value and reset len
//len = 1 cha because there will be a case in the end 
//where we will miss the last occurence of i+1 greater than i 



/*
 *  public long lenOfLongIncSubArr(long arr[], long n)
    {
        
        long maxLen =1;
        long len = 1;
        for(long i=1; i<n; i++){
            
            if(arr[(int)i-1] < arr[(int)i]){
                len++;
            }else{
                maxLen = Math.max(maxLen, len);
                len = 1;
            }
            
        }

        return Math.max(maxLen, len);
        
        
    }
*/



//134)Three distinct factors

/*
 * Given a positive integer N. The task is to check whether a 
 * number has exactly three distinct factors or not. 
*/


//perfect square ra square root prime number vaye balla 3 wata matra huncha




//135)Mega Sale


/*
 * Mr. Geek is a greedy seller. He has a stock of N laptops which 
 * comprises of both useful and useless laptops. Now, he wants to 
 * organize a sale to clear his stock of useless laptops. The 
 * prices of N laptops are Ai each consisting of positive and 
 * negative integers (-ve denoting useless laptops). In a day,
 *  he can sell atmost M laptops. Mr. Geek being a greedy seller 
 * want to earn maximum profit out of this sale. So, help him
 *  maximizing his profit by selling useless laptops.
*/

//negative prices ko abs value maxPrice heap ma rakhne
//empty navayesamma wa m wata nabechesamma poll garne.

/*
 *  for (int i = 0; i < m && !maxPrice.isEmpty(); i++) {
            maxProfit += maxPrice.poll();
        }
*/




//136***)Substrings with same first and last characters



/*
 * Given string s, the task is to find the count of all substrings 
 * which have the same character at the beginning and end.
 * 
 * Input: s = "abcab"
Output: 7
Explanation: a, abca, b, bcab, 
c, a and b
*/


//harek character ko number n vaye tyo end ma hune 
//substrings will be n*(n+1)/2  




//137)Count number of elements between two given elements in array


//left ko occurence ma found flag
//right ko occurence ma as it is bcz it accumulates


/*
 * int getCount(int arr[], int n, int num1, int num2)
    {
        //Complete the function 
        int right = -1;
        int left = n;
        
        bool found = false;    
        for(int i=0; i<n; i++){
           if(arr[i] == num2){
               right = i;
           }
           
           if(arr[i] == num1){
             if(!found){
               left = i;
               found = true;
            }
               
           }
        }
        
        if(found == false || right == -1 || left>=right){
            return 0;
        }
        
        
        return right - left - 1;    
        
        
    }
*/





//138)Maximum triplet sum in array


// first largest, second largest and third largest values needed,
//all should be initialized to Integer.MIN_VALUE;




//139)Fibonacci to N

//N negative, zero and 1 huda individual cases list garne

/*
 * int prev = 0;
        int curr = 1;
        
        while(true){
            int next = curr + prev;
            if(next>N){
                break;
            }
            
            res.add(next);
            prev = curr;
            curr = next;
            
        }
*/




//140***)Sorting Employees

//Array of objects 
//object name is node and has salary and name property
//sort based on salary and if equal compare names




//We need to create a new Comparator and pass in Arrays.sort as param

/*
 * Arrays.sort(arr, new Comparator<node>() {
            @Override
            public int compare(node o1, node o2) {
                int salaryComparision = Integer.compare(o1.salary, o2.salary);
                
                if(salaryComparision == 0){
                    return o1.name.compareTo(o2.name);
                }
        
            return salaryComparision;
            }
        });
*/





//141***)Triplet Family



/*
 * Given an array A of integers. Find three numbers such that sum of 
 * two elements equals the third element and return the triplet in a 
 * container result, if no such triplet is found return the container
 *  as empty.
*/

//Array sort garne, i ko back loop laune
//while(left<right) left = 0; right = i -1
//arr[left] + arr[right] = arr[i] vaye add to res
//sum arr[i] vanda sano vaye left++
//sum thulo vaye right--



//142***)Check if divisible by 11

//even position ka digit ko sum and odd ka digit ko sum nikalne
//Sum difference ko absolute value 11 le divide vaye true natra false

//char array use garecha
//evenSum += (int)(chArr[i] - '0');




//143)Check if a number can be expressed as x^y


/*
 * Given a positive integer N, find if it can be expressed as x^y 
 * where y > 1 and x > 0 and x and y both are both integers.

*/


//x ko loop y ko y++ wala while loop if Math.pow(x,y) <= N


/*
 *  for(int x=2; x*x<=N; x++){
            int y = 2;
            
            while(Math.pow(x,y) <= N ){
                if(Math.pow(x,y) == N){
                    return 1;
                }
                y++;
            }
        }
        
*/




//144)Check if given four points form a square


//all points distances 6 wata 
//nikalne tarika substring nikalne technique le(i ra j=i+1) ko loop


//4 wata distance same ra 2 wata diagonal huncha. diagonal = root 2* dist
//Array sort ra arr[0], arr[1] individually check


//distance ko satta distanceSquared matra nikale float to int pardaina

//2 wata points (x1,y1) and (x2,y2) passed as argument 
//int distSqr = distanceSquared(points[i] , points[j]);

/*
 * int distanceSquared(int pointA[], int pointB[]){
        int sumx = (pointB[0] - pointA[0]);
        int sumy = (pointB[1] - pointA[1]);
        
        return sumx*sumx + sumy*sumy;
        
    }
*/




//145)Map in c++

/*
 * for (const auto& pair : m) {
        cout << pair.first << " " << pair.second<< " ";
    }
*/



//146***)The Lazy Caterer's Problem


/*
 * Given an integer n, denoting the number of cuts that can be made 
 * on a pancake, find the maximum number of pieces that can be formed 
 * by making n cuts.
NOTE: Cuts can't be horizontal.
*/


//series bancha n, n-1, n-2....1
//return (int) (n*(n+1))/2 + 1;



//147 **)Perfect Squares in a Range

//a ko square root ko ceil ra b ko square root ko floor vitra ka ints count




//148)Left Rotate Matrix K times


/*
 * Given three integers N, M, and K and a matrix Mat of dimensions 
 * NxM. Left rotate the matrix K times.
*/



/*
 * N=3,M=3,K=2
Mat=[[1,2,3],[4,5,6],[7,8,9]]
Output:
3 1 2
6 4 5
9 7 8
Explanation:
Left rotating the matrix twice gives this result
*/

//There are two techniques


//1)Reverse (0,k-1) , Reverse (k, M-1) and Reverse(0, M-1) Technique


/*K = K % M;
 * for(int i=0; i<N; i++){
            
                reverse(Mat[i], 0 , K-1 );
                reverse(Mat[i], K , M-1 );
                reverse(Mat[i], 0 , M-1 );
            
        }
*/

//2)I J loop vitra new position patta launi


/*
 * int newPos = (j - K + M) % M;
                rotatedMat[i][newPos] = Mat[i][j];
*/








//149)Change all even bits in a number to 0


/*
 * Input: N = 30
Output: 10 
Explanation: Binary representation of 
11110. Bits at Even positions are 
highlighted. After making all of them 
0, we get 01010. Hence the answer is 10.
*/

//positions are 0,1,2,3,4 ... from left. 0 is also even




//Bits lai zero banauna & operation on with 0 on that pos and 1 on others

//so, mask banayera & garna sakincha

//mask ma just 0101010101 huna paryo

// mask = mask | (1 << i); vaneko 1s inject gareko i position ma.

/*
 * static long createMask(int len){
        
        
        long mask = 0L;
        for(int i=0; i<len; i++){
            
            if(i % 2 != 0){
                mask = mask | (1 << i);
            }
            
        }
        
        return mask;
    }
*/










//150)Message Spreading



/*
 * There are N students in a class, each in possession of a 
 * different funny story. 

They want to share funny stories with each other by sending 
electronic messages. Assume that a sender includes all the 
funny stories he or she knows at the time the message is sent 
and that a message may only have one addressee. What is the 
minimum number of messages they need to send to guarantee that 
every one of them gets all the funny stories?
*/

//return 2*N-2;








//151)Replace the Bit

/*
 * Given two numbers N and K, change the Kth (1-based indexing) bit from the left of the binary representation of the number N to '0' if it is  '1', else return the number N itself.

Example 1:

Input:
N = 13, K = 2
Output: 9
Explanation: Binary representation of 13 is
1101. The 2nd bit from left is 1, we make
it 0 and result is 1001 = 9 (decimal).

*/


//Length or bitcount chaiyo
//K from right (0 based indexing chaiyo)
//mask with kth bit set and if kth bit is already 0, no operation req
//if kth bit is 0, we toggle by performing N & ~mask



/*
 * public int replaceBit(int N, int K) {
        // Check if K is valid (within the bit range of N)
        int bitCount = (int) Math.floor(Math.log(N) / Math.log(2)) + 1;
        if (K > bitCount) {
            return N;
        }

        // Calculate the mask to toggle the Kth bit
        int mask = 1 << (bitCount - K);

        // If the Kth bit is already 0, return N
        if ((N & mask) == 0) {
            return N;
        }

        // Toggle the Kth bit to 0
        return N & ~mask;
    }
*/



//152)Last duplicate element in a sorted array

//pachadi bata aaune ra duplicates vetiye tei return garne


/*
 * for(int i=n-1; i>0; i--){
            if(arr[i] == arr[i-1]){
                res.set(0, i); // Instead of removing, set the first element to the index
                res.add(arr[i]);
                break;
            }
        }
*/





//153)Make a Distinct Digit Array


/*
 * Given an array nums of positive integers of size N. 
 * Find all distinct digits present in nums.
 

Example 1:

Input: nums = [131, 11, 48]
Output: 1 3 4 8
Explanation: 1, 3, 4, and 8 are only distinct
digits that can be extracted from the numbers
of the array.

*/


//for each num of nums, for each char of num, add unique to List

/*
 * ArrayList<Character> res = new ArrayList<>();
        
        for(int num: nums){
            String number = String.valueOf(num);
            for(char ch: number.toCharArray()){
                if(!res.contains(ch)){
                    res.add(ch);
                }
            }
            
        }
*/


//arrayfy the list, convert each char to int using minus '0' technique


/*
 *  int[] common = new int[res.size()];
        
        int j = 0;
        for(int i=0; i<res.size(); i++){
            common[j++] = (int) res.get(i) - '0';
        }
        
        
        
        Arrays.sort(common);
            
        return common;
*/





//154)Binary Shift to Divide


/*
 * A number N is given. Divide it in half by using the binary shift
 *  operator.
Use the floor value if the result is in decimal. If the number is 1,
 leave it as it is.
*/


//Just shift binary to right by 1 units

//return N>>1 ;



//155***)Check perfect square


/*
 * Given a positive integer n, check if it is perfect square or not.
NOTE: Try to solve the question using only addition and subtraction 
operation.
*/

//n=1+3+5+…+(2k−1)n=1+3+5+…+(2k−1).


/*
 * The sum of the first kk odd numbers is k2k2. Therefore, to 
 * check if nn is a perfect square, we can keep subtracting 
 * successive odd numbers (starting from 1) from nn. If we reach 0,
 *  nn is a perfect square. If nn becomes negative before reaching 0, 
 * then nn is not a perfect square
*/

/*
 * if(n<1){
            return 0;
        }
        
        int odd =1 ;
        
        while(n>0){
            
            n = n-odd;
            odd = odd+2;
        }
        
        return n==0? 1 : 0;
*/





//156) C++ | A Speed Breaker


/*
 * Write a program to display the floating number a with a 
 * given precision value b.

Example 1:

Input: a = 4.567, b = 2
Output: 
4.57
Explanation: Rounding a to two decimal
places.

*/



/*
 * void speedBreaker(double a, int b){
        // code here
        std::cout << std::fixed << std::setprecision(b) << a << std::endl;
    }
*/




//157)Sort the Half Sorted


/*
 * Given an integer array of which both the first halve and
 *  second halve are sorted. The task is to merge these two 
 * sorted halves of the array into a single sorted array.
Note: The two halves can be of arbitrary sizes (i.e. if first
 halve of size k then the second halve is of size N-k where 0<=k<=N).

Example 1:

Input:
N = 6
arr[] = {2 3 8 -1 7 10}
Output: -1 2 3 7 8 10 
Explanation: {2 3 8} and {-1 7 10} are sorted 
in the original array. The overall sorted 
version is {-1 2 3 7 8 10}
*/



//find the separation point

/*
 * static int findSeparationPoint(int arr[], int n) {
        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i - 1])
                return i;
        }
        return n;
    }
*/



//Merge halves using separation point k(as parameter mid)



/*
 * static void mergeHalves(int arr[], int start, int mid, int end) {
        int[] temp = new int[end - start + 1];
        int i = start, j = mid, k = 0;

        while (i < mid && j <= end) {
            if (arr[i] <= arr[j])
                temp[k++] = arr[i++];
            else
                temp[k++] = arr[j++];
        }

        while (i < mid)
            temp[k++] = arr[i++];

        while (j <= end)
            temp[k++] = arr[j++];

        // Copy sorted elements back to original array
        for (i = start, k = 0; i <= end; i++, k++)
            arr[i] = temp[k];
    }
*/





//158***)Average Count Array


/*
 * You are given an integer 'n' which denote the number of elements 
 * in an array a[ ] and an integer 'x'. You have to calculate the 
 * average of element a[i] and x and find out if that number exist 
 * in array or not. Do it for all the elements of array and store 
 * the count result in another array for each index i.

Note: Always take the floor value of the average.

Example 1:

Input : arr[ ] = {2, 4, 8, 6, 2} and X = 2
Output : 2 0 0 1 2
Explanation:
value of n is 5 and that of x is 2. 
The array is 2 4 8 6 2. We take x 
i.e. 2 and take average with a[0] 
whch is equal to 2. We found 2 resides 
in array at two positions (1st and 5th 
element) thus storing 2 in another 
array at 0th index. Similarly do for all 
elements and store the count in second 
array.

*/



//i loop ma harek ko avg nikalne ra j loop layera avg ko count herni ra
//count ArrayList ma halne. ArrayList initialize with zeros



/*
 * public static ArrayList<Integer> countArray (int arr[], int n, int x) {
        //Complete the function
        
        ArrayList<Integer> res = new ArrayList<>(n);
        
        for(int i=0; i<n; i++){
            res.add(0);
        }
        
        
        for(int i=0; i<n; i++){
            
            int avg = (arr[i] + x)/2;
            int count = 0;
            for(int j=0; j<n; j++){
                if(arr[j] == avg){
                    count++;
                }
                
            }
            
            res.set(i, count);
        }
        
        return res;
        
    }
*/







//159)Merge and Sort


/*
 * Given two arrays of length N and M, print the merged array in
 *  ascending order containing only unique elements.

Example 1:

Input:
N = 2
a[] = {1, 8}
M = 2
b[] = {10, 11}
Output:
answer[] = {1, 8, 10, 11}
Explanation:
The answer[] array after merging both
the arrays and removing duplicates is
[1 8, 10, 11]
You have to return the size of the array
formed ( 4 in this case) and update the
answer array in the function mergeNsort().
*/

//add both array elements in sets and sort them and add back to answer[]





//160)Duck Number

/*
 * A Duck number is a positive number which has zeroes present in it, 
 * For example, 3210, 8050896, 70709 are all Duck numbers. A number 
 * with only leading 0s is not considered as Duck Number. For example,
 * numbers like 035 or 0012 are not considered as Duck Numbers. A number
 *  like 01203 is considered as Duck because there is a non-leading 0 
 * present in it.
The task is to check whether the given number N is a Duck number or not.
*/



/*
 * // code here
        if (N == null || N.isEmpty()) {
            return false;
        }

        // Trim leading zeros but keep one if all zeros
        N = N.replaceFirst("^0+(?!$)", "");

        // If the trimmed number is zero
        if (N.equals("0")) {
            return false;
        }

        // Check for the presence of '0' in the remaining string
        return N.contains("0");
*/




//161)Reverse a string with spaces intact


/*
 * Given a string, your task is to reverse the string keeping
 *  the spaces intact to their positions.

Example 1:

Input:
S = "Help others"
Output: sreh topleH
Explanation: The space is intact at index 4
while all other characters are reversed.

*/

// create char array 
//left, right pointer , left ma " " aaye left++, right ma aaye right--
//else swap chars




//162)Maximum Area


/*
 * Given the maximum possible area of the right angle triangle for 
 * a fixed length of hypotenuse. The task is to find the length of 
 * hypotenuse.

Note: If the answer comes in Decimal, find it's Floor value.

Example 1:

Input:
N = 25
Output:
10
Explanation:
For a maximum area of 25 square Units
of a Right-angled Triangle,
the length of it's Hypotenuse is 10.
*/

// base and height equal huda ko case ma hypotenuse nikalne
// Hypotenuse = 2* sqrt(A)

/*
 * 
class Solution {
    static int getHypotenuse(Long N) {
        // code here
         // Calculate the length of the legs
        double x = Math.sqrt(2 * N);
        
        // Calculate the length of the hypotenuse
        double hypotenuse = x * Math.sqrt(2);
        
        // Return the floor value of the hypotenuse
        return (int) Math.floor(hypotenuse);
    }
};
*/




//163)Smallest power of 2 greater than or equal to n


/*Given a number N.Find the nearest number which is a power of 2 
and greater than or equal to N.
*/


//N vanda thulo sabai bit set vako int return garne


/*
 * if (N == 0)
            return 1;

        // Find the position of the leftmost set bit
        int position = 0;
        while ((1L << position) < N) {
            position++;
        }

        // Return 2 raised to the power of the position plus 1
        return 1L << position;
*/





//164)Shortest un-ordered subarray


/*
 * Given an array of n distinct elements. Find the length of shortest 
 * unordered (neither increasing nor decreasing) sub array in given 
 * array.
*/


//max vaye 3 wata huncha yo pattern ma:
//sano, thulo, sano 
//thulo, sano, thulo

/*
 * for(int i=0; i<n-2; i++){
            if(arr[i] < arr[i+1] && arr[i+1] > arr[i+2] || 
            arr[i] > arr[i+1] && arr[i+1] < arr[i+2] ){
                return 3;
            }
        }
*/




//165***)Parties and seats


/*
 * Given two arrays, one is array of political parties namely - 
 *  party, and their corresponding array of seats received - seats.
 *  You have to print the political parties in lexicographical sorted
 *  order along with their seats, and highest seats received by the
 *  party.

Input Format:
The first line of input contains T denoting the number of testcases.
 T testcases follow. Each testcase contains three lines of input. 
 The first line contains number of parties N. The second line 
 contains the names of the parties. The third line contains 
 the votes corresponding to each party.
*/


//Build Hashmap from two arrays
/*
 * HashMap<String, Integer> map = new HashMap<>();
        
        for(int i=0; i<n; i++){
            map.put(party[i], seats[i]);
        }
*/


//convert hashmap to treemap to sort keys in lexicographical order
//TreeMap<String, Integer> sortedMap = new TreeMap<>(map);


//print key val and max as well





//166****)Reducing Walls


/*
 * â€‹Input : arr[ ] = {5, 3, 2, 6, 8} and K = 5
Output : 2
Explanation:
Heights : 5 3 2 6 8 Ishaan can climb a 
wall with height atmost 5. So he climbs 
the first 3 walls easily. Now he has to 
use his power to reduce the height of the 
4th wall. After using his power, heights 
: 5 3 2 1 8, Now to climb the last wall, 
he again uses his power. Final heights 
: 5 3 2 1 3

*/



//count += (arr[i] - 1) /k;



//167)Count Sorted Rows


/*
 *Given two integers N and M and a matrix of dimensions N*M.
  Count all the rows in a matrix that are sorted either in strictly 
  increasing order or in strictly decreasing order.
*/


// isSorted(Mat[i]); vaye count++;

/*
 * static boolean isSorted(int[] nums){
        
        boolean desc = true;
        boolean asc = true;
        
        for(int i=1; i<nums.length; i++){
            if(nums[i-1] >= nums[i]){
                asc = false;
            }
            if(nums[i-1] <= nums[i]){
                desc = false;
            }
            
            
        }
        
        
        
        return desc || asc;
        
        
    }
*/


//168)Area of a triangle


/*
 * Given three sides of a triangle A, B and C in the form of integers. Find the area of the triangle.
Note: The triangle may not exist. In such cases, the area is 0.
*/


//(a+b > c && a+c> b && b+c >a) vaye balla valid triangle

//Semi perimeter wala formula le area niskincha

/*
 * double s = (double)(A+B+C)/2 ;        
    area = Math.sqrt(s*(s-A)*(s-B)*(s-C));
*/





//169)Celcius to Farenheit conversion

//F = Math.round((C * 9.0 / 5.0 + 32) * 100.0) / 100.0;






//170***)Largest product



/*
 * Given an array consisting of N positive integers, and an integer k 
 * .You have to find the maximum product of k contiguous elements in 
 * the array. Your task is to complete the function which takes three
 *  arguments .The first argument  is the array A[ ] and second argument
 *  is an integer N denoting the size of the array A[ ] and the third 
 * argument  is an integer k.The function will return and value 
 * denoting the largest product of sub-array of size k.
*/


// i loop from 0 to n-k
//j loop from i to i+k
//j loop ko product accumulate and see if it is max


/*
 * class GfG
{
    long findMaxProduct(int A[], int n, int k)
    {
	// Your code here
	    long max = Long.MIN_VALUE;
	    for(int i=0; i<=n-k; i++){
	        
	        long product = 1;
	        
	        for(int j=i; j<i+k; j++){
	            product *= A[j];
	        }
	        
	        max = Math.max(max, product);
	    }
	
	    return max;
    }
}
*/





//171)Same frequency in two halves


/*
 * Given a string S, find whether it fulfills the following criteria. 
When split from the middle, the string should give two halves having 
the same characters and same frequency of each character. If the 
number of characters in the string is odd, ignore the middle character.
*/

//we use freq array instead of map because we can decrement properly

// int[] freq = new int[26];

/*while loop vitra:
 * freq[chArr[low] - 'a']++;
    freq[chArr[high] - 'a']--;
 * 
*/

//Each frequency zero huna paryo


/*
 * for(int count: freq){
            if(count != 0){
                return false;
            }
        }
 */






//172)Good String


/*
 * Given a string s of length N, you have to tell whether it is good or 
 * not. A good string is one where the distance between every two 
 * adjacent character is exactly 1. Here distance is defined by
 *  minimum distance between two character when alphabets from
 *  'a' to 'z' are put in cyclic manner. For example distance 
 * between 'a' to 'c' is 2 and distance between 'a' to 'y' is also
 *  2. The task is to print "YES" or "NO" (without quotes) 
 * depending on whether the given string is Good or not.
*/


// a ra b ko cyclic difference yesto huncha:

/*
 * if(Math.abs(a-b)>12){
            charDiff = 26 - Math.abs(a-b);
        }else{
            charDiff = Math.abs(a-b);
        }
        
*/




//173)Count numbers divisible by M



/*
 * Given two numbers A and B which define a range, where A <= B. 
 * Find the count of total numbers in the given range [A … B] 
 * divisible by M.

Example 1:

Input: A = 6, B = 15, M = 3
Output: 4 
Explanation: 6, 9, 12, 15 are divisible
by 3.Hence answer is 4.

*/


//first multiple and lastmultiple in range nikalne

//*** int firstMultiple = A + (M - A % M) % M;

//int lastMultiple = B - B % M;


//return (lastMultiple - firstMultiple) / M + 1;







//174)Shortest direction


/*
 * A person wants to go from origin to a particular location, 
 * he can move in only 4 directions(i.e East, West, North, South)
 *  but his friend gave him a long route, help a person to find 
 * minimum Moves so that he can reach to the destination.

Note: You need to print the lexicographically sorted string.
 Assume the string will have only ‘E’ ‘N’ ‘S’ ‘W’ characters.
*/


//North and South cancel each other
//East and West cancel each other


//NEWS ko HashMap use garehuncha




//175)Series X1


/*
 * Given a series of numbers 2, 10, 30, 68, 130.., Identify the 
 * pattern in the series. You are given an integer X you need to
 *  find out the X'th number in the series.
*/

//(x*x*x + x) ho answer 




//176)Minimize sum of alternate product


/*
 * Given an array of even size consisting of positive integers. 
 * Your task is to find the sum after sorting the array, such that 
 * the sum of product of alternate elements is minimum.
*/

//sort ra while(left<right) ma:
//sum += arr[(int)left++] * arr[(int)right--];






//177)XOR of all elements


//non repeating bits are set

/*
 * Given a list A having N positive elements. The task to create 
 * another list such as ith element is XOR of all elements of  A 
 * except A[i].

Example 1:

Input:
A = [2, 1, 5, 9]
Output:
13 14 10 6
Explanation:
At first position 1^5^9 = 13
At second position 2^5^9 = 14
At third position 2^1^9 = 10
At last position 2^1^5 = 6
*/


//sabaiko xor garne pahila => XOR ^= A[i];

//total bata harek sanga xor garera array ma halne. Tei ho ans

/*
 * for (int i = 0; i < N; i++)
            A[i] = XOR ^ A[i];
*/



//178***)Magical String[Duplicate Problem]


/*
 * You are given a string S, convert it into a magical string.
A string can be made into a magical string if the alphabets are 
swapped in the given manner: a->z or z->a, b->y or y->b, and so on.  
 

Note: All the alphabets in the string are in lowercase.

 

Example 1:

Input:
S = varun
Output:
ezifm
Explanation:
Magical string of "varun" 
will be "ezifm" 
since v->e , a->z , 
r->i , u->f and n->m
*/



//char lai invert garne tarika:
//***char magicalChar = (char) ('a' + ('z' - ch));





//179)HashMap Operations

//Integer wrapper class use garne if val can be null bcz int cant be null

/*
 * Integer val =  hm.get(x);
        
        if(val == null){
            // System.out.print(-1);
            return -1;
        }else{
            // System.out.print(val);
            return val;
        }
*/




//180***)Making elements distinct


/*
 * Given a sorted integer array. We need to make array elements 
 * distinct by increasing values and keeping the array sum minimum 
 * possible. We need to print the minimum possible sum as output.

Note :- After increasing the values of the array , the sorted order 
should be maintained.

Example 1:

Input : arr[ ] = {2, 2, 3, 5, 6}
Output : 20
Explanation:
We make the array as {2, 3, 4, 5, 6}. 
Sum becomes 2 + 3 + 4 + 5 + 6 = 20
*/

//Array modify sanga matlab vayena, just accumulate gardai jane ho.

//prev vanne accumulate garne ho, pahila ko sanga arr[i] same vaye 
//1 increment garera accumulate natra arr[i] as it is.

/*
 * public static long minSum (int arr[], int n) {
        //Complete the function
        
        int prev = arr[0];
        int sum = arr[0];
        
        for(int i=1; i<n; i++){
            
            if(arr[i] <= prev){
                prev += 1;
            }else{
                prev = arr[i];
            }
            
            sum += prev;
           
        }
               
        return sum;
    }
*/


//181)Maximum Integer Value


/*
 * Given a string S of digits(0-9).Find the maximum value that can be
 *  obtained from the string by putting either '*' or '+' operators in
 *  between the digits while traversing from left to right of the string
 *  and picking up a single digit at a time.

Example 1:

Input: 
S="01230"
Output: 
9
Explanation: 
we have 01230.We traverse from 
left and pick zero.Now we encounter '1'. 
We see if 0*1 gives maximum or 0+1.Now we 
have ans=1.Now we traverse further.We 
encounter '2'.Now we see whether 1*2 gives 
max or 1+2.Now we have ans=3.Now we 
traverse further. We encounter'3'.
We see if 3*3 gives max or 3+3.
The ans is now 9.Now we traverse further. 
We encounter 0, we see if 9+0 gives max or 
9*0. The ans is now 9. We've traversed the
whole string so we stop.
*/

//plus garda thulo huncha ki multiply garda tyo assign gardai jane



/*
 * for(int i=1; i<chArr.length; i++){
            
            char ch = chArr[i];
            int num = Character.getNumericValue(ch);
            
            ans = Math.max(ans+num, ans*num);
            
        }
*/




//182***)Ishaan's Internship


/*
 * Ishaan wants to intern at GeeksForGeeks but for that he has to go 
 * through a test. There are n candidates applying for the internship 
 * including Ishaan and only one is to be selected.
Since he wants to qualify he asks you to help him. The test is as 
follows.
The candidates are asked to stand in a line at positions 1 to n and 
given a number k. Now, every kth candidate remains and the rest are 
eliminated. This is repeated until the number of candidates are less 
than k.
Out of the remaining candidates, the one standing at smallest position
 is selected. You need to tell Ishaan at position he must stand to get 
 selected.
*/


//highest power of k that divides n ho hamilai chaine.

//eg k=3 n=30 vaye ans=27 ho.
/*
 * int getCandidate(int n, int k) {
        int i = 0;
        while (n >= k) {
            // Divide n by k until it is no longer divisible
            n = n / k;
            i++;
        }
        // Calculate the highest power of k using exponential function
        int ans = (int) Math.pow(k, i);
        return ans;
    }
*/




//183)Sort first half in ascending and second half in descending


/*
 *Given an array arr of n integers, sort the first half of the 
 array in ascending order and second half in descending order. 
*/

//sort first half in ascending order
//Arrays.sort(arr, 0, n / 2);

// Sort the second half in descending order(first sort and reverse)
//Arrays.sort(arr, n / 2, n);
//reverse(arr, n / 2, n - 1);



//184)Repeated IDs

/*
 *  You are given array a[ ] of N elements having all printed IDs. 
 * Help him to get rid of the repeated IDs.
*/

/*
 * Input:
N = 5
a[ ] = {8, 8, 6, 2, 1}
Output:
8 6 2 1
*/

//to preserve the initial order of elements in a set use LinkedHashSet
//LinkedHashSet<Long> set = new LinkedHashSet<>();




//185)Special Series Sum


/*
 * Given the value of n, we need to find the sum of the series 
 * where i-th term is sum of first i natural numbers.

NOTE: Sum of the series 1 + (1+2) + (1+2+3) + (1+2+3+4) + …… + 
(1+2+3+4+…+n)
*/


//double loop ko pattern cha yesma

/*
 * for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                sum += j;
            }
        }
*/





//186)Multiply 2 Matrices


//matrixC[i][j] += matrixA[i][k]*matrixB[k][j];








//187***)Count zero




/*
 * Given a number d, representing the number of digits of a number.
 *  Find the total count of positive integers which have at-least one 
 * zero in them and consist d or less digits.
*/



//total numbers with digit d;  totalCount += 9 * Math.pow(10, d - 1);
//total non zero count; nonZeroCount += Math.pow(9, d);


/*
 * static long findCountUpto(long d){
        // code here
        long totalCount = 0;
        long nonZeroCount = 0;

        for (int i = 1; i <= d; i++) {
            totalCount += 9 * Math.pow(10, i - 1);
            nonZeroCount += Math.pow(9, i);
        }

        return totalCount - nonZeroCount;
    }
*/







//188****)How many pizzas ?




/*
 * Given two stacks of pizzas such that each contains 10 pizzas of 
 * varying radii. Geek can only eat a pizza from a stack if it is 
 * also present in the other stack, in the same order. The pizzas 
 * that he selects need not be continuous. Find the number of pizzas 
 * Geek can eat.

 

Example 1:

Input:
Stack1 = {891 424 945 741 897 514 692 221 678 168}
Stack2 = {702 952 221 614 69 753 821 971 318 364}
Output: 1
Explanation: There is only one common element.

*/




//Longest common subsequence ko question ho

//n by n cells banaune
//i,j hit vaye subsequent cells ko value badhaune
//return lcslen[10][10]


/*
 * for(int i = 0; i < 10; i++)
            for(int j = 0; j < 10; j++)
            {
                // If the elements at the same indices in stack1 and stack2 are equal, increment the LCS length
                if(stack1[i] == stack2[j])
                    lcslen[i+1][j+1] = 1 + lcslen[i][j];
                // Otherwise, take the maximum length from the adjacent cells
                else lcslen[i+1][j+1] = Math.max(lcslen[i+1][j], lcslen[i][j+1]);
            }
*/





//189)Why is Melody so chocolaty?

/*
 * Chunky gets happy by eating Melody.
Given an array of N elements, each element represents happiness 
chunky get by eating melody.
Chunky knows why melody is so chocolaty but will only tell you 
once you tell him the Max happiness he can get by eating two adjacent 
melodies.

Example 1:

â€‹Input : arr[ ] = {1, 2, 3, 4, 5}
Output : 9
Explanation:
At index 0, arr[0] + arr[1] = 3
At index 1, arr[1] + arr[2] = 5
At index 2, arr[2] + arr[3] = 7
...
In this way, 9 will be the answer.

*/


//Cool use of Math.max();


/*
 * // Calculate sum of current pair of adjacent elements
        int curSum = arr[i] + arr[i + 1];
        
        // Update maximum sum if current sum is greater
        maxSum = Math.max(maxSum, curSum);
*/




//190)Maximum Perimeter of Triangle from array




/*
 * Given an Array of non-negative integers. Find out the maximum 
 * perimeter of the triangle from the array.

Example 1:

â€‹Input : arr[ ] = {6, 1, 6, 5, 8, 4}
Output : 20
Explanation:
Triangle formed by  8,6 & 6. Thus 
perimeter 20.

*/


//pachadi bata loop laune, triangle sum satisfy gare tei return garne




/*
 * public static int maxPerimeter (int arr[], int n) {
        //Complete the function
        
        // Step 1: Sort the array in non-decreasing order
        Arrays.sort(arr);
        
        // Step 2: Start from the end of the array and check triplets
        for (int i = n - 1; i >= 2; i--) {
            // Check if the triplet arr[i-2], arr[i-1], arr[i] can form a triangle
            if (arr[i - 2] + arr[i - 1] > arr[i]) {
                // If they can form a triangle, return their perimeter
                return arr[i - 2] + arr[i - 1] + arr[i];
            }
        }
        
        // If no triplet satisfies the triangle condition, return -1
        return -1;
    }
*/


//191***)Repeated sum of digits



/*
 * Given an integer N, recursively sum digits of N until we get a 
 * single digit.  The process can be described below

If N < 10    
    digSum(N) = N
Else         
    digSum(N) = Sum(digSum(N))

 

Example 1:

Input:
N = 1234
Output:
1
Explanation:
The sum of 1+2+3+4 = 10, 
digSum(x) == 10 Hence 
ans will be 1+0 = 1
*/


//return 1 + (N - 1) % 9; 

/*
 * static int repeatedSumOfDigits(int N){
        // code here
        
        if(N<10){
            return N;
        }
        
        
        // Using the digital root concept
        return 1 + (N - 1) % 9;
        
    }
*/



//192***)Tough Competitors

/*
 * There are n competitors in an exam. Each competitor has his own 
 * skill value which is given by the array arr where arr1 is the 
 * skill of the first competitor, arr2 is the skill of second 
 * competitor and so on. Two competitors are said to be tough 
 * competitors if their skill difference is least i.e. they 
 * are very close in their skill values. Given n and an array 
 * arr as input, find the tough competitors among the n 
 * ompetitors and print the absolute of the difference of
 * their skill values.

Example 1:

Input:
n = 4
arr[] = {9, 4, 12, 6}
Output: 2
Explanation: As |9-4|=5, |9-12|=3, |9-6|=3,
|4-12|=8, |4-6|=2, |12-6|=6 so, the tough
competitors are competitors having skill
values 4, 6 having their skill difference
as 2.

*/



//Array sort gare adjacent mai huncha mindiff. So double loop pardaina








//193***)Perfect Array



/*
 * There is an array contains some non-negative integers. 
 * Check whether the array is perfect or not. An array is 
 * called perfect if it is first strictly increasing, then 
 * constant and finally strictly decreasing. Any of the three 
 * parts can be empty.

 

Example 1:

Input : Arr[] = {1, 8, 8, 8, 3, 2}
Output : Yes
Explanation:
We have an array [1, 8, 8, 8, 3, 2]. 
If we look in the range [0, 1] then 
we find that in this range the array is 
increasing, in the range [1, 3] the array 
is constant and in the range [3, 4] the 
array is decreasing.So, it satisfies the above 
condition then we return true.


*/

//initialize increasing with true and decreasing with false

// Increasing hit ma already decreasing cha vane return false;
//decreasing hit ma increasing cha vane inc lai false ra decreasing true garne





//194)Find the position of M-th item

/*
 * M items are to be delivered in a circle of size N. 
 * Find the position where the M-th item will be delivered
 *  if we start from a given position K. Note that items are
 *  distributed at adjacent positions starting from K.

 

Example 1:

Input:
N = 5, M = 2, K = 1
Output:
2
Explanation:
If we start from 1st position, the
2nd item will land at the 2nd position.
*/




//int position = (K + M - 1) % N;
// return position == 0 ? N : position;



//195)Elements before which no element is bigger


/*
 * You are given an array A of size N. The task is to find count 
 * of elements before which all the elements are smaller. First
 *  element is always counted as there is no other element before it.

 

Example 1:

Input : 
arr[] =  {10, 40, 23, 35, 50, 7}
Output : 
3
Explanation :
The elements are 10, 40 and 50.
No of elements is 3
*/



//array traversal from left ma max item hit huda count++;

/*
 * for(long i=0; i<n; i++){
            if(arr[(int)i] > max){
                max = arr[(int)i];
                count++;
            }
        }
        
        return count;
*/


//196**)Multiples Power


/*
 * Calculate the sum of all the multiples of 3 or 7 below the natural 
 * number N.

Example 1:

Input: 10
Output: 25
Explanation:
Numbers that are multiple of 3 or 7
are 3, 6, 7, 9 so sum will be 25.

*/

//sum of multiples of 3 below N
//sum of multiples of 7 below N
//sum of multiples of 21 below N

//we have an AP, N, A and D are given we need sum.
//last term = a + (n - 1) * d = diff + (num - 1) * diff = num * diff


/*
 * Sum = num/2 * (diff + num * diff)
    = num/2 * (diff * (num + 1))
    = num * (num + 1) / 2 * diff
*/



/*
 * public static long sumBelow(int top, int diff){
        long num = (top - 1) / diff; // Count of multiples below top
        long sum = num * (num + 1) / 2 * diff; // Sum of arithmetic series
        
        return sum;
    }
*/



//197)Friendly Array


/*
 * Like people, numbers are also friends with each other. 
 * Friendliness between any two numbers a and b is defined as
 *  the absolute difference between the two. Lower is this number 
 * more friendly the numbers are. Now you are given an array 
 * of numbers and you are required to find the friendliness of
 *  this array. This can be calculated as the sum of the friendliness 
 * of each element in the array with its closest friend in the 
 * same array.

Example 1:

Input:
N=3
arr[] = { 4,1,5 }
Output: 5
Explanation: Sum of absolute differences is
            |4-5| + |1-4| + |5-4| = 5
*/

//Sort array 
//harek item ko left ki right ma huncha nearest Math.min le patta launi


/*
 * long sumOfMinAbsDifferences(long arr[] ,int N)
    {

        Arrays.sort(arr);
        long sum = 0;
        
        for(int i=0; i<N; i++){
            
            long left = i>0 ? Math.abs(arr[i] - arr[i-1]) : Long.MAX_VALUE;
            long right = i<N-1 ? Math.abs(arr[i] - arr[i+1]) : Long.MAX_VALUE;
            
            sum += Math.min(left,right);
        }
        
        return sum;

    }
*/






//198)Count Pairs Odd Xor




/*
 * Given an array arr[] of N integers, the task is to find 
 * the number of pairs in the array whose XOR is odd.

Example 1:

Input: N = 3, arr[] = {1, 2, 3}
Output: 2
Explanation: All pairs of array
             1 ^ 2 = 3
             1 ^ 3 = 2
             2 ^ 3 = 1
*/


/*
 * 

 We can observe that:

odd ^ odd = even
odd ^ even = odd
even ^ odd = odd
even ^ even = even

Therefore total pairs in array whose XOR is odd will be equal to
 count of odd numbers multiplied by count of even numbers.
*/




//199)Check if divisible by 36



//divisible by 4 => Last two digits should be divisible by 4
//divisible by 9 => sum of digits should be divisible by 9



//200)Pronic Number

/*
 * A pronic number is a number which is the product of two consecutive 
 * integers. Find all Pronic Numbers less than  or equal to the given 
 * integer N.
The first few Pronic numbers are: 0, 2, 6, 12, 20, 30, 42, 56, 72, 90,
110, 132 and so on.


Example 1:

Input:
N = 6
Output:
0 2 6
Explanation:
0 is the product of 0 and 1.
2 is the product of 1 and 2.
6 is the product of 2 and 3.


//while loop of i and j increment in each iteration pronic = i*j

*/




//201)Find The Sequence



/*
 * Adobe is weak in the concepts of string. He is given a number N 
 * and has to find N terms of that series. The series is 1, 2, 5, 8,15.
 *  . . 

Example 1:

Input:
N = 8
Output:
1 2 5 8 15 28 51 94
Explanation:
For N = 8, series comes out to be:
1 2 5 8 15 28 51 94
*/


//next element is sum of last three elements
//use while loop with next, curr, prev, prev1





//202)Minimum sum of two elements from two arrays


/*
 * Given two arrays a[] and b[] of same size.Your task is to 
 * find minimum sum of two elements such that they belong to 
 * different arrays and are not at same index in their arrays.


Example 1:

Input : 
a[] = {5, 4, 13, 2, 1}
b[] = {2, 3, 4, 6, 5}
Output : 
3
Explanation :
We take 1 from a[] and 2 from b[]
Sum is 1 + 2 = 3.

 
Example 2:

Input : 
a[] = {5, 4, 13, 1}
b[] = {3, 2, 6, 1}
Output : 
3
Explanation :
We take 1 from a[] and 2 from b[].
Note that we can't take 1 from b[]
as the elements can not be at same
index. 
*/



//both array ko min(with index) ra second min(minA1,minB1) nikalne 
//indexA ra indexB same vaye return Math.min(minA + minB1, minA1 + minB);




//203***)Find the remainder


/*
 * Given a number N in the form of string, your task is to find the 
 * remainder when the number is divided by 7.

Note: The given number is very large and so the Input is taken as a 
String.

 

Example 1:

Input:
N = "98"
Output:
0
Explanation:
98 when divided by 7 gives a
remainder of 0.
*/

//traverse string from left, extracting the digit. In for loop,
//rem = (10*rem + digit) % 7;


//Last ma aako rem is the answer






//204)The AND Gate


/*
 * Given N bits to an AND - Gate find the output that will be 
 * produced. 
AND - Gate Table:
1 & 1 = 1
1 & 0 = 0
0 & 1 = 0
0 & 0 = 0
*/



//loop ma if any item is 0, tei return 0;
//if loop passed, return 1;





//205**)Composite Series

/*
 * Given a number N, print all the composite numbers less than 
 * or equal to N. The number should be printed in ascending order.

Example 1:

Input: N = 10
Output: 4, 6, 8, 9, 10
Explaination: From 1 to 10 these are 
the only composite numbers.
*/

//i loop for all natural numbers from 4 to N
//j loop from 2 to sqrt(i)

//if i%j == 0; its a composite hit so set flag and break j loop
//after end of j loop check the flag and add if its true


/*
 * for(int i=4; i<=N; i++){
            
             boolean isComposite = false;
            for(int j=2; j*j <=i; j++){
                if(i%j == 0){
                    isComposite = true;
                    break;
                }
                
            }
            
            if(isComposite){
                res.add(i);
            }
            
        }
*/




//206**)Factorial Number

/*
 * For a given number N, find whether it is a factorial number or not. A Factorial number is a number which is equal to the factorial value of other numbers.
 

Example 1:

Input:
N = 6
Output:
1
Explanation:
6 is factorial of 3
*/


//while loop check if still divisible by i. start i with 1 
//N = N/i and i++;
//In the end it should be 1 to be a factorial otherwise false




/*
 * static int isFactorial(int N) {
        //code here
        
        if(N<=0){
            return 0;
        }
        
        
        int i=1;
        
        while(N % i ==0){
            N = N/i;
            i++;
        }
        
        
        return N == 1 ? 1 : 0 ;
    }
*/




//207)Sum of large numbers

//i,j back loop, carry herni StringBuilder ma insert on first index garne




//208***)Gray Code



/*
 * You are given a decimal number n. You need to find the gray code 
 * of the number n and convert it into decimal.

Gray code is a binary numeral system where two successive values differ
 in only one bit.
For example, the sequence of Gray codes for 3-bit numbers is: 000,
 001, 011, 010, 110, 111, 101, 100, so G(4)=6.

Example 1:

Input:
n  = 7
Output:
4
Explanation:
7 is represented as 111 in binary form.
The gray code of 111 is 100, in the binary
form whose decimal equivalent is 4.
*/



//return n ^ (n >> 1);

//same bits except last bit, xor simply flips last bit



//209)Maximum weight difference


/*
 * Given an array arr of size n. The task is to choose k numbers
 *  from the array such that the absolute difference between the 
 * sum of chosen numbers and the sum of remaining numbers is maximum.

Example 1:

Input:
n = 5, k = 2
arr[] = {8, 4, 5, 2, 10}
Output: 17
Explanation: If we select 2 and 4,
then abs((2+4) - (8+5+10)) = 17.

*/


//sort garne, last k items select and find diff with remaining Or,
//first k items select and find diff with remaining
//Max diff wala return garne




//210)The Modulo Task



/*
 * Given an integer N. FInd an integer K for which N%K is the 
 * largest ( 1 <= K < N).

 

Example 1:

Input:
N = 3
Output:
2
Explanation:
3%1 = 0
3%2 = 1
So, the modulo is highest for 2.
*/

//Half ko 1 step mathi ko value ma huncha highest remainder

//return (long)N/2 + 1;





//211)Evaluate the expression


/*
 * Given a number n, find the value of below expression:
            f(n-1)*f(n+1) - f(n)*f(n)    where f(n) is nth Fibonacci. 
 

Example 1:

Input : n = 5
Output: -1
Explanation: f(4) = 3, f(5) = 5
f(6) = 8. 3 * 8 - 5 * 5 = -1

*/


//pattern n even vaye 1 natra -1 huncha

// return n % 2 == 0 ? 1 : -1 ;





//212)Total distance travelled in an array



/*
 * You are given an array arr[] of size N.
The array consists of a permutation of the set {1, 2, 3, … , N} for 
some positive integer N. You have to start at the position which has 
1 in the array and then travel to the position which has 2. Then from 2,
 you travel to 3 and so on till you reach the position which has N.
When you travel from Arr[i] to Arr[j], the distance travelled is
 | i– j |.
Find the total distance you have to travel to reach N when you 
start from 1.


Example 1:

Input:
N = 5
Arr[] = {5, 1, 4, 3, 2}
Output: 7
Explanation: The numbers and their respective 
indices are given below:
1->1
2->4
3->3
4->2
5->0
Total distance =|4-1|+|3-4|+|2-3|+|0-2| 
= 3+1+1+2 = 7.

*/


//Indices lai TreeMap ma rakhne (key based sorting huncha)
//values lai array ma rakhne
//array ko consecutives ko abs difference nikalne ra accumulate garne





//213**)K-th distinct element



//k wata distinct elements pachi ko distinct element nikalne


/*
 * Given an array of n integers. Find the kth distinct element.

Example 1:

Input: 
n = 6, k = 2
arr = {1, 2, 1, 3, 4, 2}
Output:
4
Explanation: 1st distinct element will be 3
and the 2nd distinct element will be 4. As 
both the elements present in the array only 1 
times.

*/

//Array ko HashMap banaune


/*
 * int distinctCount = 0;
        for (Map.Entry<Integer, Integer> entry : elementCount.entrySet()) {
            if (entry.getValue() == 1) { // Check if the element is distinct
                distinctCount++;
                if (distinctCount == k) {
                    return entry.getKey(); // Return the k-th distinct element
                }
            }
        }
*/



//214)King's War


/*
 * King is getting ready for a war. He know his strengths and weeknesses
 *  so he is taking required number of soldiers with him. King can only 
 * defeat enemies with strongest and weakest power, and one soldier can 
 * only kill one enemy. Your task is to calculate that how many soldiers 
 * are required by king to take with him for the war.
Note: The array may contain duplicates.
 

Example 1:

Input:
N = 2
A[] = {1, 5}
Output:
0
Explanatation:
The king will itself be able to defeat all the enemies.
*/

// return n - maxCount - minCount; 

/*
 * for(long i=0; i<n; i++){
             if(arr[(int)i] > max){
                 max = arr[(int)i];
                 maxCount = 1;
             }else if(arr[(int)i] == max){
                 maxCount++;
             }
             if(arr[(int)i] < min){
                 min = arr[(int)i];
                 minCount = 1;
             }else if(arr[(int)i] == min){
                 minCount++;
             }
         }
*/




//215)Stuffs Division

/*
 * Your are given N students with some goodies to be distrubuted among 
 * them such that student at ith index gets exactly i amount of goodies 
 * (considering no wastage). The goodies has already been distributed 
 * by some other. Your task is to check if it can be redistributed such 
 * that student at ith index gets i amount of goodies.
 

Example 1:

Input:
N = 5
Arr = {7, 4, 1, 1, 2}
Output:
YES
Explanation:
Since, all the goods can be
redistributed as 1 2 3 4 5 
(ith students get i number of 
goodies).So, output is YES.
*/


//sum of array nikalne
//sn of AP till n nikalne
//return sum == sn;




//216)Trimorphic Number


/*
 * Input: N = 24
Output: 1
Explaination: 243 = 13824. The cube is ending with 24.
*/


//Right bata last digits check gardai aaune


/*
 * while(n > 0){
            // If any digit does not match, return 0.
            if(n%10 != cubed%10)
                return 0;
            // Remove the last digit from N and cubed.
            n /= 10;
            cubed /= 10;
        }
        // If all digits matched, return 1.
        return 1;
*/



//217)Sum the common elements



/*
 * You are given two arrays of size n1 and n2. Your task is to find all 
 * the elements that are common to both the arrays and sum them. If
 *  there are no common elements the output would be 0.

Note: The arrays may contain duplicate elements. However, you need to 
sum only unique elements that are common to both arrays and answer 
may be too large so return it with modulo (109+7) .

 

Example1:

Input:
5 6
1 2 3 4 5
2 3 4 5 6 7
Output: 14
Explanation: Common unique elements in both arrays are 2, 3, 4 and 5 so 
answer will be 2+3+4+5 = 14
*/

//set1 ma arr1 elements halne
//loop through arr2, if item is in set1, add it to set2
//sum set2






//218)Strange Sort - copy


/*
 * Given an array A of non-negative integers. Sort the array in
 *  ascending order such that element at the Kth position in unsorted 
 * array stays unmoved and all other elements are sorted. 

Example 1:

Input:
N = 5, K = 2
arr[] = {3 12 30 79 2}
Output: 2 12 3 30 79
Explanation: The element at the 2nd 
position (12) remains at its own place 
while others are sorted.

*/



//New array ma K-1 item bahek aaru sabai rakhne
//New array sort garne
//New array to old array with item at its position

/*
 * for(int i=0; i<N; i++){
            if(i == index){
                A[i] = item;
            }else{
                A[i] = newArr[j++];
            }
        }
*/




//219***)Sum of Consecutives



/*
 * Given a number n, the task is to check whether it can be 
 * expressed as a sum of two or more consecutive numbers or not.
NOTE: Return "1" if number can be expressed as sum of consecutives 
else "0". (Without the double quotes)

Example 1:

Input: n = 10
Output: 1 
Explanation: It can be expressed as sum of 
two or more consecutive numbers 1+2+3+4.

*/

//power of 2 lai bahek all others can be expressed as that sums.




//220)Interesting Patterns

/*
 * N = 4
Output:
4444444 
4333334 
4322234 
4321234 
4322234 
4333334 
4444444
*/


//Mathi ko 4 wata banaune ra tala ko lai mirroring garne

/*
 * ans[i] = stb.toString();
            ans[num - i - 1] = stb.toString();
*/


//harek row ma decreasing, equal ra increasing cha

/*
 * for (int j = 0; j < i; j++) {
                stb.append(N - j);
            }

            // Middle part: repeating N-i
            for (int j = 0; j < num - 2 * i; j++) {
                stb.append(N - i);
            }

            // Last part: increasing to N
            for (int j = i - 1; j >= 0; j--) {
                stb.append(N - j);
            }
*/



//221)Tracks



/*
 * Vishesh, who doesn't like maths, has to certify v-shaped tracks. 
 * A track is valid if it satisfies the following conditions :

1. There must be a constant difference between the height of pillars 
(not zero) of a track. For eg., if the heights of first two pillars 
are 7 and 5, then height of 3rd pillar must be 3. As 7-5=2 & 5-3=2.

2. The height of middle pillar must be always 1.

3. Number of pillars on the left side must be equal to the number of 
pillars on the right side of middle pillar. And their heights must 
be also equal. for example: Track with pillar heights [3 2 1 2 3] is 
a valid track. 
Help him in finding the valid tracks.

 

Example 1:

Input:
N = 3
A[] = {2, 1, 2}
Output:
Yes

*/

//even vaye return false
//center ma 1 navaye false
//diff 0 vaye false
//diff throughout the array navaye false





//222***)Check whether two numbers differ at one bit position only



/*
 * Given two non-negative integers a and b. The problem is to 
 * check whether the two numbers differ at one-bit position only 
 * or not. If yes then the answer is 1, otherwise 0.


Example 1:

Input: a = 13, b = 9
Output: 1
Explanation: (13)10 = (1101)2
(9)10 = (1001)2
Both the numbers differ at one bit 
position only, i.e, differ at the 
3rd bit from the right.

*/

/*========================ChatGPT==============================*/

//XOR garda only 1 bit set vaye true ho
//1 bit set vaneko power of 2 ho
//so xor result power of 2 huna paryo

/*========================My way==================================*/


//diff power of 2 vaye its not a jump
//diff 1 huda jahile ni upper element even huda jump huncha


/*
 *static long DifferOne(long a, long b){
        //complete the function here
        
        //difference power of 2 vaye 1 bit matra different
        
        long diff = Math.abs(a-b);
        long max = Math.max(a,b);
        
        if(diff == 1){
            //diff 1 vaye upper element even vaye jump huncha
            
            if(max % 2 == 0){
                return 0L;
            }else{
                return 1L;
            }
        }
        
        
        if(isPowerOfTwo(diff)){
            //is not a jump
            return 1L;
        }
        
        return 0L;
    } 
*/




//223)The Muskteers

/*Given binary string str consisting of only 0's and 1's, Check if 
all the 0's are together or not.*/


//all 1 vaye false
//all 0 vaye true
//loop ma 010 pattern aaye false
//natra true


/*============================CharGpt====================================*/

//count zeros in loop, keep track of index of first zero
//if 1 encountered, check the value of i with firstZeroIndex+ZerosCount

/*
 * if (countZeros > 0 && i != firstZeroIndex + countZeros) {
                    return 0;
                }
*/




//224)Modulus of two double numbers in C++

//Given two floating point numbers a and b, find a%b.


/*
 * Example 1:

Input:
a = 36.5, b = 5.0
Output:
1.5
Explanation:
36.5 % 5.0 = 1.5
*/

//return std::fmod(a, b);




//225)Distinct Elements in a Stream


/*
 * Given an input stream of N integers (alongwith the operation on 
 * these integers), the task is to print the number of the distinct
 *  elements in the stream after each operation.
The array is will be having positive and negative values. Positive 
value meaning you have to append it into your database and 
Negative value means you have to remove it from your database
 if present and at every step you have to count the number of 
 distinct character in your database.

Example 1:
Input: A[] = {5, 5, 7, -5, -7, 1, 2, -2}
Output: 1 1 2 2 1 2 3 2
Explanation:
Here you can see we have an array of integer as 
stated that positive number means we will adding 
it to our database and negative means we will be 
deleting one occurence of that number from our database.
So, [5, 5, 7, -5, -7, 1, 2, -2] 
Add 5, Unique Value in Data Base is 1 -> [5]
Add 5, Unique Value in Data Base is 1 -> [5, 5]
Add 7, Unique Value in Data Base is 2 -> [5, 5, 7]
Removing 5, Unique Value in Data Base is 2 -> [5, 7]
Removing 7, Unique Value in Data Base is 1 -> [5]
Add 1, Unique Value in Data Base is 2 -> [5, 1]
Add 2, Unique Value in Data Base is 3 -> [5, 1, 2]
Removing 2, Unique Value in Data Base is 2 -> [5, 1]
*/

//i loop layera value map ma freq sahit haldai ra hataudai jane
// res ma last ma map.size() haldai ArrayList banayera return garne



//226)Face off Tournament

/*
 * Ram and Rohan are participating in a tournament. Together they must 
 * face off against x contenders whose strengths are given in an array 
 * arr[]. The respective strength of Ram and Rohan in m and n. They 
 * take turns taking part in face-off matches with contenders and Ram 
 * goes first. They win a match only if their opponent's strength is
 *  an integral multiple of their strengths. If the opponent is 
 * defeated, he can not fight again.

Find out who among Ram and Rohan is a better player. If both of 
them win the same number of matches then both are winners.


Example 1:

Input: 
x = 7
m = 2, n = 3
arr = {4, 5, 7, 6, 9, 10, 14}
Output: Ram
Explaination: Ram win against opponents 
having strength 4, 6, 10, 14 and Rohan 
win against opponent having strength 9.
*/


//Both ko multiple ho vane ram ko count ma matra jancha acc to qsn
//so, else if use garna parcha first instance matra run huncha

/*
 * for(int i=0; i<x; i++){
            
            if(arr[i] % m == 0){
                ramCount++;
            }else if(arr[i]%n == 0 ){
                rohanCount++;
            }
            
        }
*/



//227***)Message decoding


/*
 * Given a string S, check whether it can be converted into the 
 * string "hello" by deleting some characters from it.
Note : S can have both uppercase and lowercase letters.

Example 1:

Input:
S = "bbbbbxxhhelllllooudd"
Output: 1
Explanation: The string hello is marked
in bold: bbbbbxxhhelllllooudd


*/

// String target = "hello"
//Nice use of targetIndex.
//loop ma charAt(i) ra charAt(targetIndex) vaye targetIndex++
//tei check garne length purai targetIndex le cover garyo ki nai
//natra arrayOOB aaucha



/*
 * public boolean decode(String S)
    {
        //code here
        if(S.length() < 5)
            return false;
            
        String target = "hello";
        
        int targetIndex = 0;
        
        for(int i=0; i<S.length(); i++){
            if(S.charAt(i) == target.charAt(targetIndex)){
                targetIndex++;
                
                if(targetIndex == target.length()){
                    return true;
                }
            }
        }
         
        return false;
            
            
        //h,e,l,l,o lagatar vetina paryo
        
        
    }
*/







//228****)Ladoo problem


/*
 * Bheem has N friends. And he has a ladoo for each day. Given an 
 * Array A[] denoting on which day ith friend wants a ladoo. If 
 * Bheem is unable to give a ladoo to a friend, he loses his
 *  friendship with them. Find out the maximum number of Friends
 *  he can have at the end.

 

Example 1:

Input:
N = 5
A[] = {3, 3, 1, 2, 4}
Output:
4 
Explanation:
He will lose either his 1st or 2nd
friend and therefore will be left
with 4 friends.
*/



/*
 * 
class Solution {
    static int divideLadoo(int N , int[] A) {
        // code here
        //A[i] represents day's index where a friend i wants laddo
            
        HashMap<Integer, Integer> map = new HashMap<>();
        
        //harek day i ma requests ko map banako
        for(int i: A){
            map.put(i+1, map.getOrDefault(i+1, 0) + 1 );
        }
        
        int totalWantFreq= 0;
        int friendLost = 0;
        int totalHasFreq = 0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            int val = entry.getValue();
            int key = entry.getKey();
            
            totalWantFreq += val;
            totalHasFreq++;
            
            if(totalWantFreq > totalHasFreq ){
                //kati wata lai dina sakiyena
                friendLost+= (val - totalHasFreq);
                totalHasFreq = 0;
            }else{
                totalHasFreq--;
            }
        }
        
        return N - friendLost;
        
    }
};
*/



//229)Tywin's War Strategy



/*
 * Tywin Lannister is facing a war. He has N troops of soldiers. Each 
 * troop has a certain number of soldiers denoted by an array A.
Tywin thinks that a troop is lucky if it has a number of soldiers as 
a multiple of K. He doesn't want to lose any soldiers, so he decides
 to train some more.
He will win the war if he has at least half of his troops are lucky
 troops.
Determine the minimum number of soldiers he must train to win the war.

Example 1:

Input : arr[ ] = {5, 6, 3, 2, 1} and K = 2
Output : 1
Explanation:
Troop with 1 soldier is increased to 2.

*/


//Iterate array, lucky vaye count, unlucky vaye kati le lucky huncha,
//tyo value ArrayList ma rakhne. Kati wata lai lucky banauna parni ho 
//nikalne. ArrayList sort garera tyo tomakelucky wata ko sum return garne

/*
 * class Complete{
    
   
    // Function for finding maximum and value pair
    public static int min_soldiers (int arr[], int n, int K) {
        //Complete the function
        
        ArrayList<Integer> required = new ArrayList<>();
        
        int luckies = 0;
        for(int i=0; i<n; i++){
            int remaining = arr[i] % K;
            
            if(remaining == 0){
                luckies++;
            }else{
                int reqd = K - remaining;
                required.add(reqd);
                
            }
        }
        
        int half = (int)Math.ceil(n/2.0);
        
        if (luckies >= half) {
            return 0;
        }
        
        //if half is equal or greater
        
        Collections.sort(required);
        
        int toMakeLucky = half - luckies;
        
        int totalSoldiers = 0;
        
        for(int i=0; i<toMakeLucky; i++){
            //harek item lai K ko multiple banauni
            
            int item = required.get(i);
            
            
            totalSoldiers += item;
            
        }
        
        return totalSoldiers;
        
        
        
        
    }
    
    
}

*/




//230***)Sum of all sub-sequences of a number



/*
 * Given a number as integer s, find the sum of all the elements 
 * present in all possible subsequences of s.

Example 1:

Input:  S = "123" 
Output: 24
Explanation: {1}, {2}, {3}, {1, 2}, {2, 3}
{1, 3}, {1, 2, 3} are all possible sub-
sequences

*/
//For each digit at position i, its contribution to the sum is 
//calculated as num * 2^(len - i - 1) * (i + 1). Here:

/*
 * int len = s.length();
        int sum = 0;

        // Iterate through each digit of the string
        for (int i = 0; i < len; i++) {
            int num = s.charAt(i) - '0'; // Convert character to integer
            sum += num * (1 << (len - i - 1)) * (1 << i); // Corrected calculation
        }

        return sum;
*/




//231)Extraction of secret message


/*
 * You are given an encoded string S of length N. The encoded 
 * string is mixed with some number of substring "LIE" and some
 *  secret message. You have to extract secret message from it
 *  by removing all the "LIE" substrings.
For example - "I AM COOL" is given as "LIEILIEAMLIELIECOOL".

Example 1:

Input: S = "LIEILIEAMLIELIECOOL"
Output: "I AM COOL"

*/


//String str =  S.replace("LIE" , " ");




//232)Max Odd Sum

/*
 * Given an array of integers, check whether there is a subsequence 
 * with odd sum and if yes, then finding the maximum odd sum. If no 
 * subsequence contains odd sum, print -1.


Example 1:

Input:
N=4
arr[] = {4, -3, 3, -5}
Output: 7
Explanation:
The subsequence with maximum odd
sum is 4 + 3 = 7
*/


//keep track of total sum, smallest positive odd, biggest -ve odd
//return sum if odd else,
//return Max of (sum - smallest positive odd) or (sum + maxOddNegative)
//return maxOddNegative if all elements are negative








//233)Number of Integer solutions

/*
 * You are given a positive integer N and you have to find the 
 * number of non negative integral solutions to a+b+c=N.

 

Example 1:

Input:
N = 10
Output:
66
Explanation:
There are 66 possible solutions.

Example 2:

Input:
N = 20
Output:
231
Explanation:
There are 231 possible solutions.
*/


// return Binomial coefficient of (N+K-1)/(K-1)




//234)Dull Jack


/*
 * Jack is very fond of reading. He reads a lot many pages of 
 * books in a day. Since he is obsessed with reading, he reads 
 * K times more pages than the number of pages he read the 
 * previous day.He read 1 page on the first day. He wants to 
 * see that on any given day N, how many pages will he read.
 * Since the answer can be very large, find the answer in modulo 
 * 109+7.

Example 1:

Input: N = 5, K = 2 
Output: 16 
Explanation: 
On Day 1 : 1
On Day 2 : 2
On Day 3 : 4
On Day 4 : 8
On Day 5 : 16
So the answer is 16. 

*/

//tN = a*r^(n-1) ho tara precision loss hune vayera need iterative approach


/*
 * class Solution {
    static long nthDayPage(long N, long K){
        // code here
         int MOD = 1000000007;
        
        if (N == 1) {
            return 1;
        }
        // Compute K^(N-1) % MOD
        long result = power(K, N - 1, MOD);
        return result;
        
    }
    public static long power(long base, long exp, int mod) {
        long result = 1;
        while (exp > 0) {
            if ((exp % 2) == 1) {
                result = (result * base) % mod;
            }
            base = (base * base) % mod;
            exp = exp / 2;
        }
        return result;
    }
}
*/




//235)Just One Mismatch


/*
 * Given a string S and array of strings, find whether the array 
 * contains a string with one character different from the given 
 * string.

 

Example 1:

Input :
N = 4
arr[] = {"bana","apple","banaba","bonanzo"}
S = "banana"
Output :
True
Explanation: 
banana and banaba has only one character 
different.
*/
//index badhaudai check chars at both strings with diff indexes
//if there is mismatch count
//if full traversal with 1 or less mismatch, item found


/*
 * static String isStringExist(String arr[],int N,String S){
        // code here
        
        for (int i = 0; i < N; i++) {
            String currStr = arr[i];
            int strIndex = 0;
            int mismatchCount = 0;
            for (int j = 0; j < currStr.length(); j++) {
                if (strIndex < S.length() && currStr.charAt(j) == S.charAt(strIndex)) {
                    strIndex++;
                } else {
                    mismatchCount++;
                    strIndex++;
                    if (mismatchCount > 1) {
                        break; // more than 1 mismatch, move to the next string
                    }
                }
            }
            if (strIndex == S.length() && mismatchCount <= 1) {
                return "True"; // Found S with at most 1 mismatch
            }
        }
        return "False";
    }
*/




//236)Total digits


/*
 * Given a number n, count the total number of digits required to 
 * write all numbers from 1 to n.

Example 1:

Input: n = 13
Output: 17 
Explanation: There are total 17 
digits required to write all 
numbers from 1 to 13.

Example 2:

Input: n = 4
Output: 4
Explanation: There are total 4 
digits required to write all
numbers from 1 to 4.

*/


/*
 * class Solution {
    static long totalDigits(long n){
        // code here
        long totalDigits = 0;
        long length = 1;
        long start = 1;
        
        while (start <= n) {
            long end = Math.min(n, start * 10 - 1);
            totalDigits += (end - start + 1) * length;
            length++;
            start *= 10;
        }
        
        return totalDigits;
    }
}
*/


//237)Distinct Adjacent Element

/*
 * Given an array arr[] of size N, the task is to check whether 
 * it is possible to obtain an array having distinct neighboring 
 * elements by swapping two neighboring array elements.

Example 1:

Input: N = 3, arr[] = {1, 1, 2}
Output:  YES
Explanation: Swap 1 (second last element) 
and 2 (last element), to obtain 1 2 1,
which has distinct neighbouring elements.
*/

//frequency map banaune ra max freq track garne
/*
 * if (maxFreq > (n + 1) / 2) {
            return false;
        }
    return true;        
*/


}







