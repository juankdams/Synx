import org.apache.log4j.Logger;

public abstract class cyx extends ts
{
  public void a(cWG paramcWG, boolean paramBoolean)
  {
    try
    {
      if (paramcWG.getId() == 3153) {
        aJ localaJ = (aJ)paramcWG;
        String str = localaJ.Xd();
        if ((str != null) && (str.contains("kama")))
          K.info("vicinity sent=" + str, new Exception());
      }
    } catch (Exception localException) {
      K.error("erreur lors du debug des vicinity", localException);
    }

    super.a(paramcWG, paramBoolean);
  }
}