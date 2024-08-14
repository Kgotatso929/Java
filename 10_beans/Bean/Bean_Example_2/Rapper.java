//Example of BeanStandard using Rapper
import java.io.Serializable;

public class Rapper implements Serializable{
	private String lyrical;
	private String flow;
	private String punchline;
	
	public String getLyrical(){
		return lyrical;
	}
	
	public void setLyrical(String lyrical){
		this.lyrical = lyrical;
	}
	
	public String getflow(){
		return flow;
	}
	
	public void setFlow(String flow){
		this.flow = flow;
	}
	
	public String getPunchline(){
		return punchline;
	}
	public void setPunchline(String punchline){
		this.punchline = punchline;
	}
}
