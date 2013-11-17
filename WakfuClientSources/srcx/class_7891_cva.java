import java.util.ArrayList;

class cva
  implements bPA
{
  cva(bCP parambCP)
  {
  }

  public boolean a(int paramInt, dEE paramdEE)
  {
    if (paramdEE.isComplete()) {
      ArrayList localArrayList = paramdEE.dgh();
      int i = 0; for (int j = localArrayList.size(); i < j; i++) {
        aiJ localaiJ = (aiJ)localArrayList.get(i);
        localaiJ.cm(true);
      }
    }
    return true;
  }
}