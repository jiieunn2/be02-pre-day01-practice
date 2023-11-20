public class ex3 {
    public static void main(String[] args) {
        // 1. 다음과 같이 정사각형을 출력하는 코드 작성
        /*
        ----------
                *****
         *****
         *****
         *****
         *****
        ----------
                */
       

        

        // 2. 다음과 같이 삼각형을 출력하는 코드 작성
        /*
        ----------
         *
         **
         ***
         ****
         *****
        ----------
         */
        for (int i = 0; i < 6; i++) {
            for (int j = 5; j > 0; j--) {
                if (i < j) {
                    System.out.print(" ");
                } else
                    System.out.print("*");


        // 3. 다음과 같이 삼각형을 출력하는 코드 작성
        /*
        ----------
             *
            ***
           *****
          ********
         **********
         ----------
         */

        for (int i = 0; i < 6; i++) {
            for (int j = 5; j > 0; j--) {
                if (i < j) {
                    System.out.println(" ");
                } else
                    System.out.print("*");


            }

        }

    }

