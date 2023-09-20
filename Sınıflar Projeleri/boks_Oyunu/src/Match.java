public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    void run() {
        if (isCheck()) {
            while (this.f1.healty > 0 && this.f2.healty > 0) {
                System.out.println("======YENİ ROUND=======");
                double firstNumber = Math.random()*100;
                System.out.println(firstNumber);
                if(firstNumber>50){
                    this.f2.healty = this.f1.hit(f2);
                    if (isWin()) {
                        break;
                    }
                    this.f1.healty = this.f2.hit(f1);
                    if (isWin()) {
                        break;
                    }
                }
                else{

                    this.f1.healty=this.f2.hit(f1);
                    if (isWin()) {
                        break;
                    }
                    this.f2.healty=this.f1.hit(f2);
                    if (isWin()) {
                        break;
                    }
                }





                System.out.println(this.f1.name + " Sağlık " + this.f1.healty);
                System.out.println(this.f2.name + " Sağlık " + this.f2.healty);
            }
        } else {
            System.out.println("Sikletler Uyuşmuyor.");
        }
    }

    boolean isCheck() {
        return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
    }

    boolean isWin() {
        if (this.f1.healty == 0) {
            System.out.println(this.f2.name + " KAZANDI ");
            return true;
        }
        if (this.f2.healty == 0) {
            System.out.println(this.f1.name + " KAZANDI ");
            return true;
        }
        return false;
    }




}
