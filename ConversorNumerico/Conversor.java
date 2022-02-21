public class Conversor {

	public static void ConvertirEnBin(int num) {
		int mod;
		String valor = "";
		while (num >= 2) {
			mod = num % 2;
			valor = valor + mod;
			num = num / 2;
			if (num < 2)
				valor = valor + num;
		}
		System.out.print(valor + '\n');
	}

	public static void convertirEnOctal(int num) {
		int mod;
		while (num >= 8) {
			mod = num % 8;
			System.out.print(mod);
			num = num / 8;
			if (num < 8)
				System.out.print(num + '\n');
		}
	}

	public static void convertirEnHexadecimal(int num) {
		int mod;
		if (num < 10)
			System.out.print(num);
		else if (num < 16)
			convertirEnLetraHexadecimal(num);
		else if (num >= 16) {
			while (num > 15) {
				//System.out.print(num / 16);
				mod = num % 16;
				if (mod > 9)
					convertirEnLetraHexadecimal(mod);
				else
					System.out.print(mod);
				num = num / 16;
			}
		}
		System.out.print(num + "\n");
	}

	public static void convertirEnLetraHexadecimal(int mod) {
		switch (mod) {
			case 10:
				System.out.print("A");
				break;
			case 11:
				System.out.print("B");
				break;
			case 12:
				System.out.print("C");
				break;
			case 13:
				System.out.print("D");
				break;
			case 14:
				System.out.print("E");
				break;
			case 15:
				System.out.print("F");
				break;
			default:
				System.out.println("ERROR");
		}
	}
}