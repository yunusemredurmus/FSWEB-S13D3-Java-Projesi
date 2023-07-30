public  class Person {
    String firstname ;
    String lastname;
    int age ;
    boolean isMarried;
    int maas ;

    public Person(String firstname, String lastname, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }

    public Person(String firstname, String lastname, int age ,
                  boolean isMarried,
                  int maas){
        this(firstname,lastname,age);
        this.isMarried = isMarried ;
        this.maas = maas;




    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getAge() {
        return age;
    }

    public boolean isTeen(){
        return 13 <= age && age <=19 ;

    }
}