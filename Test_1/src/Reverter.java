import java.util.ArrayList;

public class Reverter {

    public static void main(String[] args) {
        System.out.println(modifyString("1wl4ei4"));
    }

    static String modifyString(String input){
        String [] strArr = input.split("");
        ArrayList<Integer> stringNums = new ArrayList<>();
        for (int i = 0; i < strArr.length; i++) {
            try{
                Integer num = Integer.parseInt(strArr[i]);
            }catch (NumberFormatException e){
                stringNums.add(i);
            }
        }

        for (int i = 0; i<stringNums.size()/2; i++){
            int left = stringNums.get(i);
            int right = stringNums.get(stringNums.size()-1-i);
            String tmp = strArr[right];
            strArr[right] = strArr[left];
            strArr[left] = tmp;
        }

        return String.join("", strArr);
    }


}
