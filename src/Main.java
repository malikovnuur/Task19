import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        switch (scanner.nextInt()){
            case 1:
                System.out.println(Week.ДҮЙШӨМБҮ.name()+ " " + Week.ДҮЙШӨМБҮ);
                break;
            case 2:
                System.out.println(Week.ШАРШЕМБИ.name()+ " " + Week.ШАРШЕМБИ);
                break;
            case 3:
                System.out.println(Week.ШЕЙШЕМБИ.name()+ " " + Week.ШЕЙШЕМБИ);
                break;
            case 4:
                System.out.println(Week.БЕЙШЕМБИ.name()+ " " + Week.БЕЙШЕМБИ);
                break;
            case 5:
                System.out.println(Week.ЖУМА.name()+ " " + Week.ЖУМА);
                break;
            case 6:
                System.out.println(Week.ИШЕМБИ.name()+ " " + Week.ИШЕМБИ);
                break;
            case 7:
                System.out.println(Week.ЖЕКШЕМБИ.name()+ " " + Week.ЖЕКШЕМБИ);
                break;
            default:
                System.out.println("Error");
        }

    }
}