import java.util.ArrayList;
import java.util.List;

public class bjx extends cwV
{
  public void addText(String paramString)
  {
    dhB localdhB = (dhB)Ga().bR("ant.projectHelper");
    if (!(localdhB instanceof si))
    {
      return;
    }
    String str = Ga().getDescription();
    if (str == null)
      Ga().setDescription(paramString);
    else
      Ga().setDescription(str + paramString);
  }

  public static String x(FF paramFF)
  {
    List localList = (List)paramFF.bR("ant.targets");
    if (localList == null) {
      return null;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    for (wZ localwZ : localList) {
      a(paramFF, localwZ, localStringBuilder);
    }
    return localStringBuilder.toString();
  }

  private static void a(FF paramFF, wZ paramwZ, StringBuilder paramStringBuilder)
  {
    if (paramwZ == null) {
      return;
    }
    for (aGK localaGK : a(paramFF, paramwZ, "description"))
      if ((localaGK instanceof aQS))
      {
        aQS localaQS = (aQS)localaGK;
        String str = localaQS.aSQ().caf().toString();
        if (str != null)
          paramStringBuilder.append(paramFF.bH(str));
      }
  }

  private static List a(FF paramFF, wZ paramwZ, String paramString)
  {
    ArrayList localArrayList = new ArrayList();
    for (aGK localaGK : paramwZ.Gb()) {
      if (paramString.equals(localaGK.aSI())) {
        localArrayList.add(localaGK);
      }
    }
    return localArrayList;
  }
}