class JZ extends bhb
{
  final int[] bWf;

  JZ(int[] paramArrayOfInt)
  {
    this.bWf = paramArrayOfInt;
  }

  public final int read() {
    return this.bWf[(this.fuZ++)];
  }
}