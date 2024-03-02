
[[Recursion]]


#### Parameterised Recursion


```
fun(i ,sum){
	if ( i< 1){
		print (sum);
		return;
	}
	f(i -1, sum + i);
}
```

#### Functional Recursion

```
fun(n){
	if (n == 0){
		return 0;
	}
	return n + fun(n- 1);
}
```

#### Factorial program

```
fact(n){
	if(n <= 1){
		return 1;
	}
	return n * fact(n-1);
}
```

```
fact(i, prod){
	if (i < 1){
		return 1;
	}
	fact(i-1, 1 * prod);
}
```

