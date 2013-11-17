import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.apache.log4j.Logger;

public class aEl extends akN
{
  private static ArrayList aAG = new ArrayList();

  protected List kM()
  {
    return aAG;
  }

  public aEl(ArrayList paramArrayList) {
    int i = u(paramArrayList);
    switch (i)
    {
    case 0:
      return;
    }
    K.error("Mauvais paramétrage du critère : " + Arrays.toString(paramArrayList.toArray()));
  }

  public int a(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4)
  {
    dhJ localdhJ = aAw.e(paramObject1, paramObject2, paramObject4, paramObject3);
    if (localdhJ == null)
      throw new aIh("Impossible de récupérer la cible du critère");
    if (!(localdhJ instanceof cjm)) {
      throw new aIh("La cible " + localdhJ + " du critère est invalide");
    }
    bHj localbHj = (bHj)((cjm)localdhJ).bSC();
    return localbHj.c(cPC.kyN) ? 0 : -1;
  }

  public Enum gm()
  {
    return Bz.bCu;
  }

  static
  {
    aAG.add(zT.buX);
  }
}