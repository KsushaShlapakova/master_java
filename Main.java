import java.util.Scanner;
public class Main {
    public static void firstTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter e: ");
        double e = scanner.nextDouble();
        System.out.print("Enter R: ");
        double R = scanner.nextDouble();
        double r;
        while (true) {
            System.out.print("Enter r: ");
            r = scanner.nextDouble();
            if (R != r) {
                break;
            }
            System.out.println("Variable r must be not equal R. Please try again.");
        }
        double result = (e / Math.pow(R + r, 2)) * r;
        System.out.println("Результат вычислений, P = " + result + " Вт");
    }

    public static void secondTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter music band name: ");
        String Name = scanner.next();
        System.out.print("Enter genre: ");
        String Genre = scanner.next();
        System.out.print("Enter members count of band: ");
        int MemberCount = scanner.nextInt();
        System.out.print("Is this band active (True/False)?: ");
        boolean isActive = scanner.nextBoolean();
        MusicBand musicBandTest = new MusicBand(Name, Genre, MemberCount, isActive);
        musicBandTest.getInfo();
    }

    public static void main(String[] args)
    {
        firstTask();
        System.out.println();
        secondTask();
    }
}