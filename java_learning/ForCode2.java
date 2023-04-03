package java_learning;

public class ForCode2 {
    public static void main(String[] args) {
        int count=1;
        for (int i=1;i<=40;i++){
            System.out.println(i);

            if (count==3){
                System.out.println("Quack");
                count=0;
            }
            count++;
        }
    }
}
