import java.awt.Font;

public class bMR extends cLb
{
  private boolean gRk;

  public bMR(Font paramFont, boolean paramBoolean1, boolean paramBoolean2)
  {
    super(paramFont, paramBoolean1, paramBoolean2);
    this.gRk = false;
  }

  public bMR(Font paramFont, boolean paramBoolean1, boolean paramBoolean2, vP paramvP)
  {
    super(paramFont, paramBoolean1, paramBoolean2, paramvP);
    if ((paramvP instanceof aAF))
      this.gRk = true;
    else
      this.gRk = false;
  }

  public boolean at()
  {
    return this.gRk;
  }
}