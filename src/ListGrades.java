
public class ListGrades {

    public static void main(String[] args) {
        
        int grades[] = {50,70,40,80,20,100};
        
        double total = 0;

        double media = 0;

        for (int i = 0; i < grades.length; i++) {

            total += grades[i];

        }

        media = total/grades.length;

        if(media < 60) {
            System.out.println("Reprovado com média:" + media);
        }else{
            System.out.println("Aprovado com média:" + media);
        }
    }
    
}
