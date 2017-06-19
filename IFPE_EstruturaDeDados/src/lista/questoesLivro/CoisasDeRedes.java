package lista.questoesLivro;

import java.util.Arrays;

public class CoisasDeRedes {

	public static void imprimeIPv4Bin(long ipBin){
		for(int i = 0 ; i < 32 ; i++){
			if(i % 8 == 0 && i != 0)
				System.out.print(".");
			System.out.print(((ipBin & (1 << (31 - i))) == 0) ? 0 : 1);
		}
		System.out.println();
	}

	public static long getMascaraBin(long maskNum){
		long maskBin = 0;
		for(long i = 0 ; i < 32 ; i++ ){
			maskBin |= (1 << (31 - i));
		}
		return maskBin;
	}

	public static long aplicaMascara(long ipBin, long maskNum){
		return ipBin & getMascaraBin(maskNum);
	}

	public static void coisasDeRede(){
		//int[] ip = {246, 172, 8, 24};
		long[] ip = {255, 128, 127, 0};
		long valor = (ip[0] << 24) | (ip[1] << 16) | (ip[2] << 8) | (ip[3]);

		System.out.println(Arrays.toString(ip));
		imprimeIPv4Bin(valor);

		valor = getMascaraBin(16);
		imprimeIPv4Bin(valor);
	}
	
	public static void main(String[] args) {
		
		coisasDeRede();
		
	}

}
