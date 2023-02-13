import java.util.Scanner;

import javax.sound.midi.VoiceStatus;



public class MainConsole {
    public MainConsole(){
        this.about();
        System.out.println("Feladat 301");
        String radiusStr=input("sugár");
        String heightStr=input("magasság");
        double radius=Double.parseDouble(radiusStr);
        double height=Double.parseDouble(heightStr);
        Cone cone = new Cone();
        System.out.println(cone.calcVolume(radius,height));
        
        

    }
    public String input(String msg){
        Scanner scanner=new Scanner(System.in);
        System.out.print(msg+" ");
        String text=scanner.nextLine();
        return text;
    }
    public void about(){

        System.out.println("--------------");
        System.out.println("Kovács Attila");
        System.out.println("Szoft I-1 N");
        System.out.println("2023-02-13");
        System.out.println("--------------");
        
    }
}
