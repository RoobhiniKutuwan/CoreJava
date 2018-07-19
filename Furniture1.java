public class Furniture1 {
	public double CalculateDiscount(cot c)
	{
		return c.price*0.1;
	}
	public double CalculateDiscount(table t)
	{
		return t.price*0.2;
	}
	public double CalculateDiscount(dining d)
	{
		return d.price*0.15;
	}
}