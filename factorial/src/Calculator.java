public class Calculator {

    int factorialResult(int num){
        int result = 1;
        for(int i=1;i<=num;i++){
            result = result * i;
        }
        return result;
    }
}
