package nl.utwente.di;

public class Quoter {
	
double getBookPrice(String s){
	double result=0.0;
	if(s.equals("1")){
		result= 10.0;
	}else if(s.equals("2")){
		result=45.0;
	}else if(s.equals("3")){
		result=20.0;
	}else if(s.equals("4")){
		result=35.0;
	}else if(s.equals("5")){
		result=50.0;
	}else if(s.equals("others")){
		result=0.0;
	}
return result;
}

}
