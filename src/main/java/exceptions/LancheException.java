package exceptions;

public class LancheException extends Exception {
	private static final long serialVersionUID = 1L;

	public LancheException() {
        super();
    }

    public LancheException(String mensagem, Exception e) {
        super(mensagem, e);
    }
}
