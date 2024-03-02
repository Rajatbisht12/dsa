
[[Recursion]]

#### - Reverse an Array

```
fun( l, r){
	if (l >= r){
		return;
	}
	swap(a[l], a[r]);
	fun (l + 1, r - 1);
}
```

#### - Check a Function is a palindrome

```
fun(i){
	if(s[i] != s[n- i -1]){
		return false;
	}
	return fun(i+1);
}
```


## -  Tower of Hanoi

```
	void ToH(int n, int A, int B, int C){
		if(n>0){
			ToH(n-1, A ,C, B);
			printf("from %d to %d", A, C);
			ToH(n-1, B, A, C);
		}
	}
```


