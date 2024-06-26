import java.util.Stack;

public class _10_Duplicate_Parenthesis {
    public static boolean isDuplicateParenthesis(String str){
        Stack<Character> s = new Stack<>();

        for(int i=0;i<str.length();i++){
            char currChar = str.charAt(i);

            if(currChar!=')'){
                s.push(str.charAt(i));
            }
            else{
                int count = 0;
                while(s.peek()!='('){
                    s.pop();
                    count++;
                }
                s.pop();

                if(count==0){
                    return true;
                }
            }
        }

        return false;
    }
    public static void main(String[] args) {
        String str = "(((a+b)+(c+d)))";
        System.out.println(isDuplicateParenthesis(str));
    }
}
