
public class Try {

	public static void main(String[] args) {
		int a=9;
		switch(a) {
		case 10:
			{
				System.out.println(a--);
				break;
			}
		case 9:
		{
			System.out.println(a--);
			break;
		}
		case 8:
		{
			System.out.println(a--);
		}
		default:
		{
			System.out.println(a--);
		}
		}
	}
}
