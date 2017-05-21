package testeDeadlock;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;

public class TesteDeadLock extends Thread{

	private int id;
	private ArrayBlockingQueue<Integer> list;
	private Random r;
	private int count;

	public TesteDeadLock(int id, ArrayBlockingQueue<Integer> list, int count) {
		this.id = id;
		this.list = list;
		
		this.count = count;
		this.r = new Random();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();

		try {

			for(int i = 0 ; i < count; i++){
				list.add(r.nextInt(100));
//				Thread.sleep(100);
//
//				System.out.println("ID: " + id + ", list: " + list.toString());
			}

			while(true){
				System.out.println("ID: " + id + ", list: " + list.toString());
				Thread.sleep(1000);
			}

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static int teste(int n) throws Exception{
		
		System.out.println("Inicio");
		try{
			
			if(n == 0)
				throw new Exception("Erro");
			
			return n;
		}finally{
			System.out.println("Fim");
		}
		
	}


	public static void main(String[] args) throws Exception {

		System.out.println(teste(1));
		System.out.println(teste(0));
		
		
//		final int nElements = 2000000;
//		final int nThreads = 5;
//		final int count = nElements/nThreads;
//
//		ArrayBlockingQueue<Integer> filaArray = new ArrayBlockingQueue<Integer>(nElements);
//
//		//Criando a lista de Threads
//		Thread[] threadsArray = new Thread[nThreads];
//
//		for(int i = 0 ; i < nThreads ; i++){
//			threadsArray[i] = new TesteDeadLock(i, filaArray, count);
//		}
//
//		for(Thread t : threadsArray){
//			t.start();
//		}
//
//		//Execução de todas as Threads
//		for(Thread t : threadsArray){
//			t.join();
//		}

	}


}
