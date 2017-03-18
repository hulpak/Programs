public  enum Num{
    first(1.5),
    second(2),
    third(2.5);

    private double d;

    Num(double n){
        this.d = n;
    }

    public double getD() {
        return d;
    }
}
