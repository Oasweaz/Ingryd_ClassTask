package inClass_week_2_1;

public class CastingTwo {
        private String name;
        private int age;
        private String gender;
        private String studentClass;
        private static int numberOfStudent;



        //constructor
        public CastingTwo(String name, int age, String gender, String studentClass){
            this.name = name;
            this.age = age;
            this.gender = gender;
            this.studentClass = studentClass;
            numberOfStudent++;
yesjj
        }

        //getters
        public static int getNumberOfStudent(){
            return numberOfStudent;
        }
        public String getName(){
            return name;
        }

        public int getAge(){
            return age;
        }

        public String getGender(){
            return gender;
        }

        public String getStudentClass(){
            return studentClass;
        }

//setters

        public void setName(String name){
            this.name = name;
        }

        public void setAge(int age){
            this.age = age;
        }

        public void setGender(String gender){
            this.gender = gender;
        }

        public void setStudentClass(String studentClass){
            this.studentClass = studentClass;
        }

        @Override
        public String toString() {
//        return "Student{" + "name='" + name + '\'' + ", age=" + age + ", gender='" + gender + '\'' + ", studentClass='" + studentClass + '\'' +
//                '}';
            return "Student name:"+ getName() +", Age:" +this.age+", Gender:"+gender+", Student class:"+studentClass;
        }

    }




    class ExecuteStudent{
        public static void main(String[] args){
            virtual_week_1_1.Student student1 = new virtual_week_1_1.Student("Sam", 5, "male", "java");
            virtual_week_1_1.Student student2 = new virtual_week_1_1.Student("mark", 54, "male", "data");
            virtual_week_1_1.Student student3 = new virtual_week_1_1.Student("sandra", 54, "female", "cyber");
            //virtual_week_1_1.Student student4 = new virtual_week_1_1.Student("John", 54, "male", "data");
            System.out.println(student1.toString());
            System.out.println(student1.getAge());
            System.out.println(virtual_week_1_1.Student.getNumberOfStudent());

            student1.setAge(90);
            System.out.println(student1.getAge());

        }






}
