package exceptions;

public class NotValidMemorySocket extends Error{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6952056883427707424L;

	public NotValidMemorySocket(String errorMessage) {
        super(errorMessage);
    }
}
