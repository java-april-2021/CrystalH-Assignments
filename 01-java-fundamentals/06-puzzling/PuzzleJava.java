import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class PuzzleJava {
    public static void main(String[] args) {
        int[] nums = {3,5,1,2,7,9,8,13,25,32};


        String[] names = {"Nancy", "Jinchi", "Fujibayashi", "Momochi", "Ishikawa"};
        
        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (char ch = 'a'; ch <= 'z'; ++ch){
            alphabet.add(ch);
        }

        System.out.println(alphabet);
        Collections.shuffle(alphabet);
        System.out.println(alphabet);
        System.out.println(alphabet.get(25));
        System.out.println(alphabet.get(0));
        }
    }

    public static int[] greaterThan10(int[] nums) {
        int sum = 0;
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            sum = sum + nums[i];
            if(nums[i] > 10){
                count++;
            }
        }
        System.out.println(sum);



        int[] array = new int[count];
        int idx = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 10){
               array[idx] = nums[i];
               idx++;
            }
        }
        return array;
    }

    public static String[] names(String[] names){
        
    }
}
