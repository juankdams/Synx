import java.util.ArrayList;

public class afn
  implements aQI
{
  private int aw;
  private bNa bPo;
  private String cYf;
  private String aGq;
  private int cYg;
  private final ArrayList bFw = new ArrayList();
  private short cYh;

  public afn(int paramInt, bNa parambNa, String paramString1, String paramString2)
  {
    this.aw = paramInt;
    this.bPo = parambNa;
    this.cYf = paramString1;
    this.aGq = paramString2;
  }

  public short aqT() {
    return this.cYh;
  }

  public void as(short paramShort) {
    this.cYh = paramShort;
  }

  public void a(cwt paramcwt) {
    this.bFw.add(paramcwt);
  }

  public void b(cwt paramcwt) {
    this.bFw.remove(paramcwt);
  }

  public void removeAllChildren() {
    this.bFw.clear();
  }

  public ArrayList getChildren() {
    return this.bFw;
  }

  public bNa aqU() {
    return this.bPo;
  }

  public int getId() {
    return this.aw;
  }

  public byte aqV() {
    return 0;
  }

  public String aqW() {
    return this.cYf;
  }

  public void hV(int paramInt) {
    this.cYg = paramInt;
  }

  public int getBorderWidth() {
    return this.cYg;
  }

  public String fJ() {
    return this.aGq;
  }
}