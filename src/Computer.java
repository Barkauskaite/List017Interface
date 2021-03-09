
public class Computer implements ComputerOperations {
	private String className ="";
	
	public void setClassName (String className) {
		this.className= className;
	}
	public String getClassName () {
		return className;
	}

	public void turnOn() {
		System.out.println(getClassName()+" is now turned on!");
	}


	public void turnOff() {
		System.out.println(getClassName()+" is now shutting down.");
	}
	
	public void performDownload() {
		System.out.println(getClassName()+" is now Downloading.");
	}

	public void performUpload() {
		System.out.println(getClassName()+" is now uploading.");
	}
	public void playVideo() {
		System.out.println(getClassName()+" is now playing video!");
		
	}
	public void playMusic() {
		System.out.println(getClassName()+" is now playing music!");	
	}
	
}
