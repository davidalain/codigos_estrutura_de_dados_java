package array;

public class Antivirus {

	public static boolean temAmeaca(byte[] arquivo, byte[] ameaca){
		
		for(int i = 0 ; i < arquivo.length ; i++){
			
			boolean contem = true;
			
			for(int j = 0 ; j < ameaca.length ; j++){
				
				if(arquivo[i] == ameaca[j]){
					i++;
				}else{
					contem = false;
					break;
				}
			}
			
			if(contem)
				return true;
		}
		
		return false;
	}
	
	
	public static void main(String[] args) {
		
		byte[] arquivo = {0,2,3,4,5,7};
		byte[] ameaca = {3,4,5};
		
		System.out.println(temAmeaca(arquivo, ameaca));
		
	}
	
}
