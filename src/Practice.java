public class Practice {

public static void main(String[]args){

    Student kjh;
    kjh = new Student();
    kjh.age = 26;
    kjh.name = "강지흔";

    Student hkh;
    hkh = new Student();
    hkh.age = 25;
    hkh.name = "한경훈";

    Student ltw;
    ltw = new Student();
    ltw.age = 27;
    ltw.name = "임태우";

    Student ljh;
    ljh = new Student();
    ljh.age = 23;
    ljh.name = "이주현";


    Integer result;
    result = kjh.age * hkh.age;
    System.out.println(result);
    result = ltw.age + ljh.age;
    System.out.println(result);
    result = (ltw.age + ljh.age) * kjh.age;
    System.out.println(result);
    result = ((ltw.age + ljh.age) * kjh.age ) / hkh.age;
    System.out.println(result);

    Boolean finalResult;
    finalResult = (kjh.age* hkh.age) > ((ltw.age+ljh.age)* kjh.age)/hkh.age ;
    System.out.println(finalResult);






        }

}