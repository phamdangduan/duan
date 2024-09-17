import java.time.LocalDate;
import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Mời nhập số tiền cần gửi  : ");
        int a= sc.nextInt();
        System.out.println("Mời nhập tháng gửi: ");
        int b= sc.nextInt();
        float c=0.47f;
        System.out.println("Số tiền nhận là : " +(a*b*c));


    }
}
