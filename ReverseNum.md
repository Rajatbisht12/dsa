[[Star Pattern(Pyramid)]]

```
int ReverseNum(int n) {

	int RevNum = 0;

	while (n > 0) {

		int Last_Digit = n % 10;

		n = n / 10;

		RevNum = (RevNum * 10) + Last_Digit;

	}

	return RevNum;

}
```