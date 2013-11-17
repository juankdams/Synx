import com.ankamagames.wakfu.client.WakfuClientInstance;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.log4j.Logger;

public class aIJ extends BX
{
  public static final int BORDER_SIZE = 2;
  private static final Logger K = Logger.getLogger(aIJ.class);
  private dcd eht;
  private boolean ehu;
  private final aoL ehv = new aoL();

  public aIJ(short paramShort) {
    super(paramShort);
  }

  private aIJ(aIJ paramaIJ) {
    super(paramaIJ);
    this.ehu = true;
  }

  public static aIJ b(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2) {
    aIJ localaIJ = new aIJ((short)0);
    localaIJ.H(paramArrayOfByte1);
    localaIJ.a(paramArrayOfByte2, false);
    localaIJ.ehu = true;
    return localaIJ;
  }

  public aIJ aUC()
  {
    return new aIJ(this);
  }

  private void aUD() {
    if (this.ehu)
      throw new UnsupportedOperationException("Ne doit pas être appelé avec un monde servant à l'edition");
  }

  public dgg mI(int paramInt)
  {
    return (dgg)cyF.inc.ee(paramInt);
  }

  public void H(byte[] paramArrayOfByte) {
    aUD();

    c(-4, -10, 8, 11);
    B(bnp.fGg);

    I(paramArrayOfByte);
    aUG();
  }

  private void I(byte[] paramArrayOfByte) {
    aUD();

    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);

    while (localByteBuffer.hasRemaining()) {
      short s1 = localByteBuffer.getShort();
      short s2 = localByteBuffer.getShort();
      short s3 = localByteBuffer.getShort();
      short s4 = localByteBuffer.getShort();
      short s5 = localByteBuffer.getShort();
      short s6 = localByteBuffer.getShort();

      a(s1, s2, s3, s4, s5, s6);
    }
  }

  public void d(short paramShort1, short paramShort2, short paramShort3, short paramShort4, short paramShort5, short paramShort6) {
    aUD();
    a(paramShort1, paramShort2, paramShort3, paramShort4, paramShort5, paramShort6);
    u(paramShort1, paramShort2);

    aUG();
    aUE();
  }

  public void c(aXL paramaXL) {
    aUD();
    boolean bool = a(paramaXL, true);
    bool |= e(paramaXL);
    if (bool)
      aUE();
  }

  public void u(long paramLong, int paramInt)
  {
    aUD();
    aXL localaXL = d(paramLong, paramInt);
    if (localaXL != null) {
      e(localaXL);
      aUE();
    }
  }

  private void d(aXL paramaXL) {
    aUD();
    KJ localKJ = dM.Uk.ap(paramaXL.bmU());
    if (localKJ == null) {
      return;
    }
    Vc localVc1 = aRd.bhB().nw(dpl.lpK.getId());
    Vc localVc2 = aRd.bhB().nw(dpl.lpN.getId());

    ArrayList localArrayList = localKJ.nw();
    for (cZw localcZw : localArrayList)
      try
      {
        Vc localVc3 = localcZw.cMj() ? localVc2 : localVc1;
        Wj localWj = a(paramaXL, localcZw, localVc3);
        localWj.initialize();
        dps.cXa().k(localWj);
        z(paramaXL.gv(), localWj.getId());
      } catch (IOException localIOException) {
        K.error("i/o exception", localIOException);
      }
  }

  private Wj a(aXL paramaXL, cZw paramcZw, Vc paramVc)
  {
    long l = dsE.cYX();
    cYk localcYk = paramcZw.cMk();
    return Wj.a(l, paramcZw.oc(), paramaXL.bmV() + localcYk.getX(), paramaXL.bmW() + localcYk.getY(), localcYk.IB(), paramcZw.bZ(), paramcZw.bY(), (byte)paramcZw.E().getIndex(), paramVc, paramcZw.bTI());
  }

  private void z(long paramLong1, long paramLong2)
  {
    cbQ localcbQ = (cbQ)this.ehv.get(paramLong1);
    if (localcbQ == null) {
      localcbQ = new cbQ();
      this.ehv.put(paramLong1, localcbQ);
    }

    localcbQ.add(paramLong2);
  }

  private void dV(long paramLong) {
    cbQ localcbQ = (cbQ)this.ehv.get(paramLong);

    if (localcbQ == null) {
      return;
    }

    for (int i = 0; i < localcbQ.size(); i++) {
      long l = localcbQ.get(i);
      dps.cXa().jQ(l);
    }

    this.ehv.remove(paramLong);
  }

  public void dW(long paramLong) {
    aXL localaXL = bh(paramLong);
    if (localaXL != null) {
      e(localaXL);
      aUE();
    }

    dV(paramLong);
  }

  private void u(short paramShort1, short paramShort2) {
    bOh.N(paramShort1, paramShort2);
  }

  private void aUE() {
    aUD();

    if (this.eht != null) {
      this.eht.clear();
    }
    WakfuClientInstance.awy().Dg().cKV().blZ();

    dcd localdcd = aUH();
    Vr.cAl.aiH().c(localdcd);
    btb.bBd().bBf();
    ayj.aJY().clear();
    aUF();
  }

  private void aUF() {
    bQK.bXG().ape();
    bVl.caZ().ape();
    acL.apd().ape();
    dps.cXa().ape();
  }

  private boolean e(aXL paramaXL) {
    dQx localdQx = paramaXL.bmY();
    for (int i = localdQx.hqw; i < localdQx.hqx; i++) {
      for (int j = localdQx.hqu; j < localdQx.hqv; j++) {
        u((short)j, (short)i);
        bOh.N(oU.bX(j), oU.bY(i), 0);
      }
    }
    return true;
  }

  public void a(byte[] paramArrayOfByte, boolean paramBoolean) {
    aUD();

    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    while (localByteBuffer.hasRemaining()) {
      aXL localaXL = bFA.az(localByteBuffer);
      a(localaXL, paramBoolean);
    }
  }

  private boolean a(aXL paramaXL, boolean paramBoolean) {
    b(paramaXL);
    if (paramBoolean) {
      d(paramaXL);
    }
    return true;
  }

  public void aUG() {
    short[][] arrayOfShort = aUI();
    for (int i = 0; i < getWidth(); i++)
      for (int j = 0; j < getHeight(); j++) {
        int k = i + KU();
        int m = j + KV();
        if ((Q(k, m)) && (cUe.c(arrayOfShort, i, j))) {
          short s = cUe.b(arrayOfShort, i, j);
          j(k, m, s);
        }
      }
  }

  public dGr v(short paramShort1, short paramShort2)
  {
    aUD();

    dGr localdGr = new dGr();
    localdGr.eZ(paramShort1, paramShort2);
    a(paramShort1, paramShort2, localdGr);
    return localdGr;
  }

  public dJN w(short paramShort1, short paramShort2) {
    aUD();

    dt localdt = new dt();
    localdt.y(paramShort1, paramShort2);
    a(paramShort1, paramShort2, localdt);
    return localdt;
  }

  public dcd aUH() {
    aUD();

    dcd localdcd = new dcd();
    for (int i = KU(); i <= KW(); i++) {
      int j = i * 9;
      for (int k = KV(); k <= KX(); k++) {
        dgg localdgg = (dgg)S(i, k);
        if (localdgg != null)
        {
          int m = k * 9;
          localdcd.a(j, m, localdgg);
        }
      }
    }
    e(new bOS(this, localdcd));

    localdcd.cNP();
    this.eht = localdcd;
    return localdcd;
  }

  public short[][] aUI() {
    short[][] arrayOfShort = KY();
    for (int i = 0; i < arrayOfShort.length; i++) {
      for (int j = 0; j < arrayOfShort[i].length; j++) {
        if (bnp.qn(arrayOfShort[i][j]).getX() == 1) {
          arrayOfShort[i][j] = bnp.fGg;
        }
      }
    }
    return arrayOfShort;
  }

  public short a(short[][] paramArrayOfShort, int paramInt1, int paramInt2) {
    int i = paramInt1 - KU();
    int j = paramInt2 - KV();
    if ((Q(paramInt1, paramInt2)) && (cUe.c(paramArrayOfShort, i, j))) {
      return cUe.b(paramArrayOfShort, i, j);
    }
    return 0;
  }

  public boolean e(dGy paramdGy)
  {
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    super.e(new bOT(this, localArrayList2, localArrayList1));

    for (Iterator localIterator = localArrayList1.iterator(); localIterator.hasNext(); ) { localaXL = (aXL)localIterator.next();
      if (!paramdGy.d(localaXL))
        return false;
    }
    aXL localaXL;
    for (localIterator = localArrayList2.iterator(); localIterator.hasNext(); ) { localaXL = (aXL)localIterator.next();
      if (!paramdGy.d(localaXL))
        return false;
    }
    return true;
  }
}