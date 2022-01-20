public class Person{
   //Attributes for persons age, name, gender and phone number
   private int age;
   private String name, gender, phoneNum;
   
   //Create getters and setters
   public int getAge(){
      return age;
   }
   public String getPhoneNum(){
      return phoneNum;
   }
   public String getName(){
      return name;
   }
   public String getGender(){
      return gender;
   }
   public void setAge(int age){
      this.age = age;
   }
   public void setPhoneNum(String phoneNum){
      this.phoneNum = phoneNum;
   }
   public void setName(String name){
      this.name = name;
   }
   public void setGender(String gender){
      this.gender = gender;
   }
   
   //Create constructors
   public Person(int age, String phoneNum, String name, String gender){
      this.age = age;
      this.phoneNum = phoneNum;
      this.name = name;
      this.gender = gender;
      }
   public Person(String name, String gender){
      this.name = name;
      this.gender = gender;
   }
   //Create toString method
   public String toString(){
      return "Hello my name is " + name + " I'm a " + gender + " student at Clayton State. " + "I'm " + age + " years old and my phone number is " + phoneNum + "." ;
   }
   //Create an equals method
   public boolean equals(Person that){
      return (this.age == that.age && (this.name).equals (that.name) && this.phoneNum == that.phoneNum && (this.gender).equals (that.gender));
   }
   //Create a copy constructor
   public Person(Person that){
      this.age = that.age;
      this.gender = that.gender;
      this.phoneNum = that.phoneNum;
      this.name = that.name;
   }
}