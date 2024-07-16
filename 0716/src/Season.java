

// java's API Annotation
/**
 * @author Shinwook
 * @version 1.0.0
 * @Since jdk 17
 */
public enum Season {
	spring(1), summer(100), fall(1000), winter(3000);
	private int value;
	Season(int i) {
		this.value = value;
	} 
	public int getValue() {
		return this.value;
	}
} 

