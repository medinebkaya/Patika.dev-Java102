package genericMethodsHackerrank;

class Printer
{
    public <T> void printArray(T[] dizi){
        for(T x: dizi){
            System.out.println(x);
        }
    }
}
