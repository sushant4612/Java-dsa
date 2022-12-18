package Practice;

public class MultipleIfElse {
    public static void main(String[] args) {
        int salary = 5000;
        if (salary >5000){
            salary += 2000;
        }else if(salary == 5000){
            salary += 5000;
        }else{
            salary += 1000;
        }
        System.out.println(salary);
    }
}
