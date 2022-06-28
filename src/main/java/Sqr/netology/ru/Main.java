package Sqr.netology.ru;

public class Main {

    public static void main(String[] args) {
        SQRService service = new SQRService();
        int Borders = service.calculateSQR(100, 100);
        System.out.println();

    }
}
