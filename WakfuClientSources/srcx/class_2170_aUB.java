import java.util.ArrayList;

public class aUB extends cQd
{
  public static final byte aDG = 6;
  private final ArrayList eVC = new ArrayList(2);

  public void a(XF paramXF)
  {
    this.eVC.add(paramXF);
  }

  public ArrayList bjG() {
    return this.eVC;
  }

  public boolean aOX() {
    for (int i = this.eVC.size() - 1; i >= 0; i--) {
      if (!((XF)this.eVC.get(i)).isValid()) {
        return false;
      }
    }

    return true;
  }

  public byte nq() {
    return 6;
  }

  public void k(aYQ paramaYQ) {
    int i = paramaYQ.readByte();
    for (int j = 0; j < i; j++)
      this.eVC.add(auU.j(paramaYQ));
  }

  public void e(dSw paramdSw)
  {
    paramdSw.writeByte((byte)this.eVC.size());
    int i = 0; for (int j = this.eVC.size(); i < j; i++)
      auU.a(paramdSw, (XF)this.eVC.get(i));
  }

  public String aOY()
  {
    StringBuilder localStringBuilder = new StringBuilder("{");
    int i = 0; for (int j = this.eVC.size(); i < j; i++) {
      if (i > 0) {
        localStringBuilder.append(" ET ");
      }
      localStringBuilder.append(((XF)this.eVC.get(i)).toString());
    }
    localStringBuilder.append("}");

    return localStringBuilder.toString();
  }

  public XF ajE()
  {
    aUB localaUB = new aUB();
    localaUB.iF(ajF());
    int i = 0; for (int j = this.eVC.size(); i < j; i++) {
      localaUB.a(((XF)this.eVC.get(i)).ajE());
    }
    return localaUB;
  }
}