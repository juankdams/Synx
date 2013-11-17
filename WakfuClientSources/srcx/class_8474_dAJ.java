import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

public class dAJ
{
  public static final boolean DEBUG = false;
  protected static final Logger K = Logger.getLogger(dAJ.class);

  private static final dAJ lIm = new dAJ();

  private aKW lIn = new aKW("root", null, dUl.mrx);
  private final cXr lIo = new cXr();

  public static dAJ def()
  {
    return lIm;
  }

  public aKW deg()
  {
    return this.lIn;
  }

  public final void clear()
  {
    this.lIn.clear();
  }

  public final byte[] deh()
  {
    this.lIo.clear();
    deg().a(this.lIo);
    return this.lIo.toArray();
  }

  public final void d(byte[] paramArrayOfByte, String paramString)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    byte[] arrayOfByte = new byte[localByteBuffer.get() & 0xFF];
    localByteBuffer.get(arrayOfByte);
    String str = dzp.aJ(arrayOfByte);
    localByteBuffer.get();
    localByteBuffer.get();
    if (!str.equals(deg().getName())) {
      K.error("Synchronisation depuis un root package différent : " + str + " au lieu de " + deg().getName());
      return;
    }
    deg().a(localByteBuffer, paramString);
  }

  public final void aL(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    int i = localByteBuffer.getShort() & 0xFFFF;
    for (int j = 0; j < i; j++) {
      byte[] arrayOfByte = new byte[localByteBuffer.getShort() & 0xFFFF];
      localByteBuffer.get(arrayOfByte);
      String str = dzp.aJ(arrayOfByte);
      long l = localByteBuffer.getLong();
      boq localboq = l(str, l);
      if (localboq == null)
        K.error("Impossible de créer le node " + str);
    }
  }

  private boq l(String paramString, long paramLong)
  {
    String[] arrayOfString = paramString.split("\\.");
    aKW localaKW = null;
    for (int i = 0; i < arrayOfString.length; i++) {
      String str = arrayOfString[i];
      if (i == 0)
      {
        if (str.equals(this.lIn.getName())) {
          localaKW = this.lIn;
        } else {
          K.error("Le root package ne s'appelle pas " + str);
          return null;
        }
      }
      else
      {
        dNt localdNt;
        if (i == arrayOfString.length - 1)
        {
          localdNt = localaKW.rx(str);
          boq localboq;
          if (localdNt == null) {
            localboq = localaKW.b(str, dUl.mrx);
            localboq.fM(paramLong);
            return localboq;
          }
          if ((localdNt instanceof boq)) {
            localboq = (boq)localdNt;
            localboq.fM(paramLong);
            return localboq;
          }
          K.error("Impossible de définir une valeur au neoud " + localdNt + " qui n'est pas une propriété");
        }
        else
        {
          localdNt = localaKW.rx(str);
          if (localdNt == null) {
            localaKW = localaKW.gS(str);
          }
          else if ((localdNt instanceof aKW)) {
            localaKW = (aKW)localdNt;
          } else {
            K.error("Impossible de créer un fils à " + localdNt + " qui n'est pas un package");
            return null;
          }
        }
      }
    }
    return null;
  }

  public void dei()
  {
    K.info("All statistics:");
    for (boq localboq : deg().ry("*").cGd())
      K.info("  " + localboq.getFullName() + " = " + localboq.getValue());
  }
}