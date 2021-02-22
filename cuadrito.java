import java.util.*;
public class cuadrito(){
	public cuadrito(){
		isCenter = false;
		isCorner = false;
		isSide = false;
		color = "";
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
