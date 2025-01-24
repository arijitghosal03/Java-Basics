public class Pattern1{
    public static void main(String[] args) {
        System.out.println("Hello");
        int a = 0;
        for(int i = 0;i<3;i++){
            for (int k = 2-i;k>=0;k--) {
                  System.out.print(" ");  
                }
            for (int j=1;j<=2*i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}