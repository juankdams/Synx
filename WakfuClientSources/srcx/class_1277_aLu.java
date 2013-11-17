import java.io.File;

public class aLu
  implements crE
{
  private final crE epM;

  public aLu(crE paramcrE)
  {
    this.epM = paramcrE;
  }

  public void b(bTp parambTp) {
    if (parambTp.bZP() == awB.dLM) {
      bJx localbJx = (bJx)parambTp;
      aOT localaOT = (aOT)localbJx.bZN();
      String str = localaOT.bfM();
      if ((str != null) && (!str.equals(localaOT.bfL()))) {
        File localFile = localbJx.bQG();
        bOp.gTA.put(localFile.getName(), str);
      }
    }

    this.epM.b(parambTp);
  }

  public String toString()
  {
    return "CacheFillerListener{}";
  }
}