package primes.erathostenes ;

import java.math.BigInteger ;

public class Counter extends primes.Counter<Token> {
/*
private    BigInteger count ;
private    T tok;
*/
 
 // costruttori
	public Counter() {
		this(new Token());
	}
	
	public Counter(Token token) {
		super(token);
	}
	
	public Counter(Sieve<Token> sieve) {
		super(sieve);
	}

	/*
    // setters
public	void set() {
		this.count = this.count.add(BigInteger.ONE) ;
	}

    // getters
	
public void print() {
		System.out.println("C:"+this.count);
	}
*/
	 
	 public Token get() ;
	 
	 {
	 
	 this.tok.Set(this.count);
	 this.set() ;
	 
	 return tok ;
	 }

/*
public	BigInteger value() {
		return this.count ;
	}
	
public 	T token() {
		return this.tok;
	}
 
 */

}
