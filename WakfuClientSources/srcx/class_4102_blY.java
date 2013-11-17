import java.util.ArrayList;

public class blY extends aMT
{
  public static final int fDl = -1;
  public static final String[] bF = { "name", "achievements", "isHistory" };

  public blY()
  {
    this.esv = -1;
  }

  public String[] getFields()
  {
    return bF;
  }

  protected String getName() {
    return bU.fH().getString("achievement.history");
  }

  public boolean bdT() {
    return true;
  }

  public int getId() {
    return -1;
  }

  public void a(cPH paramcPH)
  {
  }

  public cSR bdU()
  {
    return null;
  }

  protected ArrayList bdV() {
    ArrayList localArrayList = new ArrayList();
    bCP localbCP = byv.bFN().bFO().bGa();
    for (cIl localcIl : localbCP.bLp()) {
      ckJ localckJ = cHT.iDr.xQ(localcIl.sY());
      if ((localckJ != null) && (!cHT.iDr.xT(localckJ.getId())))
        localArrayList.add(localckJ);
    }
    return localArrayList;
  }

  protected boolean bwW() {
    return false;
  }
}