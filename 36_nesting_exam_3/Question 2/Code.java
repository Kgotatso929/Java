public int setVar(int a, int b, float c){
	....
}

public int setVar(int a, float b, int c){
	return this(a, c, b);
}

public int setVar(int a, int y, float c){
	return c * a;
}

public float setVar(int a, int y, float c){
	return c * a;
}