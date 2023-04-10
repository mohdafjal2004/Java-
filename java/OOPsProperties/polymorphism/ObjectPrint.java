
//This is for demonstartion of toString() method overriding
package OOPsProperties.polymorphism;

public class ObjectPrint {

    int num;

    // Internally it prints using its own toString() method when no toString()
    // method is provided by us
    public ObjectPrint(int num) {
        this.num = num;
    }

    // But what if we provide our own toString() method
    @Override // It will override the original toString() method at runtime
    public String toString() {
        return "ObjectPrint{ " + "num =  " + num + "}";
    }

    public static void main(String[] args) {
        ObjectPrint obj = new ObjectPrint(52);
        System.out.println(obj);
    }
}
