public class Section {

    private String name;
    private int currentSize;
    public Teacher teacher;
    private Student[] student = new Student[50];


    public Section(String name){
        this.name=name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public String getName() {
        return name;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student[] getStudents() {
        return this.student;
    }

    public void addStudents(Student s){
        this.student[currentSize] = s;
        currentSize++;
    }

    public String toString(){
        String a = this.name + " is taught by " + this.teacher.getName() + " and has size " + this.currentSize +
                " students.";
        for(int i=0; i<this.currentSize; i++){
            a += student[i].getName();
            a += " , ";
        }
        return a;
    }


}
