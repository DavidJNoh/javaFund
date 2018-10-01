import java.util.ArrayList;

public class BasicTool{
    public void OneTo255(){
        for(int i = 1; i<=255; i++ ){
            System.out.println(i);
        }
    }
    public void OneTo255Odd(){
        for(int i = 1; i<=255; i++ ){
            if(i % 2 == 1){
                System.out.println(i);
            }
        }
    }
    public void SumTo255(){
        int newshit = 0;
        int sum = 0;
        for(int i = 0; i<=255; i++ ){
            newshit = i;
            sum += i;
            System.out.println("New number " + newshit + " Sum " + sum);
        }
    }
}