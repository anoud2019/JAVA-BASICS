public class StudentInfo {
    public static void main(String[] args) {
        int id=12;
        int age=20;
        age=age+1;
        String name="Alanoud";
        String[] subjects={"Science","Technology","math","English"};
        String[] grades={"A","B","C","D"};
        int[] numbers={1,2,3,4,5};
        System.out.println("ID:"+id+"\n"+"age:"+age+"\n"+"Name:"+name);
        for (int i=0;i<subjects.length;i++) {
            System.out.println(numbers[0] + " " + "Subject: " + subjects[0] + " Grade: " + grades[0] + "numbers: " + numbers[0]);

        }

    }
}
