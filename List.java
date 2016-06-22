
public class List extends Data{
	private double [] value;
	public List(double [] arr) {
		value = arr;
	}
	public double valueOf(){
		double result = 0.0;
		for (double i : value){
			result += i;
		}
		return result;
	}

}
