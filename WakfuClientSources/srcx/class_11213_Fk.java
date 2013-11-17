import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

public class Fk
{
  private static final Logger K = Logger.getLogger(Fk.class);

  public static byte[] b(cKg paramcKg) {
    cXr localcXr = new cXr();
    localcXr.dT(paramcKg.arI());
    bpu.a(paramcKg.aiJ(), localcXr);
    localcXr.putInt(paramcKg.arM());

    cRY localcRY = new cRY();
    paramcKg.o(localcRY);
    localcXr.putInt(localcRY.ceF());
    localcXr.aD(localcRY.getData());

    car localcar = new car();
    paramcKg.p(localcar);
    localcXr.putInt(localcar.ceF());
    localcXr.aD(localcar.getData());

    return localcXr.toArray();
  }

  public static cKg H(ByteBuffer paramByteBuffer) {
    short s = paramByteBuffer.getShort();
    bpu localbpu = bpu.av(paramByteBuffer);

    int i = paramByteBuffer.getInt();

    brW localbrW = ars.dzL.aL(s);
    ago localago = (ago)XT.a(localbrW, localbpu, i);

    int j = 0; for (int k = paramByteBuffer.getInt(); j < k; j++) {
      localago.g(J(paramByteBuffer));
    }

    j = 0; for (k = paramByteBuffer.getInt(); j < k; j++) {
      localago.d(I(paramByteBuffer));
    }

    return localago;
  }

  public static byte[] c(bnt parambnt)
  {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(12);
    localByteBuffer.putShort(parambnt.nx());
    localByteBuffer.putShort(parambnt.ny());
    localByteBuffer.putShort(parambnt.vQ());
    localByteBuffer.putShort(parambnt.vR());
    localByteBuffer.putShort(parambnt.vS());
    localByteBuffer.putShort(parambnt.vT());
    return localByteBuffer.array();
  }

  public static byte[] e(cuF paramcuF) {
    cXr localcXr = new cXr();
    localcXr.aD(f(paramcuF));
    bxn localbxn = new bxn();
    paramcuF.k(localbxn);
    localcXr.putInt(localbxn.getNumber());
    localcXr.e(localbxn.bEH());
    return localcXr.toArray();
  }

  public static byte[] f(cuF paramcuF) {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(26);
    localByteBuffer.putShort(paramcuF.adj().nc());
    localByteBuffer.putLong(paramcuF.EN());
    localByteBuffer.putInt(paramcuF.adl());
    localByteBuffer.putLong(paramcuF.rb());
    localByteBuffer.putShort(paramcuF.nx());
    localByteBuffer.putShort(paramcuF.ny());
    return localByteBuffer.array();
  }

  public static byte[] a(avk paramavk) {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(16);
    localByteBuffer.putLong(paramavk.EN());
    localByteBuffer.putLong(paramavk.m());
    return localByteBuffer.array();
  }

  public static bnt I(ByteBuffer paramByteBuffer)
  {
    short s1 = paramByteBuffer.getShort();
    short s2 = paramByteBuffer.getShort();
    short s3 = paramByteBuffer.getShort();
    short s4 = paramByteBuffer.getShort();
    short s5 = paramByteBuffer.getShort();
    short s6 = paramByteBuffer.getShort();
    return new ou(s1, s2, s3, s4, s5, s6);
  }

  public static cuF J(ByteBuffer paramByteBuffer) {
    Sk localSk = (Sk)K(paramByteBuffer);
    int i = 0; for (int j = paramByteBuffer.getInt(); i < j; i++) {
      bOy localbOy = L(paramByteBuffer);
      localSk.b(localbOy);
    }
    return localSk;
  }

  public static cuF K(ByteBuffer paramByteBuffer) {
    short s1 = paramByteBuffer.getShort();
    long l1 = paramByteBuffer.getLong();
    int i = paramByteBuffer.getInt();
    long l2 = paramByteBuffer.getLong();
    short s2 = paramByteBuffer.getShort();
    short s3 = paramByteBuffer.getShort();

    cUh localcUh = ars.dzL.aM(s1);
    return new Sk(localcUh, l1, i, l2, s2, s3);
  }

  private static bOy L(ByteBuffer paramByteBuffer) {
    long l1 = paramByteBuffer.getLong();
    long l2 = paramByteBuffer.getLong();
    return new bOy(l1, l2);
  }
}