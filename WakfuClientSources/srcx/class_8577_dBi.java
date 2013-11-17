class dBi
  implements Runnable
{
  int count;

  dBi(buI parambuI, cWk paramcWk)
  {
  }

  public void run()
  {
    this.lIM.setText(String.valueOf(this.count));
    this.count += 1;
  }
}