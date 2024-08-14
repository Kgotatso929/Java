Interface X1{ }
interface X2{ }
class A { }
class B extends A implements X1{ }
class C extends B implements X2{
	D d = new D();
}
class D{ }