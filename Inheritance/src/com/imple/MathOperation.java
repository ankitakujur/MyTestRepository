package com.imple;

public interface MathOperation {
int add(int x,int y);
int div(int x,int y);
default double area(int radius)
{
	return 100;
}
 default String greeting()
 {
 return "hello";

}
class myimpl implements  MathOperation{

	@Override
	public int add(int x, int y) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int div(int x, int y) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String greeting() {
		// TODO Auto-generated method stub
		return MathOperation.super.greeting();
	}



}