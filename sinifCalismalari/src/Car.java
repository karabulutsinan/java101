class Car {
    String type;
    String model;
    String color;
    int speed;
    int speedLimit=180;

    Car(String model,int speed,String type,String color,int speedLimit){
        this.model=model;
        this.speed=speed;
        this.type=type;
        this.color=color;
        this.speedLimit=speedLimit;
    }

    void increaseSpeed(int increment) {
        if ((this.speed + increment) < speedLimit) {

            this.speed += increment;
        }
    }
    void decreaseSpeed(int decrease) {
        if (this.speed > 0) {
            this.speed -= decrease;
        }
    }
    void printSpeed() {
        System.out.println(this.model + " Hızınız: " + this.speed);
    }
    void printInfo(){
        System.out.println("Model\t:"+this.model);
        System.out.println("Hızı\t:"+this.speed);
        System.out.println("Tipi\t:"+this.type);
        System.out.println("Rengi\t:"+this.color);
        System.out.println("Hız Limit\t:"+this.speedLimit);
    }
}
