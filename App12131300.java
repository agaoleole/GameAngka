import java.util.Scanner;

/**
 *
 * @Newbie
 */
public class App12131300 {
    public static void main(String[] args) {
    int jumlah = 0;
    int input  = 0;
    String a   = "y";
    int poin   = 0;
    int jawab;

		do {
		System.out.println ("Skor pertama anda adalah Nol");
        System.out.println ("Jika jawaban  anda benar Bertambah1");
        System.out.println ("Jika jawaban  anda salah Dikurangi 1");
        Scanner scan = new Scanner (System.in);

		System.out.print("1+5=");
			jawab = scan.nextInt();
		
		if(jawab==6){
			System.out.println("jawaban anda benar");
			System.out.print("poin anda adalah:");
			System.out.println(poin+=1);
		}
		
		else {
			System.out.println("jawaban anda salah");
			System.out.print("poin anda adalah:");
			System.out.println(poin-=1);
		}
			
		System.out.print("6:2=");
			jawab = scan.nextInt();
		if(jawab==3){
			System.out.println("jawaban anda benar");
			System.out.print("poin anda adalah:");
			System.out.println(poin+=1);
		}
 
		else {
			System.out.println("jawaban anda salah");
			System.out.print("poin anda adalah:");
			System.out.println(poin-=1);
		}
   
		System.out.print("5+5=");
			jawab = scan.nextInt();
		if(jawab==10){
			System.out.println("jawaban anda benar");
			System.out.print("poin anda adalah:");
			System.out.println(poin+=1);
		}
 
		else {
			System.out.println("jawaban anda salah");
			System.out.print("poin anda adalah:");
			System.out.println(poin-=1);}
 
		System.out.print("5x5=");
			jawab = scan.nextInt();
		if(jawab==25){
			System.out.println("jawaban anda benar");
			System.out.print("poin anda adalah:");
			System.out.println(poin+=1);
		}
 
		else {
			System.out.println("salah");
			System.out.print("poin anda adalah:");
			System.out.println(poin-=1);
		}
 
		System.out.print("12+8=");
			jawab = scan.nextInt();
		if(jawab==20){
			System.out.println("jawaban anda benar");
			System.out.print("poin anda adalah:");
			System.out.println(poin+=1);}
 
		else {
			System.out.println("jawaban anda salah");
			System.out.print("poin anda adalah:");
			System.out.println(poin-=1);
		}
 
		System.out.print("4x4=");
			jawab = scan.nextInt();
		if(jawab==16){
			System.out.println("jawaban anda benar");
			System.out.print("poin anda adalah:");
			System.out.println(poin+=1);
		}
 
		else {
			System.out.println("jawaban anda salah");
			System.out.print("poin anda adalah:");
			System.out.println(poin-=1);
		}
 
		System.out.print("20+21=");
			jawab = scan.nextInt();
		if(jawab==41){
			System.out.println("jawaban anda benar");
			System.out.print("poin anda adalah:");
			System.out.println(poin+=1);
		}
 
		else {
			System.out.println("jawaban anda salah");
			System.out.print("poin anda adalah:");
			System.out.println(poin-=1);
		}

		System.out.print("10+65=");
			jawab = scan.nextInt();
		if(jawab==75){
			System.out.println("jawaban anda benar");
			System.out.print("poin anda adalah:");
			System.out.println(poin+=1);
		}
 
		else {
			System.out.println("salah");
			System.out.print("poin anda adalah:");
			System.out.println(poin-=1);
		}
 
		System.out.print("100-25=");
			jawab = scan.nextInt();
		if(jawab==75){
			System.out.println("benar");
			System.out.print("poin anda adalah:");
			System.out.println(poin+=1);
		}
 
		else {
			System.out.println("salah");
			System.out.print("poin anda adalah:");
			System.out.println(poin-=1);
		}
 
		System.out.print("12+7=");
			jawab = scan.nextInt();
		if(jawab==19){
			System.out.println("benar");
			System.out.print("poin anda adalah:");
			System.out.println(poin+=1);
		}
 
		else {
			System.out.println("salah");
			System.out.print("poin anda adalah:");
			System.out.println(poin-=1);}
         
            System.out.println("apakah anda ingin mengulang ? y/t)");
        a= scan.next();
		}while ("y".equals(a) );
  
    }
}