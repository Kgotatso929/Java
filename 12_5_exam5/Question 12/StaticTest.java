class StaticTest{
	void m1(){
		StaticTest.m2();
		m4();
		StaticTest.m3();
	}

	Static void m2(){}
	void m3(){
	m1();
	m2();
	StaticTest.m1();
	}
	static void m4(){}
}