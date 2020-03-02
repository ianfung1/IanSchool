public class Runner {

    public static void main(String[] args){

        School berkeleyHigh = new School("Berkeley High");

        Section math = new Section("Math");
        Section biology = new Section("Biology");
        Section compSi = new Section("Computer Science");

        Teacher albinson = new Teacher("Albinson", "Computer Science");
        Teacher mueller = new Teacher("Mueller", "Biology");
        Teacher goodrich = new Teacher("Goodrich", "Math");

        Student me = new Student("Me",100);
        Student james = new Student("James", 50);
        Student lilah = new Student("Lilah",20);
        Student rayna = new Student("Rayna",70);
        Student zoidis = new Student("Zoidis",80);
        Student afraz = new Student("Afraz",90);

        berkeleyHigh.addSection(math);
        berkeleyHigh.addSection(biology);
        berkeleyHigh.addSection(compSi);

        math.setTeacher(goodrich);
        biology.setTeacher(mueller);
        compSi.setTeacher(albinson);

        goodrich.addSection(math);
        mueller.addSection(biology);
        albinson.addSection(compSi);

        math.addStudents(me);
        biology.addStudents(james);
        compSi.addStudents(afraz);
        math.addStudents(lilah);
        biology.addStudents(zoidis);
        compSi.addStudents(rayna);

        me.addSection(math);
        james.addSection(biology);
        afraz.addSection(compSi);
        lilah.addSection(math);
        zoidis.addSection(biology);
        rayna.addSection(compSi);


        System.out.println(math.toString());
        System.out.println(biology.toString());
        System.out.println(compSi.toString());

        System.out.println(albinson.toString());
        System.out.println(mueller.toString());
        System.out.println(goodrich.toString());

        System.out.println(me.toString());
        System.out.println(james.toString());
        System.out.println(afraz.toString());
        System.out.println(lilah.toString());
        System.out.println(zoidis.toString());
        System.out.println(rayna.toString());
    }
}
