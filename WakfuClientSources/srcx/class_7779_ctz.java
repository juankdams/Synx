import java.util.ArrayList;

class ctz extends bGg
{
  private cZf idq;

  private ctz(qm paramqm)
  {
    super(paramqm);
  }

  public void K(ArrayList paramArrayList)
  {
    super.K(paramArrayList);
  }

  public final void aMH()
  {
    float f1 = this.gCm[0].floatValue();
    float f2 = this.gCm[1].floatValue();

    if ((f1 == 0.0F) || (f2 == 0.0F)) {
      stop();
      return;
    }
    if (this.idq == null) {
      start();
    }
    this.idq.a(this.cHC);
    this.idq.am(f2, f1);
  }

  public final void stop()
  {
    if (this.idq == null)
      return;
    this.idq.reset();
    this.idq.clear();
    Pb.aaU().b(this.idq);
    this.idq = null;
  }

  public final void start()
  {
    this.idq = new cZf();
    this.idq.start();
    Pb.aaU().a(this.idq);
  }
}