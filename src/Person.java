public class Person {
    private String fname;
    private String lname;
    private int age;

    public Person() {
    }

    public Person(String fname, String lname, int age) {
        this.fname = fname;
        this.lname = lname;
        this.age = age;
    }

    public Person(String fname,String lname) {
        this.fname = fname;
        this.lname = lname;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString(){
        return "person[fname:" +fname+ ",lname:"+lname+ ",age:"+age+"]";
    }

}