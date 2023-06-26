package br.ibfac.main.security;

<<<<<<< HEAD
/*
=======
import java.util.Date;

import br.ibfac.main.exceptions.LancheException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

>>>>>>> 21ac4c9cc4dd408e36a38f1368813242aba74505
public class JwtTokenProvider {

    private static final String SECRET_KEY = "sua_chave_secreta";
    private static final long EXPIRATION_TIME_MS = 86400000; // 24 horas

    public String generateToken(String username) {
        Date now = new Date();
        Date expiryDate = new Date(now.getTime() + EXPIRATION_TIME_MS);

        return Jwts.builder()
                .setSubject(username)
                .setIssuedAt(now)
                .setExpiration(expiryDate)
                .signWith(SignatureAlgorithm.HS512, SECRET_KEY)
                .compact();
    }
    
    public boolean validateToken(String token) {
        try {
            Jwts.parser().setSigningKey(SECRET_KEY).parseClaimsJws(token);
            return true;
        } catch (LancheException ex) {
            System.out.println("Token expirado");
            return false;
        } catch (Exception e) {
	        throw new LancheException("Erro ao validar token(JwtTokenProvider): " + e.getMessage(), e);
        }
    }
<<<<<<< HEAD
}*/
=======
}
>>>>>>> 21ac4c9cc4dd408e36a38f1368813242aba74505
