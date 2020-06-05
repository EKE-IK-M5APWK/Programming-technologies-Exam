package exceptions;

public class NotValidProcessorSocket extends Error{
	/**
	 * 
	 */
	private static final long serialVersionUID = -5101610571882023323L;

	public NotValidProcessorSocket(String errorMessage) {
        super(errorMessage);
    }
}
