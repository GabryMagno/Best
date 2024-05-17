//prova
package it.unipd.mtss;

public class ArabsToRomans {
    public static String Converter(int a)  throws NumberZeroException,NegativeNumberException,NumberBiggerThan4000Exception{

        if(a==0) {throw new NumberZeroException(); }
        if(a<0) {throw new NegativeNumberException();}
        if(a>3999) {throw new NumberBiggerThan4000Exception();}

        String[] thousands = {"", "M","MM","MMM"};
        String[] hundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] units = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

        return (thousands[a / 1000] + hundreds[(a % 1000) / 100] + tens[(a % 100) / 10] + units[a % 10]);
    }
    /*
    public static void main(String[] args) throws NumberZeroException,NegativeNumberException,NumberBiggerThan4000Exception{
        ArabsToRomans ar=new ArabsToRomans();
        Scanner s=new Scanner(System.in);
        System.out.print("Inserire un numero:");
        int numero_arabo;
        numero_arabo=s.nextInt();
        System.out.println(ar.Converter(numero_arabo));
    }
    */
}
