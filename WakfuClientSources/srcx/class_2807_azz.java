import java.util.ArrayList;

public class azz
{
  private ArrayList dQU;
  private eR dQV = null;
  private static final eR dQW = new Gm();

  private ArrayList ca = new ArrayList();

  public azz(ArrayList paramArrayList) {
    z(paramArrayList);
  }

  public azz() {
  }

  public void g(axU paramaxU) {
    this.ca.add(paramaxU);
  }

  public void h(axU paramaxU) {
    this.ca.remove(paramaxU);
  }

  public void clear() {
    this.ca.clear();
  }

  public void aLp() {
    for (int i = this.ca.size() - 1; i >= 0; i--)
      ((axU)this.ca.get(i)).aJz();
  }

  protected void aLq()
  {
    this.dQV = null;

    if ((this.dQU == null) || (this.dQU.size() == 0)) {
      return;
    }

    if (this.dQV == null)
      this.dQV = ((eR)this.dQU.get(0));
  }

  public boolean i(axU paramaxU)
  {
    if ((this.dQV == null) || (paramaxU == null)) {
      return false;
    }

    Object localObject = null;

    for (eR localeR : this.dQU) {
      if (localeR.isRenderableCompatible(paramaxU)) {
        localObject = localeR;
        break;
      }

    }

    if (localObject == null) {
      if (dQW.isRenderableCompatible(paramaxU))
        localObject = dQW;
      else {
        localObject = this.dQV;
      }

    }

    if (paramaxU.getRenderer() != localObject) {
      paramaxU.setRenderer((eR)localObject);
      return true;
    }
    return false;
  }

  public ArrayList aLr()
  {
    return this.dQU;
  }

  public void z(ArrayList paramArrayList)
  {
    this.dQU = paramArrayList;
    if (this.dQU != null) {
      for (int i = this.dQU.size() - 1; i >= 0; i--) {
        ((eR)this.dQU.get(i)).setManager(this);
      }
    }
    aLq();
  }

  public void a(eR parameR) {
    if (this.dQU == null) {
      this.dQU = new ArrayList();
    }

    this.dQU.add(parameR);
    parameR.setManager(this);

    aLq();
  }
}