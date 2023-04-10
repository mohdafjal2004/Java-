
//this file is for demonstration of multilevel inheritance
package OOPsProperties.inheritance;

public class BoxPrice extends BoxWeight {

    double cost;

    BoxPrice() {
        super();
        this.cost = -1;
    }

    BoxPrice(BoxPrice other) {
        super(other);
        this.cost = other.cost;

    }

    public BoxPrice(double side, double weight, double cost) {
        super(side,weight);// call the parent class constructor
        // used to initialise values present in parent class
        this.cost = cost;

    }

    public BoxPrice(double l, double h, double w, double weight, double cost) {
        super(l, h, w, weight);// call the parent class constructor
        // used to initialise values present in parent class
        this.cost = cost;

    }
}
