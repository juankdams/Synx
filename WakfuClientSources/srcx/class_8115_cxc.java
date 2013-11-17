class cxc
  implements Runnable
{
  cxc(cmT paramcmT)
  {
  }

  public void run()
  {
    synchronized (cmT.cnD()) {
      if (cmT.b(this.ijP) == null)
        return;
      cmT.b(this.ijP).setPosition(bsP.getInstance().getWidth(), aFG.ecl.bb(cmT.b(this.ijP).getHeight(), bsP.getInstance().getHeight()));

      cmT.b(this.ijP).a(new dHx(cmT.b(this.ijP).getX(), cmT.b(this.ijP).getY(), aFG.eck.ba(cmT.b(this.ijP).getWidth(), bsP.getInstance().getWidth()), cmT.b(this.ijP).getY(), cmT.b(this.ijP), 0, 150, ddp.kWG));
    }
  }
}