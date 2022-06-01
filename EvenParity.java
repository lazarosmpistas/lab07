/**
 * Η ισοτιμία είναι ένα σύστημα που χρησιμοποιείται για την ανίχνευση λάθους μιας ακολουθίας από bits. Η άρτια ισοτιμία
 * εμφανίζεται ως "1" στο τέλος της ακολουθίας, συμβολίζοντας πως τα συνολικά bits με τιμή "1" (μαζί με το bit ισοτιμίας)
 * θα πρέπει να είναι άρτια σε πλήθος. Η περιττή ισοτιμία παίρνει αντίστοιχα την τιμή "0" και υποδεικνύει ότι τα συνολικά
 * bits τιμής "1" πρέπει να είναι περιττού πλήθους.
 */

public class EvenParity {
    public static void main(String[] args) {
        String BinaryNumber = "10001101011000";
        String [] arr = BinaryNumber.split("");
        int bitCounter = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i].equals("1"))
                bitCounter++;
        }
        String [] arr2 = new String[arr.length + 1];
        for(int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }
        if(bitCounter % 2 == 0)
            arr2[arr.length] = "0";
        else
            arr2[arr.length] = "1";
        for(int i = 0; i < arr2.length; i++)
            System.out.print(arr2[i]);
    }
}
