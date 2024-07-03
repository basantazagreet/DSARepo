/*We are using buttom up approach so start from bottom*/

//1***) Reciprocal of a character

//chArray[i] = (char) ('Z' - (chArray[i] - 'A'));

//2) Perform boolean operation on given integers which are converted tobinary
//boolean F1 = (F != 0);
//boolean res = (!A1 && B1) || (C1 && D1) || (E1 && !F1 ) ;

//3)Toeplitz Matrix (Harek Leading diagonal ma elements same huna paryo)

/* 
        if (mat[i][j] != mat[i + 1][j + 1]) {
                // If they are not equal, the matrix is not a Toeplitz matrix
                return false;
        }
*/

//4)Diagonal sum 
//primary diagonal(left wala) pDSum += Grid[i][i];
//Secondary diagonal(right wala)  sDSum += Grid[i][N-i-1];

//5)Automorphic huna (square garda last ma tei number huna)

//last digit [0,1,5,6] vaye sure 

//6) Extract the integers
/*
 * Iterate through string
 * If digit, add into buffer
 * If not digit, convert buffer to string and add in arrayList
 * At end of loop also convert buffer to string
 * 
*/

//7***)Cube root using Binary Search

/*
 * static int cubeRoot(int N) {
        // code here
        long low = 0, high = Math.min(N, 1291); 
        
        while(low<=high){
                //Mid lai sano thulo banaune game ho
            long mid = low + (high-low)/2 ;
            long cube =  mid * mid * mid;
            
            if(cube == N){
                return (int) mid;
            }else if(cube > N){
                //Mid thulo vaye high lai ghatauni
                high = mid -1;
            }else{
                //Mid sano vaye low lai badhauni
                low = mid +1 ;
            }
        }
        
        return (int) high;
    }
 * 
 * 
*/

//8***)Check if it is prime or not using

/* 

        public static boolean isPrime(int N) {
                // If N is less than or equal to 1, it is not a prime number
                if (N <= 1) {
                        return false;
                }
                // If N is between 2 and 3 (inclusive), it is prime
                else if (N > 1 && N <= 3) {
                        return true;
                } else {
                        // If N is divisible by 2 or 3, it is not prime
                        if (N % 2 == 0 || N % 3 == 0) {
                                return false;
                        }

                        // Check other divisors starting from 5
                        //use rule 6k+1, 6k-1
                        // i<sqrt(N) because 4*9 = 36. Upto 6 its enough
                        for (int i = 5; i * i <= N; i += 6) {

                                //6k-1 (Mathi 5 vayera)  ||  6k+1 (5 vayera)
                                if (N % i == 0 || N % (i + 2) == 0) {
                                        return false;
                                }
                        }
                        // If no divisors were found, N is prime
                        return true;
                }
        }


        */
//9) Reverse incrementing pattern lai add content to last of ArrayList

/*
for(int i=0; i<charArr.length; i++){
        str = str + charArr[i];
        result.add(0,str);
    }
*/


//10)    Binary ma convert 
//find binary number by while loop rem method
//let binaryStr = '0'.repeat(zerosLength)+binary;



//11***) Multiplication of two square matrices using k loop
/*

for(int i=0; i<N; i++){
        for(int j=0; j<N; j++ ){
            int sum = 0;
             for (int k = 0; k < N; k++) {
                 //Logic
             sum += A[i][k] * B[k][j];
             }
         C[i][j] = sum;
        }
    }

*/    

//12) Transpose of a matrix

/*
 * for(int i = 0; i < n; i++) {
        for(int j = 0; j < n; j++) {
            result[j][i] = a[i][j]; // Transpose the matrix
        }
    }
 * 
*/


