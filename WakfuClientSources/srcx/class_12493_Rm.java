public class Rm
  implements bOK
{
  private static final String cqL = "progress.task.name";
  private static final String cqM = "progress.subtask.name";
  private static final String cqN = "progress.value";
  private int cqO = 1;

  public void g(String paramString, int paramInt)
  {
    this.cqO = paramInt;
    dLE.doY().t("progress.task.name", paramString);
    dLE.doY().t("progress.value", Double.valueOf(0.0D));
  }

  public void done()
  {
  }

  public void dt(String paramString)
  {
    if (paramString == null) {
      paramString = bU.fH().getString("loading");
    }
    dLE.doY().t("progress.task.name", paramString);
  }

  public void du(String paramString)
  {
    if (paramString == null) {
      paramString = "";
    }
    dLE.doY().t("progress.subtask.name", paramString);
  }

  public void gs(int paramInt)
  {
    if (this.cqO != 0)
      dLE.doY().t("progress.value", Double.valueOf(paramInt / this.cqO));
  }

  public int acP()
  {
    return this.cqO;
  }

  public void gt(int paramInt) {
    this.cqO = paramInt;
  }
}