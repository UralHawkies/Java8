package Sqr.netology.ru;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {

    @Test
    public void shouldCalcNoAnswer() {

        SQRService service = new SQRService();

        int expected = 0;
        int actual = service.calculateSQR(10, 99);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldCalcThreeAnswers() {

        SQRService service = new SQRService();

        int expected = 3;
        int actual = service.calculateSQR(200, 300);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcOneAnswer() {

        SQRService service = new SQRService();

        int expected = 1;
        int actual = service.calculateSQR(100, 100);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcNinetyAnswers () {

        SQRService service = new SQRService();

        int expected = 90;
        int actual = service.calculateSQR(10, 10_000);


        Assertions.assertEquals(expected, actual);
    }
}
