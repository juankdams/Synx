public class bsB
{
  private static final akR fZw = new akR();

  public static hf g(String paramString1, String paramString2, boolean paramBoolean) {
    return dqA.g(paramString1, paramString2, paramBoolean);
  }

  public static P b(hf paramhf) {
    P localP = (P)fZw.get(paramhf);
    if (localP != null)
      return localP;
    Object localObject;
    if (paramhf.getClass() == aEj.class) {
      localObject = new awQ();
      ((awQ)localObject).a((aEj)paramhf);
      fZw.put(paramhf, localObject);
      return localObject;
    }if (paramhf.getClass() == cdM.class) {
      localObject = new cAF();
      ((cAF)localObject).b((cdM)paramhf);
      fZw.put(paramhf, localObject);
      return localObject;
    }if ((paramhf instanceof aYE)) {
      localObject = (aYE)paramhf;
      bMR localbMR;
      if (((aYE)localObject).at())
        localbMR = new bMR(((aYE)localObject).bnO(), ((aYE)localObject).isAntiAliased(), false, aAF.dTA);
      else {
        localbMR = new bMR(((aYE)localObject).bnO(), ((aYE)localObject).isAntiAliased(), false);
      }
      localbMR.setUseVertexArrays(false);
      fZw.put(paramhf, localbMR);
      return localbMR;
    }

    return null;
  }
}