public class cTs
{
  private boolean daO;
  private boolean daP;
  private String name;
  private ThreadGroup kFV;

  public cTs()
  {
    this(true);
  }

  public cTs(boolean paramBoolean)
  {
    this(paramBoolean, false);
  }

  public cTs(boolean paramBoolean1, boolean paramBoolean2) {
    this(paramBoolean1, paramBoolean2, null);
  }

  public cTs(boolean paramBoolean1, boolean paramBoolean2, String paramString) {
    this(paramBoolean1, paramBoolean2, paramString, null);
  }

  public cTs(boolean paramBoolean1, boolean paramBoolean2, String paramString, ThreadGroup paramThreadGroup) {
    this.daO = paramBoolean1;
    this.daP = paramBoolean2;
    this.name = paramString;
    this.kFV = paramThreadGroup;
  }

  public String a(dBN paramdBN) {
    return this.name;
  }
  public ThreadGroup b(dBN paramdBN) { return this.kFV; } 
  public boolean c(dBN paramdBN) {
    return this.daO;
  }

  public boolean d(dBN paramdBN) {
    return this.daP;
  }
}