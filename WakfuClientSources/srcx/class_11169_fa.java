import com.ankamagames.wakfu.client.binaryStorage.NationLawBinaryData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import org.apache.log4j.Logger;

class fa
  implements gd
{
  fa(dHu paramdHu)
  {
  }

  public void a(NationLawBinaryData paramNationLawBinaryData)
  {
    cQY localcQY = cQY.yR(paramNationLawBinaryData.TK());
    int i = paramNationLawBinaryData.getId();
    int j = paramNationLawBinaryData.TL();
    int k = paramNationLawBinaryData.TN();
    boolean bool = paramNationLawBinaryData.TO();
    EnumSet localEnumSet = EnumSet.noneOf(amI.class);
    if (paramNationLawBinaryData.TP())
      localEnumSet.add(amI.dpq);
    if (paramNationLawBinaryData.TQ())
      localEnumSet.add(amI.dpr);
    if (paramNationLawBinaryData.TR())
      localEnumSet.add(amI.dps);
    String[] arrayOfString = paramNationLawBinaryData.getParams();

    dWf localdWf = localcQY.kDh.b(i, j, k, bool, localEnumSet);

    localdWf.El(paramNationLawBinaryData.TM());

    ArrayList localArrayList = dHu.N(arrayOfString);
    if (!awA.a(localcQY, localArrayList)) {
      dHu.i().error("La loi " + localcQY + " n'a pas des paramètres du bon type");
      return;
    }
    localdWf.b(localArrayList);

    int[] arrayOfInt1 = paramNationLawBinaryData.TS();
    if (arrayOfInt1.length == 0) {
      bpL.fKb.b(localdWf);
      return;
    }

    for (int i1 : arrayOfInt1)
      bpL.fKb.a(i1, localdWf);
  }
}