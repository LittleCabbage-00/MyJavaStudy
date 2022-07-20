package PrimaryDesign.BasalStudy;

public class ContinueAndBreak2 {
    public static void main(String[] args){
        System.out.println();
        int i = 0;

        while(true) {
            label27:
            while(true) {
                System.out.println("have been out");

                while(true) {
                    while(true) {
                        ++i;
                        System.out.println(" i= " + i);
                        if (i == 1) {
                            System.out.println("continue");
                        } else {
                            if (i == 3) {
                                System.out.println("continue outer");
                                continue label27;
                            }

                            if (i == 5) {
                                System.out.println("break");
                                continue label27;
                            }

                            if (i == 7) {
                                System.out.println("break outer");
                                return;
                            }
                        }
                    }
                }
            }
        }
    }
}
