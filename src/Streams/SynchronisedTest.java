package Streams;

class MyThread extends Thread {
	private String name;
	private Sample sample;

	public MyThread(String s, Sample sample) {
		name = s;
		this.sample = sample;
	}

	@Override
	public void run() {
		synchronized (System.out) {
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(sample);
		}
	}

}

class MyThread2 extends Thread{
	private Sample sample;
	
	public MyThread2(Sample sample){
		this.sample = sample;
	}
	@Override
	public void run(){
		synchronized(sample){
			System.out.println("Hello");
		}
	}
	
}

class Sample{
	
}
public class SynchronisedTest {

	public static void main(String[] args) {
		Sample sample = new Sample();
		MyThread thread = new MyThread("Nagabhushan", sample);
		thread.start();
		MyThread2 thread2 = new MyThread2(sample);
		thread2.start();

	}

}
