package assignment1;

public class FastTrackBatchStudent extends Student {
	public double calculateFee(String course){
		double fee=0;
		double fastTrackFee=5000;
		if(course.equals("java")){
			fee=15000;
		}
		else if(course.equals("UI")){
			fee=12000;
		}
		else if(course.equals("testing")){
			fee=10000;
		}
		return fee+fastTrackFee;
		
	}

}
