import java.nio.ByteBuffer;
import java.util.Iterator;

public class dDP
{
  long aXW;
  short bdn;
  final bPu lMu = new bPu();

  static Iterator lMv = new dnI();
  clg lMw;

  dDP()
  {
  }

  long AD()
  {
    return this.aXW;
  }

  void X(long paramLong) {
    this.aXW = paramLong;
  }

  public void dfI()
  {
    this.lMu.cw(this.bdn);
    this.bdn = ((short)(this.bdn + 1));
  }

  void dfJ() {
    if (this.lMw != null)
      this.lMw.stop();
  }

  public short dfK()
  {
    return this.bdn;
  }

  public void a(dIN paramdIN, short paramShort, boolean paramBoolean)
  {
    eE(paramShort);
    ((cSU)this.lMu.cx(paramShort)).a(paramdIN, paramBoolean);
  }

  private void eE(short paramShort) {
    if (!this.lMu.N(paramShort))
      this.lMu.c(paramShort, new cSU());
  }

  private boolean dfL() {
    return !this.lMu.N(this.bdn);
  }

  Iterator cAA()
  {
    if (dfL())
      return lMv;
    this.lMw = new clg(this, ((cSU)this.lMu.cx(this.bdn)).cIO());
    return this.lMw;
  }

  Iterator cAB() {
    if (dfL())
      return lMv;
    this.lMw = new clg(this, ((cSU)this.lMu.cx(this.bdn)).cIM());
    return this.lMw;
  }

  public cXU dfM() {
    return new dnG(this);
  }

  public void dfN()
  {
    cSU[] arrayOfcSU = new cSU[this.lMu.size()];
    this.lMu.d(arrayOfcSU);
    for (int i = 0; i < arrayOfcSU.length; i++) {
      cSU localcSU = arrayOfcSU[i];
      localcSU.clear();
    }
  }

  public int O()
  {
    int i = 4;
    for (short s : this.lMu.Vq()) {
      i += 2 + ((cSU)this.lMu.cx(s)).O();
    }
    return i;
  }

  public void b(ByteBuffer paramByteBuffer) {
    paramByteBuffer.putShort(this.bdn);
    paramByteBuffer.putShort((short)this.lMu.size());
    for (short s : this.lMu.Vq()) {
      paramByteBuffer.putShort(s);
      ((cSU)this.lMu.cx(s)).b(paramByteBuffer);
    }
  }

  protected void a(ahy paramahy, ByteBuffer paramByteBuffer) {
    this.bdn = paramByteBuffer.getShort();
    int i = paramByteBuffer.getShort();
    for (int j = 0; j < i; j++) {
      short s = paramByteBuffer.getShort();
      cSU localcSU = cSU.d(paramahy, paramByteBuffer);
      this.lMu.c(s, localcSU);
    }
  }

  public static dDP e(ahy paramahy, ByteBuffer paramByteBuffer)
  {
    dDP localdDP = new dDP();
    localdDP.a(paramahy, paramByteBuffer);
    return localdDP;
  }

  public dDP(long paramLong, short paramShort)
  {
    this();
    this.bdn = paramShort;
    this.aXW = paramLong;
  }
}