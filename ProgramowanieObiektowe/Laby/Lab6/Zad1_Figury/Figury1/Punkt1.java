package Figury1;

public class Punkt1 {
    String nazwa;
    int x, y;
    public Punkt1() {
        nazwa = "null";
        x = 0;
        y = 0;
    }
    public Punkt1(String nazwa, int x, int y) {
        this.nazwa = nazwa;
        this.x = x;
        this.y = y;
    }

    public Punkt1(int i, int i1) {
    }

    public int getX() {return x;}
    public int getY() {return y;}
    public void setX(int x) {this.x = x;}
    public void setY(int y) {this.y = y;}
    public void zeruj(){
        System.out.println("x = " + this.x + " -> x = 0, y = " + this.y + " -> y = " + (this.y+y));
        this.x = 0;
        this.y = 0;
    }
    public void przesun(int x, int y){
        System.out.println("x = " + this.x + " -> x = " + (this.x+x) + ", y = " + this.y + " -> y = " + (this.y+y));
        this.x += x;
        this.y += y;
    }

    public void viewData(){
        System.out.println("Nazwa: " + this.nazwa + ", X: " + this.x + ", Y: " + this.y);
    }
    public String opis(){return "klasa Punkt1";}
    
}

