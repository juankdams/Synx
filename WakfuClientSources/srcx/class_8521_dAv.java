import java.util.List;

final class dAv
  implements Runnable
{
  private final dCM lHC;
  private final String lHD;
  private final String lHE;
  private final Integer lHF;
  private final String name;
  private final String header;
  private final Integer lHG;
  private final String message;

  private dAv(dmk paramdmk, dCM paramdCM, String paramString1, String paramString2, Integer paramInteger1, String paramString3, String paramString4, Integer paramInteger2, String paramString5)
  {
    this.lHC = paramdCM;
    this.lHD = paramString1;
    this.lHE = paramString2;
    this.lHF = paramInteger1;
    this.name = paramString3;
    this.header = paramString4;
    this.lHG = paramInteger2;
    this.message = paramString5;
  }

  public void run()
  {
    aHA.trace("run()", new Object[0]);
    for (int i = dmk.c(this.gYe).size() - 1; i >= 0; i--) {
      btJ localbtJ = (btJ)dmk.c(this.gYe).get(i);
      try {
        localbtJ.a(this.lHC, this.lHD, this.lHE, this.lHF, this.name, this.header, this.lHG, this.message);
      }
      catch (Exception localException) {
        aHA.d("Event listener {} threw an exception", localException, new Object[] { localbtJ });
      }
    }

    aHA.trace("runnable exits", new Object[0]);
  }
}