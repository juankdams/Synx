import java.util.ArrayList;
import java.util.Iterator;

public class cIF extends bBn
  implements chm, dHt
{
  private final ArrayList iGt = new ArrayList();
  private final cSi iGu = new cSi();
  private final czM hhF;
  private akP hhG;
  private bbG hhH;

  cIF()
  {
    this.hhF = new czM(this);
  }

  void b(bbG parambbG) {
    this.hhH = parambbG;
  }

  void U(int[] paramArrayOfInt) {
    this.iGu.add(paramArrayOfInt);
    this.iGu.sort();
  }

  void b(akP paramakP) {
    this.hhG = paramakP;
  }

  public cqG acu()
  {
    return cqG.iat;
  }

  public String getName()
  {
    return bU.fH().b(15, getId(), new Object[0]);
  }

  public String getDescription()
  {
    return bU.fH().b(16, getId(), new Object[0]);
  }

  public String[] getFields() {
    throw new UnsupportedOperationException("Ridicule");
  }

  public Object getFieldValue(String paramString) {
    throw new UnsupportedOperationException("Ridicule");
  }

  public void a(String paramString, Object paramObject) {
    throw new UnsupportedOperationException("Ridicule");
  }

  public void b(String paramString, Object paramObject) {
    throw new UnsupportedOperationException("Ridicule");
  }

  public void c(String paramString, Object paramObject) {
    throw new UnsupportedOperationException("Ridicule");
  }

  public boolean l(String paramString) {
    throw new UnsupportedOperationException("Ridicule");
  }

  public czM cbh() {
    return this.hhF;
  }

  public void V(int[] paramArrayOfInt) {
    this.iGt.clear();
    for (int k : paramArrayOfInt)
      this.iGt.add((bOf)dap.cMI().zw(k));
  }

  public Iterator cCK()
  {
    return this.iGt.iterator();
  }

  public int[] cCL() {
    return this.iGu.cIf();
  }

  public int cCM() {
    return this.iGu.isEmpty() ? -1 : this.iGu.get(this.iGu.size() - 1);
  }

  public int cCN() {
    return this.iGu.isEmpty() ? -1 : this.iGu.get(0);
  }

  public akP cbg() {
    return this.hhG;
  }

  public bbG cbj() {
    return this.hhH;
  }
}