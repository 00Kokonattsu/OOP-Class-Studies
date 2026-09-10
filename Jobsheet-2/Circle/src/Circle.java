class Circle{
    double r, pi = 3.14159;

    Circle(double r) {
        this.r = r;
    }

    double calculateArea(){
        return r * r * pi; 
    }

    double calculateCircumference(){
        return r * 2 * pi;
    }
}