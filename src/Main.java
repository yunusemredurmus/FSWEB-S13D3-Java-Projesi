public class Main {
    public static void main(String[] args) {

        Person person = new Person("John" , "Durmus" , 34 , true , 100);

        System.out.println("Firstname: " + person.getFirstname());

        System.out.println("LastName: " + person.getLastname());

        System.out.println("Age: " + person.getAge());

        System.out.println("************************************************");

        Wall wall = new Wall(5,4);

        System.out.println("area= " + wall.getArea());

        wall.setHeight(-1.5);

        System.out.println("width= " + wall.getWidth());

        System.out.println("height= " + wall.getHeight());

        System.out.println("area= " + wall.getArea());

        System.out.println("********************************************");
    }




}