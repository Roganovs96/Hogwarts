package roganov.hogwarts;

public class Test {
    public static void main(String[] args) {
        Gryffindor harry = new Gryffindor("Harry Poter",7,2,3,16,5);
        Slytherin drako = new Slytherin("Drako Malfoy",2,5,1,6,3,2,5);
        Hufflepuff zaharia = new Hufflepuff("Zaharia Smith",2,5,1,6,3);
        Ravenclaw zhoy = new Ravenclaw("Choy Chang",4,2,6,3,1,6);
        Gryffindor germiona = new Gryffindor("Germiona Grenjer",5,5,5,5,6);
        System.out.println(harry.showStudent());
        System.out.println(drako.showStudent());
        System.out.println(zaharia.showStudent());
        System.out.println(zhoy.showStudent());
        System.out.println(germiona.whoBetter(harry));
        System.out.println(harry.whoBetter(zhoy));

    }
}
