import java.util.List;

abstract class bTv extends doA
{
  private final bKR heS = new bKR();

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    List localList = adf();

    if ((this.evp == null) || (localList == null) || (localList.isEmpty()))
    {
      cVD();
      return;
    }

    for (bfE localbfE : localList)
    {
      localbfE.jv(this.cxl);
      this.heS.add(localbfE.oj());
    }

    ade();
  }

  protected abstract void ade();

  protected abstract List adf();

  public void aK()
  {
    if (!this.ksH)
    {
      super.aK();
      return;
    }
    if (!this.heS.isEmpty())
    {
      List localList = adf();
      for (bfE localbfE : localList)
      {
        if (this.heS.N(localbfE.oj()))
        {
          localbfE.jv(-this.cxl);
        }
      }
      if (this.evp != null)
        ade();
    }
    super.aK();
  }

  public boolean aL()
  {
    return false;
  }

  public boolean aM()
  {
    return true;
  }

  public boolean aN()
  {
    return false;
  }

  public void bc()
  {
    super.bc();
    this.heS.clear();
  }
}