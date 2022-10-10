public class LesBoucles {
    public static void main (String[] args){
        System.out.println("Boucle for :");

        for(int i=1;i<5;i=i+1){
            System.out.println("Valeur de i:"+i);
        }

        System.out.println("");
        System.out.println("Boucle for (2 incrementations) :");
        int i2=0;
        for(int i=1;i<5;i++,i2++){
            System.out.println("Valeur de i:"+i);
        }
        System.out.println("Valeur de i2:"+i2);

        /*
        for(;;;) // for infini
        */



        System.out.println("");
        System.out.println("Boucle while :");

        int i=0;
        while(i<5){
            System.out.println("Valeur de i : "+i);
            i++;
        }

        /* 
        while(true){// while infini
            System.out.println("autre");
        }
        */

        System.out.println("");
        System.out.println("Boucle while infini avec condition de sortie interne :");
        i2=1;
        while(true){// while infini
            System.out.println("autre");
            if(i2==3)break;
            i2++;
            if(i2%2==0){
                continue;
            }
            System.out.println("i2 est impair ("+i2+")");    
        }
        System.out.println("Je suis sorti de la boucle");



        System.out.println("");
        System.out.println("Boucle do...while :");
        i=10;
        do{
            System.out.println("Valeur de i : "+i);
            i++;
        }
        while(i<5);
    }
}