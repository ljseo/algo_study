import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class s계산기3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = 10;

        for(int t = 1; t<=T; t++){
            int n = Integer.parseInt(br.readLine());
            String s = br.readLine();
            char[] cArr = s.toCharArray();
            Stack<Character> symbolStack = new Stack<>();
            Stack<Integer> numStack = new Stack<>();

            for(int i = 0; i<n; i++){
                char c= cArr[i];
                if(c == '('){
                    symbolStack.push(c);
                }
                //여는 괄호가 나오면 닫는 괄호가 나올 때 까지 연산진행
                // 그런데 이때 + 가 나왔을 때 이전에 *가 있을 가능성이 있나?
                // -> 없다 +가 나오면 이전에 *가 있는지 확인하고 있으면 연산 후 + 를 집어넣기 때문
                else if(c == ')'){
                    while(!symbolStack.isEmpty() && symbolStack.peek() != '('){
                        int num = calculation(numStack.pop(),numStack.pop(),symbolStack.pop());
                        numStack.push(num);
                    }
                    symbolStack.pop();
                }
                else if(c == '+'){
                    while (!symbolStack.isEmpty() && symbolStack.peek() == '*'){
                        int num = calculation(numStack.pop(),numStack.pop(),symbolStack.pop());
                        numStack.push(num);
                    }
                    symbolStack.push(c);
                }
                else if(c == '*'){
                    symbolStack.push(c);
                }
                else {
                    numStack.push(c-'0');
                }
            }

            while(!symbolStack.isEmpty()){
                int num = calculation(numStack.pop(),numStack.pop(),symbolStack.pop());
                numStack.push(num);
            }
            System.out.println("#" + t + " " + numStack.pop());
        }
    }
    public static int calculation(int num1, int num2, char symbol){
        if(symbol == '+'){
            return num1 + num2;
        } else {
            return num1 * num2;
        }
    }
}

// - v2
// - 후위 표기법으로 변경하여 풀이
// - 이 때 result를 String으로 사용하지 않고, StringBuilder를 사용해야함

// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;
// import java.util.Stack;


// public class s계산기3{
//     public static void main(String[] args) throws IOException {
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         int T = 10;

//         for(int t = 1; t<=T; t++){
//             int n = Integer.parseInt(br.readLine());
//             String s = br.readLine();
//             String postfix = infixToPostfix(s);
//             int result = calculation(postfix);


//             System.out.println("#" + t + " " + result);
//         }
//     }

//     private static int calculation(String s) {
//         char[] cArr = s.toCharArray();
//         Stack<Integer> stack = new Stack<>();
//         int length = cArr.length;
//         for (int i = 0; i < length; i++) {
//             char c = cArr[i];
//             if(c >= '0' && c <= '9') {
//                 stack.push(c - '0');
//             }
//             else {
//                 if(c == '*'){
//                     stack.push(stack.pop() * stack.pop());
//                 }
//                 else{
//                     stack.push(stack.pop() + stack.pop());
//                 }
//             }
//         }
//         return stack.pop();
//     }

//     private static String infixToPostfix(String s) {
//         StringBuilder sb = new StringBuilder();
//         char[] cArr = s.toCharArray();
//         Stack<Character> stack = new Stack<>();
//         int length = cArr.length;
//         for (int i = 0; i < length; i++) {
//             char c = cArr[i];
//             if (c == '(') {
//                 stack.push(c);
//             }
//             else if (c == ')') {
//                 while(!stack.isEmpty() && stack.peek() != '('){
//                     sb.append(stack.pop());
//                 }
//                 stack.pop();
//             }
//             else if (c == '+'){
//                 while (!stack.isEmpty() && stack.peek() == '*'){
//                     sb.append(stack.pop());
//                 }
//                 stack.push(c);
//             }
//             else if (c == '*'){
//                 stack.push(c);
//             }
//             else{
//                 sb.append(c);
//             }
//         }
//         while(!stack.isEmpty()){
//             sb.append(stack.pop());
//         }
//         return sb.toString();
//     }

// }
