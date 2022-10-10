public class LeSwitch {
    public static void main (String[] args){
        System.out.println("Exemple 1");
        char c='a';
        switch(c){
            case 'a':
                System.out.println("c vaut a");
            case 'i':
            case 'j':
                System.out.println("c vaut j");
            case 'e':
                System.out.println("c vaut e");
                break;
            case 'f':
                System.out.println("c vaut f");
                break;
            default:
                System.out.println("cas non géré");
                break;
        }

        System.out.println("");
        System.out.println("Exemple 2");
        String chaine3="salut";
        switch(chaine3){
            case "hello":
                System.out.println("Je te dis hello");
                break;
            case "salut":
                System.out.println("Je te dis salut");
                break;
            default:
                System.out.println("Je n'ai rien dit");
                break;
        }

        System.out.println("");
        System.out.println("Exemple 3 avec enum");
        FeuxTricolor feu=FeuxTricolor.VERT;
        switch(feu){
            case ROUGE:
                System.out.println("je m'arrete");
                break;
            case VERT:
                System.out.println("je passe");
                break;
                case ORANGE:
                System.out.println("j'accelere");
                break;
            default:
                System.out.println("Je force le passage");
                break;
        }

    }
    enum FeuxTricolor{VERT,ROUGE,ORANGE};
}