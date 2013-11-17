import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

public class Qi
{
  protected static final Logger K = Logger.getLogger(Qi.class);
  private static final Qi cpj = new Qi();

  private final cSR cpk = new cSR();
  private final cSi cpl = new cSi();

  public static Qi abZ() {
    return cpj;
  }

  private Qi()
  {
    for (int i = 1; i < 17; i++) {
      int j = 1 << i;
      cCF localcCF = go(j);
      if (localcCF == null)
        throw new RuntimeException("Impossible de créer un des pools par défaut : size = " + j + " bytes");
    }
  }

  public cCF go(int paramInt) {
    int i = 0; for (int j = this.cpl.size(); i < j; i++) {
      int k = this.cpl.wm(i);
      if (k >= paramInt) {
        return (cCF)this.cpk.get(k);
      }
    }
    cCF localcCF = new cCF(paramInt);
    this.cpk.put(paramInt, localcCF);
    this.cpl.add(paramInt);
    return localcCF;
  }

  byte[] a(cGF paramcGF, cCH[] paramArrayOfcCH) {
    if ((paramArrayOfcCH == null) || (paramArrayOfcCH.length == 0)) {
      return new byte[0];
    }
    int i = 0;
    int j = 0;
    int[] arrayOfInt1 = new int[paramArrayOfcCH.length];

    int k = 0; for (int m = paramArrayOfcCH.length; k < m; k++) {
      localObject1 = paramArrayOfcCH[k];
      if (localObject1 == null) {
        throw new RuntimeException("Impossible de sérialiser le BInarSerial : une part est null");
      }
      if (localObject1 != cCH.ivi)
      {
        try
        {
          ((cCH)localObject1).cyP();
          arrayOfInt1[k] = ((cCH)localObject1).cc();
        } catch (Exception localException1) {
          throw new RuntimeException("Error while calling expectedSize()", localException1);
        }
        i += 1 + arrayOfInt1[k];
        j++;
      }
    }
    cCF localcCF1 = go(i + paramArrayOfcCH.length * 5 + 1);
    ByteBuffer localByteBuffer1 = localcCF1.cyL();

    Object localObject1 = new byte[j];
    int[] arrayOfInt2 = new int[j];
    localByteBuffer1.put((byte)j);
    localByteBuffer1.position(1 + j * 5);

    j = 0;

    int n = 0; for (int i1 = paramArrayOfcCH.length; n < i1; n++) {
      cCH localcCH = paramArrayOfcCH[n];
      if (localcCH != cCH.ivi)
      {
        cCF localcCF2 = null;
        ByteBuffer localByteBuffer2 = null;
        try {
          int i2 = 1 + arrayOfInt1[n];

          localcCF2 = go(i2);
          localByteBuffer2 = localcCF2.cyL();
          localByteBuffer2.limit(i2);

          byte b = (byte)paramcGF.a(localcCH);

          if (b >= 0) {
            localObject1[j] = b;
            arrayOfInt2[j] = localByteBuffer1.position();
            localByteBuffer2.put(b);

            localcCH.clearError();
            if (arrayOfInt1[n] > 0) {
              localcCH.b(localByteBuffer2);
            }
            j++;
          }
          else {
            K.error("Impossible d'ajouter une part non référencée : " + localcCH.getClass().getName());
          }

          localByteBuffer2.flip();
          localByteBuffer1.put(localByteBuffer2);
        }
        catch (Exception localException2)
        {
          localcCH.a("Exception levée lors de la sérialisation de la part " + localcCH.getClass().getName(), localException2);
        } finally {
          if ((localcCF2 != null) && (localByteBuffer2 != null)) {
            localcCF2.aF(localByteBuffer2);
          }
        }
      }
    }

    for (n = 0; n < j; n++) {
      localByteBuffer1.put(1 + n * 5, localObject1[n]);
      localByteBuffer1.putInt(1 + n * 5 + 1, arrayOfInt2[n]);
    }

    localByteBuffer1.flip();
    byte[] arrayOfByte = new byte[localByteBuffer1.limit() - localByteBuffer1.position()];

    localByteBuffer1.get(arrayOfByte);
    localcCF1.aF(localByteBuffer1);

    return arrayOfByte;
  }
}