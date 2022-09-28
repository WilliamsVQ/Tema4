public class Main {
    public static void main(String[] args) {
        System.out.println("-------------------------Punto 1--------------------");
        System.out.println(Es(-3));
        System.out.println("-------------------------Punto 2--------------------");
        m3(-4);
        System.out.println("-------------------------Punto 3--------------------");
        System.out.println(m3Do(-2));
        fr();
        System.out.println("-------------------------Punto 4--------------------");
        est("Verano");
    }

    public static String Es(int numeroIf) {
        String a = "";
        if (numeroIf > 0) {
            a = "Es positivo";
        } else {
            if (numeroIf < 0) {
                a = "Es Negativo";
            } else {
                a = "Es Cero";
            }
        }
        return a;
    }
    public static void m3(int numeroWhile){

        while(numeroWhile<3) {
            numeroWhile++;
            System.out.println(numeroWhile);
        }
    }
    public static int m3Do(int numeroWhile){

        do{
            numeroWhile++;
        }while(numeroWhile<3);
        return(numeroWhile);
    }

    public static void fr(){
        for (int numeroFor =0; numeroFor<3;numeroFor++){
            System.out.println(numeroFor);
        }
    }
    public static void est(String a){
        switch (a)
        {
            case "Verano":
                System.out.println("Es Verano");
                break;
            case "Invierno":
                System.out.println("Es Invierno");
                break;
            case "Primavera":
                System.out.println("Es Primavera");
                break;
            case "Otoño":
                System.out.println("Es Otoño");
                break;
            default:
                System.out.println("No es Estacion");
        }
    }
}