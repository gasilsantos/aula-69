public class ListPersons {
    
    public static void main(String[] args) {
        
        String persons[] = {"joão","Maria", "Joana" };

        int i = 2;
        do {
            if(i > persons.length){
                System.out.println("Indice inválido");
                break;
            }

            System.out.println(persons[i]);
            i++;
        }while(i<persons.length);
    }
}
