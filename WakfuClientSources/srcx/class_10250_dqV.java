import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

public class dqV
{
  private static final Logger K = Logger.getLogger(dqV.class);
  private final aYr bwL;

  public dqV(aYr paramaYr)
  {
    this.bwL = paramaYr;
  }

  public final byte[] b(dFf paramdFf)
  {
    int i = 1;
    Object localObject2;
    for (bYR localbYR : paramdFf.dgJ()) {
      localObject2 = this.bwL.a(localbYR);
      if (localObject2 != null)
        i += ((hk)localObject2).O();
      else {
        K.error("Erreur lors de la récupération de la NationPart correspondant à " + localbYR + " de la forme " + paramdFf);
      }
    }
    ??? = ByteBuffer.allocate(i);
    ((ByteBuffer)???).put((byte)paramdFf.ordinal());
    for (localObject2 : paramdFf.dgJ()) {
      hk localhk = this.bwL.a((bYR)localObject2);
      if (localhk != null)
        localhk.b((ByteBuffer)???);
      else {
        K.error("Erreur lors de la récupération de la NationPart correspondant à " + localhk + " de la forme " + paramdFf);
      }
    }
    return ((ByteBuffer)???).array();
  }

  public final void q(byte[] paramArrayOfByte, int paramInt)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    int i = localByteBuffer.get() & 0xFF;
    if ((i < 0) || (i >= dFf.values().length)) {
      K.error("Numéro de part invalide : " + i);
      return;
    }
    dFf localdFf = dFf.values()[i];
    for (bYR localbYR : localdFf.dgJ()) {
      hk localhk = this.bwL.a(localbYR);
      if (localhk != null) {
        localhk.c(localByteBuffer, paramInt);
        localhk.pj();
      } else {
        K.error("Impossible de trouver la NationPart correspondant à " + localbYR);
      }
    }
  }

  public byte[] a(hk paramhk) {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(paramhk.O());
    paramhk.b(localByteBuffer);
    return localByteBuffer.array();
  }

  public void a(hk paramhk, byte[] paramArrayOfByte, int paramInt) {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    paramhk.c(localByteBuffer, paramInt);
    paramhk.pj();
  }
}