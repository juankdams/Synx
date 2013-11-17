import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public abstract class cGF
{
  private static final int iBM = 10485760;
  private static final Logger K = Logger.getLogger(cGF.class);

  public abstract cCH[] tn();

  int a(cCH paramcCH)
  {
    cCH[] arrayOfcCH = tn();
    if (arrayOfcCH != null) {
      for (int i = 0; i < arrayOfcCH.length; i++) {
        if (arrayOfcCH[i] == paramcCH)
          return i;
      }
    }
    return -1;
  }

  public final byte[] a(cCH[] paramArrayOfcCH) {
    if ((paramArrayOfcCH != null) && (paramArrayOfcCH.length > 0)) {
      return Qi.abZ().a(this, paramArrayOfcCH);
    }
    throw new RuntimeException("Unable to serialize content without parts");
  }

  public final byte[] T(int[] paramArrayOfInt) {
    if ((paramArrayOfInt != null) && (paramArrayOfInt.length > 0)) {
      cCH[] arrayOfcCH1 = new cCH[paramArrayOfInt.length];
      cCH[] arrayOfcCH2 = tn();
      int i = 0;
      for (int m : paramArrayOfInt) {
        arrayOfcCH1[(i++)] = arrayOfcCH2[m];
      }
      return Qi.abZ().a(this, arrayOfcCH1);
    }
    throw new RuntimeException("Unable to serialize content without parts");
  }

  public final void q(byte[] paramArrayOfByte) {
    q(paramArrayOfByte, 0);
  }

  public final void q(byte[] paramArrayOfByte, int paramInt) {
    cCH[] arrayOfcCH = tn();
    if ((arrayOfcCH == null) || (arrayOfcCH.length <= 0)) {
      return;
    }
    ArrayList localArrayList = new ArrayList(arrayOfcCH.length);
    ByteBuffer localByteBuffer1 = ByteBuffer.wrap(paramArrayOfByte);

    int i = localByteBuffer1.get();
    byte[] arrayOfByte = new byte[i];
    int[] arrayOfInt = new int[i];
    for (int j = 0; j < i; j++) {
      arrayOfByte[j] = localByteBuffer1.get();
      arrayOfInt[j] = localByteBuffer1.getInt();
    }

    for (j = 0; j < i; j++) {
      int k = arrayOfByte[j];
      int m = arrayOfInt[j];
      int n;
      if (j < i - 1)
        n = arrayOfInt[(j + 1)] - m - 1;
      else {
        n = localByteBuffer1.limit() - m - 1;
      }
      if (n <= 0) {
        K.warn("Part " + k + "(offset=" + m + ") is empty for " + this + " ! (voir log serveur)", new Exception());
      }
      else if (n > 10485760) {
        K.error("Part " + k + "(offset=" + m + ") exceeds max limit (" + n + " > " + 10485760 + " bytes)", new Exception());
      }
      else
      {
        cCF localcCF = Qi.abZ().go(n);
        ByteBuffer localByteBuffer2 = localcCF.cyL();
        localByteBuffer1.position(m + 1);
        localByteBuffer2.limit(n);
        localByteBuffer1.get(localByteBuffer2.array(), 0, n);

        if ((k >= 0) && (k < arrayOfcCH.length)) {
          cCH localcCH2 = arrayOfcCH[k];
          if (localcCH2 == cCH.ivi) {
            K.warn("Don't know how to unserialise part #" + k + " (EMPTY).");
            continue;
          }
          if (localcCH2 == null) {
            K.error("Part " + k + " of " + this + " is null", new Exception());
            continue;
          }
          try {
            localcCH2.clearError();
            localcCH2.a(localByteBuffer2, paramInt);
            if (!localcCH2.hasError())
              localArrayList.add(localcCH2);
          }
          catch (Exception localException) {
            localcCH2.a("Exception levée lors de la déserialisation de " + this + ", part :" + k, localException);
          }
          if (localByteBuffer2.remaining() > 0) {
            K.warn("Part " + k + " of " + this + " still have " + localByteBuffer2.remaining() + " byte(s) left !", new Exception());
          }
        }

        localcCF.aF(localByteBuffer2);
      }
    }
    for (cCH localcCH1 : localArrayList)
      localcCH1.Ho();
  }

  public final void a(cCH paramcCH, byte[] paramArrayOfByte, int paramInt)
  {
    cCH[] arrayOfcCH = tn();
    if ((paramcCH == null) || (arrayOfcCH == null) || (arrayOfcCH.length <= 0)) {
      return;
    }
    int i = a(paramcCH);
    if (i < 0) {
      throw new RuntimeException("Unable to find part in BinarSerial class : " + getClass().getSimpleName());
    }

    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);

    int j = localByteBuffer.get();
    for (int k = 0; k < j; k++) {
      int m = localByteBuffer.get();
      int n = localByteBuffer.getInt();
      if (m == i) {
        localByteBuffer.position(n + 1);
        try {
          paramcCH.clearError();
          paramcCH.a(localByteBuffer, paramInt);
          if (!paramcCH.hasError())
            paramcCH.Ho();
        }
        catch (Exception localException) {
          K.error("Exception levée lors de la déserialisation de la part :" + i, localException);
        }
        return;
      }
    }

    throw new RuntimeException("Part (" + i + ")doesnt exist in BinarSerial class : " + getClass().getSimpleName());
  }
}