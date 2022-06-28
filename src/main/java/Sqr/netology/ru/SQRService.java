package Sqr.netology.ru;

public class SQRService {

    public int calculateSQR(int minBorder, int maxBorder) {

        int x = 0; //Счётчик
        for (int i = 10; i <= 99; i++) {
            if (i * i >= minBorder && i * i <= maxBorder) {
                x++;
            }
        }
        System.out.println(x + " Квадратов чисел встречаются в выбранном диапазоне");
        return x;
    }
}









