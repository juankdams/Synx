import com.ankamagames.wakfu.client.binaryStorage.CraftBinaryData;
import com.ankamagames.wakfu.client.binaryStorage.RecipeBinaryData;
import java.util.EnumSet;
import org.apache.log4j.Logger;

public class vv
  implements asq
{
  private static final Logger K = Logger.getLogger(vv.class);

  public void a(dnq paramdnq) {
    cze.cwb().a(new CraftBinaryData(), new dLm(this));

    paramdnq.c(this);
  }

  private static deT a(CraftBinaryData paramCraftBinaryData) {
    deT localdeT = new deT(paramCraftBinaryData.axX(), paramCraftBinaryData.cMt(), paramCraftBinaryData.bAz(), paramCraftBinaryData.Wk(), paramCraftBinaryData.cMu(), paramCraftBinaryData.cMv());

    cSR localcSR = new cSR();

    cze.cwb().a(new RecipeBinaryData(), "craft_id", localdeT.getId(), new dLl(localdeT, localcSR));

    localdeT.g(localcSR);
    return localdeT;
  }

  public static cGx a(RecipeBinaryData paramRecipeBinaryData)
  {
    int[] arrayOfInt = paramRecipeBinaryData.Bz();
    EnumSet localEnumSet = EnumSet.noneOf(yK.class);
    for (int i = 0; i < arrayOfInt.length; i++) {
      int j = arrayOfInt[i];
      yK localyK = yK.dH(j);
      if (localyK == null) {
        throw new Exception("Impossible de trouver la propriété " + j + " de la recette " + paramRecipeBinaryData.getId());
      }
      if (localEnumSet.contains(localyK)) {
        throw new Exception("Duplication de la propriété " + j + " sur la recette " + paramRecipeBinaryData.getId());
      }
      localEnumSet.add(localyK);
    }

    cGx localcGx = new cGx(paramRecipeBinaryData.getId(), paramRecipeBinaryData.aTz(), (short)paramRecipeBinaryData.getLevel(), paramRecipeBinaryData.getDuration(), paramRecipeBinaryData.cBw(), aVj.hn(paramRecipeBinaryData.uL()), localEnumSet, paramRecipeBinaryData.cCH());
    Object localObject2;
    for (localObject2 : paramRecipeBinaryData.cCI()) {
      if (localcGx.xL(localObject2.gw())) {
        throw new Exception("Duplication d'ingredient " + localObject2.gw() + " sur la recette " + paramRecipeBinaryData.getId());
      }

      int n = localObject2.gw();
      localcGx.A(n, localObject2.nP());
    }

    for (localObject2 : paramRecipeBinaryData.cCJ()) {
      localcGx.B(localObject2.gw(), localObject2.nP());
    }

    return localcGx;
  }

  public String getName() {
    return bU.fH().getString("contentLoader.craft");
  }
}