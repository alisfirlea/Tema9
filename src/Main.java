public class Main {

    public static void main(String[] args) {
        double distanta= 10.0; //km
        double dCluj;
        double vitIon=50;
        double vitFlorica=30;
        vitIon=vitIon/50;
        vitFlorica=vitFlorica/30;
        double k;
        k=distanta/(vitIon+vitFlorica);
        System.out.println("cei doi se intalnesc dupa "+k+" minute de la plecare");
        dCluj=vitIon *k;
        System.out.println("La " +dCluj + " km distanta de Cluj");

    }
}
