import java.nio.ByteBuffer;
import java.util.ArrayList;

public final class dPy
{
  public static byte[] a(cyS paramcyS)
  {
    cXr localcXr = new cXr();
    localcXr.jn(paramcyS.getId());
    localcXr.dT(paramcyS.nU());
    localcXr.jn(paramcyS.CH());
    byte[] arrayOfByte1 = dzp.qC(paramcyS.getName());
    localcXr.putInt(arrayOfByte1.length);
    localcXr.aD(arrayOfByte1);
    byte[] arrayOfByte2 = dzp.qC(paramcyS.getDescription());
    localcXr.putInt(arrayOfByte2.length);
    localcXr.aD(arrayOfByte2);
    byte[] arrayOfByte3 = dzp.qC(paramcyS.getMessage());
    localcXr.putInt(arrayOfByte3.length);
    localcXr.aD(arrayOfByte3);
    localcXr.putInt(paramcyS.CI());
    localcXr.putInt(paramcyS.aNr());
    localcXr.putInt(paramcyS.aNw());
    localcXr.putInt(paramcyS.aNx());
    localcXr.putInt(paramcyS.aNy());
    localcXr.putInt(paramcyS.aNt());
    paramcyS.B(new cUv(localcXr));

    ArrayList localArrayList = new ArrayList();
    paramcyS.A(new cUy(localArrayList, paramcyS));

    localcXr.putInt(localArrayList.size());
    for (int i = 0; i < localArrayList.size(); i++) {
      localcXr.aD((byte[])localArrayList.get(i));
    }

    localcXr.putInt(paramcyS.aNu());
    paramcyS.C(new cUA(localcXr));

    return localcXr.toArray();
  }

  public static cyS aR(ByteBuffer paramByteBuffer) {
    aBc localaBc = new aBc();
    a(paramByteBuffer, localaBc);
    return localaBc;
  }

  public static void a(ByteBuffer paramByteBuffer, cyS paramcyS) {
    aBc localaBc = (aBc)paramcyS;
    localaBc.a(paramByteBuffer.getLong());
    localaBc.aQ(paramByteBuffer.getShort());
    localaBc.dI(paramByteBuffer.getLong());
    byte[] arrayOfByte1 = new byte[paramByteBuffer.getInt()];
    paramByteBuffer.get(arrayOfByte1);
    localaBc.setName(dzp.aJ(arrayOfByte1));
    byte[] arrayOfByte2 = new byte[paramByteBuffer.getInt()];
    paramByteBuffer.get(arrayOfByte2);
    localaBc.setDescription(dzp.aJ(arrayOfByte2));
    byte[] arrayOfByte3 = new byte[paramByteBuffer.getInt()];
    paramByteBuffer.get(arrayOfByte3);
    localaBc.setMessage(dzp.aJ(arrayOfByte3));
    localaBc.lC(paramByteBuffer.getInt());
    localaBc.lB(paramByteBuffer.getInt());
    localaBc.lD(paramByteBuffer.getInt());
    localaBc.lE(paramByteBuffer.getInt());
    localaBc.lF(paramByteBuffer.getInt());
    int i = 0; for (int j = paramByteBuffer.getInt(); i < j; i++) {
      localaBc.d(aS(paramByteBuffer));
    }
    i = 0; for (j = paramByteBuffer.getInt(); i < j; i++) {
      localaBc.d(aU(paramByteBuffer));
    }
    i = 0; for (j = paramByteBuffer.getInt(); i < j; i++)
      localaBc.f(aT(paramByteBuffer));
  }

  public static byte[] i(aUJ paramaUJ)
  {
    byte[] arrayOfByte = dzp.qC(paramaUJ.getName());
    ByteBuffer localByteBuffer = ByteBuffer.allocate(12 + arrayOfByte.length + 8);
    localByteBuffer.putLong(paramaUJ.getId());
    localByteBuffer.putInt(arrayOfByte.length);
    localByteBuffer.put(arrayOfByte);
    localByteBuffer.putLong(paramaUJ.bjT());
    return localByteBuffer.array();
  }

  public static aUJ aS(ByteBuffer paramByteBuffer) {
    bmF localbmF = new bmF(paramByteBuffer.getLong());
    byte[] arrayOfByte = new byte[paramByteBuffer.getInt()];
    paramByteBuffer.get(arrayOfByte);
    localbmF.setName(dzp.aJ(arrayOfByte));
    localbmF.fH(paramByteBuffer.getLong());
    return localbmF;
  }

  public static byte[] l(bqd parambqd) {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(20);
    localByteBuffer.putInt(parambqd.ajL());
    localByteBuffer.putLong(parambqd.bza().rP());
    localByteBuffer.putLong(parambqd.byZ().rP());
    return localByteBuffer.array();
  }

  public static bqd aT(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.getInt();
    long l1 = paramByteBuffer.getLong();
    long l2 = paramByteBuffer.getLong();
    return new dEu().CC(i).Z(cYq.jq(l2)).aa(cYq.jq(l1)).dgd();
  }

  public static byte[] i(aCl paramaCl) {
    byte[] arrayOfByte = dzp.qC(paramaCl.getName());
    ByteBuffer localByteBuffer = ByteBuffer.allocate(41 + arrayOfByte.length);
    localByteBuffer.putLong(paramaCl.getId());
    localByteBuffer.putInt(paramaCl.ajD());
    localByteBuffer.putLong(paramaCl.aOC());
    localByteBuffer.putLong(paramaCl.ayX());
    localByteBuffer.put((byte)(paramaCl.isConnected() ? 1 : 0));
    localByteBuffer.put(paramaCl.aOD());
    localByteBuffer.put(paramaCl.xK());
    localByteBuffer.putShort(paramaCl.uO());
    localByteBuffer.putInt(paramaCl.bP());
    localByteBuffer.putInt(arrayOfByte.length);
    localByteBuffer.put(arrayOfByte);
    return localByteBuffer.array();
  }

  public static aCl aU(ByteBuffer paramByteBuffer) {
    djP localdjP = new djP(paramByteBuffer.getLong());
    localdjP.hm(paramByteBuffer.getInt());
    localdjP.jJ(paramByteBuffer.getLong());
    localdjP.aM(paramByteBuffer.getLong());
    localdjP.dK(paramByteBuffer.get() == 1);
    localdjP.fb(paramByteBuffer.get());
    localdjP.cO(paramByteBuffer.get());
    localdjP.F(paramByteBuffer.getShort());
    localdjP.dc(paramByteBuffer.getInt());
    byte[] arrayOfByte = new byte[paramByteBuffer.getInt()];
    paramByteBuffer.get(arrayOfByte);
    localdjP.setName(dzp.aJ(arrayOfByte));
    return localdjP;
  }
}