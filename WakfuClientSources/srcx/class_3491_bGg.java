import java.util.ArrayList;

public abstract class bGg
{
  private final agQ gCl;
  protected final zO[] gCm;
  protected rp cHC;

  public bGg(agQ paramagQ)
  {
    this.gCl = paramagQ;
    this.gCm = paramagQ.asr();
  }

  protected final String sJ(int paramInt) {
    return this.gCl.daM[paramInt].getName();
  }

  public abstract void aMH();

  public abstract void stop();

  public abstract void start();

  public void f(cXf paramcXf)
  {
    this.cHC = paramcXf.cKV();
  }

  public void K(ArrayList paramArrayList) {
    this.gCl.a(this.gCm);
    int i = paramArrayList.size();
    for (int j = 0; j < i; j++)
      cwG localcwG = (cwG)paramArrayList.get(j);
  }
}