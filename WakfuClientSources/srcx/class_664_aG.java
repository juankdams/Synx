import com.ankamagames.xulor2.graphics.XulorParticleSystem;

public class aG
{
  private String hX;
  private int hY;
  private int hZ;
  private int ia;
  private int ib;
  private XulorParticleSystem ic;

  public aG(String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this(paramString, paramInt1, paramInt2, paramInt3, paramInt4, null);
  }

  public aG(String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4, XulorParticleSystem paramXulorParticleSystem) {
    this.hX = paramString;
    this.hY = paramInt1;
    this.hZ = paramInt2;
    this.ia = paramInt3;
    this.ib = paramInt4;
    this.ic = paramXulorParticleSystem;
  }

  public String getKey() {
    return this.hX;
  }

  public int getX() {
    return this.hY;
  }

  public int getY() {
    return this.hZ;
  }

  public int getWidth() {
    return this.ia;
  }

  public int getHeight() {
    return this.ib;
  }

  public XulorParticleSystem bO()
  {
    return this.ic;
  }

  public void g(int paramInt1, int paramInt2)
  {
  }

  public String bM()
  {
    return cBQ.cxL().mL(this.hX);
  }
}