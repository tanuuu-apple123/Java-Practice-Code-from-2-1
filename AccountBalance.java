//imprting/accessing 
import mybank.Balance;
public class AccountBalance{
    public static void main(String args[])
    {
        Balance current[]=new Balance[3];
        current[0]=new Balance("Pratap",12323);
        current[1]=new Balance("Prasad",15702);
        current[2]=new Balance("Praveen",51233);
        for(int i=0;i<3;i++)
        {
            current[i].show();
        }
    }
}