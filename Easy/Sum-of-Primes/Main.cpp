#include <iostream>

int main() {

	int s = 0;
	int count = 0;
	for (int i = 2; count < 1000; i++) {
		bool isPrime = true;
		for (int j = 2; j < i - 1; j++) {
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
}
