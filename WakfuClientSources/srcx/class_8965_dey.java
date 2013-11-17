import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

public class dey extends ctN
{
  private static final Logger K = Logger.getLogger(dey.class);

  public static final aug aGB = new GL();
  private long iI;
  private byte[] kYt;
  private int fui;
  private float fuj;
  private byte dJJ;
  private byte dJK;
  private byte dJL;
  private byte dJM;
  private byte dJN;
  private byte ctp;
  private byte ctq;
  private int ihl;
  private int ihm;
  private int ihn;

  public dey()
  {
    super(dfr.kZG);
  }

  public void g(long paramLong) {
    this.iI = paramLong;
  }

  public void oZ(String paramString) {
    this.kYt = dzp.qC(paramString);
  }

  public void ue(int paramInt) {
    this.fui = paramInt;
  }

  public void dc(float paramFloat) {
    this.fuj = paramFloat;
  }

  public long eq() {
    return this.iI;
  }

  public String acf() {
    return dzp.aJ(this.kYt);
  }

  public int bsZ() {
    return this.fui;
  }

  public float bta() {
    return this.fuj;
  }

  public byte aHc() {
    return this.dJJ;
  }

  public byte aHd() {
    return this.dJK;
  }

  public byte aHe() {
    return this.dJL;
  }

  public byte aHf() {
    return this.dJM;
  }

  public byte aHg() {
    return this.dJN;
  }

  public byte afn() {
    return this.ctp;
  }

  public byte afo() {
    return this.ctq;
  }

  public int ctz() {
    return this.ihl;
  }

  public int ctA() {
    return this.ihm;
  }

  public int ctB() {
    return this.ihn;
  }

  public void a(byte paramByte1, byte paramByte2, byte paramByte3, byte paramByte4, byte paramByte5, byte paramByte6, byte paramByte7) {
    this.dJJ = paramByte1;
    this.dJK = paramByte2;
    this.dJL = paramByte3;
    this.dJM = paramByte4;
    this.dJN = paramByte5;
    this.ctp = paramByte6;
    this.ctq = paramByte7;
  }

  public void a(gA paramgA1, gA paramgA2, gA paramgA3) {
    this.ihl = (paramgA1 != null ? paramgA1.ok() : 0);
    this.ihm = (paramgA2 != null ? paramgA2.ok() : 0);
    this.ihn = (paramgA3 != null ? paramgA3.ok() : 0);
  }

  public void execute() {
    aYr localaYr = crk();
    if (localaYr == null) {
      K.error("Impossible d'exécuter l'action " + this + " : la nation " + this.ie + " n'existe pas");
      return;
    }
    localaYr.b(this);
  }

  public boolean h(cTK paramcTK) {
    int i = paramcTK.cJf().bP();
    if (i != this.ie)
      return false;
    if (paramcTK.nU() < 1)
      return false;
    int j = paramcTK.cJf().dJ(i);
    return dwC.dbQ().BQ(j).a(aRk.eOb);
  }

  public boolean g(ByteBuffer paramByteBuffer) {
    paramByteBuffer.putLong(this.iI);
    paramByteBuffer.putShort((short)this.kYt.length);
    paramByteBuffer.put(this.kYt);
    paramByteBuffer.putInt(this.fui);
    paramByteBuffer.putFloat(this.fuj);
    paramByteBuffer.put(this.dJJ);
    paramByteBuffer.put(this.dJK);
    paramByteBuffer.put(this.dJL);
    paramByteBuffer.put(this.dJM);
    paramByteBuffer.put(this.dJN);
    paramByteBuffer.put(this.ctp);
    paramByteBuffer.put(this.ctq);
    paramByteBuffer.putInt(this.ihl);
    paramByteBuffer.putInt(this.ihm);
    paramByteBuffer.putInt(this.ihn);
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    this.iI = paramByteBuffer.getLong();

    int i = paramByteBuffer.getShort();
    this.kYt = new byte[i];
    paramByteBuffer.get(this.kYt);

    this.fui = paramByteBuffer.getInt();
    this.fuj = paramByteBuffer.getFloat();

    this.dJJ = paramByteBuffer.get();
    this.dJK = paramByteBuffer.get();
    this.dJL = paramByteBuffer.get();
    this.dJM = paramByteBuffer.get();
    this.dJN = paramByteBuffer.get();
    this.ctp = paramByteBuffer.get();
    this.ctq = paramByteBuffer.get();

    this.ihl = paramByteBuffer.getInt();
    this.ihm = paramByteBuffer.getInt();
    this.ihn = paramByteBuffer.getInt();

    return true;
  }

  public int O() {
    return 10 + this.kYt.length + 4 + 4 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 4 + 4 + 4;
  }

  public void clear() {
    this.ie = -1;
    this.iI = -1L;
    this.kYt = null;
    this.fui = 0;
    this.fuj = 0.0F;
    this.dJJ = -1;
    this.dJK = -1;
    this.dJL = -1;
    this.dJM = -1;
    this.dJN = -1;
    this.ctp = -1;
    this.ctq = -1;
    this.ihl = -1;
    this.ihm = -1;
    this.ihn = -1;
  }
}