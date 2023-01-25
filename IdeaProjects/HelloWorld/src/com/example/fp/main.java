package com.example.fp;

public class main {
	public static void main(String[] args) {
		MyNumber num1;
		MyNumberPara num2;
		num1 = () -> {
			int total = 0;
			for (int i = 0; i < 5; i++) {
				total += i * 2;
			}
			return total;
		};
		num2 = (n, m) -> {
			return n < m? m * 2 : n * 3;
		};
		System.out.println(num1.getValue());
		System.out.println(num2.getValue2(3, 4));
		/* in C++, using std::functional<argTypes..., returnType>, or typeof or auto as explicit type
		    std::function<double(int, int)> func = [](int a, int b){ return (double)a / b; };
		    std::cout << std::setprecision(2) << func(1, 2) << std::endl;

		    typedef double(*functype4)(double, double);
		    functype4 func4 = [](double a, double b){ return a * b; };
		    std::cout << func4(3.14, 2.718) << std::endl;

		    using functype = double(*)(int, int);
		    functype func2 = [](int a, int b) { return (double)a * b; };
		    std::cout << func2(2, 3) << std::endl;

		    auto func3 = [](int n) {
		        int total = 0;
		        for(int i = 0; i < n; i++) {
		            total += i * 2;
		        }
		        return total;
		    };
		    std::cout << func3(5) << std::endl;

		* in Java, we have to use @FunctionalInterface to `typedef` or `alias` explicitly;
		*/
		MyNumber func = () -> { return 69; };
		System.out.println(func.getValue());

	}
}

@FunctionalInterface    // fi contains one and only one abstract method;
interface MyNumber {
	double getValue();
}

@FunctionalInterface
interface MyNumberPara {
	double getValue2(int a, int b);
}
