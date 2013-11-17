import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.EncodedKeySpec;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import org.apache.log4j.Logger;

public class Ua extends re
{
  public static final Ua cxp = new Ua("RSA", azk.dQB);
  private KeyFactory cxq;

  private Ua(String paramString, AlgorithmParameterSpec paramAlgorithmParameterSpec)
  {
    super(paramString, paramAlgorithmParameterSpec);
    try
    {
      this.cxq = KeyFactory.getInstance(this.aYV);
    } catch (NoSuchAlgorithmException localNoSuchAlgorithmException) {
      K.fatal("Algorithme non supporté : " + this.aYV, localNoSuchAlgorithmException);
    }
  }

  public void r(byte[] paramArrayOfByte) {
    try {
      EncodedKeySpec localEncodedKeySpec = f(paramArrayOfByte);
      PublicKey localPublicKey = this.cxq.generatePublic(localEncodedKeySpec);
      this.aYX.init(1, localPublicKey);
    } catch (InvalidKeySpecException localInvalidKeySpecException) {
      K.fatal("Spec de clef publique invalide : " + this.aYV, localInvalidKeySpecException);
    } catch (InvalidKeyException localInvalidKeyException) {
      K.fatal("Clef publique invalide : " + this.aYV, localInvalidKeyException);
    }
  }

  public byte[] g(byte[] paramArrayOfByte) {
    try {
      return this.aYX.doFinal(paramArrayOfByte);
    } catch (IllegalBlockSizeException localIllegalBlockSizeException) {
      K.error("taille de bloc invalide", localIllegalBlockSizeException);
    } catch (BadPaddingException localBadPaddingException) {
      K.error("padding invalide", localBadPaddingException);
    }

    return null;
  }

  public byte[] h(byte[] paramArrayOfByte) {
    throw new UnsupportedOperationException("le client ne doit pas decrypter de données de connection");
  }
}