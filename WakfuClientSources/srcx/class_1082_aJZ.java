final class aJZ extends cGB
{
  aJZ(cGB[] paramArrayOfcGB)
  {
  }

  public boolean a(dhJ paramdhJ, bor parambor)
  {
    for (cGB localcGB : this.ekx) {
      if (localcGB.a(paramdhJ, parambor))
        return true;
    }
    return false;
  }

  protected String name() {
    StringBuilder localStringBuilder = new StringBuilder("or(");
    for (int i = 0; i < this.ekx.length; i++) {
      cGB localcGB = this.ekx[i];
      localStringBuilder.append(localcGB.name()).append(", ");
    }
    if (this.ekx.length > 0)
      localStringBuilder.setLength(localStringBuilder.length() - 2);
    return ")";
  }
}