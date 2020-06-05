package exceptions;

public class NotValidMemory extends Error{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2111820616857819514L;

	public NotValidMemory(String errorMessage) {
        super(errorMessage);
    }
}
