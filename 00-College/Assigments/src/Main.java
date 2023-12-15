import DS.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int opt;
        while (true){
            System.out.println("Select a Option");
            System.out.println("1. Reverse a String");
            System.out.println("2. Implement Queue operations");
            System.out.println("3. Exit");
            opt = in.nextInt();

            switch (opt){
                case 1:
                    reverseString();
                    break;
                case 2:
                    System.out.println("Enter the number of element you want to add in Queue");
                    int no = in.nextInt();
                    queue queue = new queue(no);
                    for (int i = 0; i < no ; i++) {
                        System.out.println("Enter the element " + (i + 1));
                        int num = in.nextInt();
                        queue.add(num);
                    }
                    while (true){
                        System.out.println("Select option");
                        System.out.println("1. Display");
                        System.out.println("2. Delete");
                        System.out.println("3. Exit");
                        int option = in.nextInt();
                        switch (option){
                            case 1:
                                queue.display();
                                break;
                            case 2:
                                queue.delete();
                                break;
                            case 3:
                                System.exit(0);
                        }
                    }
                case 3:
                    System.exit(0);
            }
        }

    }

    public static void reverseString() throws Exception{
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string you want to reverse: ");
        String str = in.next();
        stack stack = new stack(str.length());
        String reverseStr = "";
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            stack.push(ch);
        }
        while(!stack.isEmpty()) {
            reverseStr += stack.pop();
        }
        System.out.println(reverseStr);
    }
}