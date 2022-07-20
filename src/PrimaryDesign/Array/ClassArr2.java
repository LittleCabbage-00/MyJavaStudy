package PrimaryDesign.Array;

public class ClassArr2 {
    public static void main(String[] args){
        (new ClassArr2()).arr1();
        (new ClassArr2()).arr2();
        (new ClassArr2()).arr3();
    }

    void arr1(){
        int[][] sc =new int [4][3];
        sc[0][1]=30;
        sc[1][0]=31;
        sc[2][2]=32;
        sc[3][1]=33;
        sc[1][1]=30;
        for (int[] ints : sc) {         //for(int i=0;i<sc.length;i++)
            for (int anInt : ints) {    //for(int j=0;j<sc[i].length;j++)
                System.out.print(anInt + "\t");
            }
            System.out.println("");
        }
    }

    void arr2(){
        for(int i=0;i<20;i++){
            System.out.print("-");
        }
        System.out.println("");
        int[][] sc ={{98,96,65},{85,96,63,45},{100,23,99}};
        for(int i=0;i<sc.length;i++){
            for(int j=0;j<sc[i].length;j++){
                System.out.print(sc[i][j] + "\t");
            }
            System.out.println("");
        }
        for(int i=0;i<20;i++) {
            System.out.print("-");
        }
    }

    void arr3(){
        System.out.println("");
        int[][][][] sco ={{{{12,66,69,45},{45,569,6885,3},{56,96,58,63,4}},{{45,25,36,36,5}}},{{{256,69,36,36,}}}};
        for (int i=0;i<sco.length;i++){
            for(int j=0;j<sco[i].length;j++){
                for(int k=0;k<sco[i][j].length;k++){
                    for(int l=0;l<sco[i][j][k].length;l++){
                        System.out.println("sco["+i+"]["+j+"]["+k+"]["+l+"]="+sco[i][j][k][l]);
                    }
                }
            }
        }
    }
}
