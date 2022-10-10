public class LesMethodes {
    public static void main (String[] args){
        System.out.println("Utilisation de la methode addition de la class");
        int i=addition(12,78);
        System.out.println("12 + 78 = "+i);

        System.out.println("");
        System.out.println("Utilisation de la methode addition de la class LesMethodes2");
        int j=LesMethodes2.addition(34,118);
        System.out.println("34 + 118 = "+j);

        System.out.println("");
        System.out.println("Utilisation de la methode soustraction de la class LesMethodes3 (fichier externe)");
        int k=LesMethodes3.soustraction(34,118);
        System.out.println("34 - 118 = "+k);

    }

    static int addition(int val1, int val2){
        int result;
        result = val1 + val2;
        return result;
    }


}

class LesMethodes2 {
    static int addition(int val1, int val2){
        int result;
        result = val1 + val2;
        return result;
    }
}