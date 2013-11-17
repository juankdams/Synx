import java.io.DataInputStream;
import java.io.DataOutputStream;
import org.apache.log4j.Logger;

public final class aUo
  implements bWU, cMX
{
  private static final Logger K = Logger.getLogger(aUo.class);
  public int eVe;
  public long eVf;
  public long eVg;
  public String value;
  private static final aee aOr = new bOO(new aHD());

  private aUo()
  {
  }

  public aUo(String paramString, int paramInt, long paramLong1, long paramLong2)
  {
    this.value = paramString;
    this.eVe = paramInt;
    this.eVf = paramLong1;
    this.eVg = paramLong2;
  }

  public void write(DataOutputStream paramDataOutputStream) {
    paramDataOutputStream.writeUTF(this.value);
    paramDataOutputStream.writeInt(this.eVe);
    paramDataOutputStream.writeLong(this.eVf);
    paramDataOutputStream.writeLong(this.eVg);
  }

  public void read(DataInputStream paramDataInputStream) {
    this.value = paramDataInputStream.readUTF();
    this.eVe = paramDataInputStream.readInt();
    this.eVf = paramDataInputStream.readLong();
    this.eVg = paramDataInputStream.readLong();
  }

  public static aUo a(String paramString, int paramInt, long paramLong1, long paramLong2)
  {
    aUo localaUo;
    try
    {
      localaUo = (aUo)aOr.Mm();
    } catch (Exception localException) {
      localaUo = new aUo();
      K.error("Erreur lors d'un checkout d'un IndexEntry", localException);
    }

    localaUo.value = paramString;
    localaUo.eVe = paramInt;
    localaUo.eVf = paramLong1;
    localaUo.eVg = paramLong2;

    return localaUo;
  }

  public static aUo bjw()
  {
    aUo localaUo;
    try
    {
      localaUo = (aUo)aOr.Mm();
    } catch (Exception localException) {
      localaUo = new aUo();
      K.error("Erreur lors d'un checkout d'un IndexEntry", localException);
    }

    return localaUo;
  }

  public void release() {
    try {
      aOr.y(this);
    } catch (Exception localException) {
      K.error("Erreur lors d'un release d'un IndexEntry", localException);
    }
  }

  public void aJ()
  {
  }

  public void bc() {
    this.value = null;
  }
}