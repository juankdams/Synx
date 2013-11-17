final class aKc extends cGB
{
  aKc(cGB[] paramArrayOfcGB)
  {
  }

  public boolean a(dhJ paramdhJ, bor parambor)
  {
    for (cGB localcGB : this.ekx) {
      if (!localcGB.a(paramdhJ, parambor))
        return false;
    }
    return true;
  }

  protected String name() {
    StringBuilder localStringBuilder = new StringBuilder("and(");
    for (int i = 0; i < this.ekx.length; i++) {
      cGB localcGB = this.ekx[i];
      localStringBuilder.append(localcGB.name()).append(", ");
    }
    if (this.ekx.length > 0)
      localStringBuilder.setLength(localStringBuilder.length() - 2);
    return ")";
  }
}