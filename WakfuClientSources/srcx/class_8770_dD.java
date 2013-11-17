import java.util.ArrayList;
import java.util.List;

public class dD extends bzu
{
  private final bZc TQ;
  private final int TR;
  private final List TS = new ArrayList();

  private String TT = null;
  private bNa TU = bNa.gRx;
  private String hh;
  private final int TV;

  public dD(bZc parambZc, int paramInt)
  {
    this(parambZc, paramInt, -1);
  }

  public dD(bZc parambZc, int paramInt1, int paramInt2) {
    this.TQ = parambZc;
    this.TR = paramInt1;
    this.TV = paramInt2;
  }

  public bZc hv() {
    return this.TQ;
  }

  public List hw() {
    return this.TS;
  }

  public int getOffset() {
    return this.TR;
  }

  public String hx() {
    return this.TT;
  }

  public void G(String paramString) {
    this.TT = paramString;
  }

  public bNa hy() {
    return this.TU;
  }

  public void a(bNa parambNa) {
    this.TU = parambNa;
  }

  public String getTitle() {
    return this.hh;
  }

  public void setTitle(String paramString) {
    this.hh = paramString;
  }

  public void addInfo(String paramString) {
    a(paramString, null, null);
  }

  public void c(String paramString1, String paramString2) {
    a(paramString1, paramString2, null);
  }

  public void a(String paramString1, String paramString2, ArrayList paramArrayList) {
    if ((paramString1 != null) && (paramString1.length() > 0))
      this.TS.add(new Pc(this, paramString1, paramString2, paramArrayList, null));
  }

  public boolean hz() {
    return this.TV >= 0;
  }

  public int hA() {
    return this.TV;
  }

  public int getId()
  {
    return 16590;
  }
}