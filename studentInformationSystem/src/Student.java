public class Student {
    private String name;
    private String studentNo;
    private Integer classes;
    private Course math;
    private Course chemical;
    private Course physical;
    private Double average;
    private Boolean isPass;

    public Student(String name, Integer classes, String studentNo, Course math, Course chemical, Course physical) {
        this.name = name;
        this.studentNo = studentNo;
        this.classes = classes;
        this.math = math;
        this.chemical = chemical;
        this.physical = physical;
        calculatorAverage();
        this.isPass = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(String studentNo) {
        this.studentNo = studentNo;
    }

    public Integer getClasses() {
        return classes;
    }

    public void setClasses(Integer classes) {
        this.classes = classes;
    }

    public Course getMath() {
        return math;
    }

    public void setMath(Course math) {
        this.math = math;
    }

    public Course getChemical() {
        return chemical;
    }

    public void setChemical(Course chemical) {
        this.chemical = chemical;
    }

    public Course getPhysical() {
        return physical;
    }

    public void setPhysical(Course physical) {
        this.physical = physical;
    }

    public Double getAverage() {
        return average;
    }

    public void setAverage(Double average) {
        this.average = average;
    }

    public Boolean getPass() {
        return isPass;
    }

    public void setPass(Boolean pass) {
        isPass = pass;
    }

    public void addBulkExamNote(int math, int pyhsical, int chemical) {
        if (math >= 0 && math <= 100) {
            this.getMath().setNote(math);
        }

        if (pyhsical >= 0 && pyhsical <= 100) {
            this.getPhysical().setNote(pyhsical);
        }

        if (math >= 0 && math <= 100) {
            this.getChemical().setNote(chemical);
        }
    }

    public void isPass() {
        if (this.getMath().getNote() == 0 || this.getPhysical().getNote() == 0 || this.getChemical().getNote() == 0) {
            System.out.println("Not Completed!");
        } else {
            this.setPass(this.isCheckPass());
            printNote();
            System.out.println("Ortalama: " + this.getAverage());
            if (this.getPass()) {
                System.out.println("Geçti");
            } else {
                System.out.println("Kaldı");
            }
        }
    }

    public void calculatorAverage() {
        Double average = (double) ((this.getPhysical().getNote() + this.getChemical().getNote() + this.getMath().getNote()) / 3);
        this.setAverage(average);
    }

    public Boolean isCheckPass() {
        calculatorAverage();
        return this.getAverage() > 55;
    }

    public void printNote() {
        System.out.println("==========================================");
        System.out.println("Öğrenci: " + this.getName());
        System.out.println("Matematik Notu: " + this.getMath().getNote());
        System.out.println("Fizik Notu: " + this.getPhysical().getNote());
        System.out.println("Kimya Notu: " + this.getChemical().getNote());
    }
}
