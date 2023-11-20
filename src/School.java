class School{
    public static void main(String[] args) {
        //객체 저장할 수 있는 변수 생성
        Student  kje;
        // 앞에서 만든 변수에 new로 객체를 생성해서 = 으로 저장
        kje = new Student();
        // 객체 안에 있는 변수 , 메소드를 사용할 때는 변수이름. 사용
        kje.age = 24;
        kje.name = "김지은";

        Student kjee;
        kjee = new Student();

        kjee.age = 24;
        kjee.name = "김지은";

        Student kim;
        kim = new Student();
        kim.age = 27;
        kim.name = "김김김";


        Subject linux;
        linux = new Subject();
        linux.name = "linux";
        linux.time = 2;

        Subject db;
        db = new Subject();
        db.name= "db";
        db.time = 8;

        Subject sw;
        sw =  new Subject();
        sw.name= "sw";
        sw.time = 3;


        Integer totalAge;
        totalAge = kje.age + (kjee.age * kim.age);

        Integer result;
        result = kje.age + kjee.age;
        System.out.println(result);
        result = kje.age - kjee.age;
        System.out.println(result);
        result = kje.age * kjee.age;
        System.out.println(result);
        result = kje.age / kjee.age; //몫만 저장
        System.out.println(result);
        result = kje.age % kjee.age;
        System.out.println(result);

        //논리 연산자




    }

}