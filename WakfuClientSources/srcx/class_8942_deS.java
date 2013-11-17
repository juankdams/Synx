import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

public class deS extends ctN
{
  public static byte kYV = 1;
  public static byte kYW = 2;
  public static byte kYX = 3;
  public static byte kYY = 4;
  public static byte kYZ = 5;

  private static final Logger K = Logger.getLogger(deS.class);

  public static final aug aGB = new cAh();
  private long iI;
  private long brD;
  private byte ilH;
  private int fui;
  private float fuj;
  private auX kZa;
  private dOF kZb;

  public deS()
  {
    super(dfr.kZI);
  }

  public void g(long paramLong) {
    this.iI = paramLong;
  }

  public void ue(int paramInt) {
    this.fui = paramInt;
  }

  public long Hc() {
    return this.brD;
  }

  public void jE(long paramLong) {
    this.brD = paramLong;
  }

  public void dc(float paramFloat) {
    this.fuj = paramFloat;
  }

  public long eq() {
    return this.iI;
  }

  public int bsZ() {
    return this.fui;
  }

  public byte cva() {
    return this.ilH;
  }

  public void eS(byte paramByte) {
    this.ilH = paramByte;
  }

  public float bta() {
    return this.fuj;
  }

  public auX cPf() {
    return this.kZa;
  }

  public dOF cPg() {
    return this.kZb;
  }

  public void a(byte paramByte1, byte paramByte2, byte paramByte3, byte paramByte4, byte paramByte5, byte paramByte6, byte paramByte7) {
    this.kZa = new auX(paramByte1, paramByte2, paramByte3, paramByte4, paramByte5, paramByte6, paramByte7, null);
  }

  public void a(gA paramgA1, gA paramgA2, gA paramgA3) {
    this.kZb = new dOF(paramgA1 != null ? paramgA1.ok() : 0, paramgA2 != null ? paramgA2.ok() : 0, paramgA3 != null ? paramgA3.ok() : 0, null);
  }

  public void execute()
  {
    aYr localaYr = crk();
    if (localaYr == null) {
      K.error("Impossible d'exécuter l'action " + this + " : la nation " + this.ie + " n'existe pas");
      return;
    }
    localaYr.a(this);
  }

  public boolean h(cTK paramcTK) {
    int i = paramcTK.cJf().bP();
    if (i != this.ie)
      return false;
    if (paramcTK.getId() != this.iI)
      return false;
    return true;
  }

  public boolean g(ByteBuffer paramByteBuffer) {
    paramByteBuffer.putLong(this.iI);
    paramByteBuffer.putLong(this.brD);
    paramByteBuffer.put(this.ilH);
    paramByteBuffer.putInt(this.fui);
    paramByteBuffer.putFloat(this.fuj);
    if (this.kZa != null) {
      paramByteBuffer.put((byte)1);
      this.kZa.b(paramByteBuffer);
    } else {
      paramByteBuffer.put((byte)0);
    }
    if (this.kZb != null) {
      paramByteBuffer.put((byte)1);
      this.kZb.b(paramByteBuffer);
    } else {
      paramByteBuffer.put((byte)0);
    }
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    this.iI = paramByteBuffer.getLong();
    this.brD = paramByteBuffer.getLong();
    this.ilH = paramByteBuffer.get();

    this.fui = paramByteBuffer.getInt();
    this.fuj = paramByteBuffer.getFloat();

    if (paramByteBuffer.get() == 1) {
      this.kZa = auX.af(paramByteBuffer);
    }
    if (paramByteBuffer.get() == 1) {
      this.kZb = dOF.aQ(paramByteBuffer);
    }
    return true;
  }

  public int O() {
    return 26 + (this.kZa != null ? this.kZa.O() : 0) + 1 + (this.kZb != null ? this.kZb.O() : 0);
  }

  public void clear() {
    this.ie = -1;
    this.iI = -1L;
    this.ilH = -1;
    this.fui = 0;
    this.fuj = 0.0F;
    this.kZa = null;
    this.kZb = null;
  }
}