package exceptions;

public class NotValidValue extends Error{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2532611673165490050L;

	public NotValidValue(String errorMessage) {
        super(errorMessage);
    }
}
