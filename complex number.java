package Four;
/**
 * @author Kun Sun
 * @Date： 2013.10.15
 */
import java.util.Scanner;
 
public class Complex {// complex class
	 double real; // real part
	 double image; // imaginary part
	
	 Complex () {// Constructor without parameters
		Scanner input = new Scanner(System.in);
		double real = input.nextDouble();
		double image = input.nextDouble();
		Complex(real,image);
	}
 
	 private void Complex (double real, double image) {// Called by constructor without parameters
		// TODO Auto-generated method stub
		this.real = real;
		this.image = image;
	}
 
	 Complex (double real, double image) {// Construction method with parameters
		this.real = real;
		this.image = image;
	}
 
	public double getReal() {
		return real;
	}
 
	public void setReal(double real) {
		this.real = real;
	}
 
	public double getImage() {
		return image;
	}
 
	public void setImage(double image) {
		this.image = image;
	}
	
	 Complex add (Complex a) {// Add complex numbers
		double real2 = a.getReal();
		double image2 = a.getImage();
		double newReal = real + real2;
		double newImage = image + image2;
		Complex result = new Complex(newReal,newImage);
		return result;
	}
	
	 Complex sub (Complex a) {// Complex subtraction
		double real2 = a.getReal();
		double image2 = a.getImage();
		double newReal = real - real2;
		double newImage = image - image2;
		Complex result = new Complex(newReal,newImage);
		return result;
	}
	
	 Complex mul (Complex a) {// Multiply complex numbers
		double real2 = a.getReal();
		double image2 = a.getImage();
		double newReal = real*real2 - image*image2;
		double newImage = image*real2 + real*image2;
		Complex result = new Complex(newReal,newImage);
		return result;
	}
	
	 Complex div (Complex a) {// Divide complex numbers
		double real2 = a.getReal();
		double image2 = a.getImage();
		double newReal = (real*real2 + image*image2)/(real2*real2 + image2*image2);
		double newImage = (image*real2 - real*image2)/(real2*real2 + image2*image2);
		Complex result = new Complex(newReal,newImage);
		return result;
	}
	
	 public void print () {// output
		if(image > 0){
			System.out.println(real + " + " + image + "i");
		}else if(image < 0){
			System.out.println(real + "" + image + "i");
		}else{
			System.out.println(real);
		}
	}
}




package Four;
/**
 * @author Kun Sun
 * @Date： 2013.10.15
 */
 public class MainClass {// used to test plural class
 
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println ("Please ask the user to enter the real and imaginary parts of the first complex number:");
        Complex data1 = new Complex();
                 System.out.println ("Please ask the user to enter the real and imaginary part of the second complex number:");
        Complex data2 = new Complex();
       
                 // The following are addition, subtraction, multiplication and division
        Complex result_add = data1.add(data2);
        Complex result_sub = data1.sub(data2);
        Complex result_mul = data1.mul(data2);
        Complex result_div = data1.div(data2);
        
        result_add.print();
        result_sub.print();
        result_mul.print();
        result_div.print();
	}
}
