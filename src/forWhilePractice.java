public class forWhilePractice {
    public static void main(String[] args) {

        Integer num1;
        num1 = 10;

        while (num1 > 5) {
            System.out.println("크다");
            //조건변경코드 추가
            num1 = num1 -1 ;
        }

        for (int i=0; i<10; i++) {
            System.out.println("code");
        }
    }
}