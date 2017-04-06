public class TowerOfHanoi
{
	public static void main(String[] args){
		Hanoi("First","Second","Third", 3);
	}
	public static void Hanoi(String initial,String middle,String end, int height)
	{
		if(height == 0){
			return;
		}
		Hanoi(initial,end,middle,height-1);
		System.out.println( initial + "->" + end+"|"+height);
		Hanoi(middle,initial,end,height-1);
	}
}