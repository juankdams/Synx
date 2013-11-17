import java.nio.ByteBuffer;
import java.util.ArrayList;

public class wQ
{
  private aMr boE;

  public wQ FS()
  {
    this.boE = new aMr();
    return this;
  }

  public aVw FT() {
    if (this.boE == null)
      throw new UnsupportedOperationException("L'objet n'a pas été créé");
    return this.boE;
  }

  public wQ aP(long paramLong) {
    this.boE.a(paramLong);
    return this;
  }

  public wQ aQ(long paramLong) {
    this.boE.el(paramLong);
    return this;
  }

  public wQ bf(String paramString) {
    this.boE.gU(paramString);
    return this;
  }

  public wQ ds(int paramInt) {
    this.boE.ne(paramInt);
    return this;
  }

  public wQ a(bCe parambCe) {
    this.boE.bS(parambCe.ewr);
    return this;
  }

  public wQ w(short paramShort) {
    this.boE.bl(paramShort);
    return this;
  }

  public wQ dt(int paramInt) {
    this.boE.nf(paramInt);
    return this;
  }

  public wQ a(bAp parambAp) {
    this.boE.bT(parambAp.ewr);
    return this;
  }

  public wQ aR(long paramLong) {
    this.boE.em(paramLong);
    return this;
  }

  public wQ a(dnm paramdnm) {
    this.boE.b(paramdnm);
    return this;
  }

  public void clear() {
    this.boE = null;
  }

  public static ArrayList a(aJo paramaJo, ByteBuffer paramByteBuffer)
  {
    ArrayList localArrayList = new ArrayList();
    int i = 0; for (int j = paramByteBuffer.getInt(); i < j; i++)
      localArrayList.add(b(paramaJo, paramByteBuffer));
    return localArrayList;
  }

  public static aVw b(aJo paramaJo, ByteBuffer paramByteBuffer) {
    aMr localaMr = new aMr();
    localaMr.a(paramByteBuffer.getLong());
    localaMr.el(paramByteBuffer.getLong());
    byte[] arrayOfByte = new byte[paramByteBuffer.getShort()];
    paramByteBuffer.get(arrayOfByte);
    String str = dzp.aJ(arrayOfByte);
    localaMr.gU(str);
    localaMr.ne(paramByteBuffer.getInt());
    localaMr.bS(paramByteBuffer.get());
    localaMr.bl(paramByteBuffer.getShort());
    localaMr.nf(paramByteBuffer.getInt());
    localaMr.bT(paramByteBuffer.get());
    localaMr.em(paramByteBuffer.getLong());
    localaMr.b(c(paramaJo, paramByteBuffer));
    return localaMr;
  }

  public static dnm c(aJo paramaJo, ByteBuffer paramByteBuffer) {
    dnm localdnm = paramaJo.bQ(paramByteBuffer.get());
    localdnm.a(paramByteBuffer);
    return localdnm;
  }

  public String toString()
  {
    return "MarketEntryBuilder{m_entry=" + this.boE + '}';
  }
}