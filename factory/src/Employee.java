import java.time.LocalDate;


public class Employee {
    private String name;
    private Double salary;
    private Integer workHours;
    private Integer hireYear;

    public Employee(String name, Double salary, Integer workHours, Integer hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Integer getWorkHours() {
        return workHours;
    }

    public void setWorkHours(Integer workHours) {
        this.workHours = workHours;
    }

    public Integer getHireYear() {
        return hireYear;
    }

    public void setHireYear(Integer hireYear) {
        this.hireYear = hireYear;
    }

    public Double tax(Double salary) {
        if (salary < 1000) {
            return salary;
        } else {
            return (salary * 0.03);
        }
    }

    public Integer bonus(Integer workHours) {
        if (workHours > 40) {
            return (workHours - 40) * 30;
        } else {
            return 0;
        }
    }

    public Double raiseSalary(Integer hireYear) {
        LocalDate now = LocalDate.now();
        Integer nowYear = now.getYear();
        if (nowYear - hireYear < 9) {
            return 0.05;
        } else if (9 <= nowYear - hireYear && nowYear - hireYear < 20) {
            return 0.10;
        } else if (20 <= nowYear - hireYear) {
            return 0.15;
        } else {
            return 0.0;
        }
    }

    @Override
    public String toString() {
        return

                "Adı='" + this.getName() + '\'' + "\n" +
                "Maaşı=" + this.getSalary() + "\n" +
                "Çalışma Saati=" + this.getWorkHours() + "\n" +
                "Başlangıç yılı=" + this.getHireYear() + "\n" +
                "Vergi: " + this.tax(this.getSalary()) + "\n" +
                "Bonus: " + this.bonus(this.getWorkHours()) + "\n" +
                "Maaş Artışı: " + (this.getSalary() * this.raiseSalary(this.getHireYear()) + "\n" +
                "Vergi ve Bonuslar Toplam: " + (this.bonus(this.getWorkHours()) - this.tax(this.getSalary())) + "\n" +
                "Net: " + (this.getSalary() + this.bonus(this.getWorkHours()) - (this.tax(this.getSalary())) + (this.raiseSalary(this.getHireYear()))));
    }
}
