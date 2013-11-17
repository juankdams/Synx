import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

public abstract class bUg
  implements cOT
{
  protected static Logger K = Logger.getLogger(bUg.class);

  public cWG aA(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer.mark();
    int i = paramByteBuffer.remaining();

    if (i < 2) {
      paramByteBuffer.reset();
      return null;
    }

    int j = paramByteBuffer.getShort() & 0xFFFF;

    if (j < 4) {
      K.error("Décodage impossible car taille trop petite (taille = " + j + ", minimum = 6");
      return null;
    }

    if (paramByteBuffer.remaining() < 2) {
      paramByteBuffer.reset();
      return null;
    }

    int k = paramByteBuffer.getShort();

    if (paramByteBuffer.remaining() < j - 4) {
      paramByteBuffer.reset();
      return null;
    }

    int m = paramByteBuffer.position() + j - 4;

    Object localObject = null;
    switch (k)
    {
    case 100:
      localObject = new bCG();
      break;
    case 102:
      localObject = new dkD();
      break;
    case 105:
      localObject = new ceS();
      break;
    case 109:
      localObject = new tC();
      break;
    case 103:
      localObject = new bBU();
      break;
    case 106:
      localObject = new bGu();
      break;
    case 108:
      localObject = new adK();
      break;
    case 110:
      localObject = new cfl();
      break;
    case 200:
      localObject = new bKy();
      break;
    case 202:
      localObject = new Fd();
      break;
    case 204:
      localObject = new bWk();
      break;
    case 206:
      localObject = new dNr();
      break;
    case 8:
      localObject = new cVN();
      break;
    case 2:
      localObject = new alU();
      break;
    case 4:
      localObject = new avX();
      break;
    case 6:
      localObject = new dIb();
      break;
    case 9:
      localObject = new dJQ();
      break;
    default:
      localObject = sN(k);
    }

    if (localObject == null) {
      paramByteBuffer.position(m);
      K.error("Le message type=" + k + " inconnu du décodeur !");
    }

    if ((localObject != null) && (paramByteBuffer.remaining() != 0))
    {
      byte[] arrayOfByte = new byte[j - 4];
      paramByteBuffer.get(arrayOfByte);
      try {
        long l = System.currentTimeMillis();
        ((cWG)localObject).a(arrayOfByte);
        int n = (int)(System.currentTimeMillis() - l);
        String str = localObject.getClass().getSimpleName();
        aGF.w(str, true).mt(n);
        aGF.w(str, true).mu(arrayOfByte.length);
      }
      catch (Throwable localThrowable) {
        K.error("Exception", localThrowable);
      }
    }

    return localObject;
  }

  protected abstract cWG sN(int paramInt);
}