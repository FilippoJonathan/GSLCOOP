import java.util.Scanner;

public class ProfessionPredictor {
		
		static void counting(int num) {
			if(num==101) {
				System.out.println("Kamu adalah Penggergaji kayu");
			}else if(num==102) {
				System.out.println("Kamu adalah Kasir");
			}else if(num==103) {
				System.out.println("Kamu adalah Janitor");
			}else if(num==104) {
				System.out.println("Kamu adalah Kuli");
			}else if(num==105) {
				System.out.println("Kamu adalah Dosen");
			}else if(num==106) {
				System.out.println("Kamu adalah Pemburu Ayam");
			}else if(num==107) {
				System.out.println("Kamu adalah Pengecat Pagar");
			}else if(num==108) {
				System.out.println("Kamu adalah Buruh");
			}else if(num==109) {
				System.out.println("Kamu adalah Penjaga Kandang Harimau");
			}else if(num==110) {
				System.out.println("Kamu adalah Penjual Gorengan");
			}else {
				System.out.println("Kamu adalah Dukun Pelet");
			}
		}
		
		static void algo(String name) {
			char[] arr = new char[name.length()];
			int hold = 0;
			int count = 0;
			for(int i=0;i<name.length();i++) {
				arr[i] = name.charAt(i);
				hold = arr[i];
				count = count + hold;
			}
			counting(count/name.length());
//			System.out.println(count/name.length());
		}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Opsi yang diinginkan (1=mulai || 0=berhenti) : ");
			int opt = sc.nextInt();
			if(opt==1) {
				System.out.println("Masukkan nama pertama kamu (dalam huruf kecil): ");
				String name = sc.next();
//				System.out.println(total);
//				System.out.println(name);
				algo(name);

			}else if(opt==0) {
				break;
			}
		}
	}

}
