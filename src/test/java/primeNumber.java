public class primeNumber {
    public static void main(String[] args) {
        int[] arrNumbers= {3, 56, 1, 0, 5, 8, 9,11,13,19,21};
        int count;
        for(int i=0;i<arrNumbers.length;i++){
            count=2;
            if(!(arrNumbers[i]==0 || arrNumbers[i]==1)) {
                for (int j = 2; j < arrNumbers[i]; j++) {
                    if (arrNumbers[i] % j == 0) {
                        count++;
                    }
                }
                if (count == 2) {
                    System.out.println(arrNumbers[i] + " is a prime number");
                }
            }

        }


        }
}
