package javathread;

class RunThread extends Thread {
	private boolean isRunning = true;
	
	public boolean isRunning() {
		return isRunning;
	}
	
	public void setRunning(boolean isRunning) {
		this.isRunning = isRunning;
	}
	
	@Override
	public void run() {
		System.out.println("enters run()");
		while(isRunning) {
			;
		}
		System.out.println("thread has been terminated");
	}
}


public class RunDeadThread2 {
	public static void main(String[] args) {
		try {
			RunThread thread = new RunThread();
			thread.start();
			Thread.sleep(1000);
			thread.setRunning(false);
			System.out.println("set as false");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}











