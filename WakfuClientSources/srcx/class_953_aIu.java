import java.io.IOException;
import org.apache.log4j.Logger;

public class aIu extends aoI
{
  private static final Logger K = Logger.getLogger(aIu.class);

  protected crX a(aYQ paramaYQ)
  {
    try
    {
      cgh localcgh = new cgh();
      localcgh.y(paramaYQ);

      uJ localuJ = null;
      if (localcgh.hDG != 0)
      {
        int i;
        int j;
        if ((localcgh.hDK != 4) && (localcgh.hDK != 8))
        {
          i = localcgh.hDH + 7 >> 3;
          j = localcgh.hDG * i;
          paramaYQ.os(j);
        } else {
          i = paramaYQ.getOffset();
          localuJ = new uJ(localcgh.hDG);
          for (j = 0; j < localcgh.hDG; j++) {
            int k = paramaYQ.readByte();
            int m = paramaYQ.readByte();
            int n = paramaYQ.readByte();
            localuJ.d(new bNa(-1, n, m, k));
            i += 3;
          }

        }

      }

      byte[] arrayOfByte = b(paramaYQ, localcgh.gKt, localcgh.bdV, localcgh.hDK);
      paramaYQ.close();

      return a(localcgh, localuJ, arrayOfByte);
    } catch (IOException localIOException) {
      K.error("Exception", localIOException);
    }
    return null;
  }

  private static crX a(cgh paramcgh, uJ paramuJ, byte[] paramArrayOfByte) {
    cSJ localcSJ = new cSJ(paramcgh.gKt, paramcgh.bdV, paramcgh.hDI, paramcgh.hDJ, paramcgh.hDK, paramuJ, paramArrayOfByte);
    crX localcrX = new crX(bIN.gJg, localcSJ);
    localcSJ.eF((byte)18);
    localcSJ.axl();
    return localcrX;
  }

  protected int aU()
  {
    return 18;
  }

  protected MD b(aYQ paramaYQ)
  {
    cgh localcgh = new cgh();
    localcgh.y(paramaYQ);
    return new MD(localcgh.gKt, localcgh.bdV);
  }
}