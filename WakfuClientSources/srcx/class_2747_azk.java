import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.RSAKeyGenParameterSpec;

public abstract interface azk
{
  public static final String ALGORITHM = "RSA";
  public static final AlgorithmParameterSpec dQB = new RSAKeyGenParameterSpec(1024, RSAKeyGenParameterSpec.F4);
}