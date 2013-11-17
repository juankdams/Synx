import java.io.File;

class bGq
{
  public final int eVe;
  public int size;
  public int gCF;
  public final File cGG;

  public bGq(Vm paramVm, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.eVe = paramInt2;
    this.size = paramInt3;
    this.gCF = paramInt4;

    Vm.a(paramVm).setLength(0);
    String str = Vm.b(paramVm) + "data." + paramInt1 + "_" + this.eVe + ".bdat";
    File localFile = (File)Vm.c(paramVm).get(str.hashCode());
    if (localFile != null) {
      this.cGG = localFile;
    } else {
      this.cGG = new File(str);
      Vm.c(paramVm).put(str.hashCode(), this.cGG);
    }
  }
}