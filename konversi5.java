import java.util.Scanner;
public class konversi5
{
	public static void main (String[]args)
	{
		long angkar;
		Scanner masukan=new Scanner(System.in);
		System.out.print("masukan angka (max 1000): ");
		long angka=masukan.nextLong();
		int i=0;
		int j=0;
		angkar=angka;
		System.out.print("Maka bilangan angkanya : ");
		if(angka==1000)
		{
			System.out.print("Seribu");
		}
		while(angka>=100)
		{
			angka=angka-100;
			i++;
		}
		if(i==1)
		{
			System.out.print("Seratus ");
		}
		if(i==2)
		{
			System.out.print("Dua Ratus ");
		}
		if(i==3)
		{
			System.out.print("Tiga Ratus ");
		}
		if(i==4)
		{
			System.out.print("Empat Ratus ");
		}
		if(i==5)
		{
			System.out.print("Lima Ratus ");
		}
		if(i==6)
		{
			System.out.print("Enam Ratus ");
		}
		if(i==7)
		{
			System.out.print("Tujuh Ratus ");
		}
		if(i==8)
		{
			System.out.print("Delapan Ratus ");
		}
		if(i==9)
		{
			System.out.print("Sembilan Ratus ");
		}
		while(angka>=10)
		{
			angka=angka-10;
			j++;
		}
		if(j==1)
		{
			System.out.print("Sepuluh ");
		}
		if(j==2)
		{
			System.out.print("Dua Puluh ");
		}
		if(j==3)
		{
			System.out.print("Tiga Puluh ");
		}
		if(j==4)
		{
			System.out.print("Empat Puluh ");
		}
		if(j==5)
		{
			System.out.print("Lima Puluh ");
		}
		if(j==6)
		{
			System.out.print("Enam Puluh ");
		}
		if(j==7)
		{
			System.out.print("Tujuh Puluh ");
		}
		if(j==8)
		{
			System.out.print("Delapan Puluh ");
		}
		if(j==9)
		{
			System.out.print("Sembilan Puluh ");
		}
		if(angka==1)
		{
			System.out.print("Satu");
		}
		if(angka==2)
		{
			System.out.print("Dua");
		}
		if(angka==3)
		{
			System.out.print("Tiga");
		}
		if(angka==4)
		{
			System.out.print("Empat");
		}
		if(angka==5)
		{
			System.out.print("Lima");
		}
		if(angka==6)
		{
			System.out.print("Enam");
		}
		if(angka==7)
		{
			System.out.print("Tujuh");
		}
		if(angka==8)
		{
			System.out.print("Delapan");
		}
		if(angka==9)
		{
			System.out.print("Sembilan");
		}
		System.out.println();
		System.out.print("Maka angka romawinya : ");
		if(angkar>=1000)
		{
			angkar=angkar-1000;
			System.out.print("M");
		}
		if(angkar>=900)
		{
			angkar=angkar-900;
			System.out.print("CM");
		}
		if(angkar>=500)
		{
			angkar=angkar-500;
			System.out.print("D");
		}
		if(angkar>=400)
		{
			angkar=angkar-400;
			System.out.print("CD");
		}
		while(angkar>=100)
		{
			angkar=angkar-100;
			System.out.print("C");
		}
		if(angkar>=90)
		{
			angkar=angkar-90;
			System.out.print("XC");
		}
		if(angkar>=50)
		{
			angkar=angkar-50;
			System.out.print("L");
		}
		if(angkar>=40)
		{
			angkar=angkar-40;
			System.out.print("XL");
		}
		while(angkar>=10)
		{
			angkar=angkar-10;
			System.out.print("X");
		}
		if(angkar>=9)
		{
			angkar=angkar-9;
			System.out.print("IX");
		}
		if(angkar>=5)
		{
			angkar=angkar-5;
			System.out.print("V");
		}
		if(angkar>=4)
		{
			angkar=angkar-4;
			System.out.print("IV");
		}
		while(angkar>=1)
		{
			angkar=angkar-1;
			System.out.print("I");
		}
	}
}