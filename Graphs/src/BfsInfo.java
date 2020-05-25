
public class BfsInfo {

	public BfsInfo() {
	    this.distance = -1;
	    this.predecessor = -1;
	  }
	  
	  public BfsInfo(int distance, int predecessor) {
	    this.distance = distance;
	    this.predecessor = predecessor;
	  }
	  
	  public int distance;
	  public int predecessor;
	
}
