package exceptions;

public class NotValidCameraValue extends Error{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3196884072746357053L;

	public NotValidCameraValue(String errorMessage) {
        super(errorMessage);
    }
}
