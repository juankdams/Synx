import java.util.ArrayList;

class dQL
  implements cIw
{
  dQL(aCQ paramaCQ, ArrayList paramArrayList)
  {
  }

  public boolean R(int paramInt)
  {
    ayJ localayJ = bOU.gUc.tG(paramInt);
    if (localayJ == null)
      return true;
    for (dmn localdmn = localayJ.aKG().cjy().yF(); localdmn.hasNext(); ) {
      localdmn.fl();
      for (Ig localIg : ((aTY)localdmn.value()).bjo())
        if ((localIg instanceof aSr))
        {
          dum localdum = new dum((aSr)localIg);
          if (localdum.btw()) {
            bCY.bLy().a(localdum);
          }
          this.mlo.add(localdum);
        }
    }
    return true;
  }
}