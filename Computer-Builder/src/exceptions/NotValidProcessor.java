package exceptions;

public class NotValidProcessor extends Error{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3475917736473600275L;

	public NotValidProcessor(String errorMessage) {
        super(errorMessage);
    }
}
