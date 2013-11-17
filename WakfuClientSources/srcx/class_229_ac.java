import java.io.File;
import java.io.FileInputStream;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.util.Locale;

public class ac
  implements aHJ
{
  private static final int bs = 255;
  private static final int bt = 8192;
  private String algorithm = "MD5";

  private String bu = null;

  private MessageDigest bv = null;

  private int bw = 8192;

  public void setAlgorithm(String paramString)
  {
    this.algorithm = (paramString != null ? paramString.toUpperCase(Locale.ENGLISH) : null);
  }

  public void j(String paramString)
  {
    this.bu = paramString;
  }

  public void aE()
  {
    if (this.bv != null) {
      return;
    }

    if ((this.bu != null) && (!"".equals(this.bu)) && (!"null".equals(this.bu)))
      try {
        this.bv = MessageDigest.getInstance(this.algorithm, this.bu);
      } catch (NoSuchAlgorithmException localNoSuchAlgorithmException1) {
        throw new cJ(localNoSuchAlgorithmException1);
      } catch (NoSuchProviderException localNoSuchProviderException) {
        throw new cJ(localNoSuchProviderException);
      }
    else
      try {
        this.bv = MessageDigest.getInstance(this.algorithm);
      } catch (NoSuchAlgorithmException localNoSuchAlgorithmException2) {
        throw new cJ(localNoSuchAlgorithmException2);
      }
  }

  public boolean isValid()
  {
    return ("SHA".equals(this.algorithm)) || ("MD5".equals(this.algorithm));
  }

  public String a(File paramFile)
  {
    aE();
    String str1 = null;
    try {
      if (!paramFile.canRead()) {
        return null;
      }
      FileInputStream localFileInputStream = null;

      byte[] arrayOfByte1 = new byte[this.bw];
      try {
        this.bv.reset();
        localFileInputStream = new FileInputStream(paramFile);
        DigestInputStream localDigestInputStream = new DigestInputStream(localFileInputStream, this.bv);

        while (localDigestInputStream.read(arrayOfByte1, 0, this.bw) != -1);
        localDigestInputStream.close();
        localFileInputStream.close();
        localFileInputStream = null;
        byte[] arrayOfByte2 = this.bv.digest();
        StringBuffer localStringBuffer = new StringBuffer();
        for (int i = 0; i < arrayOfByte2.length; i++) {
          String str2 = Integer.toHexString(0xFF & arrayOfByte2[i]);

          if (str2.length() < 2) {
            localStringBuffer.append("0");
          }
          localStringBuffer.append(str2);
        }
        str1 = localStringBuffer.toString();
      } catch (Exception localException2) {
        return null;
      }
    } catch (Exception localException1) {
      return null;
    }
    return str1;
  }

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("<DigestAlgorithm:");
    localStringBuilder.append("algorithm=").append(this.algorithm);
    localStringBuilder.append(";provider=").append(this.bu);
    localStringBuilder.append(">");
    return localStringBuilder.toString();
  }
}