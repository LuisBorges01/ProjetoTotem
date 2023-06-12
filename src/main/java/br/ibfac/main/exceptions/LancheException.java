package br.ibfac.main.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)

public class LancheException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public LancheException(String ex) {
        super(ex);
    }

    public LancheException(String mensagem, Exception e) {
        super(mensagem, e);
    }
}
