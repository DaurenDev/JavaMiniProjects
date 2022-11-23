package ACM_ALgorithms;

public class OtherAlgorithms {
    static boolean isPalindrome(int num){
        String str = Integer.toString(num);

        int left = 0;
        int right = str.length() - 1;

        if(str.length() == 1){
            return true;
        }

        else if(str.length() == 2){
            if(str.charAt(0) != str.charAt(1)){
                return false;
            }
        }
        else if(str.length() > 2){
            while(left < right){
                if(str.charAt(left) != str.charAt(right)){
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;
    }

    static boolean checkVariableName(String word){
        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i) == ' '){
                return false;
            }
            if(word.charAt(0) <= 9){
                return false;
            }
            if(word.charAt(i) == '&'){
                return false;
            }
            if(word.charAt(i) == '.' && i > 0){
                return false;
            }
        }
        return true;
    }
}
