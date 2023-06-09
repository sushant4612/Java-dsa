package Properties.Inheritance;

public class Box {
    double l;
    double w;
    double h;

    Box (){
        this.h = -1;
        this.w = -1;
        this.l = -1;
    }

    Box(double side){
        this.l = side;
        this.w = side;
        this.h = side;
    }

    Box(double l, double w, double h) {
        this.l = l;
        this.w = w;
        this.h = h;
    }

    Box(Box other){
        this.l = other.l;
        this.w = other.w;
        this.h = other.h;
    }
}
