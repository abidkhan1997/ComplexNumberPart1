//Abid Khan
//CS361

public class ComplexArithmetic
{
    public static void main(String[] args)
    {
        ComplexArithmetic comparith = new ComplexArithmetic(1, 7);
		ComplexArithmetic comparith2 = new ComplexArithmetic(6, 3);
		
		System.out.println("Adding - ");
		comparith.Adding(comparith2);
		comparith.print();
		System.out.println("Random Scalar Multipication - ");
		comparith.ScalarMultiplication(3);
		comparith.print();
		System.out.println("Multipication - ");
		comparith.Multiply(comparith2);
		comparith.print();
    }

    double r;
	double i;

    //Constructor
	public ComplexArithmetic(double a, double b) 
	{
		r = a;
		i = b;
	}

    //Adding
	public void Adding(ComplexArithmetic arith) 
	{
		this.r = this.r+ arith.r;
		this.i = this.i+ arith.i;
	}

    //Scalar multiplication
    public void ScalarMultiplication(double m) 
	{
		this.r = this.r*m;
		this.i = this.i*m;
	}

    //Multiplication
    public void Multiply(ComplexArithmetic arith) 
	{
		this.r = this.r*arith.r - this.i*arith.i;
		this.i = this.r* arith.i + this.i* arith.r;
	}

    //Printing using toString
	public void print() {
		String result;
		if(this.i>0) 
		{
			result = "       "+this.r+"+"+this.i+"i";	
		}
		else if (this.i < 0)
		{
			result = "       "+this.r+"-"+Math.abs(this.i)+"i";
		}
		else 
		{
			result = "       "+this.r;
		}
		System.out.println(result);
	}
}