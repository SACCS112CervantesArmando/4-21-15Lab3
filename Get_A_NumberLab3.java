
public class Get_A_NumberLab3 {

public static void main(String[] args){
		
		RandomNumber myRandomNumber = new RandomNumber();
		
		int computerNum = myRandomNumber.Get_A_Number(1, 13);
		System.out.print(computerNum);
		computerNum = myRandomNumber.Get_A_Number(1,13);
		System.out.print(computerNum);
	}
}
