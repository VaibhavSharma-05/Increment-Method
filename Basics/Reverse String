public class Vaibhav{
    public static void main(String args[]){

        StringBuilder va = new StringBuilder("Vaibhav");
        //loop
        for (int i=0; i<va.length()/2; i++){
            int front = i;
            int back = va.length()-i-1;

            char frontChar = va.charAt(front);
            char backChar = va.charAt(back);

            va.setCharAt(front , backChar);
            va.setCharAt(back , frontChar);
        }
        System.out.println(va);
    }
}