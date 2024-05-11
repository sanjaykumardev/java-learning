public class Main {
  public static void main(String[] args)
  {
    Manualcar mcar=new Manualcar();
    mcar.turnoncar();
    mcar.turnoffcar();
    System.out.println(mcar.getcartype());

    Automaticcar acar=new Automaticcar();
    acar.turnoncar();
    acar.turnoffcar();
    System.out.println(acar.getcartype());
  } 
}
