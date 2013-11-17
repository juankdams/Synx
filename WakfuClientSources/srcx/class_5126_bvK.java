import java.util.ArrayList;

public final class bvK extends aRw
{
  private final ArrayList dcd = new ArrayList();

  public boolean a(bH parambH) {
    return (!this.dcd.contains(parambH)) && (this.dcd.add(parambH));
  }

  public byte[] encode()
  {
    cXr localcXr = new cXr();
    for (int i = 0; i < this.dcd.size(); i++) {
      bH localbH = (bH)this.dcd.get(i);
      localcXr.eL(localbH.eT().ewr);
      localcXr.aD(localbH.j());
    }
    return a((byte)3, localcXr.toArray());
  }

  public int getId()
  {
    return 15651;
  }

  public String toString()
  {
    return "HavenWorldManageActionRequest{m_actions=" + this.dcd.size() + '}';
  }
}