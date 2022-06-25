public class InviteList {

    public static void main(String[] args) {
        
        String[] persons = {"john", "johnathan", "johnny" , "johnin" , "john"};

        for(int i = 0; i < persons.length; i++){

            System.out.println(persons[i]);
        }

        System.out.println();
        for (String person : persons) {

            System.out.println(person);
        }
    }


}
