import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class dsV
  implements aQR
{
  public void a(aiN paramaiN)
  {
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    ArrayList localArrayList3 = new ArrayList();
    ArrayList localArrayList4 = new ArrayList();
    ArrayList localArrayList5 = new ArrayList();
    ArrayList localArrayList6 = new ArrayList();
    cSR localcSR = paramaiN.avE();

    ArrayList localArrayList7 = (ArrayList)localcSR.get(ajD.diV.nc());
    if (localArrayList7 != null)
      for (localObject1 = localArrayList7.iterator(); ((Iterator)localObject1).hasNext(); ) { localObject2 = (auT)((Iterator)localObject1).next();

        switch (Gl.bOA[cAT.dr((short)localObject2.aGY()).ordinal()]) {
        case 1:
          if (((auT)localObject2).aGZ())
            localArrayList5.add(((auT)localObject2).getText());
          else {
            localArrayList6.add(((auT)localObject2).getText());
          }
          break;
        case 2:
          if (((auT)localObject2).aGZ())
            localArrayList4.add(((auT)localObject2).getText());
          else {
            localArrayList3.add(((auT)localObject2).getText());
          }
          break;
        case 3:
          if (((auT)localObject2).aGZ())
            localArrayList1.add(((auT)localObject2).getText());
          else
            localArrayList2.add(((auT)localObject2).getText());
          break;
        }
      }
    Object localObject2;
    Object localObject1 = (ArrayList)localcSR.get(paramaiN.avD());
    if (localObject1 != null) {
      for (localObject2 = ((ArrayList)localObject1).iterator(); ((Iterator)localObject2).hasNext(); ) { auT localauT = (auT)((Iterator)localObject2).next();

        switch (Gl.bOA[cAT.dr((short)localauT.aGY()).ordinal()]) {
        case 1:
          if (localauT.aGZ())
            localArrayList5.add(localauT.getText());
          else {
            localArrayList6.add(localauT.getText());
          }
          break;
        case 2:
          if (localauT.aGZ())
            localArrayList4.add(localauT.getText());
          else {
            localArrayList3.add(localauT.getText());
          }
          break;
        case 3:
          if (localauT.aGZ())
            localArrayList1.add(localauT.getText());
          else {
            localArrayList2.add(localauT.getText());
          }
          break;
        }
      }
    }
    paramaiN.i(localArrayList6);
    paramaiN.j(localArrayList5);
    paramaiN.m(localArrayList2);
    paramaiN.n(localArrayList1);
    paramaiN.k(localArrayList3);
    paramaiN.l(localArrayList4);
  }
}