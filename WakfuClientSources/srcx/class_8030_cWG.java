import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

public abstract class cWG
  implements aUw, bWU
{
  protected static final Logger K = Logger.getLogger(cWG.class);
  aee aOr;
  protected aUw hZr;
  protected aUw hZs;
  long kJt;
  protected Km kJu;
  protected boolean kJv = false;

  public aUw bjx()
  {
    return this.hZs;
  }

  public void a(aUw paramaUw)
  {
    this.hZs = paramaUw;
  }

  public aUw bjy()
  {
    return this.hZr;
  }

  public void b(aUw paramaUw)
  {
    this.hZr = paramaUw;
  }

  public dUd cKx()
  {
    if (this.kJu != null) {
      return (dUd)this.kJu.dcK();
    }
    return null;
  }

  public void d(dUd paramdUd)
  {
    this.kJu = new Km();
    this.kJu.b(paramdUd);
  }

  public boolean cKy()
  {
    if (this.kJu != null) {
      return this.kJu.dcJ();
    }
    return false;
  }

  protected void a(aee paramaee)
  {
    this.aOr = paramaee;
  }

  public void release()
  {
    this.kJu = null;
    this.kJv = false;

    if (this.aOr != null)
      try {
        aee localaee = this.aOr;
        this.aOr = null;
        localaee.y(this);
      } catch (Exception localException) {
        K.error("Exception", localException);
      }
    else
      bc();
  }

  public boolean cKz()
  {
    return this.kJv;
  }

  public void iN(boolean paramBoolean) {
    this.kJv = paramBoolean;
  }

  public final void cKA()
  {
    if (!this.kJv)
      release();
  }

  public void execute()
  {
    if (this.kJu != null) {
      dUd localdUd = (dUd)this.kJu.dcK();
      if (localdUd != null)
        localdUd.a(this);
      else
        K.warn("Le message de type " + getClass().getSimpleName() + " n'a pas de destinataire.");
    }
  }

  public abstract byte[] encode();

  public abstract boolean a(byte[] paramArrayOfByte);

  public abstract int getId();

  public void d(int paramInt)
  {
  }

  protected final byte[] aI(ByteBuffer paramByteBuffer)
  {
    if (paramByteBuffer.remaining() >= 1) {
      int i = paramByteBuffer.get() & 0xFF;
      if (i == 0)
        return null;
      if (paramByteBuffer.remaining() < i)
        return null;
      byte[] arrayOfByte = new byte[i];
      paramByteBuffer.get(arrayOfByte);
      return arrayOfByte;
    }
    return null;
  }

  public boolean j(int paramInt1, int paramInt2, boolean paramBoolean) {
    if (paramBoolean) {
      if (paramInt1 != paramInt2) {
        K.error("****************************** Message de longueur incorrecte : reçu=" + paramInt1 + " octet(s), attendu=" + paramInt2 + " octet(s), type : " + getClass().getName(), new Exception("TRACE"));

        return false;
      }
    }
    else if (paramInt1 < paramInt2) {
      K.error("****************************** Message de longueur incorrecte : reçu=" + paramInt1 + " octet(s), attendu >= " + paramInt2 + " octet(s), type : " + getClass().getName(), new Exception("TRACE"));

      return false;
    }

    return true;
  }

  void jj(long paramLong)
  {
    this.kJt = paramLong;
  }

  public long cKB()
  {
    return this.kJt;
  }

  public String toString() {
    return getClass().getName() + '@' + Integer.toHexString(hashCode()) + ", listener : " + cKx();
  }
}