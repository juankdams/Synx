import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import java.util.zip.Adler32;
import java.util.zip.CRC32;
import java.util.zip.CheckedInputStream;
import java.util.zip.Checksum;

public class dOV
  implements aHJ
{
  private String algorithm = "CRC";

  private Checksum mgG = null;

  public void setAlgorithm(String paramString)
  {
    this.algorithm = (paramString != null ? paramString.toUpperCase(Locale.ENGLISH) : null);
  }

  public void dqs()
  {
    if (this.mgG != null) {
      return;
    }
    if ("CRC".equals(this.algorithm))
      this.mgG = new CRC32();
    else if ("ADLER".equals(this.algorithm))
      this.mgG = new Adler32();
    else
      throw new cJ(new NoSuchAlgorithmException());
  }

  public boolean isValid()
  {
    return ("CRC".equals(this.algorithm)) || ("ADLER".equals(this.algorithm));
  }

  public String a(File paramFile)
  {
    dqs();
    String str = null;
    try
    {
      if (paramFile.canRead()) {
        this.mgG.reset();
        FileInputStream localFileInputStream = new FileInputStream(paramFile);
        CheckedInputStream localCheckedInputStream = new CheckedInputStream(localFileInputStream, this.mgG);
        BufferedInputStream localBufferedInputStream = new BufferedInputStream(localCheckedInputStream);
        while (localBufferedInputStream.read() != -1);
        str = Long.toString(localCheckedInputStream.getChecksum().getValue());
        localBufferedInputStream.close();
      }
    } catch (Exception localException) {
      str = null;
    }
    return str;
  }

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("<ChecksumAlgorithm:");
    localStringBuilder.append("algorithm=").append(this.algorithm);
    localStringBuilder.append(">");
    return localStringBuilder.toString();
  }
}