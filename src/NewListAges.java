public class NewListAges {

    public static void main(String[] args) {

        int ages[] = { 18, 14, 19, 34, 12, 18, 22, 23 };


        for (int i = 0; i < ages.length; i++) {

            System.out.println("Idade:" + ages[i]);

            if (ages[i] > 18) {

                continue;
            }

            System.out.println("Idade:" + ages[i]);

            i++;
        }
    }
}
