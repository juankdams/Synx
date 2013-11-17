final class aKb extends cGB
{
  aKb(cGB paramcGB)
  {
  }

  public boolean a(dhJ paramdhJ, bor parambor)
  {
    return !this.eky.a(paramdhJ, parambor);
  }

  protected String name() {
    return "not(" + this.eky.name() + ")";
  }
}