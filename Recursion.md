##### - Calling a function by itself until a condition is met is known as the Recursion.


### Problem Questions on Recursion


##### Program to print name n times

```

int count = 0;

void printName(int n, String name) {

	if (count > n) {

		return;

	}

	System.out.println(name);

	count++;

	printName(n, name);

}
```


##### Program to Print from  1 to N

```
int count  = 0;

void printtoN(int n) {

	if (count > n) {

		return;

	}

	System.out.println(count);

	count++;

	printtoN(n);

}
```

#### Program to print from 1 to N using Backtracking

```
int count = 0;

void FBackTracking(int i, int n) {

	if (i < 1) {

		return;

	}

	FBackTracking(i - 1, n);

	System.out.println(i);

}

```

#### Program to print N to 1 using Backtracking

```
int count = 0;

void BBackTracking(int i, int n) {

	if (i > n) {

		return;

	}

	BBackTracking(i + 1, n);

	System.out.println(i);
}
```