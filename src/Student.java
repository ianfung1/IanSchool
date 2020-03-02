public class Student extends Person{

    private int grade;
    private int sectionCount=0;
    private Section[] sections = new Section[10];

    public Student(String name, int grade){
        super(name);
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }


    public Section[] getSections() {
        return sections;
    }

    public void addSection(Section s){
        sections[sectionCount] = s;
        sectionCount++;
    }

    public String toString(){
        String c = name + " is in " + this.grade +  " and is enrolled in the following sections: ";
        for(int i=0; i<this.sectionCount; i++){
            c+=sections[i].getName();
            c+= "(" + sections[i].getTeacher() + ")";
        }
        return c;
    }
}
