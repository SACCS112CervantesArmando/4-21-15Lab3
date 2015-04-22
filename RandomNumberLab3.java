
public class RandomNumberLab3 {

	private int computerNum;
	
	public int Get_A_Number(int high)
	{
		computerNum = 1 + (int) (Math.random() * high);
		
		return computerNum;
	}
	
	public int Get_A_Number(int lo,int high)
	{
		computerNum = lo + (int) (Math.random() * high);
		
		return computerNum;
	
	}
	
	public void GetLowNumber(){
		return
	}
	
	public void GetHighNumber(){
		
	}
}

