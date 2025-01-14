//Viraj Walunj
package Lab1;
     public class Lab2 {
        public static void main(String[] args) {
            System.out.println("Main");
            Student student = new Student();
            student.dob="26-04-2005";
            student.gender="Male";
            System.out.println(student.dob);
            student.course();
            student.registration();
            Student student1 = new Student(76.5f,41,"987656788","02-03-2005","m");
            Student student2 = new Student(82.3f,15,"12345","09-98-25","f");
            Student student3 = new Student(23.2f,16,"45324232","23-04-23","f");
            Student student4 = new Student(34.2f,48,"2342342323","6-3-23","m");
            Student student5 = new Student(342.5f,45,"67554435","25-01-2005","m");
        }
    }
    class  Student{
        String gender;
        String dob;

        public Student(float weight , int roll, String phone, String dob, String gender) {
            this.weight = weight;
            this.roll = roll;
            this.phone = phone;
            this.dob = dob;
            this.gender = gender;
        }

        String phone;
        int roll;
        float weight;

        public Student() {
            System.out.println("No students found");
        }

        void course(){
            System.out.println("Successfully Completed!");
        }

        void registration(){
            System.out.println("incomplete");

        }
    }

