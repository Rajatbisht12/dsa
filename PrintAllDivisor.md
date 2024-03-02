[[Palindrome]]

**Using the Time Complexity of O(n)**

```
int Divisor(int n) {

	for (int i = 1; i <= n; i++) {

		if (n % i == 0) {

			System.out.println(i);

		}

	}

	return 0;

}
```


**Using time complexity of O(n log n)**


```
int SqrtDivisor(int n) {

	for (int i = 1; i <= Math.sqrt(n); i++) {

		if (n % i == 0) {

			System.out.println(i);

			if ((n / i) != 1) {

				System.out.println(n / i);

			}

		}

	}

	return 0;

}
```