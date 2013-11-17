import java.util.ArrayList;

public class aZG
  implements aIo
{
  private aIo diG = null;
  private ArrayList bFw;
  protected boolean aGX = false;
  private boolean dBi = false;
  private int brR = 0;
  private Object aOd;

  public aZG(Object paramObject)
  {
    this.aOd = paramObject;
  }

  public void a(aZG paramaZG) {
    if (this.bFw == null) {
      this.bFw = new ArrayList();
    }

    if (!this.bFw.contains(paramaZG)) {
      this.bFw.add(paramaZG);
      paramaZG.diG = this;
      paramaZG.mG(this.brR + 1);
    }
  }

  public boolean hasChildren() {
    return (this.bFw != null) && (!this.bFw.isEmpty());
  }

  public ArrayList getChildren() {
    return this.bFw;
  }

  public aIo aUq() {
    return this.diG;
  }

  public void setValue(Object paramObject) {
    this.aOd = paramObject;
  }

  public Object getValue() {
    return this.aOd;
  }

  public void cq(boolean paramBoolean) {
    this.aGX = paramBoolean;
  }

  public boolean axS() {
    return this.aGX;
  }

  public void setSelected(boolean paramBoolean) {
    this.dBi = paramBoolean;
  }

  public boolean isSelected() {
    return this.dBi;
  }

  public int getDepth() {
    return this.brR;
  }

  public void mG(int paramInt) {
    if (this.brR == paramInt) {
      return;
    }

    this.brR = paramInt;
    if (this.bFw != null)
      for (int i = this.bFw.size() - 1; i >= 0; i--)
        ((aIo)this.bFw.get(i)).mG(this.brR + 1);
  }
}