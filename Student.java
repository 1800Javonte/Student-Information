public class Student extends Person implements Comparable<Student>{
   //Declare variables
   private String major, classification;
   private double gpa;
   private static int idHelper = 900000;
   private String studentId;
   
   
   //Create constructor
   public Student( String major, String classification, String name, String gender, String phoneNum, int age, double gpa){
      super(age, phoneNum, name, gender);
      this.major = major;
      this.classification = classification;
      this.gpa = gpa;
      
      //Give a student their own copy of Id number
      studentId = Integer.toString(idHelper);
      
      //Increment id for the next student
      idHelper++;
   }
   public String getStudentId(){
      return studentId;
   }
         
   //Override toString method from Person class
   @Override
   public String toString(){
      return super.toString() + "\nI'm a " + classification + " at Clayton State and my major is " + major + "." + " My gpa is " + gpa + ".";
   }
   
   public int compareTo(Student that){
      if(this.gpa > that.gpa){
         return(1);
      }
      if(this.gpa < that.gpa){
         return(-1);
      }
      else{
         return 0;
      }
      
   }
   
   public static void main(String args[]){
      Student random = new Student("Computer Science", "sophomore", "Bobby", "male", "555 - 555 - 5555", 19, 2.25);
      System.out.println(random);
      Student random2 = new Student("Business", "Senior", "John", "male", "555 - 555 - 5555", 21, 2.53);
      Student random3 = new Student("Accounting", "Junior", "Joe", "male", "555 - 555 - 5555", 20, 3.53);
      Student random4 = new Student("Information Technology", "Freshman", "Jimmy", "male", "555 - 555 - 5555", 18, 3.23);
      
      
      //Test Override compareTo method
     System.out.println(random2.compareTo(random)); //2.53 > 2.25
     System.out.println(random.compareTo(random2)); //2.25 < 2.53
     System.out.println(random.compareTo(random)); //2.25 == 2.25
     System.out.println(random2.compareTo(random2)); //2.53 == 2.53
     System.out.println(random3.compareTo(random4)); //3.53 > 3.23
     System.out.println(random4.compareTo(random3)); // 3.23 < 3.53
     
     System.out.println("Random student id: " + random.getStudentId());
     System.out.println("Random2 student id: " + random2.getStudentId());
     System.out.println("Random3 student id: " + random3.getStudentId());
   }
   
   
}