 public class Main {
    public static void main(String[] args) {
        String name;
        String surname;
        int[] scores;
        scores = new int[3];
        scores[0] = 3;
        scores[1] = 2;
        scores[2] = 6;
        name = "Marek";
        surname = "Kowalski";
        System.out.println("Imie = " + name);
        System.out.println("Nazwisko = " + surname);
        System.out.println("Pierwsza ocena = "+ scores[0]);
        System.out.println("Druga ocena = "+ scores[1]);
        System.out.println("Trzecia ocena = "+ scores[2]);
    }
}