package Core;


public class HelloWorld {

	// The native keyword is required by the compiler
	// to indicate that the function is implemented
	// in a shared library somewhere.
	
	public native void displayMessage();
	public native void set(String key, Object value);
	public native Object get(String key);
	public native void open(String cache);
	public native void close(String cache);
	
	// Code within the static section is executed
	// when this class is initialized. Since part of
	// the functionality of this class resides in
	// a shared library, it must be loaded at runtime
	// when this class is initialized. 
	
	static {
		// The shared library that contains the implementation
	    // of the native methods is loaded here. The name of the
	    // shared library file is arbitrary, but it is a good
	    // idea to give it a meaningful name.
		System.loadLibrary("HelloWorldImp"); 
	}

  
}

	
	

