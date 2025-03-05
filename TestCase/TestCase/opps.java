package TestCase;
class animal{
    void eat(){
        System.out.println("eating food");
    }
}

class dog extends animal{
    void bark(){
        System.out.println("bow bow");
    }
}

class en{
    //this help to achieve encapusaltion 
    private int speed;
    private String coloor;
    public en(String coloor,int speed){
        this.coloor=coloor;
        this.speed=speed;
    }
    public int getSpeed(){
        return speed;
    }
    public String getColor(){
        return coloor;
    }
}

class car{
String color;
int speed;
public int accelerate(){
    return speed;
 }
 public void color(){
    System.out.println("the car color is "+ color);
 }
}
public class opps {
    public static void main(String[] args) {
        car cr = new car();
        cr.color = "black";
        cr.speed = 455;
        System.out.println(cr.accelerate());
        cr.color();
        
        en e = new en("blue",455);
        e.getSpeed();
        e.getColor();

        dog dg  = new dog();
        dg.eat();
        dg.bark();
    }
}
