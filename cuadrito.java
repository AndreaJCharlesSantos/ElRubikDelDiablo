import java.util.*;
public class cuadrito(){
	public class(){
		boolean isCenter = false;
		boolean isCorner = false;
		boolean isSide = false;
		String color = "";
	}
	
	public boolean setCenter(boolean a){
		isCenter = a;
	}

	public boolean setCorner(boolean b){
		isCorner = b;
	}

	public boolean setSide(boolean c){
		isSide = c;
	}	

	public boolean getIsCenter(){
		return isCenter;
	}

	public boolean getIsCorner(){
		return isCorner;
	}

	public boolean getIsSide(){
		return isSide;
	}	
}