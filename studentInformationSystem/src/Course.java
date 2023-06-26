public class Course {
    private String name;
    private String code;
    private String prefix;
    private Integer note;
    private Teacher teacher;

    public Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public Integer getNote() {
        return note;
    }

    public void setNote(Integer note) {
        this.note = note;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void addTeacher(Teacher teacher){
        if(this.getPrefix().equals(teacher.getBranch())){
            this.setTeacher(teacher);
            System.out.println("Success");
        }
        else{
            System.out.println(teacher.getName()+" Akademisyen bu ders için uygun değil!");
        }
    }

    public void printTeacher(){
        if (teacher !=null){
            System.out.println(this.getName() + "Dersinin Akademisyeni: "+this.getTeacher().getName());
        }
        else {
            System.out.println(this.getName()+" Dersinin Akademisyeni Bulunmamaktadır!");
        }
    }
}
