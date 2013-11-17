import java.security.NoSuchAlgorithmException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import org.apache.log4j.Logger;

public abstract class re
{
  protected static Logger K = Logger.getLogger(re.class);
  protected final String aYV;
  protected final AlgorithmParameterSpec aYW;
  protected Cipher aYX;

  protected re(String paramString, AlgorithmParameterSpec paramAlgorithmParameterSpec)
  {
    this.aYV = paramString;
    this.aYW = paramAlgorithmParameterSpec;
    try
    {
      this.aYX = Cipher.getInstance(this.aYV);
    } catch (NoSuchAlgorithmException localNoSuchAlgorithmException) {
      K.fatal("Algorithme non supporté : " + this.aYV, localNoSuchAlgorithmException);
    } catch (NoSuchPaddingException localNoSuchPaddingException) {
      K.fatal("Padding non supporté pour " + this.aYV, localNoSuchPaddingException);
    }
  }

  protected EncodedKeySpec f(byte[] paramArrayOfByte) {
    return new X509EncodedKeySpec(paramArrayOfByte);
  }

  public String getAlgorithm() {
    return this.aYV;
  }

  public abstract byte[] g(byte[] paramArrayOfByte);

  public abstract byte[] h(byte[] paramArrayOfByte);
}