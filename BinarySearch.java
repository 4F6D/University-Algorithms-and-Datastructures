public class BinarySearch {


    public static void binarySearch(int min, int max, int lookFor) {
        int pointer = (min + max)/2;

        if(min > max) {
            System.out.println("Liste ist leer!");
        }
        else if(lookFor < pointer) {
            System.out.println(pointer);
            binarySearch(min, pointer-1, lookFor);
        }
        else if(lookFor > pointer) {
            System.out.println(pointer);
            binarySearch(pointer+1,max,lookFor);
        }
        else if(lookFor == pointer){
            System.out.println("Suche endet erfolgreich!");
            System.out.println(pointer);
        }
    }

    public static void main(String[] args) {
        binarySearch(1,10000, 126);
    }
}
