public class Main {

    public static void main(String[] args) {
//        Person p1 = new Person();
//        p1.setFname("John");
//        p1.setLname("sonia");
//        p1.setAge(20);
//        System.out.println(p1.getFname());
//        System.out.println(p1.getLname());
//        System.out.println(p1.getAge());
//        System.out.println(p1);
//        System.out.println(p1.toString());
        Person p1 = new Person("john","sonia",20);
        Person p2 = new Person("keza","divine",16);
        Person p3 = new Person("teta","gaju");
        p1.setFname("Claude");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p1.getFname());
        System.out.println(p2.getFname());


        System.out.println(p2.getFname() + " " + p2.getLname());

    }
}