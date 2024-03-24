// variant 11

public class Main {
    public static void main(String[] args) {
        for(String s: args){
            System.out.println("- "+s);
        }

        String[] arr = bubbleSortofLength(args);

        System.out.println("Sort array of strings:");
        for(String s: arr){
            System.out.println("\t" + s.length() + ": " + s);
        }
    }
    static String[] bubbleSortofLength(String[] words){
        boolean flag = true;

        for(int i = 0; i < words.length - 1; i++){
            for(int j = 0; j < words.length - 1 - i; j++){
                if(words[j].length() > words[j+1].length()){
                    flag = false;
                    String temp = words[j];
                    words[j] = words[j+1];
                    words[j+1] = temp;
                }
            }
            if(flag) break;
            flag = true;
        }

        return words;
    }
}