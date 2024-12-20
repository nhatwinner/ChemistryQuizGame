
package chemistryquizgame;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class chemistryquizgame1 {
    public static void main(String[] args) {
       
        try (Scanner scanner = new Scanner(System.in)) {
            
            String[] questions = {
                "ky hieu hoa học cua nuoc la gi ?",
                "so nguyen tu cua hydro la may ?",
                "cay hap thu khi gi trong qua trinh quang hop ?",
                "gia tri pH cua nuoc tinh khiet la bao nhieu ?",
                "khi nao co nhieu nhat o baou khi quyen trai dat ?"
            };
            
            String[] answers = {"H2O", "1", "CO2", "7", "Nitrogen"};
            
            int score = 0; 
            
            System.out.println("chao mung den tro choi do vui hoa hoc !");
            System.out.println("tra loi cac cau hoi duoi day :");
            
            
            for (int i = 0; i < questions.length; i++) {
                System.out.println("\ncau hoi  " + (i + 1) + ": " + questions[i]);
                System.out.print("cau tra loi cua ban : ");
                String answer = scanner.nextLine().trim();
                
               
                if (answer.equalsIgnoreCase(answers[i])) {
                    System.out.println("dung !");
                    score++;
                } else {
                    System.out.println("sai ! cau tra loi dung la : " + answers[i]);
                }
            }
            
           
            System.out.println("\ndo vui ket thuc!");
            System.out.println("ban co so diem la : " + score + " out of " + questions.length);
        }
    }
}

