public class bVw extends bBn
  implements chm
{
  private final czM hhF;
  private akP hhG;
  private bbG hhH;

  bVw()
  {
    this.hhF = new czM(this);
  }

  void b(akP paramakP) {
    this.hhG = paramakP;
  }

  void b(bbG parambbG) {
    this.hhH = parambbG;
  }

  public cqG acu()
  {
    return cqG.ias;
  }

  public akP cbg() {
    return this.hhG;
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
    return this.hhF.getFields();
  }

  public Object getFieldValue(String paramString) {
    return this.hhF.getFieldValue(paramString);
  }

  public void a(String paramString, Object paramObject)
  {
  }

  public void b(String paramString, Object paramObject)
  {
  }

  public void c(String paramString, Object paramObject)
  {
  }

  public boolean l(String paramString) {
    return false;
  }

  public czM cbh() {
    return this.hhF;
  }

  public boolean cbi() {
    return (byv.bFN().c(duO.dax())) && (duO.dax().BN(getId()));
  }

  public boolean bKx()
  {
    bZA localbZA = a(Aq.bvT);
    byz localbyz = byv.bFN().bFO();
    return (localbZA == null) || (localbZA.i(localbyz, this, null, localbyz.bEY()));
  }

  public bbG cbj() {
    return this.hhH;
  }
}