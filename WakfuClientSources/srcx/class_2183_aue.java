import com.ankamagames.framework.kernel.core.maths.Matrix44;

public final class aue extends dFe
{
  public Matrix44 aGp()
  {
    return this.gzo;
  }

  public void Ls()
  {
    this.gzo.Ls();
  }

  public float ahn()
  {
    return this.gzo.Fj()[12];
  }

  public float aho()
  {
    return this.gzo.Fj()[13];
  }

  public float aGq()
  {
    return this.gzo.Fj()[0];
  }

  public float aGr()
  {
    return this.gzo.Fj()[5];
  }

  public void b(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    float[] arrayOfFloat = this.gzo.Fj();
    arrayOfFloat[12] = paramFloat1;
    arrayOfFloat[13] = paramFloat2;
    arrayOfFloat[14] = paramFloat3;
  }

  public void c(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    float[] arrayOfFloat = this.gzo.Fj();
    arrayOfFloat[0] = paramFloat1;
    arrayOfFloat[5] = paramFloat2;
    arrayOfFloat[10] = paramFloat3;
  }
}