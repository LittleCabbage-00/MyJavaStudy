package PrimaryDesign.Array;

public class ClassArr1apply {

    public static void main(String[] args) {
        (new ClassArr1apply()).study0();
    }

    void study0() {
        int[] score = {12, 45, 65, 3, 98, 75, 56, 36};
        for (int i = 1; i < score.length; i++) {
            for (int j = 0; j < score.length; j++) {
                if (score[i] < score[j]) {
                    int temp = score[i];
                    score[i] = score[j];
                    score[j] = temp;
                }
            }
            System.out.print("the "+i+" times to result: \t");
            for(int j=0;j<score.length;j++){
                System.out.print(score[j] + "\t");
            }
            System.out.println("");
        }
        System.out.print("the last result is: \t");
        for (int j : score) {
            System.out.print(j + "\t");
        }
        System.out.println("\nmax is " + score[score.length - 1]);
        System.out.println("min is " + score[0]);
    }


}

