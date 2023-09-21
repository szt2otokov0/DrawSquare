import java.util.Scanner;

public class DrawSquare {
    public static void main(String[] args) {
        Runnable drawPercent = () -> System.out.print('%');
        Runnable drawSpace = () -> System.out.print(' ');
        Scanner scn = new Scanner(System.in);
        System.out.println("Add meg a magasságot:");
        int height = scn.nextInt();

        for(int i = 0; i < height; i++){
            drawPercent.run();
        }
        System.out.println();
        for(int i = 0; i < height-2; i++){
            drawPercent.run();
            for(int j = 0; j < height-2;j++){
                drawSpace.run();
            }
            drawPercent.run();
            System.out.println();
        }
        for(int i = 0; i < height; i++){
            drawPercent.run();
        }
    }
}