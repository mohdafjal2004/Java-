package OOPsProperties.inheritance;

public class Main {
    public static void main(String[] args) {
        Box box = new Box();
        Box box2 = new Box(box);
        System.out.println(box.l + " " + box.h + " " + box.w);
        System.out.println(box2.l + " " + box2.h + " " + box2.w);

        // These boxes are for representing the inheritance of Box Class in BoxWeight
        // Class
        // BoxWeight box3 = new BoxWeight();
        // BoxWeight box4 = new BoxWeight();
        // System.out.println(box3.h + " " + box3.l + " " + box3.w);

        Box box5 = new BoxWeight(2, 3, 4, 5);
        System.out.println(box5);

        // there ar many variables in both parent and child classes
        // you are given access to variables that in the ref types i.e BoxWeight
        // hence you should have access to weight variable
        // so this also means, that the ones you are trying to access should be
        // initialised
        // But here, when the object itself is of type parent class, how will you call
        // the constructor of child class

        // Parent class has not idea about the varibles of child class, so when
        // BoxWeight refer to Box class, it can access the variables of parent class
        // hence not allowed for child class to refer to parent class so it gives error
        // BoxWeight box6 = new Box(2, 3, 4);
        // System.out.println(box5);

        BoxPrice box6 = new BoxPrice(5, 8, 200);

    }
}
