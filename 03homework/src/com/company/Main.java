package com.company;

public class Main {
    public static void main(String[] args) {
        Teacher teacherEnginDemirog = new Teacher(1, "Engin Demiroğ", "Yazılım geliştirmeye lisede \"yazılım\" bölümünde okurken başladım.");
        Teacher teacherMustafaMuratCoskun = new Teacher(2, "Mustafa Murat Çoşkun", "yatwuloşduhıauwkl gh8awıugdh ıuakwjdsn ıhakwj bsdıuakwjd");
        Course javaCourse = new Course(teacherEnginDemirog, 1, "Yazılım Geliştirici Yetiştirme Kampı (JAVA + REACT)");
        Course cSharpCourse = new Course(teacherMustafaMuratCoskun, 2, "Yazılım Geliştirici Yetiştirme Kampı (C# + ANGULAR)");

        Teacher[] teachers = {teacherEnginDemirog, teacherMustafaMuratCoskun};
        Course[] courses = {javaCourse, cSharpCourse};

        UserHelper userHelper = new UserHelper();

        for (Teacher teacher : teachers) {
            System.out.println(teacher + "\n");
        }
        for (Course course : courses) {
            System.out.println(course + "\n");
        }
        userHelper.exitTheAccount();
        userHelper.signIn();
    }
}
