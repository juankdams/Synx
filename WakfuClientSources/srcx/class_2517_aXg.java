import java.util.Iterator;

class aXg
  implements Runnable
{
  aXg(dgd paramdgd)
  {
  }

  public void run()
  {
    if (cNm.b(this.fcr.lbb) == null) {
      return;
    }
    boolean bool1 = cNm.b(this.fcr.lbb).cjU();
    boolean bool2 = cNm.b(this.fcr.lbb).cjT();
    Object localObject2;
    for (localObject2 : aDM.aPZ().aPY()) {
      Object localObject3 = (cEz)cNm.a(this.fcr.lbb).get(((aum)localObject2).aGx());
      if (localObject3 == null) {
        localObject3 = new uo((aum)localObject2);
        cNm.a(this.fcr.lbb).put(((aum)localObject2).aGx(), localObject3);
      }
      ((cEz)localObject3).setEnabled(bool1);
      ((cEz)localObject3).update();
    }

    for (??? = bOO.bVH().iterator(); ((Iterator)???).hasNext(); ) { String str = (String)((Iterator)???).next();

      bOO localbOO = bOO.ki(str);
      if (localbOO != null)
      {
        localObject2 = (cEz)cNm.a(this.fcr.lbb).get(localbOO.hashCode());
        if (localObject2 == null) {
          localObject2 = new aSi(localbOO);
          cNm.a(this.fcr.lbb).put(localbOO.hashCode(), localObject2);
        }
        ((cEz)localObject2).setEnabled(bool2);
        ((cEz)localObject2).update();
      } }
    cNm.b(this.fcr.lbb).c(cNm.a(this.fcr.lbb));
  }
}