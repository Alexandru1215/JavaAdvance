import java.util.ArrayList;
import java.util.Scanner;
public class Male {
   // private String fname;
    //private String lname;
   // private int age;
  //  private double weight;
  //  private double height;
    Scanner sc = new Scanner(System.in);


   /* Male(String fname, String lname, int age, double weight, double height) {
        this.fname = fname;
        this.lname = lname;
        this.age = age;
        this.weight = weight;
        this.height = height;
*/

    public void  setInfo(ArrayList<String> data ,Scanner sc){

        for(int i=0;i< data.size();i++){
            String info = sc.nextLine();
            System.out.println(" Enter your info here "+data);
        }
    }

}
