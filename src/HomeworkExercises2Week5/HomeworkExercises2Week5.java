package HomeworkExercises2Week5;


public class HomeworkExercises2Week5 {

   
    public static void main(String args[]) {
    
        int day = 1 + (int)(Math.random() * 7);
        
        switch(day) {
            case 1:
                System.out.println("1 - Monday");
                break;
            case 2:
                System.out.println("2 - Tuesday");
                break;
            case 3:
                System.out.println("3 - Wednesday");
                break;
            case 4:
                System.out.println("4 - Thursday");
                break;
            case 5:
                System.out.println("5 - Friday");
                break;
            case 6:
                System.out.println("6 - Saturday");
                break;
            case 7:
                System.out.println("7 - Sunday");
        }
    }
}
