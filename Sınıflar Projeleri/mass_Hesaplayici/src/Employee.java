import java.sql.SQLOutput;

public class Employee {

    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, double salary, int workHours, int hireYear) {


        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;

    }

    double tax() {

        if (this.salary > 1000.0) {
            return this.salary * 0.03;
        } else {
            return 0;
        }

    }

    double bonus() {
        int extraHours = this.workHours - 40;
        if (this.workHours > 40) {
            return extraHours * 30;
        } else {
            return 0;
        }
    }

    double raiseSalary() {
        if (2021 - this.hireYear < 10) {
            return this.salary * 0.05;
        } else if (2021 - this.hireYear > 10 && 2021 - this.hireYear < 20) {
            return this.salary * 0.1;

        } else {
            return this.salary * 0.15;
        }
    }

    double taxPlusBonus() {
        return this.salary + bonus() - tax();
    }

    double total() {
      return taxPlusBonus() + raiseSalary();
    }

    public String toString() {
        return " Adı : " + this.name + "\n Maaşı : " + this.salary
                + "\n Başlangıç Yılı : " + this.hireYear
                + "\n Vergi : " + tax()
                + "\n Bonus : "+bonus()
                + "\n Maaş Artışı : " + raiseSalary()
                + "\n Vergi ve Bonuslar ile birlikte maaş : " + taxPlusBonus()
                + "\n Toplam Maaş : " + total();


    }


}
