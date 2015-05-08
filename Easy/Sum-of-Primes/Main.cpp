#include <iostream>

int main() {

	int s = 2;
	int count = 1;
	for (int i = 3; count < 1000; i+=2) {
		bool isPrime = true;
		for (int j = 3; j < i / 2; j+=2) {
			if (i % j == 0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime) {
			s += i;
			count++;
		}
	}
	std::cout << s;
	return 0;
}
