public class LeIf {
    public static void main (String[] args){
        System.out.println("if :");
        
        int i1,i2;

        i1=12;
        i2=7;
        if(i1 >= i2){
            System.out.println("i1 plus grand que i2");
        }


        System.out.println("");
        System.out.println("if...else :");
        if(i1 == i2){
            System.out.println("i1 egale i2");
        }
        else{
            System.out.println("i1 different de i2");
        }


        System.out.println("");
        System.out.println("if...else if...else if...else :");

        

        if(i1 == i2){
            System.out.println("i1 egale i2");
        }
        else if(i1 < i2){
            System.out.println("i1 inferieur a i2");
        }
        else if(i1 > i2){
            System.out.println("i1 superieur a i2");
        }
        else{
            System.out.println("Je ne sais pas");
            throw new RuntimeException("je ne dois pas passer par ici");
        }


    }
    
}