public class ListAges {
    
    public static void main(String[] args) {
        
        int ages[] = {18,20,19,34,12,18,22,23};

        int i = 0;

        boolean m = false;

        while (i < ages.length){
            System.out.println("idade:" + ages[i]);
            i++;
        }

        while (m) {
            System.out.println("Idade:" + ages[i]);

            if (ages[i] < 18){
                System.out.println("Menor de idade");
                m = true;
            }

            i++;
        }
    }
}
