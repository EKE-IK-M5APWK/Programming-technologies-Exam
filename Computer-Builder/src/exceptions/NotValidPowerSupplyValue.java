package exceptions;

public class NotValidPowerSupplyValue extends Error{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8890725432590619266L;
	public NotValidPowerSupplyValue(String errorMessage) {
        super(errorMessage);
    }
}
